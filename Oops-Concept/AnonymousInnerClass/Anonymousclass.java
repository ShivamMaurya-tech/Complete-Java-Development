package AnonymousInnerClass;

public class Anonymousclass {
    public static void main(String args[]){

        A a=new A(){

public void show(){
    System.out.println("In Anonymous new show");
}

      

        public void config(){
            System.out.println("In a Config");
        }
        
          };
          a.show();
          a.config();
        
    }
}


 abstract class A{
   abstract public void show();
   abstract public void config();




}


 