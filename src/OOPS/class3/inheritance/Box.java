package OOPS.class3.inheritance;

public class Box{
//    private double l ;  // if it is kept private only we can use inside class
    double h ;
    double l ; 
    double w  ;
    Box (){
        System.out.println("the defualt constructor of box class is called");
//        super()  ;  // no error as every call has a parent or super class as object class
        this.l = -1 ;
        this.h = -1 ;
        this.w = -1 ;

    }
    Box (double side){
        this.l = side ;
        this.h = side ;
        this.w = side ;

    }
    Box (double length , double height){
        this.l = length ;
        this.h = height ;
        this.w = 1 ;

    }
    Box (double length , double height , double width) {
        System.out.println("the constructor of box class with 3 arguments is called");

        this.l = length ;
        this.h = height ;
        this.w = width;
    }
    Box(Box old){
        this.l  = old.l  ;
        this.h  = old.h  ;
        this.w  = old.w  ;

    }
    public void  boxMethod1 (){
        System.out.println("This is Box Mehtod 1 ");
    }

}