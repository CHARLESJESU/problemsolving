class single:
    def singleanswer(self,listnumber):
        result=0
        for n in range(len(listnumber)):
            result=result^listnumber[n]
        return result
s1=single()
print(s1.singleanswer([1,2,4,1,2]))