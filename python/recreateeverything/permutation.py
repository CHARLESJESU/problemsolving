def permutation(num:list[int])->list[list[int]]:
    temp=[]
    result=[]
    for i in range(len(num)):
        temp.append(num[i])
        for j in range(i+1,len(num)*2):
            if(num[j%len(num)]==num[i]):
                break
            temp.append(num[j%len(num)])
        print(temp)
        result.append(temp.copy())
        temp.clear()
    return result
print(permutation([1,2,3]))
