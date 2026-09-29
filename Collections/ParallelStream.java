package Collections;
import java.util.*;

public class ParallelStream {


    public static void main(String args[]){
        int size=10000;
    List<Integer> l=new ArrayList<>(size);
    
        Random ran=new Random(size);
        for(int i=1;i<=size;i++){
       
        l.add(ran.nextInt(100));
        

    }

// int sum1=l.stream()
// .map(n->n*2)
// .reduce(0, (c,e)->c+e);


long startseq=System.currentTimeMillis();
int sum2=l.stream()
.map(n->{
    try{
        Thread.sleep(1);
    }
    catch(Exception e){
    }
    
     return n*2 ;
}
   
    )
.mapToInt(n->n)
.sum();


long endseq=System.currentTimeMillis();


long Startpara=System.currentTimeMillis();
int sum3=l.parallelStream()
.map(n->{
    try{
        Thread.sleep(1);
    }
    catch(Exception e){
    }
    
     return n*2 ;
}
   
    )
.mapToInt(i->i)
.sum();

long endpara=System.currentTimeMillis();
System.out.println(sum2+","+sum3);

System.out.println("Seq:"+(endseq-startseq));
System.out.println("para:"+(endpara-Startpara));


}


}