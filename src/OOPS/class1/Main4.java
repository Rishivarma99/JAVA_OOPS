package OOPS.class1;

/*
 * ->REFERENCE VARIABLE
 * ->PRIMITIVE VARAIBLES : FIXED SIZE,STORED IN STACK EXCEPTION(ARRAYS (REF IN STACK AND DATA IN HEAP ) AND CLASS STATIC VARIABLES )
 * ->FINAL KEYWORD :
 *   ->variables  : immutable ,  must be intialized , constant dont chang
 */

public class Main4 {

    public static void main(String[] args) {

        Student4 one = new Student4();
        Student4 two = one; // HERE ONE AND TWO ARE POINTING TO SAME MEMORY IN THE HEAP OR REFENCE VARIABBLE

        one.name = "somithin somthing";
        System.out.println(two.name); // somithin somthing

        // WRAPPER OBJECTS :
        int a1 = 10; // here a is primitive
        int a2 = 20;
        swap1(a1, a2);
        System.out.println("after swap" + a1 + " " + a2);

        // WRAPPER CLASSES : Provide way to treat primitive dat types as objects which
        // can be used in oops
        Integer b1 = 10; // this b1 is an object
        Integer b2 = 20;
        swap2(b1, b2); // being object passing by reference still dont change BECOZ OF FINAL KEYWORD
        // here b1 and b2 are passed as shallow copy and dont reflect in main variables
        System.out.println("after swap" + b1 + " " + b2);

        // FINAL KEYWORD :
        final int final1 = 2;

    }

    static void swap1(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap2(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class Student4 {
    int studentId;
    String name;
    int age;
    char gender;
    float weight = 82.4f;
    double height;
    int[] array1;
    char[] char1;

    // CONSTRUCTOR OVERLOADING
    Student4() {
        this.studentId = 999;
        this.name = "mohan";
        this.age = 60;

    }

    Student4(int id, String name, int age) {
        // THIS KEYWORD : POINT TO THE PRESENT OBJECT
        this.studentId = id;
        this.name = name;
        this.age = age;

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

