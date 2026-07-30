class Solution {
    public int calPoints(String[] operations) {
       Stack  <Integer> st=new Stack<>();
       for(String s:operations){
        if(s.equals("C")){
            st.pop();
        }
        else if(s.equals("D")){
            st.push(st.peek()*2);
        }
        else if(s.equals("+")){
            int temp=st.pop();
            int temp2=st.peek();
            st.push(temp);
            st.push(temp+temp2);
        }
        else{
            st.push(Integer.parseInt(s));
        }
       } 
       int sum=0;
       while(!st.empty()){
        sum+=st.pop();
       }
       return sum;
    }
}