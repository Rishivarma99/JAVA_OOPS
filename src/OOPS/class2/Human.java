package OOPS.class2;

public class Human {

    String name ;
    int age ;
    float salary ;
    boolean married ;

//    STATIC OBJECT  : COMMON TO ALL
    static long population ;

    public Human (String name , int age , float salary , boolean married) {
     this.name = name;
     this.age = age ;
     this.salary = salary ;
     this.married = married  ;
//     HERE AS A STATIC IN ONLY RELATED TO CLASS NO NEED TO USE THIS AND USE CLASS NAME
     Human.population +=1 ;
    }

}
