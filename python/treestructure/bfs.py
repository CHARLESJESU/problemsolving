from collections import deque

class Solution():
    def __init__(self,val,left=None,right=None):
        self.val=val
        self.left=left
        self.right=right

    def bfs(self,root):
        if root is None:
            return None
        queue=deque([root])
        result=[]
        while queue:
            # level=[]
            level_next=len(queue)
            # maxnumber=float('-inf')
            sum=0
            for i in range(level_next):
                node=queue.popleft()
                # maxnumber=max(maxnumber,node.val)
                sum+=node.val
                # if(i==0):
                #     result.append(node.val)

                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            result.append(sum/level_next)
        print(sum/level_next)
        return result
            

s=Solution(1)
s.left=Solution(2)
s.right=Solution(3)
s.left.left=Solution(4)
s.right.left=Solution(5)

print(s.bfs(s))
        