class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==0) return 0;
        int largest=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==1){
                count++;
                largest = Math.max(largest, count);
            }else{
                count=0;
            }
        }
        return largest;
    }
}