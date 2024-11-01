package OOPS.class4;

/* Access modifiers  : very important
*
*
* */

import java.util.ArrayList;

public class Main1 {


    public static void main(String[] args) {

//    Creating an obj of A
    A obj1 = new A( "Rishi") ;

//    in arraylist all of the methods are private and final
    ArrayList<Integer> arr1 = new ArrayList<>() ;
//    need to do some things

//    in A class val is given private
//    obj1.val ;  Cant be accesed
//    instead we can access
        obj1.setVal(10);
     int a =  obj1.getVal() ;
      System.out.println(a);

    }


}
