import java.io.*;
import java.util.*;

class oddEven{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(a>=0)
            if (n % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        else
            System.out.println("invalid");
    }
}
