# You are given n items. Each item has:

# A value
# A weight

# You are also given a knapsack with a maximum weight capacity.

# Example 1
# values = [60, 100, 120]
# weights = [10, 20, 30]
# capacity = 50

# Output:

# 240.0

# def answer(v,w,c):
#     left=0
#     result=v[left]
#     tw=w[left]
#     for i in range(1,len(v)):
#         tw+=w[i]
#         if tw>c:
#             tw-=w[left]
#             result-=v[left]
#             left+=1
#         result+=v[i]
#     return result
def answer(v, w, c):
    # Pair values with weights, sort by ratio
    items = sorted(zip(v, w), key=lambda x: x[0]/x[1], reverse=True)
    print(items)
    result = 0
    tw = 0
    for val, weight in items:
        if tw + weight <= c:
            result += val
            tw += weight
        else:
            result += val * (c - tw) / weight
            break
    return result

print(answer([10, 20, 30], [5, 10, 15], 30))

