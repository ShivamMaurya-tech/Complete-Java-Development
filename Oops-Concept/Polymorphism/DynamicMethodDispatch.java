package Polymorphism;

public class DynamicMethodDispatch {
    
    public static void main(String args[]){
        // A obj=new A();
        // obj.show();
       A obj=new B(); //output:--->In B show
        obj.show();
        // obj=new C();
        // obj.show();


        // this is called DYNAMIC METHOD DISPATCH.
        


    }
}


class A{
    public void show(){
        System.out.println("In A show");
    }

}
class B extends A{
     public void show(){
        System.out.println("In B show");
    }


}
class C extends A{
     public void show(){
        System.out.println("In  C show");
    }



}