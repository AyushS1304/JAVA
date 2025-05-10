import java.util.*;

public class Operators {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = s.nextInt();
        int sum = 0;
        for (int i = 0; i <= N; i += 2) {
            sum += i; 
        }       
        System.out.println("The sum of even numbers up to " + N + " is: " + sum);
        s.close();
    }
}
