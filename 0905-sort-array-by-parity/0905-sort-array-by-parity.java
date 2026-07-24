class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a=0;
        int b=nums.length-1;
        int temp;
        while(a<b){
            if(nums[a]%2!=0 && nums[b]%2==0 ){
                temp=nums[a];
                nums[a]=nums[b];
                nums[b]=temp;
                a++;
                b--;
            }
            else if(nums[a]%2==0){
                a++;
            }
            else{
                b--;
            }
        }
        return nums;
    }    
}