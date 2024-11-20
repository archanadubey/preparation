package StringLearning;

public class BasicStringDemo {
    public static void main(String[] args) {


        // creating string by using newkeyword
        String str = new String("Example");
        String str1 = new String("Arc");
        String str2= new String("Example");
        String str3= new String("Example");
        String str4= new String("Example");
      //  String str5= new String("Example1");

        String a,b,c,d,e = "Archana";
       // String b = "Arc"; // result: variable b is already defined in method main(java.lang.String[])

        //System.out.println(b);



        // It will create two object in the memory
        //First it will create an object in heap are
        //then it will create an abject in String constant pool


        System.out.println(str);
        System.out.println(str1);

        String name = "ArchanaD";
        name.concat("Dubey");// it will not make any chnages in the original String
        System.out.println(name);//output ; ArchanaD
        String name1= name.concat("Vikash");// we have given the different refrence to the concatinated string
        System.out.println(name1);// ouput: ArchanaDVikash

        //construct one string from another car array

        char charArray[] = {'g','f','c'};
        char cr[] = {'a','r','c','h','o','o'};
        String newString = new String(charArray);
        System.out.println("Char array into String : "+ newString);

        String stry = new String(cr);
        System.out.println("Char array into String : "+stry);




    }
}