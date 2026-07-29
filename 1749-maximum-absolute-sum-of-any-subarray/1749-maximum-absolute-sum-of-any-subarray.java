class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int maxSum=0;
        int minSum=0;
        for(int i=0;i<nums.length;i++){
            maxSum+=nums[i];
            max=Math.max(max,maxSum);
            if(maxSum<0){
                maxSum=0;
            }
            
            minSum+=nums[i];
            min=Math.min(min,minSum);
            if(minSum>0){
                minSum=0;
            }
        }
        return Math.max(Math.abs(max),Math.abs(min));
    }
}