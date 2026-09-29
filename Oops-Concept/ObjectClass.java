public class ObjectClass {
    public static void main(String args[]){

        A a1=new A();
        a1.model="iphone";
        a1.price=200000;


        A a2=new A();
        a2.model="iphone";
        a2.price=200000;

boolean result=a1.equals(a2);

System.err.println(result);  //tostring() is a method of ObjectClass which is inbuilt by the System.



    }
}



class A{

    String model;
    int price;


    public String toString(){
        return model+":"+price;
    }

    public boolean equals(A that){
       if(this.model.equals(that.model) && this.price==that.price)
       return true;
       else
       return false;
    }

}


