class Solution:
    def answer(self,a:list[int])->bool:
        five =0
        ten=0
        for i in range(len(a)):
            if a[i]==5:
                five+=1
            elif a[i]==10:
                if five==0:
                    return False
                five-=1
                ten+=1
            else:
                if five==0:
                    return False
                if ten!=0 and five!=0:
                    ten-=1
                    five-=1
                elif five>=3:
                    five-=3
                else:
                    return False

        return True

a=Solution()
print(a.answer([5, 5, 10, 10, 20]))
    