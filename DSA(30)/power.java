import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x=s.nextInt();
        System.out.print("Enter the value of power: ");
        int n=s.nextInt();
        if(x==0 || n==0){
            System.out.println(1);
        }
        else{
            int ans=(int)Math.pow(x, n);
            System.out.print("The ans is: "+ ans);
        }
        s.close();
    }
}
