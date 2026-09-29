public class Demo5 {
    public static void main(String args[]){
        Computer lap=new Laptop();
        Computer desk=new Desktop();

Developer d=new Developer();
d.devapp(desk);
    }
}


interface Computer{

// public  abstract void code();
void code();

}
class Laptop implements Computer{
    public void code(){
    System.out.println("In a Laptop");
    }
}
class Desktop implements Computer{
    public void code(){
    System.out.println("In a desktop");
    }
}

class Developer{

public void devapp(Computer lap) {
    lap.code();

    
}
}