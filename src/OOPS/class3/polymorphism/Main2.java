package OOPS.class3.polymorphism;

/* ->COMPILE TIME POLY / STATIC POLY :
*  -> Achieved by method OVER LOADING
* METHOD OVERLOADING : In a same class their are methods with same name but
* with different types , return type , arguments , ordering of arg.
* EX : constuctors IN A CLASS , or methods with same name
* */

public class Main2 {
 int sum(int a, int b){
        return a+b ;
    }  // java will also convert from int to double in arguments
 int  sum(int a, int b, int c){
        return a+b+c ;
    }

    public static void main(String[] args) {

     Main2 obj1 = new Main2() ;
     obj1.sum(2,4) ;  // at compile time only method overloding occurs it checks the arguments and invoke method
        obj1.sum(2,3,4) ; 




    }


}
