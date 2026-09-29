package Collections;

import java.util.*;
public class ConstructorReference {
    public static void main(String s[]){

        List<String> ls=Arrays.asList("Mohan","Sohan","Shubham");
// List<Student> students=new ArrayList<>();
        // for(String name:ls){
        //     students.add(new Student(name));

        // }

        List<Student> students=ls.stream()
        .map(Student::new)
        .toList();
System.out.println(students);
    }
}


class Student{
   private int age;
 private String name;


 public Student(){

 }
 public Student(String  name){
    this.name=name;
 }
//  getter method for name
public String  getName(){
    return name;
}

// Setter method name
public void Setname(String name){
    this.name=name;
}
// getter method for age
public int getAge(){
    return age;
}

//setter Method for Age
public void SetAge(int age){
    this.age=age;
}

@Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

//
}