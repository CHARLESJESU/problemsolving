class Solution:
    # def largestRectangleArea(self, heights: List[int]) -> int:
    #     maxresult=0
    #     result=0
    #     i=0
    #     j=0
    #     for i in range(len(heights)):
    #         for j in range(i-1,-1,-1):
    #             if(heights[i]>heights[j]):
    #                 break
    #         for k in range(i+1,len(heights)):
    #             if(heights[i]>heights[k]):
    #                 break
    #         result=heights[i]*(k-j-1)
    #         maxresult=max(maxresult,result)
    #     return maxresult
    def largestRectangleArea(self, heights: List[int]) -> int:
        maxresult=0
        
        result=[]
        for i in range(len(heights)):
            temp=0
            if not result:
                result.append(heights[i])
            else:
                while(len(result)>0 and heights[i]<heights[result[-1]]):
                    print(result)
                    temp=max(temp,(i-heights[result[-1]]-1)*heights[result.pop()])
                    print(temp)
                result.append(i)
            maxresult=max(maxresult,temp)
        return maxresult

s=Solution()
print(s.largestRectangleArea([2,1,5,6,2,3]))