class Solution():
    def __init__(self,value,left=None,right=None):
        self.value=value
        self.left=left
        self.right=right

    def targetsum(self,root,sum):
        def figureout(root,currsum):

            if root is None:
                return False
            if root.left is None and root.right is None:
                return currsum + root.value==sum
            return figureout(root.left,currsum+root.value) or figureout(root.right,currsum+root.value)
        return figureout(root,0)
    
    def symmetricsum(self,root):
        if root is None:
            return True
        def mirror(left,right):
            if left is None and right is None:
                return True
            if left is None or right is None:
                return False
            if left.value!=right.value:
                return False
            return mirror(left.left,right.right) and mirror(left.right,right.left)
        return mirror (root.left,root.right)

    def binarytree(self,root):
        result=[]
        def dfs(root,path):
            if root is None:
                return None
            path.append(str(root.value))
            if root.left is None and root.right is None:
                result.append("->".join(path))
                path.pop()
                return
            dfs(root.left,path)
            dfs(root.right,path)
            path.pop()
        dfs(root,[])
        return result

    def subrootiden(self,root,subroot):
        if root is None:
            return False
        def subfunction(root,subroot):
            if root is None and subroot is None:
                return True
            if root is None or subroot is None:
                return False
            if root.value!=subroot.value:
                return False
            return subfunction(root.left,subroot.left) and subfunction(root.right,subroot.right)

        if subfunction(root,subroot):
            return True

        return self.subrootiden(root.left,subroot) or self.subrootiden(root.right,subroot)

    def lca(self,root,p,q):
        if root is None:
            return None
        if root.value==p or root.value==q:
            return root.value
        left=self.lca(root.left,p,q)
        right=self.lca(root.right,p,q)
        if left and right:
            return root.value
        if left:
            return left
        return right

        


         


# s = Solution(5)
# s.left = Solution(4)
# s.right = Solution(8)
# s.left.left = Solution(11)
# s.left.left.left = Solution(7)
# s.left.left.right = Solution(2)
# s.right.left = Solution(13)
# s.right.right = Solution(4)
# s.right.right.right = Solution(1)
# print(s.targetsum(s,22))



# s = Solution(1)
# s.left = Solution(2)
# s.right = Solution(2)
# s.left.left = Solution(3)
# # s.left.left.left = Solution(3)
# s.left.right = Solution(4)
# s.right.left = Solution(4)
# s.right.right = Solution(3)
# print(s.symmetricsum(s))

# s = Solution(1)
# s.left = Solution(2)
# s.right = Solution(3)
# s.left.right = Solution(5)
# s.left.right.left = Solution(4)
# print(s.binarytree(s))

# s = Solution(3)
# s.left = Solution(4)
# s.right = Solution(5)
# s.left.left = Solution(1)
# s.left.right = Solution(2)

# su = Solution(4)
# su.left = Solution(2)
# su.right = Solution(1)

# print(s.subrootiden(s,su))


s = Solution(3)
s.left = Solution(5)
s.right = Solution(1)
s.right.left = Solution(6)
s.right.right = Solution(2)
s.right.left.left = Solution(7)
s.right.left.right = Solution(4)

print(s.lca(s,5,4))

