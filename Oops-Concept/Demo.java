// Problem 1==> Adding through blueprint of an Object [making of another class]



class Demo{
    public static void main(String[] args) {
       int num1=4;
       int num2=5;
    //    int result=num1+num2;
Calculator calc=new Calculator();
    int result=calc.add(num1,num2);
       System.out.println(result);
    }
}


//Making another class which is blueprint of an another class object.
class Calculator{
    public int add(int n1,int n2){

        return (n1+n2);
    }
}