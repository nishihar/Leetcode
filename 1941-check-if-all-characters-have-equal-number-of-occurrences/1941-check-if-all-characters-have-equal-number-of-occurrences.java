class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char key :s.toCharArray()){
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }int a=map.get(s.charAt(0));
        for(int i=0;i<n;i++){
            if(map.get(s.charAt(i))!=a){
                return false;
            }
        }
        return true;
    }
}