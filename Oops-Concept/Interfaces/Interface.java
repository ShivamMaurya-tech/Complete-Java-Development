package Interfaces;

public class Interface {
    public static void main(String args[]){
        A a=new B();
        a.show();
        a.config();

        X x=new B();
        x.run();
        
       System.out.print(a.age);
       
        

    }
}


interface  A{
// final and Static
    int age=30;
    String area="mumbai";

    void show();
    void config();
}

interface X{
    void run();
}


  


class B implements A,X{
    public void config(){
        System.out.println("In B config");
    }

    public void show(){
        System.out.println("In B show");
    }

    public void run(){
        System.out.println("In a run");
    }
}




// INTERFACE ==========>1.IN THIS [IMPLEMENTS] keyword is used to extends from parent to child.
                    //    2.NO class will be used after INTERFACE.
                    // 
                    // 3.FOR METHOD===>No modifiers will be used before void because [modifiers+abstract ] automatically placed there.
                    //4. IN INTERFACE ==>  VARIABLES considerd as FINAL AND STATIC
                    // 5.Multiple INTERFACE class can be inherit together.


                    // class - class==>extends
                    //class-interface=>implements
                    // interface-interface==> interface