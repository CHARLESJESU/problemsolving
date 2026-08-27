class Solution():
    def __init__(self,value,left=None,right=None):
        self.value=value
        self.left=left
        self.right=right

    def preorder(self,root):
        if root is None:
            return None
        print(root.value)
        self.preorder(root.left)
        self.preorder(root.right)

    def inorder(self,root):
        
        if root is None:
            return None
        self.inorder(root.left)
        print(root.value)
        
        self.inorder(root.right)

    def postorder(self,root):
        if root is None:
            return None
        self.postorder(root.left)
        self.postorder(root.right)
        print(root.value)


s=Solution(1)
s.left=Solution(2)
s.right=Solution(3)
s.left.left=Solution(4)
s.left.right=Solution(5)
s.preorder(s)
print('?????????')
s.inorder(s)
print('?????????')
s.postorder(s)


