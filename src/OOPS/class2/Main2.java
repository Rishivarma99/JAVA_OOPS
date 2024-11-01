package OOPS.class2;

/* ->Static keyword :
*  -> Such objects which are not related o objects but in common for all objects must be initialed as static
*  -> a static variable is not related to a objects varaibles
*   -> In a static method we cannot use any non static methods
*  -> something which is not static belongs to object or instance
* -> CLASSES IN SAME PACKAGE NO NEED TO IMPORT
* */

public class Main2 {
//    THIS main METHOS IS ITSEF A STATIC WHICH IS CALLED BY COMPILER WHITOUT REATING A Main2 object
    public static void main(String[] args) {

//    NO NEED TO IMPORT HUMAN AS IT IS IN SAME PACAKAGE
        Human Rishi = new Human("Rishi" , 20 , 30000 , false ) ;
        Human Mohan = new Human("Mohan" , 21 , 40000 , false ) ;


        // HERE FIRST IT CHECK POPULATION VARAIBLE IN OBJECTS ADN IT DOES NOT FOUND TO GOES TO CLASS AND CHECK STATIC VARIABLES
        System.out.println(Rishi.population);
        System.out.println(Human.population);  // CORRECT CALLING

//        CALLING A NON STATIC FUNCTION
//        greeting() ;   // ERROR COMES A FROM A STATIC METHOD WE CANT CALL A NON STATIC METHOD

          Main2.func();

    }

    static void func() {
//        You cant call a non static stuff whitout referencing to a object in a static context
//        greeting() ;  error

//        to solve we can create a instance in static to call a non static method in static
        Main2 obj1= new Main2() ;
        obj1.greeting();

 // we also cant use this as it is also a non static stuff
//      System.out.println(this.age);

    }

    void greeting() {
//        func(); // Yes from a non static we can call anything as it is related to object
        System.out.println("hi");
    }



}


