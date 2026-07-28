class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int start=0;
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int end=0;end<n;end++){
             if(end-start>k){
            set.remove(nums[start]);
             start++;
        }
        if((end-start)<=k){
            if(set.add(nums[end])==false){
                return true;
            }
        }
       
       
        }
        return false;
    }
}