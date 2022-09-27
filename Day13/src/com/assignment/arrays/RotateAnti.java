package com.assignment.arrays;

public class RotateAnti {
        static void rotateMatrix(int N, int mat[][],int ar[][])
        {

            for(int i=0;i<N;i++) {
                for(int j=0;j<N;j++)
                {
                    ar[i][j]=mat[j][N-1-i];
                }
            }
        }

        static void displayMatrix(int N, int mat[][])
        {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    System.out.print(" " + mat[i][j]);

                System.out.print("\n");
            }
            System.out.print("\n");
        }

        public static void main(String[] args)
        {
            int N = 3;

            int mat[][] = { { 1, 2, 3 },
                    { 4, 5, 6 },
                    { 7, 8, 9 } };
            int ar[][]= new int[N][N];

            rotateMatrix(N, mat,ar);


            displayMatrix(N, ar);
        }
}