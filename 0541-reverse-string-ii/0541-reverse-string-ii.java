class Solution {
    public String reverseStr(String s, int k) {
        int a=0;
        int b=(2*k-k)-1;
        char []arr=s.toCharArray();
      
        while(a<arr.length && b<arr.length){
            int i=a;
            int j=b;
         while(i<j){
           char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            }
            a+=2*k;
            b+=2*k;
        }
        b=arr.length-1;
        while(a<b){
           char temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
            }
        s=new String(arr);
    return s;
    }
}