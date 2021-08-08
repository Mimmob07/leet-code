nums = [12,345,2,6,7896]
evenNums = 0
for num in nums:
    if len(str(num)) % 2 == 0:
        evenNums += 1
print(evenNums)