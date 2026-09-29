package Collections;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Sorted {
    public static void main(String args[]){
Comparator<Student> stud=(i,j)->i.age>j.age?1:-1;

    



        List<Student> l=new ArrayList<>();
        l.add(new Student(41, "Navin"));
       
        l.add(new Student(48, "Shivam"));
       
        l.add(new Student(52, "Shyam"));
       
        Collections.sort(l,stud);
        for(Student s: l)
        System.out.println(s);


    }
}


        class Student {
            int age;
            String name;

            public Student (int age ,String name){
                this.age=age;
                this.name=name;
            }
            public String toString()
{
    return "Student [age="+age+" , name="+name+"]";



}       


public int compareTo(Student that){

    
        if(this.age > that.age){
            return 1;
        }
        else{
            return -1;
        }
}
 }
