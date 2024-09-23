package OOPS.class1;

/*
 * -> CONSTRUCTOR IS A SPECIAL FUNCTION HAVING ARGUMENTS IT ALLOCATES VALUES TO VARIABLES
 * ->BY DEFAULT : IT IS EMPTY ARGUMENTS AND INTIALIZE DEFAULT VALUES TO VARIABLES
 *  -> WHEN CONSTRUCTOR IS CREATED IT BECOEMES MANDATORY DEFAULT CONSTRUCTOR IS OVER WRITTEN
 *  -> FROM CONSTRUCTOR CALLING OTHER CONSTRUCTOR USING THIS KEYWORD : this (arg..) ;
 *   -> COPY CONSTRUCTOR  :
 */

public class Main3 {
    public static void main(String[] args) {

        // // USING CONSTUCTORS :
        // Student3 rishi = new Student3(101, "Rishi", 22); // WHENEVER THIS IS CREATED
        // CONSTRUCTOR IS INVOKED
        // // System.out.println(rishi.name); //

        // // INVOKING FUNCTIONS OR METHODS
        // rishi.changeName("Varma");
        // rishi.gretting();

        // // HAVING 2 CONSTRUCTORS WITH SAME NAME ACCORDING TO ARGUMENTS IT IS INVOKED
        // Student3 raghav = new Student3();
        // System.out.println(raghav.name); // MOHAN

        // FROM CONSTRUCTOR CALLING OTHER CONSTRUCTOR USING THIS KEYWORD : this (arg..)
        // ;
        Student3 mohan = new Student3();
        System.out.println(mohan.studentId); // 13
        System.out.println("String : " + mohan.name); // Mohan
        System.out.println(mohan.age); // 22

        //COPY CONSTRUNCTOR :
        Student3 hariharan = new Student3(mohan) ;
        // now hariharan objects have same property values as mohan
        System.out.println(hariharan.studentId);  //13
    }
}

class Student3 {
    int studentId;
    String name;
    int age;
    char gender;
    float weight = 82.4f;
    double height;
    int[] array1;
    char[] char1;

    // CONSTRUCTOR OVERLOADING
    Student3() {
        // this.studentId = 999;
        // this.name = "mohan";
        // this.age = 60;
        this(13, "Mohan2", 22); // CALLING OTHER CONSTRUCTOR USING THIS
    }

    Student3(int id, String name, int age) {
        // THIS KEYWORD : POINT TO THE PRESENT OBJECT
        this.studentId = id;
        this.name = name;
        this.age = age;

    }
//    COPY CONSTRUCTOR :
    Student3(Student3 old){
        this.studentId = old.studentId;
        this.name = old.name;
        this.age = old.age;
    }

    // to create a function
    void gretting() {
        // System.out.println("hello my name is : " + name); // here by defualt it uses
        // this keyword
        System.out.println("hello my name is : " + this.name); // this is replaced with present object name
    }

    void changeName(String newName) {
        name = newName;
    }
}
