class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> prefix = new HashSet<>();

        for(int num:arr1){
            while(num>0){
                prefix.add(num);
                num /=10;
            }
        }

        int ans=0;

        for(int num:arr2){
            while(num>0){
                if(prefix.contains(num)){
                    num = (int) Math.log10(num)+1;
                    ans = Math.max(ans,num);
                    break;
                }
                num = num/10;
            }
            
        }
        return ans;
    }
}