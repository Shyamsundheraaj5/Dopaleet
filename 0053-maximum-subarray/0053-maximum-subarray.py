class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr = 0
        maxx = -100000
        
        for num in nums:
            curr += num
            if curr > maxx:
                maxx = curr
            
            if curr < 0:
                curr = 0
        
        return maxx