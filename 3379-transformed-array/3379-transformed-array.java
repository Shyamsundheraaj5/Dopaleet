class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                int idx = (i+nums[i])%nums.length;
                result[i] = nums[idx];
            }else if(nums[i]<0){
                int idx = (i+nums[i])%nums.length;
                if(idx<0) idx +=nums.length;
                result[i] = nums[idx];
            }else result[i] = nums[i];
        }
        return result;
    }
}