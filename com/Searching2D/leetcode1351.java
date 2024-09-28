package com.Searching2D;

public class leetcode1351 {
    public static void main(String[] args) {
        int[][]  grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    static int countNegatives(int[][] grid) {
        int res=0;
        int r=grid.length-1;
        int rstart=0;
        int cstart=0;
       
        while(r>=rstart){
            int c=grid[r].length-1;
            while(c>=cstart){
                if(grid[r][c]<0){
                    res++;
                    c--;
                   
                }
                else{
                    cstart=c+1;
                    break;

                }
                
            }
            r--;
        }
        return res;
    }
}
