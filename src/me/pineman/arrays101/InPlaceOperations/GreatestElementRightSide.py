arr = [17,18,5,4,6,1]

l = len(arr)
ans = []
for i in range(l-1):
    arr_r=max(arr[i+1:])
    ans.append(arr_r)
ans.append(-1)
print(ans)
