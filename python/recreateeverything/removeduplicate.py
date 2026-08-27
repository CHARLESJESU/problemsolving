class Solution:
    def removeduplicate(self,n):
        j=0
        for i in range(len(n)):
            if(n[i]!=n[j]):
                n[j+1]=n[i]
                j+=1
        print(j+1)
        while(j+1<len(n)):
            n[j+1]=0
            j+=1
        
        print(n)
s=Solution()
s.removeduplicate([0,0,1,1,1,2,2,3,3,4])