package ExceptionHandling;

public class Throw2 {
    public static void main(String args[]){
    

    
// A a=new A();
// a.ShivamException();

        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0)
             throw new ShivamException("I don't want print zero" );
        }
        
        catch(ShivamException e){
            System.out.println("some missing" +e);
        }
       
        catch(Exception e){
            System.out.println("something went wrong" +e);
        }
System.out.println(j);
    }
    
    
}


class ShivamException extends Exception{
    // parameterized constructor
    public ShivamException(String string){
        super(string);
    }

}