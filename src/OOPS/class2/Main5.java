package OOPS.class2;

public class Main5 {
   static class InnerTest1 {   // HERE STATIC MEANS IT DOES NOT DEP ON MAIN 5 OBJECT
         String name ;   // HERE THIS NAME IS NOT STATIC AND INDEPENDENT TO EACH OBJECT
        InnerTest1(String name ) {
//        updating the static variable using contructor
           this.name = name ;

        }
    }

    public static void main(String[] args) {
        OuterTest1 a = new OuterTest1("Rishi") ;
        OuterTest1 b = new OuterTest1("Rahul") ;  // this set the name as rahu l
        System.out.println(OuterTest1.name);  //Rahul
        System.out.println(b.name);   //Rahul

        //TRYING THE ABOVE ON INNER CLASS
        InnerTest1 a2 = new InnerTest1("Rishi") ;
        InnerTest1 b2 = new InnerTest1("Rahul") ;  // this set the name as rahu l
        System.out.println(a2.name);  //RISHI  DIFFER FROM OBOVE
        System.out.println(b2.name);   //Rahul


    }


}

 class OuterTest1 {
    static String name ;  // SAME FOR ALL OBJECTS
    OuterTest1(String name ) {
//        updating the static variable using contructor
        OuterTest1.name = name ;

    }
}
