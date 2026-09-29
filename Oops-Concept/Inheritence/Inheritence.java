package Inheritence;
// parent class  or super class or base class

public class Inheritence {
    public static void main(String args[]){
      AdvInheritence c=new AdvInheritence();
       int r1=c.add(3, 5);
      int r2= c.sub(7, 4);
      int r3=c.Multi(3,4);
      int r4=c.Div(20,5);
        System.out.println(r1+","+r2+","+r3+","+r4);
    }
    
}



// child class or subclass or derived class
 class Calc extends Inheritence{
    
    public int add(int n1,int n2){
        return n1+n2;
    }
    
    public int sub(int n1,int n2){
        return n1-n2;
    }

    }




