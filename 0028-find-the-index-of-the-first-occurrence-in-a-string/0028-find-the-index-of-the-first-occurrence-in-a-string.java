class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int hLen = haystack.length();
        int nLen = needle.length();
        int i = 0;
        int count = 0;
        while (i < hLen) {
            if (haystack.charAt(i) == needle.charAt(count)) {
                i++;
                count++;
            } 
            else {
                i = i - count + 1;
                count = 0;
            }
            if (count == nLen) {
                return i - nLen;
            }
        }
        return -1;
    }
}
