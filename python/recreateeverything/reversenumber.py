class reversenumber:
    def solution(self, num:int)->int:
        reverse=0
        while(num>0):
            digit=num%10
            reverse=digit+(reverse*10)
            num//=10
        return reverse
s=reversenumber()
answer=s.solution(121)
print(answer)