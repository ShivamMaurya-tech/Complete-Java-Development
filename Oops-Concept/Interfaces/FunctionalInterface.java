// package Interfaces;

// public class FunctionalInterface {
//     public static void main(String args[]){

//         // A b=new A(){
//         //     //Anonymous class
//         //     public void show(){
//         //         System.out.println("In a Show");
//         //     }
//         // };

//         A a=()-> System.out.println("In a show");   //using Lambada Expression
//         // B b=new B();
        
//         a.show();

//     }
// }



// interface A{
//     public void show();
// }

// // class B implements A{
// //     public void show(){
// //         System.out.println("In B show");
// //     }
// // }

// // INTERFACE ARE THREE TYPES .
// // 1.NORMAL INTERFACE ===>CONTAINS MULTIPLE ABSTRACT METHODS.
// // 2.FUNCTIONAL INTERFACE==> WHEN IT CONTAINS ONLY SINGLE ABSTRACT METHOD THEN KNOWN AS SINGLE ABSTRACT METHOD(SAM) .
// //3.MARKER==>WHEN IT CONTAINS NO ABSTRACT METHOD WHICH MEANS NO NORMAL OR ABSTRACT METHOD THAT IS EMPTY.



// // LAMBADA EXPRESSION ==> IT WORKS ONLY WITH FUNCTIONAL INTERFACE.



package Interfaces;

public class FunctionalInterface{
    public static void main(String args[]){
        A obj=(int a,int b)->a+b;
 int result=obj.add(3,4);
 System.out.println(result);
    }
   
}

interface A{
    int add(int a,int b);
      
}