package PatternLoops;
// Java program to illustrate creating
//  an array of objects
public class Student {
    int rollNum;
    String name;

    Student(int rollNum, String name) {

        this.rollNum = rollNum;
        this.name = name;

    }
}
class Test {
    public static void main(String[] args) {


        Student[] array = new Student[5];
        array[0] = new Student(1, "archana");
        array[1] = new Student(2, "archu");
        array[2] = new Student(3, "archoo");
        array[3] = new Student(4, "archi");
        array[4] = new Student(5, "archive");

        for(int i = 0 ; i< array.length;i++)
            System.out.println("Student record : " + i + " " + array[i].name+" "+ array[i].rollNum);



    }
}