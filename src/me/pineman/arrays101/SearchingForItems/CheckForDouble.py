# arr = [-2, 0, 10, -19, 4, 6, -8]
arr = [0,0]
i = 0

for num in arr:
    if num * 2 in arr and (num * 2 != num or arr.count(num) != 1):
        print(num)
        print(num * 2)
        print("True")

    i += 1
