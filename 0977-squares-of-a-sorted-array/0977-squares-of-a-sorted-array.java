class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j= nums.length-1;
        int [] res = new int[nums.length];
        int k = res.length-1;
        int isquare = 0;
        int jsquare = 0;
        while(i<=j){
            isquare = nums[i]*nums[i];
            jsquare=nums[j]*nums[j];
            if(isquare<jsquare){
                res[k]=jsquare;
                j--;
                k--;
            }else{
                res[k]=isquare;
                i++;
                k--;
            }
        }
        return res;
    }
}