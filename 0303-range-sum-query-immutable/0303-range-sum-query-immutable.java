class NumArray {
    int nums[];
    int prefix[];

    public NumArray(int[] nums) {
        this.nums=nums;
        prefix=new int[nums.length];
        prefix[0]=0;
        for(int  i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return (prefix[right]-prefix[left]+nums[right]);
        
    }
}
