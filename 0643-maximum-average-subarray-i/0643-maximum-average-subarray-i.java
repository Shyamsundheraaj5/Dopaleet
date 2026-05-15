class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currMax = 0;
        for(int i=0;i<k;i++){
            currMax += nums[i];
        }
        int maxSum = currMax;

        for(int i=k;i<nums.length;i++){
            currMax += nums[i];
            currMax -= nums[i-k];
            maxSum = Math.max(maxSum,currMax);
        }

        return (double) maxSum/k;
    }
}