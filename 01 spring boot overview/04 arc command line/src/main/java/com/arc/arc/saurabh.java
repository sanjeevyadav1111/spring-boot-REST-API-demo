package com.arc.arc;
import java.util.*;

public class saurabh {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int row= sc.nextInt();
        int colomn=sc.nextInt();
        int[][] matrix=new int[row][colomn];
         for(int i=0;i<row;i++){
             for(int j=0;j<colomn;j++){
                  matrix [i][j]=sc.nextInt();
             }
         }
        for(int i=0;i<row;i++){
            for(int j=0;j<colomn;j++){
                System.out.println(matrix[i][j]);
            }
        }

    }
}
