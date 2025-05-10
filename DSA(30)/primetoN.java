import java.util.Scanner;
public class primetoN {
    public static boolean isprime(int n){
        int d=2;
        while(d<n){
            if(n % d==0){
                return false;
            }
            d++;
        }
        return true;
    }
    public static void printPrime(int n){
        for(int i=2; i<=n;i++){
            boolean isIprime=isprime(i);
            if(isIprime){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=s.nextInt();
        System.out.println("The prime numbers upto " + n + " are: ");
        printPrime(n);
        s.close();
    }
}
