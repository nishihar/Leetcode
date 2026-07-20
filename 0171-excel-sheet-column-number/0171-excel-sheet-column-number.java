class Solution {
    public int titleToNumber(String columnTitle) {
        String Title=columnTitle;
        int n=Title.length();
        int a=0;
        int count=0;
        for(int i=n-1;i>=0;i--){
            a=a+(int)Math.pow(26,count)*(Title.charAt(i)-64); 
            count++;
        }
        return a;
    }
}