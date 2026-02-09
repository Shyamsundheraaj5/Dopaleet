class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> answer = new HashSet<>();
        for (int num : nums1) set.add(num);
        for (int num : nums2) {
            if (set.contains(num)) answer.add(num);
        }
        int[] res = new int[answer.size()];
        int i = 0;
        for (Integer val : answer) {
            res[i++] = val;
        }
        return res;
    }
}