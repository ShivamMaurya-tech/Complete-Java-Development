package Anotations;

public class Anotations {
    public static void main(String args[]){
        A a=new B();
        a.show();

    }
}


class A{

    public void show(){
        System.out.println("In A show");
    }
}


// class B extends A{
//     @Override
//     public void shows(){
//         System.out.println("In B show");
//     }
// }






class B extends A{
    @Override
    public void show(){
        System.out.println("In B show");
    }
}


//ANOTATION========> IT STATES THAT WHAT ACTUALLY METHOD IS DOING .IF METHOD WORKS DIFFERENTLY AND YOU PROVIDED ANOTHER NAME NOT 
//ACCORDING TO THAT METHOD SO MAY OCCUR RAISES THERE.


// SERIALISTATION===>WHEN YOU STORED THE OBJECT VARIABLES VALUE IN A HARDRIVE THEN IT  CONSIDERED AS SERIALISTATION.
// DESERIALISATION===>WHEN YOU LOAD THE HARDRIVE VALUES INTO OBJECT VALUES THEN IT CONSIDERED AS DESERIALISATION.