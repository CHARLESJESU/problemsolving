arr = [1, 2, 4, 6, 8, 9]
target = 10

left = 0
right = len(arr) - 1

while left < right:
    total = arr[left] + arr[right]

    if total == target:
        print(arr[left], arr[right])
        break

    elif total < target:
        left += 1

    else:
        right -= 1