package OOPS.class2;

/*
*   STATIC BLOCK : To initialze static variables
*
* */


public class Main3 {
    static  int a = 4 ;
    static int b  ;
   int c = 0 ;
//    STATIC BLOCK : hat are executed exactly once when the class is first loaded by the Java Virtual Machine (JVM)
    static {
        System.out.println("Hi am static block");
        b = a * 5 ;
    }

    public static void main(String[] args) {

        Main3 obj1 = new Main3() ;

        System.out.println(Main3.a + " " + Main3.b);

        Main3.b +=3 ;
        System.out.println(Main3.a + " " + Main3.b);


    }


}
