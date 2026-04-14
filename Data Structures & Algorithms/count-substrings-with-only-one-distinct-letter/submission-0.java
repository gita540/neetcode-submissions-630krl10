class Solution {
    public int countLetters(String s) {
        int total =0;
        for(int left =0, right =0; right <= s.length(); right++){
            if(right ==s.length() || s.charAt(left)!=s.charAt(right)){
                int lengthSubstr = right-left;
                total = total+ lengthSubstr *(lengthSubstr+1)/2;
                left = right;
            }
        }
        return total;
    }
}
