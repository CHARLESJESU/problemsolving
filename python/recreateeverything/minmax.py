numbers = [10, 5, 25, 3, 18, 7]

minimum = numbers[0]
maximum = numbers[0]

for num in numbers:
    if num < minimum:
        minimum = num

    if num > maximum:
        maximum = num

print("Minimum:", minimum)
print("Maximum:", maximum)