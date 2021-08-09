nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3

del nums1[m:]
del nums2[n:]

if nums1 == [] or nums2 == []:
    nums1 += nums2
else:
    i = 0
    j = 0

    while i < len(nums1) and j < len(nums2):
        if nums1[i] < nums2[j]:
            i += 1
        else:
            nums1.insert(i, nums2[j])
            i += 1
            j += 1

    nums1 += nums2[j:]

print(nums1)