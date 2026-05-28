class Solution {
    public boolean isPalindrome(String s) {
        return solve(s,0,s.length()-1);
    }
    public boolean solve(String s, int left, int right){
        if(left>=right) return true;

        if(!Character.isLetterOrDigit(s.charAt(left)))
            return solve(s,left+1,right);
        if(!Character.isLetterOrDigit(s.charAt(right))){
            return solve(s,left,right-1);
        }
        if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right)))
            return false;
        return solve(s,left+1,right-1);
    }
}