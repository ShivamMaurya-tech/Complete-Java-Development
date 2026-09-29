package InnerClass;

public class Innerclass {
    public static void main(String args[]){

        A obj=new A();
        obj.show();


        A.B b=obj.new B();
        b.config();

    }
}


class A{

    public void show(){
        System.out.println("In A show");
    }

    // Inner Class
    class B{

        public void config(){
            System.out.println("In a config");
        }




    }
}