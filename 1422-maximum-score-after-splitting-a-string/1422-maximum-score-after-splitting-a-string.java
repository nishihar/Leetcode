class Solution {
    public int maxScore(String s) {
        int n = s.length();
        
        // Arrays to store our visual star patterns as Strings
        String[] leftZerosPattern = new String[n];
        String[] rightOnesPattern = new String[n];
        
        // 1. Forward Star Pattern: Add a '*' every time we find a '0'
        String zeroStars = "";
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                zeroStars += "*";
            }
            leftZerosPattern[i] = zeroStars;
        }
        
        // 2. Inverse Star Pattern: Add a '*' every time we find a '1' (scanned backwards)
        String oneStars = "";
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                oneStars += "*";
            }
            rightOnesPattern[i] = oneStars;
        }
        
        // 3. Sum the pattern lengths at each step to find the max score
        int maxScore = 0;
        
        // Loop stops at n - 2 because both split sides must be non-empty
        for (int i = 0; i < n - 1; i++) {
            // Count stars on the left side up to i
            int leftScore = leftZerosPattern[i].length();
            
            // Count stars on the right side from i + 1 to the end
            int rightScore = rightOnesPattern[i + 1].length();
            
            int currentScore = leftScore + rightScore;
            maxScore = Math.max(maxScore, currentScore);
        }
        
        return maxScore;
    }
}
