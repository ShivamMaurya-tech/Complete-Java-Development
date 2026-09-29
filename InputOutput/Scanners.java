package InputOutput;
import java.util.Scanner;
public class Scanners {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int result=sc.nextInt();
        System.out.println(result);
        sc.close();
    }
}
