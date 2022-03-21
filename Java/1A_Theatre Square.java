import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long N = in.nextLong();
        long M = in.nextLong();
        long A = in.nextLong();
        long X = N / A;
        long Y = M / A;
        
        if(N % A != 0) X++;
        if(M % A != 0) Y++;
        
        System.out.println(X * Y);
    }
}