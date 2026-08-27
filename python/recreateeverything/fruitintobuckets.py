from collections import deque

class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        start=0
        max_len=0
        fruitcount={}
        for i in range(len(fruits)):
            fruitcount[fruits[i]]=fruitcount.get(fruits[i],0)+1
            while len(fruitcount)>2:
                fruitcount[fruits[start]]-=1
                if fruitcount[fruits[start]]==0:
                    del fruitcount[fruits[start]]
                start+=1
            max_len=max(max_len,i-start+1)
        return max_len



        


s=Solution()
print(s.totalFruit([3,3,3,1,2,1,1,2,3,3,4]))