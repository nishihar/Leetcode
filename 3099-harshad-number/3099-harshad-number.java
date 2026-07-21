class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a=0,sum=0,org=x;
        while(x!=0){
            a=x%10;
            x=x/10;
            sum+=a;
        }
        if( org%sum==0){
            return sum;
        }
       return -1;
        
    }
}