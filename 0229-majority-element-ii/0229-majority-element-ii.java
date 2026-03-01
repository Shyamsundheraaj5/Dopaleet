class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;
        HashSet<Integer> answer = new HashSet<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for(int num:nums){
            if(freq.get(num)>(n/3)) answer.add(num);
        }
        return new ArrayList<>(answer);
    }
}