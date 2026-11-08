class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> freq= new HashMap<>();
        for(char ch: s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        boolean odd = false;
        int res = 0;
        
        for(char ch: freq.keySet()){
            int val=freq.get(ch);
            if(val%2==0) res = res + val;
            else{
                odd = true;
                res = res + val -1;
            }
        }
        if(odd==false) return res;
        else{
            return (res+1);
        }
    }
}