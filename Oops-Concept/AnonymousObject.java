public class AnonymousObject {
    public static void main(String args[]){
        // ANONYMOUS OBJECT CREATED

        // Demo a;//this is a reference variable "a"
        // new Demo();
        new Demo().show();

    }
}

class Demo {

public Demo() {
  System.out.println("Object Created");
}
    public void show(){
        System.out.println("In a show");
    }

}
