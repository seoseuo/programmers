class Solution {
    public int solution(int[][] sizes) {
        int box,maxW=0,maxH=0;
                
        
        for(int i=0; i<sizes.length; i++) {
            for(int j=0; j<2; j++) {
                if(sizes[i][0] < sizes[i][1]) {
                    box = sizes[i][1];
                    sizes[i][1] = sizes[i][0];
                    sizes[i][0] = box;
                }
                
                maxW = maxW < sizes[i][0] ? sizes[i][0] : maxW;
                maxH = maxH < sizes[i][1] ? sizes[i][1] : maxH;
            }
        }        

        return maxW*maxH;
    }
}