class Solution {
    public char findTheDifference(String s, String t) {
        char ans=0;
        for(char c:(s+t).toCharArray()){
            ans ^=c;
        }
        return ans;
    }
}