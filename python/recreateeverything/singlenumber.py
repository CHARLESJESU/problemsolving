class Solution:
    def answer(self,n):
        result=0
        for i in range(len(n)):
            result=result^n[i]
        return result

s=Solution()
print(s.answer([4,4,3,1,2,1,2]))
            