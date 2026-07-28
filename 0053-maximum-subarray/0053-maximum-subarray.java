class Solution {
    public int maxSubArray(int[] nums) {
        int start=0;
        int n=nums.length;
        int curr=0;
        int maxSum=nums[0];
        for(int end=0;end<n;end++){
           curr+=nums[end];
           maxSum=Math.max(curr,maxSum);
           if(curr<0){
            curr=0;
           }

        }
        return maxSum;
    }
}