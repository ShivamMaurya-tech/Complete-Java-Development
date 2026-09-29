package Polymorphism;
public class MethodOverriding {
    public static void main(String args[]){
       

        advcal a=new advcal();
       System.out.println(a.add(4, 4)); 

    }
}


class Calc {
    public int  add(int n1,int n2){
       return n1+n2;
    }
    
}
class advcal extends Calc {
    public int  add(int n1,int n2){
       return n1+n2+1;
    }
    
}


// method overriding concept=====>class and parameter will be the same but behaviour different .