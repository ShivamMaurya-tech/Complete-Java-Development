package ExceptionHandling;

public class Throw {
    public static void main(String args[]){
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0)
             throw new ArithmeticException("aapke program me error hai" );
        }
        
       
        catch(Exception e){
            System.out.println("something went wrong"+e);
        }
System.out.println(j);
    }
    
    
}
