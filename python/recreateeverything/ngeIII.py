class Solution:
    def nextGreaterElement(self, n: int) -> int:
        ques=str(n)
        ques=list(ques)
        for i in range(len(ques)-1,0,-1):
            if(ques[i]>ques[i-1]):
                break
        if i == 0:
            return -1
        j=len(ques)-1
        while(j>i and ques[i]<ques[j]):
            j-=1
        ques[i-1],ques[j]=ques[j],ques[i-1]

        ques[i:]=reversed(ques[i:])

        result = ''.join(ques)  # list -> string
        return int(result)
s=Solution()
answer=s.nextGreaterElement(21)
print(answer)