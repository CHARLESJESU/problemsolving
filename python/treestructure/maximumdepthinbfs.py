from collections import deque

class Solution():
    def __init__(self,value,left=None,right=None):
        self.value=value
        self.left=left
        self.right=right

    def maxdepth(self,root):
        queue=deque([(root,1)])
        maxdep=0
        while queue:
            node,depth=queue.popleft()
            maxdep=max(maxdep,depth)
            if node.left:
                queue.append((node.left,depth+1))
            if node.right:
                queue.append((node.right,depth+1))
        return maxdep

    def mindepth(self,root):
        queue=deque([(root,1)])
        while queue:
            node,depth=queue.popleft()
            if node.left is None and node.right is None:
                return depth
            if node.left:
                queue.append((node.left,depth+1))
            if node.right:
                queue.append((node.right,depth+1))
        
        

    def countnode(self,root):
        queue=deque([root])
        count=0
        while queue:
            level_val=len(queue)
            
            for _ in range(level_val):
                count+=1
                node=queue.popleft()
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
        return count

    def diameteranswer(self,root):
        self.diameter=0
        def answer(root):
            if root is None:
                return 0
            left=answer(root.left)
            right=answer(root.right)
            self.diameter=max(self.diameter,left+right)
            return 1+max(left,right)
        answer(root)
        return self.diameter



s=Solution(1)
s.left=Solution(2)
s.right=Solution(3)
s.left.left=Solution(4)
s.left.right=Solution(5)
print(s.maxdepth(s))
print(s.mindepth(s))
print(s.countnode(s))
print(s.diameteranswer(s))

