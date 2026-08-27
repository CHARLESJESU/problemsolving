class Solution:
    def answer(self, n):
        if len(n)==1:
            return n[0]
        maxprod=float('-inf')
        prod=1
        for i in range(len(n)):
            if n[i]>0:
                prod*=n[i]  
            elif (prod<0 or n[i]<0):
                prod*=n[i]
            else:
                prod=1
            print(prod)
            if (prod>maxprod):
                maxprod=prod
        return maxprod

s = Solution()

print(s.answer([-2,3,-4]))  