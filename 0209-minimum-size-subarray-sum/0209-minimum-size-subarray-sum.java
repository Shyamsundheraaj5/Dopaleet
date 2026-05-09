class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength=Integer.MAX_VALUE;
        int n = nums.length;
        int sum=0;
        int l=0;
        for(int r=0;r<n;r++){
            sum = sum+nums[r];
            while(sum>=target){
                minLength = Math.min(minLength,r-l+1);
                sum  = sum-nums[l];
                l++;
            }
        } 
        
        if(minLength == Integer.MAX_VALUE) return 0;
        return minLength;
    }
}