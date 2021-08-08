nums = [1,1,0,1,1,1]

ones = 0
maxOnes = 0
for num in nums:
    if num == 1:
        ones += 1
    else:
        ones = 0
    if ones > maxOnes:
        maxOnes = ones

print(maxOnes)