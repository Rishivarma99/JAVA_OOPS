package OOPS.class2;

/*
* INNER CLASSES :
*
*
* STATIC CLASSES :
* -> OUTSIDE CLASSES CANT BE STATIC
* -> all methods and variables are defualt static in a staic class
* */

public class Main4 {
  // this is a inner class before this we have created all classes outside main4
  // now treat it as object this is not static now when we create a instance fo innserclass1 from a static public main
  // -> we know that in static methods we just cant call a object directly without instance similarly we
    // cant call InnerClass1 from main without creating a obejct of class main4
    // solution : use static
    class InnerClass1{   //SIMPLY IT IS DEPENDENT ON MAIN4 CLASS SO NNED A INSTANCE OR SHOULD BE STATIC
      String name ;

     InnerClass1(String name){
      this.name = name ;
      }
    }
    static class InnerClass2{
        String name ;

        InnerClass2(String name){
            this.name = name ;
        }
    }

    public static void main(String[] args) {
//        InnerClass1 obj1 = new InnerClass1("Rishi") ;   ERROR
//        InnerClass1 obj2 = new InnerClass1("Mohan") ;  ERROR

//        TO SOLVE THE ABOVE ERROR
        InnerClass2 obj1 = new InnerClass2("Rishi") ;
        InnerClass2 obj2 = new InnerClass2("Mohan") ;

    }

}

//static class OutisdeStatic{  ERROR AS OUTSIDE CLASSES CANT BE STATIC
//
//}
