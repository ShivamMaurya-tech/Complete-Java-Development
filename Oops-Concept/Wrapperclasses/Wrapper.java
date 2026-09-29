package Wrapperclasses;

public class Wrapper {
    public static void main(String args[]){

        int num=3;//primitive type of variable
        // Integer num1=new Integer(num);  //boxing======>when you are getting value from the  primitive type to object type.

//******************Object type****************
Integer num1=num;//Auto-boxing;===========>when you stored value from the  primitive type to object type automatically .

        System.out.println(num1);


// *******Primitive type.***********
       // int num2=num1.intValue(); //Unboxing====>when you are getting value from the object type to primitive type.

        int num2=num1;  //Auto-Unboxing.===> when you take out the primitive value from the object automatically.
        System.out.println(num2);

    }
}




// int =Integer
// char=Character
// double=Double
// ****=========>Wrapper classes  objects these are .

//DEPRECATION ===============> IT means that there will be better updated version in future .