package OOPS.class3.polymorphism;

public class Circle  extends Shapes{
//      this method area in overidding the parent class area methods
//    when circle object is created this method is given priority
       @Override  // this is a notation
        void area () {
            System.out.println("The area of circle is pi * r * r");
        }

}
