class Solution:
    def answer(self,n):
        j=0
        for i in range(len(n)):
            if(n[i]!=0):
                n[j],n[i]=n[i],n[j]
                j+=1
        print(n)

s=Solution()
s.answer([0,1,0,3,12])