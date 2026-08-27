# class linearsort:
#     def solution(self, n):
#         for i in range(len(n)):
#             for j in range(i+1,len(n)):
#                 if n[i]>n[j]:
#                     n[i],n[j]=n[j],n[i]

#         return n
# s=linearsort()
# print(s.solution([1,5,4,6,4,6,4]))

class Binerysearch:
    def solution(self, n,target):
        left,right=0,len(n)-1
        while(left<right):
            mid=right-(left+right)//2
            print(n[mid])
            if n[mid]==target:
                
                return target
            elif mid>target:
                left+=1
            else:
                right+=1
        return n
s=Binerysearch()
print(s.solution([1,2,3,4,5,6,7],6))