def searchInsert(self, nums, target):
beg, end = 0, len(nums)
while beg < end:
    mid = (beg + end)//2
    if nums[mid] >= target:
        end = mid
    else:
        beg = mid + 1
return beg