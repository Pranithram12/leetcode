class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> Integer.compare(a[0],b[0]));
        int arrows=1;
        int prevstart=points[0][0];
        int prevend=points[0][1];
        for(int i=1; i<points.length;i++){
            int currstart=points[i][0];
            int currend=points[i][1];
            if(currstart > prevend){
                arrows++;
                prevstart=currstart;
                prevend=currend;
            }
            else{
               prevstart=Math.max(prevstart,currstart);
               prevend=Math.min(prevend,currend); 
            }
        }
        return arrows;
    }
}