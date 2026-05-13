class Solution {
    public int maximumCount(int[] nums) {
        if(nums[0]>0) return nums.length;
        if(nums.length==1&&nums[0]!=0) return 1;

        int negC = findPos(nums);
        int numZero=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) numZero++;
        }
        int posC = nums.length-negC-numZero;

        if(negC>=posC) return negC;
        return posC;
    }
    public int findPos(int[] nums) {
        int left=0;
        int right = nums.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(nums[mid]<0){
                if(mid==nums.length-1)return mid+1;
                if(nums[mid+1]>=0)
                    return mid+1;
                else left = mid+1;
            }
            else right = mid-1;
        }
        return 0;
    }
}