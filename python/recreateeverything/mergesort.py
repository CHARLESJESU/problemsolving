class mergesort:
    def answer(self,n):
        if len(n)<=1:
            return n
        left=n[:len(n)//2]
        right=n[len(n)//2:]
        print(n)
        print('left ', left)
        print('right ', right)
        left=self.answer(left)
        right=self.answer(right)
        return self.sort(left,right)
    def sort(self,left,right):
        arr_sort=[]
        i=j=0
        while i<len(left) and j<len(right):
            if left[i]<=right[j]:
                arr_sort.append(left[i])
                i+=1
            else:
                arr_sort.append(right[j])
                j+=1
        while len(left)>i:
            arr_sort.append(left[i])
            i+=1
        while len(right)>j:
            arr_sort.append(right[j])
            j+=1  
        return arr_sort
s=mergesort()
print(s.answer([4,3,2,10,12,1,5,6]))
        