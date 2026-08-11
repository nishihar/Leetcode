class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int maxcount=0;
        int right=0;
        int n=nums.length;
        while(right<n){
            while(nums[right]-nums[left]>1){
                left++;
            }
            if(nums[right]-nums[left]==1){
                int count=right-left+1;
                if(count>maxcount){
                    maxcount=count;
                }
            }
            right++;
        }
        return maxcount;
    }
}