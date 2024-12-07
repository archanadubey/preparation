//Bharath: 57 video TightCoupling And LooseCoupling


package Spring.tightCoupling;

public class Subject {

    Topic t = new Topic();

    public void startReading(){

        t.understand();



    }

}

class Topic {

    public void understand(){
        System.out.println("Tight coupling Concept: ");
    }

}

/*EXPLANATION: In the above program the Subject class is directly dependent on Topic class.
Subject class and topic class are tightly couped.
Any change in the subject class lead to change in the Topic class.
If Topic class understand() method change to gotIt() method then we need to change
startReading() method need to call gotIt() method instead of understand() method.
*
*
*
*
* */