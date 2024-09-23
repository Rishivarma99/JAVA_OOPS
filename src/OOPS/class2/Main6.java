package OOPS.class2;

/* -> SINGLETON CLASES
*   -> make sure only one instatnce of class is prenst entire application
* */
public class Main6 {



    public static void main(String[] args) {
        //    Singleton obj1 = new Singleton() ;  // as its is private we cant do like this
        // all the reference variable obj 1 , 2 3, are pointing to same instance
        Singleton obj1  =Singleton.getInstance() ;
        Singleton obj2  =Singleton.getInstance() ;
        Singleton obj3  =Singleton.getInstance() ;  // it always return the same instance

        Singleton.changeInstance("raghav" , 33);
        Singleton.changeInstance("raghav" , 33);

        System.out.println(obj1.name) ;
    }

}

class Singleton {
// to make only one instance we need to restrict the constructor which is main to create objects
//    private int num  = 0 ;  // cannot be accesed even after creating multiple objects outside the class
     String name;
     int age ;
    private Singleton(String name ,  int age ) {
      this.name = name ;
      this.age = age  ;
    }
//    creating single instance // keeping static makes the instatnce1 is the only object that can be created
    public static Singleton instance1 ;

   public static  Singleton getInstance(){
       // it needs to be staic as it is accecesed in main class without a object
//    check weather 1 obj create or not
       if(instance1==null){
           instance1 = new Singleton("Rihsi", 22) ;
       }
       return instance1 ;   // this make sure it always return the same and single instance

   }
    public static  void changeInstance(String name , int age){

        instance1.name = name ;
        instance1.age   =age ;

    }


}
