package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng ");
        int size1 = scanner.nextInt();
        System.out.println("Nhập số cột của mảng");
        int size2 = scanner.nextInt();
        double[][] matrix = new double[size1][size2];
        for (int i=0;i< size1;i++){
            for(int j =0;j<size2;j++){
                System.out.println("Nhập phần tử "+(j+1)+" của hàng "+(i+1));
                matrix[i][j]= scanner.nextDouble();
            }
        }
        for (int i=0;i< size1;i++){
            System.out.println("");
            for(int j =0;j<size2;j++){
                System.out.print(matrix[i][j]+"\t");
            }
        }
//        double[][] matrix = {
//                {1,2,3},
//                {4,5,6},
//                {2,3,4}
//        };
        double sum = 0;
        System.out.println("\nTính tổng ở cột thứ mấy?");
        int col = scanner.nextInt();
        for (int i = 0;i< matrix.length;i++){
               sum += matrix[i][col-1] ;
        }
        System.out.println("Tổng các số ở cột "+col+" là "+sum);
    }
}
