package Constructor;
public class Constructor {
   
    public static void main(String args[]){
Demon d1=new Demon();
Demon d2=new Demon("shiva",60);
System.out.println(d1.getName()+":"+d1.getAge());
System.out.println(d2.getName()+":"+d2.getAge());
  
    }
}


class Demon{
    private int age;
    private String name;

// default constructor

    public Demon(){
        age=30;
        name="vishal";
    }
// parameterized constructor

    public Demon(String name,int age){
       this. age=age;
        this.name=name;
    }
    public int getAge(){
       return age;

    }

    public void setAge(int age){
       this. age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}

// Constructor==========> it does not return anything means not a int ,boolean ,String and manymore.
// constructor may defined as the class and method name will be same as the object.
// constructor can be overloaded (default + parameterized).