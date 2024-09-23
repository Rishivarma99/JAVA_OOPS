package OOPS.class1;


// CLASES AND OBJECTS
/*
 * ->AN OBJECT AND CLASS HAVE A RELATION TO CREATE MULTPLE SIMILAR OBJECTS WE CREATE A CLASS TO MINIMIZE THE CODE
 * -> RUNTIME : AFTER COMPILATION OVER THE PROGRAM IS RUNNING
 * -> COMPILE TIME : AT THE TIME OF COMPILING THE PROGRAM
 * -> Student rishi (compile time) = new Student() (run time) ;
 * ->STATIC MEM ALOCATION : at compile time, stored in heap or stack,
 * ->DYNAMIC MEM ALLOCATION : new keword, at run time, stored in heap
 * ->IF WE TRY TO INITIALIZE A PROPERTY WHICH IS NOT IN THE CLASS FOR THE INSTANSCE WE CREATED ITS NOT POSSIBLE IN JAVA AND PSSIBLE IN PYTHON
 */
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        // CREATING AN INSTANCE OF CLASS STUDENT

        Student2 student1; // if like this it is just in stack not at intialized
        // System.out.println(student1); // error : says to intialize it

        Student2[] student2 = new Student2[5]; // creating objects
        // System.out.println(Arrays.toString(student2)); // [null, null, null, null,
        // null]

        Student2 rishi = new Student2(); // dynamically allocates memory and returns a memory to it
        System.out.println(rishi); // Student@3ffcd140

        // DEFAULT VALUES OF PROPERTIMS BEFOR INTIALIZING
        System.out.println(rishi.studentId); // 0
        System.out.println("String : " + rishi.name); // null
        System.out.println(rishi.weight); // 0.0
        System.out.println("Character: " + rishi.gender); // ""
        System.out.println("Double: " + rishi.height); // 0.0

        System.out.println(Arrays.toString(rishi.array1)); // null
        System.out.println(Arrays.toString(rishi.char1)); // null
        System.out.println();
        rishi.studentId = 2;
        System.out.println(rishi.studentId);

        // rishi.salary = 10 ; IT CANT BE INTIALISED AS IT IS NOT DECLARED IN CLASS

    }

}

class Student2 {
    int studentId; // def : 0
    String name; // null
    int age; // 0
    char gender; // " "
    float weight; // 0.0
    double height; // 0.0
    int[] array1; // null
    char[] char1; // null

    // Student(int id, String name, int age) {
    // this.studentId = id;
    // this.name = name;
    // this.age = age;

    // }
}
