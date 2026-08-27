class twosum:
    def twosumanswer(self,num:list,target)->list:
        map={}
        for i in range(0,len(num)):
            if num[i] in map.keys():
                return i,map.get(num[i])
            map[target-num[i]]=i
        return None
s=twosum()
print(s.twosumanswer([3,2,4],6))


