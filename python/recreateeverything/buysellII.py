class Solution(object):
    def maxProfit(self, prices):
        result=0
        for i in range(len(prices)-1):
            if prices[i]<prices[i+1]:
                result+=(prices[i+1]-prices[i])
                i+=1
        return result
s=Solution()
print(s.maxProfit([7,6,4,3,1]))
