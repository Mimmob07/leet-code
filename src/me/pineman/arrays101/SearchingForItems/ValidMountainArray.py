arr = [0, 3, 2, 1]

maxnum = max(arr)
index = arr.index(maxnum)
if index == 0 or index == len(arr) - 1:
    print("False")
for i in range(1, index):
    if arr[i] <= arr[i - 1]:
        print("False")
for i in range(index + 1, len(arr)):
    if arr[i] >= arr[i - 1]:
        print("False")
print("True")
