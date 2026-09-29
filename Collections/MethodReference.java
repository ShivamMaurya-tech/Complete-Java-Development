package Collections;
import java.util.Optional;
import java.util.Arrays;
import java.util.*;

public class MethodReference {
    public static void main(String args[]){
        List<String> ls=Arrays.asList("Shivam","lava","Lakhan");
  List<String >s=ls.stream()
    .map(String::toUpperCase)
    .toList();
s.forEach(System.out::println);
    }
}


// [::]============> DOUBLE COLON KNOWN AS METHOD REFERENCE.