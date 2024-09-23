package OOPS.class1;

/**
 * FINAL KEYWORD :
 * -> wrapper classes are by defult final
 * -> FINAL VARIABLES :
 * >IF FINAL VARIABLE WITH PRIMITVE VALUES LIKE IN ,CHAR THEN THE VALUES CANT
 * BEE CHANGED
 * >IF FINAL IS ASSIGNED TO A OBJECT ITSELF THEN WE CAN CHANGE
 *
 * ->FINAL METHODS :
 *
 * -> FINAL CLASSES :
 *
 *
 * ->JAVA GARBAGE COLLECTION :
 * >WE CAN SPECIFY WHAT TO DO WHEN THE OBJECT IS DESTOYED BY JAVA USING finalize
 * keyword
 */

public class Main5 {

    public static void main(String[] args) {

        final int a1 = 10; // we cant change

        final Student5 rishi = new Student5("Rihsi"); // initialing a final object

        rishi.name = "Rishi Varma";// BEING A FINAL OBJECT STILL WE CAN CHANGE THE NAME PROPERTY AS IT BEING AN OBJ

        // GARBAGE COLLECTOR
        Student5 obj1;
        for (int i = 0; i < 10000000; i++) {
            // for each time loop run obj is pointing to new address and the befor one willl
            // be deleted by java garbage
            obj1 = new Student5();
        }

    }

}

class Student5 {
    final int id = 1;
    String name;

    Student5() {
        this.name = "mohan";
    }

    Student5(String name) {
        this.name = name;
    }

    // finilize keyword : for this class
    @Override
    protected void finalize() throws Throwable {
        System.out.println("destructor");
    }
}
