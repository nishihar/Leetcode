class Solution {
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
        int a=0;
        String result="";
        while(n!=0){
            n=n-1;
            a=n%26;
            n=n/26;
            result=(char)(a+65)+result;
        }
        return result;
        
    }
}