package Casting;

public class DownCasting{
    public static void main(String[] args) {
        
    
//  Upcasting from child to parent.
        A obj1=new B(); 
         obj1.show1();
        

      

//downcasting from parent to child class.

        B obj2=(B)obj1;
       obj2.show2();
       
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
