class Solution {
    public boolean isSubsequence(String s, String t) {
        int a =0;
        int b = 0;
        int count=0;
        if(s.length() == 0) return true;
        while(a<s.length() && b<t.length()){
            char ch1 = s.charAt(a);
            char ch2 = t.charAt(b);
            if(ch1 == ch2){
                a++;
                count++;
            }
            b++;
        }
        return (count==s.length())? true:false;
    }
}