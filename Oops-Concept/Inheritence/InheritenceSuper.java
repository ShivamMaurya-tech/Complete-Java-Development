package Inheritence;
public class InheritenceSuper {

    public static void main(String args[]){
    

//    new A();//In A with default Parameter
// new B();In A with default Parameter
// It occurs due to super method .
new B(3);

}

}
// class A extends Object ===>every class extends with objects.
class A {

   
    public A(){
         super();
        System.out.println("In A with default Parameter");
    }
     
    public A(int n){
        super();
        System.out.println("In  A with parameterized Parameter");
    }


}
class B extends A{
     
    public B(){
        super();
        // super(6);
        System.out.println("In B with default Parameter");
    }
    
    public B(int n){
         super(n); // OUTPUT  ==>1.In  A with parameterized Parameter
// 2.In  B with parameterized Parameter

        //this();//In  A with parameterized Parameter // In B with default Parameter // In  B with parameterized Parameter OUTPUT


        System.out.println("In  B with parameterized Parameter");
    }


}



