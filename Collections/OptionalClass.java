package Collections;
import java.util.*;
public class OptionalClass {
    public static void main(String args[]){
List<String> ls=Arrays.asList("Anawar","Raja","Imraan","Shivam");
// Optional<String> l=ls.stream()
String l=ls.stream()
           .filter(str->str.contains("R"))
           .findFirst()
           .orElse("Not found");
            System.out.println(l);
    }
}
