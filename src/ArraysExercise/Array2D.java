package ArraysExercise;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        System.out.println("Enter the row of the Array : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        System.out.println("Enter the row of the Array : ");
       int cols = sc.nextInt();
       
       int [] [] array = new int[row][cols];

       System.out.println("Enter the Elements of the Array : ");
       //Input
       for(int i = 0; i<row;i++){
           for(int j = 0; j<cols;j++){
               array[i][j] = sc.nextInt();
           }
       }

       // output
        for(int i = 0; i<row;i++){
            for(int j = 0; j<cols;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    // Search the elements 5 and return the indices of the elements
        System.out.println("Search the Elements : ");
     int search = sc.nextInt();

     for(int i = 0; i<row;i++){

         for(int j = 0; j<cols;j++){
             if (search == array[i][j]){
                 System.out.println("found the Element at : ("+i+","+j+")");
             }

         }



     }


    }
}
