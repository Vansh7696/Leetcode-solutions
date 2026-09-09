class Solution {
    public int countCommas(int n) {
        int count = 0;
        for(int i=0;i<=n;i++){
            int x = i;
            if(x>=1000){
                count++;
                x/=1000;
            }
        }
        return count;
    }
}