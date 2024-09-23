package OOPS.class3.inheritance;



public class BoxWeight extends Box {

    double weight ;

    BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double length, double height, double width, double weight) {
//        IF NO CONSTUCTOR TO PARENT CLASS CALLED THEN IT CALLS THE DEFUALT CONTRUCTOR OF PARENT CLASS

        // SUPER KEYWORD IS USED TO CALL PARENT CONSTRUCTOR
        super(length, height, width);
//        this.w = 10  ;  // we can also do like this
        System.out.println("the constructor of boxweight child class is called");

//        System.out.println(super.l); // super can be used as this and
        // if same name present in parent and child super is used to get parent varaibles
        this.weight = weight;

//        super(length, height, width); // ERROR: CHILD ALWAYS TELL TO INTIALIZE PARENT CLASS AND THEN COME TO CHILD CLASS

    }
}
