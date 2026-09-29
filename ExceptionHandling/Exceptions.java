package ExceptionHandling;

public class Exceptions {
    public static void main(String args[]){
        int i=2;
        int j=0;
        // String s=null;
        String s="Shivam";
        int num[]=new int[6];
        try{
j=18/i;
System.out.println(j);
System.out.println("hii");
System.out.println(s.length());
System.out.println(num[6]);
        }
catch(ArrayIndexOutOfBoundsException e){
    System.out.println("take the array carefully");
}

        catch(ArithmeticException e){
            System.out.println("can't divide by Zero");
        }
        catch(NullPointerException e){
            System.out.println("nullPointer exception"+e);
        }

// 
        catch(Exception e){ //this Exception handles all the error  which can produced while runtime;
            System.out.println("something went wrong"+e);
        }

        finally{
            System.out.println("this is finally block");
        }
    }
}


// these are UNCHECKED Exception

// ArithemeticException
// NullPointerException
// ArrayIndexOutOfBoundsException


// finally ===> it is used to close the section or execution.