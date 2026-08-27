# class bubblesort:
#     def solution(self,n):
#         for i in range(len(n)):
#             for j in range(len(n)-1):
#                 if n[j]>n[j+1]:
#                     n[j],n[j+1]=n[j+1],n[j]
#         return n
# s=bubblesort()
# print(s.solution([12,54,2,7,5]))
# class selectsort:
#     def solution(self,n):
#         for i in range(len(n)):
#             min=n[i]
#             k=i
#             for j in range(i,len(n)):
#                 if min>n[j]:
#                     k=j
#                     min=n[j]
#             print(n)
#             n[i],n[k]=n[k],n[i]
#         return n
# s=selectsort()
# print(s.solution([12,54,2,7,5]))
