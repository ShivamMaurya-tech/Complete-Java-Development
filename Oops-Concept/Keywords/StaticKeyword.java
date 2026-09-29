package Keywords;
import java.util.*;

public class StaticKeyword{
    public static void main(String args[])throws Exception{
// Load class -> triggers static block
        Class.forName("Mobile");
// Mobile m=new Mobile();
// m.brand="Apple";
// m.price=300000;
// Mobile.name="smartphone";//static keyword helps to access the data using class and its variable[ static variable shared globally].
       
// Mobile m1=new Mobile();


    
// }
// m1.brand="samsung";
// m1.price=234000;
// m1.name="smartphone";


//m.name="phone";//This will shared with both the objects or common with-in.
// m.show1();
// m1.show1();
// Mobile.show2(m1);//caling static method.
      
    }
}



class Mobile{
    String brand;
    int price;
    static String name;//STATIC VARIABLE.


//NON-STATIC METHOD
public void show1(){

 System.out.println(brand+":"+price+":"+name);
}

// static block
static{
    name="nokia";
    System.out.println(" in Static block");
}


// Constructor

public Mobile(){
    brand="";
    price=200;
    System.out.println("in Constructor block");
}



public  static void show2(Mobile m1){

 System.out.println(m1.brand+":"+m1.price+":"+name); 
}


}



//1. StaticKeyword======> it will shared globally.
//2.static keyword is a member of the class.
// 3.static Keyword ===>static variables can be pass in (NON-STATIC METHOD) but (NON-STATIC VARIABLES ) can't be pass in (STATIC METHOD).
//4.static method +++=======> it always executes first from the other methods.

// Interview Question===>why non-static variables doesn't work in static method ;
// Answer====>   because it can access with the help of object reference variable where calling static method and then passing parameter in that 
// static method then we will able to access the static method.


// when static class visible at once and constructor visibles twices then there will be a unique class method it will show static class without constructor with the help not intiating object.