class Solution {
    // strs = ["flower","flow","flight"]
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        
        Arrays.sort(strs);
        // strs = ["flight", "flow", "flower"]
        
        char[] first = strs[0].toCharArray();
        // ['f', 'l', 'i', 'g', 'h', 't']
        char[] last = strs[strs.length-1].toCharArray();
        //['f', 'l', 'o', 'w', 'e', 'r']

        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break; 
            }
            sb.append(first[i]);
        }
        return sb.toString();
    }
}