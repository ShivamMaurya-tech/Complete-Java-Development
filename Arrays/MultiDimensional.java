import java.util.*;

public class MultiDimensional {
    public static void main(String args[]){
       


    int a[][] = new int[3][4];

 
        // Fill array with the random value
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                  a[i][j] = (int)(Math.random() * 100);
                
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    
}
}

    
