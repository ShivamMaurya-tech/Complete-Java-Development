package AbstractMethod;



public class Abstract{
    public static void main(String args[]){

       Car c=new Updatedwagnor();
        c.Driving();
        c.PlayingMusic();
        c.flying();

    }
}


abstract class Car{
abstract public void Driving();
abstract public void flying();


public void PlayingMusic(){
    System.out.println("PlayingMusic");
}
}


 abstract class Wagnor extends Car{

 public void Driving(){
    System.out.println("driving..");
}

 }
 class Updatedwagnor extends Wagnor{ //CONCRETE CLASS
    public void flying(){
        System.out.println("Flying");
    }

}




// ABSTRACT============>1. abstract method must contains abstract class meanwhile abstract class can contains both method normal and absract .
                        // 2.Object can't  created for the abstract class .
                        // 3.A Class Contains both abstract and normal method known as CONCREATE CLASS.