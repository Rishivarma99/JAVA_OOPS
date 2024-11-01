package OOPS.class3.polymorphism;

public class ObjectPrint {
   int num ;

   ObjectPrint (int num) {
       this.num = num ;
   }
   public String toString (){
    return "Object print " + num  ;
   }


    public static void main(String[] args) {

     ObjectPrint obj1 = new ObjectPrint(54) ;
        System.out.println(obj1);


    }


}
