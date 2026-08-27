class Solution():
    def answer(self,list):
        maxlen=0
        for i in range(len(list)):
            
            tempsum=0
            for j in range(i,len(list)):
                tempsum+=list[j]
                if tempsum==0:
                    maxlen=max(maxlen,j-i+1)
        return maxlen    
        
                

s=Solution()
print(s.answer([15,-2,2,-8,1,7,10,23]))