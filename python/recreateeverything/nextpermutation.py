class Solution:
    def answer(self, nums):
        # if len(nums)<2:
        #     return nums
        # if nums[len(nums)-1]<nums[len(nums)-2]:
        #     nums[0],nums[len(nums)-1]=nums[len(nums)-1],nums[0]
        #     self.reverse(nums,1,len(nums)-1)
        #     return nums
        # i=len(nums)-1
        # j=i-1
        # while(nums[i]>nums[j]):
        #     nums[i],nums[j]=nums[j],nums[i]  
        i=len(nums)-1
        # started find the greatest element than current one 
        while(i>0 and nums[i]<=nums[i-1]):
            i-=1
        if i==0:
            self.reverse(nums,i,len(nums)-1)
            return nums
        j=len(nums)-1
        while j>=i and nums[j]<=nums[i-1]:
            
            j-=1
        nums[i-1],nums[j]=nums[j],nums[i-1]
        self.reverse(nums,i,len(nums)-1)
        return nums

        
    def reverse(self,nums,i,j):
        while(i<j):
            nums[i],nums[j]=nums[j],nums[i]
            i+=1
            j-=1
       
            


s = Solution()

print(s.answer([1,2,3,5,4]))   # True
        # True

