class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        int max=nums[0];
        int min=nums[0];
        int maxSum=0;
        int minSum=0;
        int total=0;
       
       for(int i=0;i<nums.length;i++){
        minSum+=nums[i];
        min=Math.min(minSum,min);
        if(minSum>0)minSum=0;
        maxSum+=nums[i];
        max=Math.max(maxSum,max);
        if(maxSum<0)maxSum=0;
        total+=nums[i];
       }
       if (max < 0) return max;
       return Math.max(max, total - min); 
    }
}