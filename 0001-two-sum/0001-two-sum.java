class Solution {
    public int[] twoSum(int[] nums, int target) {
       int a,n=nums.length;
       int arr[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                a=nums[i]+nums[j];
                if(a==target){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
                
                
            }   
        }

     return arr;
        
    }
}