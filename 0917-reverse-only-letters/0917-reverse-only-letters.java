class Solution {
    public String reverseOnlyLetters(String s) {
         char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        String vowels = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        while (i <= j) {
            if (vowels.indexOf(chars[i]) == -1) {
                i++;
            } else if (vowels.indexOf(chars[j]) == -1) {
                j--;
            } else {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        
        return new String(chars);
    }
}