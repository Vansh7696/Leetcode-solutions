class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(left!=right){
                return helper(i+1,j,s) || helper(i,j-1,s);
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public boolean helper(int i,int j, String s){
        while(i<j){
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}