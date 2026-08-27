class Solution:
    def verify(self, nums):
        count = 0
        n = len(nums)

        for i in range(n):
            if nums[i] > nums[(i + 1) % n]:
                count += 1

            if count > 1:
                return False

        return True


s = Solution()

print(s.verify([3,4,5,1,2]))   # True
print(s.verify([2,1,3,4]))     # False
print(s.verify([1,2,3]))       # True
print(s.verify([1,1,1]))       # True
print(s.verify([2,1]))         # True