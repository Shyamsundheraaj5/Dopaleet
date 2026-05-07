class Solution {
    public String largestMerge(String word1, String word2) {
        int w1=0;
        int w2=0;
        StringBuilder sb = new StringBuilder();
        while(w1<word1.length() && w2<word2.length()){
            if(word1.substring(w1).compareTo(word2.substring(w2))>0){
                sb.append(word1.charAt(w1));
                w1++;
            }else{
                sb.append(word2.charAt(w2));
                w2++;
            }
        }
        if(w1<word1.length()){
            sb.append(word1.substring(w1));
        }
        if(w2<word2.length()){
            sb.append(word2.substring(w2));
        }
        return sb.toString();
    }
}