package OOPS.class3.inheritance;

import org.w3c.dom.ls.LSOutput;

import java.net.StandardSocketOptions;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

/* INHERITANCE :  EXTENDS
 * ->a CALS HAVS NAMES VARIABLES AND FUNCTIONS
 * ->IF ANOTHER CALSS WHICH CAN USE THIS VARIABLES AND FUNCTIONS THEN IS IS INHERITANCE
 *-> BASE CLASS : Any class is a base class
 *-> CHILD CLASS : Deraived from a base class
 *
 * -> SUPER KEYWORD : USED TO CALL PARENT CONSTRUCTOR , TO CALL PARENT METHODS
 *   > also used to intialize values present in parent class
 *   > It can be also used instead of this for accesing parent class variables
 *
 * ->THE ABOVE CLASSES (PARENT) DONT KNOW WHAT ARE BELOW BUT BELOW CLASSES (CHILD) KNOW WHAT VARIABLE ARE ABOVE
 * =>A CHIRD CLASS REFERENCE VARIABLE CAN NEVER POINT TO A PARENT CLASS
 *
 * ->PRIVATE KEYWORD : WHEN KEPT ONLY WE CAN ACCESS INSIDE THE CLASS
 *
 * ->WHEEVER WE ARE CREATING A CHILD OBJECT A PARENT CONSTRUCTOR MUST BE CALLED OTHER WISE A DEFUALT CONSTUCOR OF PARENT CLASS IS CALLED
 *
 *  ->*** STATIC AND OVERRIDING
 *   -> staic methods cant be overrided in child classes
 *   -> they can be inherited means from child class we can call static methods in parent class
 *
 *
 * */
public class Main {

    public static void main(String[] args) {

//    Box obj1 = new Box() ;
//    Box obj2 =  new Box(2.3 , 3.4) ;
//    Box obj3 = new Box(3.3,5.6,65.6) ;
//    System.out.println( obj1.l +  " " + obj1.h + " " + obj1.w);
//    System.out.println( obj2.l +  " " + obj2.h + " " + obj2.w);
//    System.out.println( obj3.l +  " " + obj3.h + " " + obj3.w);   // multiple constructor r called

    // WE CANT ACCES CHILD ELEMENTS FORM PARENT OBJECTS
//    obj2.weight  /// error

//        CHILD CLASS BOX WEIGHT
        BoxWeight obj4 = new BoxWeight(3.3,5.6,65.6,10.3) ;
        System.out.println( obj4.l +  " " + obj4.h + " " + obj4.w + " "+ obj4.weight);   // calling inherited class constructor

// CREATING A REFERENCE VARAIBLE OF BOX AND POINTING IT TO A OBJECT TYPE BOX WEIGHT
//Box obj5  = new BoxWeight(1,2,34,5); // HERE BOXWEIGHT TYPE OBJECT IS CREATED BUT STILL
//        System.out.println(obj5.weight); //  STILL WE CANT ACCESS CHILD VARIABLES
// THIS MEANS THE REFERNCE VARIABLE DETERMINES WHICH OBJECTS CAN BE ACCESED NOT THE OBJECT TYPE

// CREATING REF OF CHILD CLASS
//BoxWeight obj6 = new Box(2,3,4 ) ;  // ERROR : A CHIRD CLASS REFERENCE VARIABLE CAN NEVER POINT TO A PARENT CLASS
// Y COZ HERE WHEN CREATING BOX THEN BOX CLASS DONT KNOW ABOUT WEIGHT VARAIBLE SO IT CANT INTIALIZE THAT VARIABLE SO WE CANT DO SO


//        STATIC CLASS AND OVERRIDING
        Box obj7  =  new BoxWeight() ;
        obj7.Greeting() ; // here as the object is boxweight class method it should be called but box is being called
        BoxWeight obj8  =  new BoxWeight() ;
        obj8.Greeting();


//        accesing private variable in box named l1
        Box obj9 = new Box() ;
        System.out.println(obj9.getl1()); // 0.0 is printed allowing us to acess l1 a private variable in box class



    }


}