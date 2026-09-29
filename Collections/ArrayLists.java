package Collections;

// import java.util.Collection;
// import java.util.ArrayList;
import java.util.*;

public class ArrayLists {
    public static void main(String a[]){

        // <=============Collections===========>
        // Collection<Integer> c=new ArrayList<Integer>();
        // c.add(4);
        // c.add(45);
        // c.add(32);
        // c.add(12);
        // for(int cc:c){
        //     System.out.println(cc);
        // }

        //<==========================List========================>
        //  List<Integer> c=new ArrayList<Integer>();
        // c.add(4);
        // c.add(45);
        // c.add(32);
        // c.add(12);
        // for(int cc:c){
        //     System.out.println(cc);
        // }
            
        // System.out.println(c.get(3));
        // System.out.println(c.indexOf(12));

        // <=================Set=====================>
        // Set<Integer> c=new HashSet<Integer>();
        // c.add(4);
        // c.add(45);
        // c.add(32);
        // c.add(12);
        // c.add(12);
        // for(int cc:c){
        //     System.out.println(cc);
        // }


        //<================TreeSet================> It also sorts the value and also gives the unique values.
        Collection<Integer> c=new TreeSet<Integer>();
        c.add(4);
        c.add(45);
        c.add(32);
        c.add(12);
        c.add(12);
        
        // for(int cc:c){
        //     System.out.println(cc);
        // }

        Iterator <Integer> h=c.iterator();
       while (h.hasNext()) {
        System.out.println(h.next());
        
       }

         };

    }

