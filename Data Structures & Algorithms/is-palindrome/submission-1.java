public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        int left =0;  
        int right = s.length()-1;
        while(left <right){
            while(right>left && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
             while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

           if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
           return false;
           } else{
            left++;
            right--;
           }
        
        }
        return true;
    }

}