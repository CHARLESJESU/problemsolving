class insertionsort:
    def solution(self,n):
        for i in range(len(n)-1):
            key=n[i]
            j=i-1
            while j>=0 and key<n[j]:
                n[j+1]=n[j]
                j-=1
            n[j+1]=key
        return n
                    

s=insertionsort()
print(s.solution([4,3,2,10,12,1,5,6]))