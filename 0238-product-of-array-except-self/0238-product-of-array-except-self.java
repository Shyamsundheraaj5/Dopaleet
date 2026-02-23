class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        suffix[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1]*nums[i];
        }
        prefix[0] = nums[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]*nums[i];
        }
        int[] answer = new int[n];
        answer[0] = (nums[0]==0)? suffix[1]:prefix[n-1]/nums[0];
        for(int j=1;j<n-1;j++){
            
            answer[j] = (nums[j]==0) ? suffix[j+1]*prefix[j-1]:prefix[n-1]/nums[j];
        }
        answer[n-1] = (nums[n-1]==0)? prefix[n-2]:prefix[n-1]/nums[n-1];
        return answer;
    }
}