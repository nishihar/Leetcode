class Solution {
    public int maxArea(int[] height) {
        int a=0;
        int b=height.length-1;
        int res=0,cal=0;
        while(a<b){
            cal=(b-a)*Math.min(height[a],height[b]);
            if(cal>res){
                res=cal;
            }
            if(height[a]<=height[b]){
                a++;
            }
            else{
                b--;
            }
        }
        return res;
    }
}