package OOPS.class3.inheritance;

/*
*  INHERITANCE TYPES   :
* -> SINGLE INHERITANCE :  START HERE it just in heirarcy multiple classes
* ->MULTIPLE INHERITANCE : ONE CLASS IS INHERITING 2 CLASSES -> NOT SUPPORTED IN JAVA
*   > USING INTERFACES WE SOLVE THE MULTIPLE INHERITANCE PROBLEM
* ->HEIRARICAL INHERITANCE  : ONE CLASS IS INHERITED BY MULTIPLE CLASSES
* ->HYBRID INHERITANCE : COMBINATION OF SINGLE AND MUTILPLE INHERITANCE -> NOT SUPPORTED IN JAVA AND DONE WITH INTERFACES
*
* */
public class Main2 {

    public static void main(String[] args) {

//        CREATING OBJECTS OF CAR AND BUSSES
        Car ferari = new Car(4,6,"car","Blue",2000) ;
        Bus volvo = new Bus(8 , 30 , "bus" , 100 , 5000) ;

        System.out.println(Vechiles.vechileCount);
        System.out.println(ferari.color);
        volvo.callGreeting();
    }

}

class Vechiles {
    static int vechileCount = 0  ;
    int wheels ;
    int capacity ;
    String type ;
    Vechiles (int wheels , int capacity ,String type){
        System.out.println("Vechile class constuctor called");
        this.wheels = wheels ;
        this.capacity = capacity ;
        this.type = type ;
        Vechiles.vechileCount +=1 ;
    }
    public void gretting(){
        System.out.println("hi this is greeting method in vechile class");
    }
}

class Bus extends Vechiles {
    static int busCount = 0 ;
//    int model ;
    int maxSpeed ;
    int price ;
    Bus(int wheels , int capacity , String type ,  int maxSpeed , int price){
        super(wheels , capacity , type) ;
        this.maxSpeed = maxSpeed ;
        this.price = price;
         Bus.busCount +=1 ;
    }
    public void callGreeting () {
        super.gretting();
    }
}
class Car extends  Vechiles{

    static int carCount = 0;
//    int model ;
    String color ;
    int price ;
    Car(int wheels , int capacity ,String type ,  String color , int price){
        super(wheels , capacity , type) ;
        this.color = color ;
        this.price = price;
        Car.carCount +=1 ;

    }


}
