class Solution:
    def answer(self,n):
        minbuy=float('inf')
        maxsell=0
        for i in range(len(n)):
            minbuy=min(minbuy,n[i])
            maxsell=max(maxsell,n[i]-minbuy)
        return maxsell
s=Solution()
print(s.answer([7,5,3,6,4,1]))