class Solution():
    def __init__(self,value,left=None,right=None):
        self.value=value
        self.left=left
        self.right=right

    def maxdepth(self,root):
        if root is None:
            return 0
        left=self.maxdepth(root.left)
        right=self.maxdepth(root.right)
        return 1+max(left,right)

    def countnode(self,root):
        if root is None:
            return 0
        left=self.countnode(root.left)
        right=self.countnode(root.right)
        return left+right+1

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
print(s.countnode(s))
print(s.diameteranswer(s))

