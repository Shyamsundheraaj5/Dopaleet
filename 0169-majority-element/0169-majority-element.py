class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count, candidate = 0, 0
        for i in range(len(nums)):
            if count == 0:
                candidate, count = nums[i], 1
            elif candidate == nums[i]:
                count += 1
            else:
                count -= 1
        return candidate