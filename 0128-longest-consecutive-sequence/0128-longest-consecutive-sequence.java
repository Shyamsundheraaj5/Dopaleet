class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest=0;
        for(int val:nums){
            set.add(val);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int current = num;
                int currLongest = 1;
                while(set.contains(current+1)){
                    current++;
                    currLongest++;
                }
                longest = Math.max(longest,currLongest);
            }
        }
        return longest;
    }
}