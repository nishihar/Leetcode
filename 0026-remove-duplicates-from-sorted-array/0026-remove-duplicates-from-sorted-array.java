class Solution {
    public int removeDuplicates(int[] nums) {
     
        int n=nums.length;
        int a=nums[0];
        int count=1;
        int j=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                count++;
                j++;
                nums[j]=nums[i+1];
            }
            
        }
      
        return count;
    }
}