public class StringsBuilder {
    public static void main(String[] args) {

        // create a StringBuilder object
        StringBuilder sb = new StringBuilder("Discipline");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));//D
        System.out.println(sb.charAt(sb.length()-1));// e

        //set character at index 0
        sb.setCharAt(0,'G');
        System.out.println(sb);//Giscipline

        // insert at index 2
        sb.insert(2,'R');
        System.out.println(sb);

        //Delete at index 0
        sb.delete(0,3); // end index is not included
        System.out.println(sb);

        // append function, we can append all the primitive data type,Objects
        StringBuilder sba = new StringBuilder("h");
        sba.append("e");
        sba.append(1);
        boolean b = true;
        sba.append(b);
        System.out.println("Appended String: "+sba);

        // Write a program to reverse a string
        String str = "Money";
        String reversed = "";

        for (int i=str.length()-1;i>=0;i--){
            reversed = reversed + str.charAt(i);

            System.out.println("Reversed String: "+reversed);



        }





    }







}
