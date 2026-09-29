package Polymorphism;
/**
 * MethodOverLoading====>Method name same but parameter is different
 */
public class MethodOverLoading {

     public static void main(String args[]){
        //  int num1=4;
        // int num2=5;
        System.out.println("methodOverloading");
        Calculator calc=new Calculator();
      int results=  calc.add(2,4,3);
System.out.println(results);
     }
}


class Calculator{




    
    public int add(int n1,int n2,int n3){

        return n1+n2+n3;
       

    }
    public int add(int num1,int num2){

        return num1+num2;
    }




    public double add(double n1,int n2,int n3){

        return n1+n2+n3;
       

    }
    

    
}