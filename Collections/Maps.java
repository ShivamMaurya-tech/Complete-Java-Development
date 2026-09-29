package Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String args[]){
        Map<String,Integer> m=new HashMap<>();
        m.put("Shivam",23);
        m.put("Rajan",34);
        m.put("Venky",93);
        for(String key:m.keySet())
       
        System.out.println(key+":"+m.get(key));
    }
}
