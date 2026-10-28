class Solution {
    public int lengthOfLastWord(String s) {
        int counter=0, right=s.length()-1;
        while(right>=0 && s.charAt(right)==' '){
            right--;
        }
        while(right>=0 && s.charAt(right)!= ' '){
            counter++;
            right--;
        }
        return counter;
    }
}