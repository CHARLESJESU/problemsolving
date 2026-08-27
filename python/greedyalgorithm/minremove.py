#Find the minimum number of intervals you must remove so that the remaining intervals do not overlap.
def answer(self,a):
    a.sort(key=lambda a:a[1])
    prev_end=a[0][1]
    remove=0
    for i in range(1,len(a)):
        if a[i][0]<prev_end:
            remove+=1
        else:
            prev_end=a[i][1]
    return remove

#Minimum Number of Arrows to Burst Balloons
#One arrow can burst multiple balloons if their intervals contain the arrow’s position

def answer(a):
    a.sort(key=lambda a:a[1])
    prev_ele=a[0][1]
    arrow=1
    for start,end in a[1:]:
        if start<=prev_ele<=end:
            continue
        else:
            arrow+=1
            prev_ele=end
    return arrow

print(answer([[1, 2], [2, 3], [3, 4], [4, 5]]))


#sorted() never change the origin value
#but a.sort() change the origin value
# a=[4,2,4,6,7,4]
# print(a)
# b=sorted(a)
# print(b)
# a.sort()
# print(a)


    