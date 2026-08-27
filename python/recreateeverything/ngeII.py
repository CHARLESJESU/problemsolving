class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        answer=[]
        result=[-1]*len(nums)
        temp={}
        for i in range(len(nums)*2):
            while answer and nums[answer[-1]] <nums[i%len(nums)]:
                temp[answer.pop()]=nums[i%len(nums)]
            answer.append(i%len(nums))
        print(temp)
        for n in temp.keys():
            result[n]=temp[n]
        return result
s=Solution()
answer=s.nextGreaterElements([1,2,1])
print(answer)