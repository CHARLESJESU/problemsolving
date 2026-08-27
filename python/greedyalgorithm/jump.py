
# if the question ask " is it reach the end?"
def answer(a):
    max_range=0
    for i in range(len(a)):
        if i>max_range:
            return False
        max_range=max(max_range,i+a[i])

# minimum jump need for to reach the end

# def answer2(a):
#     max_range=0
#     min_jump=0
#     for i in range(len(a)):
#         if i>max_range:
#             return False
#         if max_range<i+a[i]:
#             min_jump+=1
#             max_range=i+a[i]
#             if max_range>=len(a)-1:
#                 break
#     return min_jump

#above is incorrect because I should do one jump for one farthest then only is it minimum
#ex: a = [3, 3, 4, 0, 0, 0, 1] for this input logic gets wrong
#correct
def answer2(a):
    max_range=0
    min_jump=0
    current_range=0
    for i in range(len(a)):
        if i>max_range:
            return -1
        max_range=max(max_range,i+a[i])
        if i==current_range:
            min_jump+=1
            current_range=max_range
            if current_range>=len(a)-1:
                break
    return min_jump    
