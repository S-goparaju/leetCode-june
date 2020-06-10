class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = s.length();
        int right = t.length();
        int l=0;
        int r=0;
        
        while(l<left && r< right){
            if (s.charAt(l)==t.charAt(r)){
                l+=1;
            }
            r+=1;
            
          
     
        }
          return l==left;
    }
}
