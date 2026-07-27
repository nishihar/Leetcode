class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int r=nums.length-1;
        while(i<=r){
            int mid=(i+r)/2;
            if(nums[mid]==target){
                return  mid;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return -1;
    }
}