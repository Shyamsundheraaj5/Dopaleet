class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                boolean checkLeft = true;
                int left1 =left+1;
                int right1 = right;
                while(left1<right1){
                    if(s.charAt(left1) != s.charAt(right1)){
                        checkLeft = false;
                        break;
                    }
                    left1++;
                    right1--;
                }
                boolean checkRight = true;
                int left2 = left;
                int right2 = right-1;
                while(left2<right2){
                    if(s.charAt(left2) != s.charAt(right2)){
                        checkRight = false;
                        break;
                    }
                    left2++;
                    right2--;
                }
                return checkLeft || checkRight;
            }
            left++;
            right--;
        }
        return true;

    }
}