class Solution {
    public int maxProduct(int[] nums) {
        int leftProduct = 1;
        int rightProduct = 1;
        int max=Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(leftProduct==0) leftProduct = 1;
            if(rightProduct==0) rightProduct = 1;

            leftProduct = leftProduct*nums[i];
            rightProduct = rightProduct*nums[n-i-1];
            max = Math.max(max,Math.max(leftProduct,rightProduct));
        }
        return max;
    }
}