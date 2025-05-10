import java.util.*;
public class palindrome {
    public boolean ispalindrome(int x){
        if(x<0){
            return false;
        }
        int reversed=0;
        int temp=x;
        while(temp!=0){
            int digit=(int)(temp%10);
            reversed=reversed*10 + digit;
            temp/=10;
        }
        return (reversed==x);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x=s.nextInt();
        palindrome p=new palindrome();
        boolean result=p.ispalindrome(x);
        if(result){
            System.out.println(x+" is a palindrome.");
        }
        else{
            System.out.println(x+" is not a palindrome.");
        }
        s.close();
    }
}
