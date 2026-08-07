import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        
        HashSet<Integer> intersect = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                intersect.add(num);
            }
        }
        
        int[] result = new int[intersect.size()];
        int index = 0;
        for (int num : intersect) {
            result[index++] = num;
        }
        
        return result;
    }
}
