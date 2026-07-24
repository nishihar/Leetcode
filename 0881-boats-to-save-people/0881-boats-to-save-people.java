class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int a=0;
        int b=people.length-1;
        int count=0;
        Arrays.sort(people);
        while(a<=b){
            if(people[a]+people[b]<=limit){
                a++;
               }
            b--;
           count++;
        }
        return count;
    }
}