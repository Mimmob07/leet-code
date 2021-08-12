nums = [0,0,1,1,1,2,2,3,3,4]
x = 0

while x + 1 < len(nums):
    if nums[x] == nums[x + 1]:
        nums.pop(x + 1)
    else:
        x += 1

print(nums)
