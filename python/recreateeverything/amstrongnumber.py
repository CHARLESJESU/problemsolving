class amstrongnumber:
    def solution(self, num:int)->bool:
        sum=0
        temp=num
        while(num>0):
            digit=num%10
            sum+=(digit**3)
            num//=10
        print(sum)
        if temp==sum:
            return True
        else:
            return False
s=amstrongnumber()
print(s.solution(153))