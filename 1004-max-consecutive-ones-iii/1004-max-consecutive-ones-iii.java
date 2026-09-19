class Solution {
    public int longestOnes(int[] nums, int k) {
        int temp = 0;
        int i = 0;
        
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                k--;
            }
            if (k < 0) {
                if (nums[temp] == 0) {
                    k++;
                }
                temp++;
            }
        }
        
        return i - temp;
    }
}
