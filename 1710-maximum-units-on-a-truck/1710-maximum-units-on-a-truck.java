class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int totalS = 0;
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        for(int i=0;i<boxTypes.length;i++){
            int b = boxTypes[i][0];
            int ub = boxTypes[i][1];
            if(b <= truckSize){
                totalS += b*ub;
                truckSize-=b;
            }else{
                totalS+= truckSize*ub;
                truckSize=0;
            }
            if(truckSize==0){
                break;
            }
        }
        return totalS;
    }
}