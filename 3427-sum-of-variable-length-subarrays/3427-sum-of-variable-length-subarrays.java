class Solution {
    public int subarraySum(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        int ans=0;
        int start=0;
        for(int i=0;i<nums.length;i++){
            start = Math.max(0,i-nums[i]);
            if(start==0){
                ans += prefix[i];
            }else{
                ans += prefix[i]-prefix[start-1];
            }
        }
        return ans;
    }
}