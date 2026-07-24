class Solution {
    public void duplicateZeros(int[] arr) {
        int a=0;
        int b=0;
        int [] temp=new int[arr.length];
        while(a<arr.length&&b<temp.length){
            if(arr[a]!=0){
                temp[b]=arr[a];
                a++;
                b++;
            }
            else{
                temp[b]=0;
                if(b+1<temp.length){
                temp[b+1]=0;
                }
                b+=2;
                a++;
            }
        }
        for(int x=0;x<arr.length;x++){
            arr[x]=temp[x];
        }
        
    }
}