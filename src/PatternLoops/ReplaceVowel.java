package PatternLoops;

public class ReplaceVowel {

    public static void main(String[] args) {

        String str = "Welicomeya";
        // String str1 = "";
        String newStr = str.replaceAll("[aeiou]", "@");

        System.out.println(newStr);





                String string = "The best of both worlds";
                int count = 0;
                //Counts each character except space
                for(int i = 0; i < string.length(); i++) {
                    if(string.charAt(i) != ' ')


                        count++;

                }
        System.out.println(count);


//        char [] c = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//
//            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
//                System.out.println(str.replace(c[i], 'Q'));

               // System.out.println(str1);

            //}

     //   }

        String original = "Hello, World!";
        String substringToRemove = "World";

        int startIndex = original.indexOf(substringToRemove);
        if (startIndex != -1) {
            String result = original.substring(0, startIndex) + original.substring(startIndex + substringToRemove.length());
            System.out.println(result); // Output: "Hello, !"
        }
    }
}



