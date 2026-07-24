class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int a=0;
        int b=1;
        while(a<nums.length&&b<nums.length){
           if(nums[a]%2==0){
            a+=2;
            }
           else if(nums[b]%2!=0){
            b+=2;
           }
           else{
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
           }
        }
        return nums;
    }
}