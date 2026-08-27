class zigzag:
    def zigzagsolution(self,label:str,order:int)->str:
        if order>len(label) or order<=1:
            return label
        res=["" for i in range(order)]
        goesdown=False
        refcount=0
        for s in label:
            res[refcount]+=s
            if refcount==order-1 or refcount==0:
                goesdown=not goesdown
            if goesdown:
                refcount+=1
            else:
                refcount-=1
        return "".join(res)


if __name__=='__main__':
    a=zigzag()
    result=a.zigzagsolution("PAYPALISHIRING",4)
    print(result)