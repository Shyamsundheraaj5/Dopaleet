class Solution {
    public int minimumDeletions(String s) {
        int c =0;
        int deletion=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'b' ) c++;
            if(ch == 'a' && c>0){
                c--;
                deletion++;
            }
        }
        return deletion;
    }
}