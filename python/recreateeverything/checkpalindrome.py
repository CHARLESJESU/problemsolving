class palindrome:
    def solution(self,sample:str)->bool:
        i,j=0,len(sample)-1
        while(i<j):
            if sample[i]==sample[j]:
                i+=1
                j-=1
            else:
                return False
            return True
        # revstr=''
        # for c in range(len(sample)-1,-1,-1):
        #     revstr+=sample[c]
        # print(revstr)
        # if sample==revstr:
        #     return True
        # else:
        #     return False
        # if sample==sample[::-1]:
        #     return True
        # else:
        #     return False
s=palindrome()
print(s.solution('appa'))