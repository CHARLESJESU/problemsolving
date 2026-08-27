class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        result=[-1]*(len(nums1))
        answer=[]
        temp={}
        for i in range(len(nums2)):
            while(answer and answer[-1]<nums2[i]):
                temp[answer.pop()]=nums2[i]
            answer.append(nums2[i])
        print(temp)
        while answer:
            temp[answer.pop()] = -1
        return [temp[n] for n in nums1]

s=Solution()
answer= s.nextGreaterElement([1,3,5,2,4], [6,5,4,3,2,1,7])
print(answer)