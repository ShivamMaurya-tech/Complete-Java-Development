package Threads;

public class Threads {
    public static void main(String args[])throws InterruptedException{
        // A a=new A();
        // B b=new B();
Counter c=new Counter();





    //     Runnable a=()->{
    //         for(int i=0;i<=5;i++){
  
    //     System.out.println("hii");
    //     try{
    //         Thread.sleep(2);
           
           
    //     }
    //    catch(InterruptedException e){
    //    e.printStackTrace();
    //    }
    // }


    //     };


    //     Runnable b=()->{
    //          for(int i=0;i<=5;i++){
            
    //     System.out.println("hello");
    //      try{
    //         Thread.sleep(2);
           
    //     }
    //    catch(InterruptedException e){
    //    e.printStackTrace();
    //    }
    // }
    
    //     };
        // b.setPriority(Thread.MAX_PRIORITY);




        Runnable a=()->{
             for(int i=1;i<=1000;i++){
                 c.increment();}
             };
            

Runnable b=()->{
             for(int i=1;i<=1000;i++){
                 c.increment();
                }
             };
            


        Thread T1=new Thread(a);
        Thread T2=new Thread(b);



        T1.start();  
        T2.start();

             T1.join();
             T2.join();
             System.out.println(c.count);



    }
}


// class A extends Thread{
class A  implements Runnable{
    public void run(){

    }
        

}

// class B extends Thread{
class B  implements Runnable{
    public void run(){
       
    }
}


class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

// THREAD====>A thread is the smallest unit of execution that allows programs to run multiple tasks concurrently.
// In a THREAD Only [RUN] method executes.

// Threads Priority()===>🔹 Thread Priority Constants
// Java provides three predefined constants in the Thread class:

// Thread.MIN_PRIORITY = 1 → Lowest possible priority.

// Thread.NORM_PRIORITY = 5 → Default priority for all threads.

// Thread.MAX_PRIORITY = 10 → Highest possible priority. 





// 🔹 Setting and Getting Priority
// You can control priority using:

// setPriority(int newPriority) → Assigns a new priority.

// getPriority() → Returns the current priority.






// In Java, the ["SYNCHRONIZED"] keyword ensures that only one thread at a time can access a block of code or method,
//  preventing race conditions and guaranteeing visibility of shared data across threads.