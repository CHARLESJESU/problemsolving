class Solution:
    def answer(self,n):
        count=0
        element=None
        for i in range(len(n)):
            if count==0:
                element=n[i]
            if n[i]==element:
                count+=1
            else:
                count-=1
        return element

        
    
s=Solution()
print(s.answer([3,2,3]))