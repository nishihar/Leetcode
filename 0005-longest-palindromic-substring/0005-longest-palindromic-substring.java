class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                if ((j - i + 1) <= longest.length()) {
                    break;
                }
                
                if (s.charAt(i) == s.charAt(j)) {
                    int left = i;
                    int right = j;
                    boolean isPalindrome = true;
                    
                    while (left < right) {
                        if (s.charAt(left) != s.charAt(right)) {
                            isPalindrome = false;
                            break;
                        }
                        left++;
                        right--;
                    }
                    
                    if (isPalindrome) {
                        String currentSub = s.substring(i, j + 1);
                        if (currentSub.length() > longest.length()) {
                            longest = currentSub;
                        }
                        break;
                    }
                }
            }
        }
        return longest;
    }
}
