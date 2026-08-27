class Solution():
    def __init__(self,val,left=None,right=None):
        self.val=val
        self.left=left
        self.right=right

    def identical(self,p,q):
        if p is None and q is None:
            return True
        if p is None or q is None:
            return False
        if p.val!=q.val:
            return False
        return self.identical(p.left,q.left) and self.identical(p.right,q.right)

s=Solution(1)
s.left=Solution(2)
s.right=Solution(3)

r=Solution(1)
r.left=Solution(2)
r.right=Solution(3)

print(s.identical(s,r))
