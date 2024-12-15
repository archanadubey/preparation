package ArraysExercise;

import java.util.Arrays;

public class MargeTwoArray {

    public static String mergeBothArray(int [] arr1, int []arr2){
        int size = arr1.length+arr2.length;

        int [] arr3 = new int[size];

        for(int i = 0; i<arr1.length;i=i+1){
            arr3[i] = arr1[i];
        }
        for (int i = 0; i<arr2.length;i=i+1){
            arr3[arr1.length+i] = arr2[i];
        }

        return Arrays.toString(arr3);
    }

    public static void main(String[] args) {

        int [] array1 = {2,4,6,8,10};
        int [] array2 = {11,13,15,17,19};


        System.out.println(mergeBothArray(array1,array2));



    }

}
