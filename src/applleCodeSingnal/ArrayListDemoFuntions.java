package applleCodeSingnal;

import java.util.ArrayList;

public class ArrayListDemoFuntions {

    // Creating a ArrayList
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        System.out.println(list);
        // get firstItem of List
       String firstItem =  list.get(0);
        System.out.println(firstItem);
        // get lasttItem of List
        String lastItem = list.get(list.size()-1);
        System.out.println(lastItem);

        // search D in the list

        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals("D")){
                list.remove(i);
                list.add(i,"Done");
                break;

            }
         }

        System.out.println("After Modification :" +list);
    }
}
