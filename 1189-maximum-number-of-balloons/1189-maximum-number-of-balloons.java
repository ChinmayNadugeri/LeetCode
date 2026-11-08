class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> have = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();

        for(char ch: text.toCharArray()){
            have.put(ch,have.getOrDefault(ch,0)+1);
        }

        need.put('b',1);
        need.put('a',1);
        need.put('l',2);
        need.put('o',2);
        need.put('n',1);

        
        int res = Integer.MAX_VALUE;

        for(char ch: need.keySet()){
            int times = have.getOrDefault(ch,0)/need.get(ch);
            res = Math.min(res,times);
        }
        return res;

        }
    }
