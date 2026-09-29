package Casting;

public class Upcasting {
    public static void main(String args[]){
A obj=(A)new B();
     //   A obj=new B(); //class A is a parent so it will considerd as UPCASTING. from below to top [from child to parent]
       obj.show1();
    }
}


class A{

    public void show1(){
    System.out.println("In A Show");
    }
}


class B  extends A{
 public void show2(){
    System.out.println("In B Show");
    }


}