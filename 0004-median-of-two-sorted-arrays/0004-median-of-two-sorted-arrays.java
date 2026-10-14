class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int newArr[]= new int[(nums1.length+nums2.length)];
        System.arraycopy(nums1,0,newArr,0,nums1.length);
        System.arraycopy(nums2,0,newArr,nums1.length,nums2.length);
        int n=newArr.length;
        Arrays.sort(newArr);
        double median =0;
        if(n%2!=0){
             median = (double)newArr[((n/2)+ (1/2))];
        }
        else{
             median = (double)(newArr[((n-1)/2)]+newArr[(((n-1)/2)+1)])/2;
        }
        return median;
    }
}