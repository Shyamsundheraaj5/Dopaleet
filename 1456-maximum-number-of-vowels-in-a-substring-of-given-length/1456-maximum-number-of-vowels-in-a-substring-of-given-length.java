class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int maxCount=0;

        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(vowel(ch)) count++;
        }
        maxCount = count;
        int l=0;
        int r=k-1;
        while(r<s.length()){
            if( vowel(s.charAt(l)) )count--;
            l++;
            r++;
            if(r<s.length()){
                if( vowel(s.charAt(r)) ) count++;
            }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }
    public boolean vowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}