package ArraysExercise;


import java.util.Scanner;

public class MaximumAndMinimumElement {


    public static void main(String[] args) {
        // take input from the User
        System.out.println("Enter the size of the Character : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); /* int array of each element take 4bite of memory in stack and whole array it linearly
                                            connected to its next element */


        // Create a Array
        int [] numbers;
        numbers  = new int[size];
        // Enter the Element of the Character

        System.out.println("Enter the Element of the Character : ");
        // input Array
        for(int i =0; i<size; i++){

            numbers[i]= sc.nextInt();

        }

        // for output of entered Array

        for(int a: numbers){
            System.out.print(" "+a);
        }

    }
}
