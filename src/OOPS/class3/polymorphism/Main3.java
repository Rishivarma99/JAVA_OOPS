package OOPS.class3.polymorphism;

/*
*   ->RUN TIME POLY / DYNAMIC POLY / late binding : DONE BY METHOD OVERRIDING
*  ->//      *** PLAYING WITH DEFFERENT INTIALIZATION AND HOW OVERIDDING WORKS
*  -> DYNAMIC METHOD DISPATCH
*  ->FINAL KEYWORD ON METHOD S / early binding: IF KEPT THEN WE CANT OVERIDE THAT METHOD
* */

public class Main3 {

    public static void main(String[] args) {


//    IN MAIN 1 EXPLAINED
//      *** PLAYING WITH DEFFERENT INTIALIZATION AND HOW OVERIDDING WORKS
        Circle circle2 = new Circle();
        //        CASE : REFERENCE VARIABLE AS PARENT OR SUPEER CLASS AND OBJECT IS OF CHILD OR SUB CLASS
//        HERE WHICH METHOD IS CALLED DEPENDS ON OBJECT KNOWN AS UPCASTING
        Shapes circle3 = new Circle();
//        Circle circle4 = new Shapes() ; // error

//        THIS IS CALLED AT RUN TIME AND IN RUNTIME THE DETERMINATION OF WHICH METHOD TO CALL IS DECIDED
        circle2.area();   // normal direct overridding aren in cicle is called
        circle3.area();  // BUT THIS ALSO CALL THE AREA METHOD IN THE CIRCLE
    }
}
