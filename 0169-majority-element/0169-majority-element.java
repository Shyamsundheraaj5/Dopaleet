class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],1+map.getOrDefault(nums[i],0));
             if(map.get(nums[i])>n/2)
                return nums[i];
        }
        
        return -1;
    }
}