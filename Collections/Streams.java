package Collections;

import java.util.stream.Stream;
import java.util.*;

public class Streams {
    public static void main(String args[]){
int size=10000;
    List<Integer>a =new ArrayList<>(Arrays.asList(3,5,6,7,9,1,0));
    // a.forEach((n)->System.out.println(n));


//     Stream<Integer> nums1=a.stream();
//    Stream<Integer> nums2= nums1.filter(n->n%2==0);
//    Stream<Integer>nums3=nums2.map(n->n*2);
//    int result=nums3.reduce(0,(c,e)->c+e);
//     // nums3.forEach(n->System.out.println(n));
//     System.out.println(result);



        // Stream pipeline: filter evens, double them, then sum
        // int result = a.stream()
        //               .filter(n -> n % 2 == 0)   // keep even numbers
        //               .map(n -> n * 2)           // double each
        //               .reduce(0, (c, e) -> c + e); // sum them

        // System.out.println(result);




//         Stream<Integer> result =a.stream()
//                      .filter(n->n%2==0)
//                      .sorted();
// result.forEach(n->System.out.println(n));
Random ran=new Random();


for(int i=1;i<=size;i++){
a.add(ran.nextInt(100));

}
    int sum1=a.stream()
    .filter(n->n%2==0)
    .reduce(0, (c,e)->c+e);
    
    int sum2=a.stream()
   .map(n->n*2)
    .mapToInt(i->i)
    .sum();



    System.out.println(sum1+","+sum2);
   
    }
}


