class Solution {
public:
    bool isHappy(int n) {
        int a=0,b=0;
         if(n<=9){
            if(n==1 || n==7){
                return true;
            }
            else
            return false;
        }
        else{
        while(n!=0){
            a=n%10;
            n=n/10;
            b+=a*a;
        }
        }
        n=b;
        return isHappy( n);
      
        
    }
};