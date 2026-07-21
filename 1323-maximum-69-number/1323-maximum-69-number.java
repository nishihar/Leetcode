class Solution {
    public int maximum69Number (int num) {
       
        String s = String.valueOf(num);
        
       
        String result = s.replaceFirst("6", "9");
        
    
        return Integer.parseInt(result);
    }
}
