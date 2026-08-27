class Solution:
    def answer(self,n):
        t=len(n)
        expected=(t*(t+1))//2
        actual=0
        for i in n:
            actual+=i
        return expected-actual
s=Solution()
print(s.answer([0,1,2,3,4]))