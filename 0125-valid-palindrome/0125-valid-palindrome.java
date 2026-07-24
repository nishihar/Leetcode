class Solution {
    public boolean isPalindrome(String s) {
        String st="";
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                st+=Character.toLowerCase(c);
            }
        }
        
        int n=st.length();
        int a=0;
        int b=n-1;
        while(a<b){
            if(a==b)return true;
            if(st.charAt(a)==st.charAt(b)){
                a+=1;
                b-=1;
            }
            else{
                return false;
            }
        }
        return true;
    }
}