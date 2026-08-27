class Solution:
    def answer(self,n):
        count=0
        maxcount=0
        for i in range(len(n)):
            if n[i]==1:
                count+=1
            else:
                if count>maxcount:
                    maxcount=count
                count=0
        if count>maxcount:
            maxcount=count    
        return maxcount

s=Solution()
print(s.answer([1,1,0,1,1,1]))
            