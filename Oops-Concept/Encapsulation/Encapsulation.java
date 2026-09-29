// package Encapsulation;
// public class Encapsulation {
//     public static void main(String args[]){
// Demon d=new Demon();
// d.setAge(34);
// d.setName("Shivam");
// System.out.println(d.getName()+":"+d.getAge());
  
//     }
// }


// class Demon{
//     private int age;
//     private String name;


//     public int getAge(){
//        return age;

//     }

//     public void setAge(int a){
//         age=a;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setName(String n){
//         name=n;
//     }
// }

import Constructor.Demon;

public class Encapsulation {
    public static void main(String args[]){
Demon d=new Demon();
d.setAge(34);
d.setName("Shivam");
System.out.println(d.getName()+":"+d.getAge());
  
    }
}


class Demon{
    private int age;
    private String name;

// getter method 
    public int getAge(){
       return age;

    }
// setter method
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}

// Without this keyword output comes out to the [null:0]
// (this)==============> Keyword symbolises the current current object In left side of this there will be instance variable and right side of this keyword there
// there will be local variable .