package PatternLoops;

import java.util.ArrayList;
import java.util.List;
// Java object variable can be used as a static field, local variable or a method parameter.
public class NumberPattern {

    public static void main(String[] args) {
        System.out.println("Hellow");
        int numArr [] = new int[10];
        int num = 10;
      for (int i = 0;i< numArr.length;i++) {
          numArr[i] = num;
          num += 10;
//accessing hte first element from the array-> int array = arr[index from which we want to access the element]
          System.out.println("Array of index : "+i+" "+numArr[i]);
          // changing an array element

      }

        numArr [0] = 100;
        System.out.println(numArr[0]);


        List<String> li = new ArrayList<>();

        li.add("Apple");
        li.add("Banana");
        li.add("PineApple");
        li.add("Orange");
        li.add("Kivi");

        System.out.println(li);

       for(String str :li)

           System.out.println(str);

        li.remove(1);
        System.out.println(li);

    }
}
