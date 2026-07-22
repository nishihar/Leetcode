class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int a=0;
        for(int i=0;i<n;i++){
            if(nums[(i+1)%n]<nums[i]){
                a++;
            }
        }
        return a<=1;
    }
}