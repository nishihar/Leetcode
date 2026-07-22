class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;int temp;
       /* 
         if(n==2&& nums[1]!=0){
            temp=nums[0];
            nums[0]=nums[1];
            nums[1]=temp;
        }
       */
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        
        
      for (int i = j; i < n; i++){
            nums[i]=0;
        }
        
    }
}