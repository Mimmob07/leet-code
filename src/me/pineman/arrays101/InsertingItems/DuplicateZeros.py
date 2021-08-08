arr = [1,0,2,3,0,4,5,0]

oglength = len(arr)
lastone = False
i = 0
remainder = 0

for num in arr:
    if num == 0:
        if lastone:
            lastone = False
        else:
            arr.insert(i, 0)
            lastone = True
    else:
        lastone = False
    i += 1

remainder = abs(oglength - len(arr))

for x in range(0, remainder):
    arr.pop()

print(arr)