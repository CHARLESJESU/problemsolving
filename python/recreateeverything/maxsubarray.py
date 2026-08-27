class Solution:
    # def answer(self,n):
    #     maxresult=float('-inf')
    #     result=0
    #     for i in n:
    #         if result<0:
    #             result=0
    #         result+=i
    #         maxresult=max(result,maxresult)
    #     return maxresult
    def answer(self,n):
        maxresult=float('-inf')
        result=0
        for i in n:
            if result<0:
                result=0
            result+=i
            maxresult=max(result,maxresult)
        return maxresult
    
    def dive_con_methond(self,array,low,high):
        if low==high:
            return array[low]

        mid=(low+high)//2
        left=self.dive_con_methond(array,low,mid)
        right=self.dive_con_methond(array,mid+1,high)
        crosssidesum=answer(left,right)
        
    
s=Solution()
print(s.dive_con_methond([-5, -2, -8],0,3))