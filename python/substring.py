import math
# class Solution(object):
#     def longestPalindrome(self, s):
#         start=0
#         maxlen=0
#         for i in range(len(s)):
#             len1=self.lengthlongest(s,i,i)
#             len2=self.lengthlongest(s,i,i+1)
#             result=max(len1,len2)

#             if result>maxlen:
#                 maxlen=result
#                 start=i-(maxlen-1)//2
#         return s[start:start+maxlen]
    
#     def lengthlongest(self,s,left,right)->int:
#         while left>=0 and right<len(s) and s[left]==s[right]:
#             left-=1
#             right+=1
            
#         return right-left-1
print (math.inf)
# s1=Solution()
# print(s1.longestPalindrome("babad"))
