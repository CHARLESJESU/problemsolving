class Solution():
    def answer(self, num,target):
        currentsum=0
        temp={0:-1}
        result=[]
        for i in range(len(num)):
            currentsum+=num[i]
            if((currentsum-target) in temp.keys()):
                result.append([temp[currentsum-target]+1,i])
                
            temp[currentsum]=i
        print(temp)
        print(result)


s=Solution()
print(s.answer([1,2,3,4,3,2,15],12))