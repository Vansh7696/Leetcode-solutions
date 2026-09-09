class Solution {
    public int countCommas(int n) {
        int count = 0;
        for(int i=0;i<=n;i++){
            String s = String.valueOf(i);
            if(s.length()>=4){
                count++;
            }
            if(s.length()>=7){
                count++;
            }
            if(s.length()>=10){
                count++;
            }
        }
        return count;
    }
}