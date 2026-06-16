class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=nums.length-1;

        while(j<=k){
            if(nums[j]==0){
                swap(nums,j,i);
                i++;
                j++;
            }
            else if(nums[j]==2){
                swap(nums,j,k);
                k--;
            }
            else
                j++;
        }
    }
    public void swap(int[] nums,int j,int k){
        int temp = nums[j];
        nums[j] = nums[k];
        nums[k] = temp;
    }
}