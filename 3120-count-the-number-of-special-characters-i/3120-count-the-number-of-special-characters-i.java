class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] seen = new boolean[128];

        for(char ch:word.toCharArray()){
            seen[ch] = true;
        }
        int count=0;

        for(int i=0;i<26;i++){
            if(seen['a'+i] && seen['A'+i]) count++;
        }
        return count;
    }
}