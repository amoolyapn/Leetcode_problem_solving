class Solution:
  def twoSum(self,nums,target):
    if i in range(len(nums)):
      for j in range(i+1 ,len(nums)):
        if nums[i]+num[j] == target:
          return [i,j]

nums = [2,7,11,15]
target = 9
s = solution():
result = s.twoSum(nums,target)
print("Indicies",result)
