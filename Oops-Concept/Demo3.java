public class Demo3 {
    public static void main(String args[]){
       Students obj1=new Students() ; //obj is a reference variable;
        obj1.rollno=34;
        obj1.name="shivam";
        obj1.marks=45;


       Students obj2=new Students() ; //obj is a reference variable;
        obj2.rollno=34;
        obj2.name="shivam Maurya";
        obj2.marks=450;

       Students obj3=new Students() ; //obj is a reference variable;
        obj3.rollno=34;
        obj3.name="shiva";
        obj3.marks=456;

        Students stud[]=new Students[3];
        stud[0]=obj1;
        stud[1]=obj2;
        stud[2]=obj3;
        for(Students student:stud){
            System.out.println(student.name+":"+student.marks);
        }


    }
    
}
   class Students{


     int rollno;
        String name;
        int marks;//====> these three are instance variables.


   }
   
   
   