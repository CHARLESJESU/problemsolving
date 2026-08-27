def maxsubarray(ques):
    return answer(ques,0,0)

def answer(ques,result,temp):
    if len(ques)<=1:
        return ques
    mid=(0+len(ques))//2

    left=answer(0,mid,temp)
    right=answer(mid+1,len(ques),temp)

    temp+=left+right
    if(temp>result):
        result=temp
        temp=0

print(maxsubarray([-2, 1, -3, 4, -1, 2, 1, -5, 4]))

    