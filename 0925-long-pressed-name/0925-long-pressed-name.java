class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int l=0;
        int r=0;
        int n=typed.length();
        int count=0;
        while(r<n){
           if(l<name.length()&&name.charAt(l)==typed.charAt(r)){
                l++;
                r++;
                count++;
            }
            else if(r>0&&typed.charAt(r)==typed.charAt(r-1)){
                r++;
            }
            else{
                return false;
            }
        }
        if(count==name.length())return true;
        else
        return false;
    }
}