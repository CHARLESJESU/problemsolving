class Solution:
    def answer(self, n,target):
        left=0
        right=len(n)-1
        while(left<=right):
            mid=left+(right-left)//2
            if(n[mid]==target):
                return mid
            if n[mid]>=n[left]:
                if target<n[mid] and target>=n[left]:
                    right=mid-1
                else:
                    left=mid+1
            else:
                if target>n[mid] and target<=n[right]:
                    left=mid+1
                else:
                    right=mid-1
        return -1

s = Solution()

print(s.answer([4,5,6,7,0,1,2],0))  