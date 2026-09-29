package RecordClass;

import java.util.*;
public class Recordclass {
    public static void main(String s[]){
Student a=new Student(34,"Shivam");
Student b=new Student(34,"Shivam");

System.out.println(a.equals(b));
System.out.println(a);
    }
}

record  Student(int age,String name){
    public Student(int age,String name){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
    this.age=age;S
    this.name=name;
    }
    

}



// class Student{
//    private int age;
//  private String name;


//  public Student(){

//  }
//  public Student(String  name){
//     this.name=name;
//  }
// //  getter method for name
// public String  getName(){
//     return name;
// }

// // Setter method name
// public void Setname(String name){
//     this.name=name;
// }
// // getter method for age
// public int getAge(){
//     return age;
// }

// //setter Method for Age
// public void SetAge(int age){
//     this.age=age;
// }

// @Override
//     public String toString() {
//         return "Student{name='" + name + "', age=" + age + "}";
//     }

// //
// }



//Record class is a new feature introduced in Java 14 as a preview feature and became a standard feature in Java 16. It provides a concise way to create classes that are primarily used to hold data. Records automatically generate boilerplate code such as constructors, getters, equals(), hashCode(), and toString() methods.

//Canonical Constructor: A record automatically generates a canonical constructor that takes parameters for all the components of the record. You can also define your own constructors if needed.
