class fiboandfact:
    def fibosolution(self,n):
        if n==0:
            return 0
        if n==1:
            return 1
        i=0
        a,b=0,1
        print(a,b)
        while(i<n):
            next=a+b
            a,b=b,next
            print(next)
            i+=1
    def factsolution(self,n):
        if n<=1:
            return 1
        return n*self.factsolution(n-1)
a=fiboandfact()
print(a.fibosolution(5))
print(a.factsolution(5))