class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        int count=0;
        int backupI = -1;
        int backupJ = -1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
           else if (count == 0) { 
             backupI = i + 1; 
             backupJ = j;   
             j--;             
             count++; 
            } 
            else if (count == 1 && backupI != -1) { 
            i = backupI;    
            j = backupJ;     
            backupI = -1;    
            count++;         
            }
            else{
               return false;
            }
           
        }
        
        return true;
    }
}