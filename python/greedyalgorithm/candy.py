# You must distribute candies according to these rules:

# Every child must receive at least one candy.
# A child with a higher rating than an adjacent child must receive more candies than that adjacent child.

# Return the minimum total number of candies required.

def answer(a):
    templist=[1]*len(a)
    intialele=a[0]
    if a[0]>a[1]:
        templist[0]+=1
    for i in range(1,len(a)):
        if intialele<a[i]:
            templist[i]=templist[i-1]+1
        else:
            templist[i-1]=templist[i]+1
        intialele=a[i]
    return sum(templist)
print(answer([1,2,2]))