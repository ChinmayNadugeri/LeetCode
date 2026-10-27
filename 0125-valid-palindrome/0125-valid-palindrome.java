class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        if(s.length()==0||s.length()==1) return true;
        while(left<=right){
            char currFirst=s.charAt(left);
            char currLast=s.charAt(right);
             if(!Character.isLetterOrDigit(currFirst)){
                left++;
             }else if(!Character.isLetterOrDigit(currLast)){
                right--;
             }
             else{
                if(Character.toLowerCase(currFirst)!=Character.toLowerCase(currLast)) return false;
                left++;
                right--;
             }
            }
            return true;
        }
    }