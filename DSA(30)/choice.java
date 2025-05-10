import java.util.Scanner;

public class choice {
    public static int computeSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static int computeProduct(int n){
        int product=1;
        for(int i=1;i<=n;i++){
            product *=i;
        }
        
        return product;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Value of n: ");
        int n=s.nextInt();
        System.out.println("Choose between sum(1) or product(2) ");
        int c=s.nextInt();
        if(c==1){
            System.out.println("The sum of integers up to " +" "+ n +" "+ " is: " + computeSum(n));
        }
        else if (c==2) {
            System.out.println("The product of integers up to " + n + " is: " + computeProduct(n));
        }
        else{
            System.out.println("Invalid choice. Output: -1");
        }
        s.close();
    }
    
}
