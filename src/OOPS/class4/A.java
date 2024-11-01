package OOPS.class4;

public class A {

    private int val  ;  // val is given private so it cant be accesed in main class
    String name ;
    int[] arr ;
    A ( String name) {
//        this.val = val ;
        this.name = name ;
        this.arr = new int[val] ;
    }
//    to set and get values of private variable we can use setter and getter alt+insert
    public int getVal() {   //as this method is public we can access anywhere
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }



}
