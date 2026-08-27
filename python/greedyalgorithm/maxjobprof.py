# Problem: Job Sequencing with Deadlines

# You are given several jobs. Every job contains:

# A unique job ID
# A deadline
# A profit

# Each job takes exactly one unit of time to complete.

# A job produces its profit only when it is completed on or before its deadline. Only one job can be completed during each unit of time.

# Find:

# The maximum number of jobs that can be completed.
# The maximum total profit.
# Example 1
# jobs = [
#     ["A", 2, 100],
#     ["B", 1, 19],
#     ["C", 2, 27],
#     ["D", 1, 25],
#     ["E", 3, 15]
# ]

# Output:

# Number of jobs: 3
# Maximum profit: 142

def answer(a):

    a.sort(key=lambda a:a[2],reverse=True)
    nojob=0
    maxpro=0
    temp={}
    for i in range(len(a)):
        deadline=a[i][1]
        while deadline in temp.keys() and deadline>0:
            deadline-=1
        if deadline==0:
            continue
        temp[deadline]=a[i][2]
        nojob+=1
        maxpro+=a[i][2]
    return nojob,maxpro

print(answer([
    ["A", 2, 100],
    ["B", 1, 19],
    ["C", 2, 27],
    ["D", 1, 25],
    ["E", 3, 15]
]))