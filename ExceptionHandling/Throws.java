package ExceptionHandling;

public class Throws {


    static{
            System.out.println("class Loaded");
        }
    public static void main(String args[]){
        

        A a=new A();
        try{
  a.show();
        }
        catch(ClassNotFoundException e){
            // System.out.println("Class does not exists here");
            e.printStackTrace();
        }
      
        
       


    }
}




class A{
    public void show() throws ClassNotFoundException{

     
            // Class.forName("ExceptionHandling.Throws");
            Class.forName("ExceptionHandling.Calc");
    }
}

