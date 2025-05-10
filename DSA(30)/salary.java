import java.util.*;
public class salary {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the Basic: ");
        int basic =s.nextInt();
        char grade=s.next().charAt(0);
        double HRA=0.2*basic;
        double DA=0.5*basic;
        double pf=0.11*basic;
        int Allow;
        if(grade=='A'){
            Allow=1700;
        }
        if(grade=='B'){
            Allow=1500;
        }
        else{
            Allow=1300;
        }
        double Salary= basic + HRA + DA + Allow - pf;
        int ans=(int)Math.round(Salary);
        System.out.println("The Total Salary for the employee is: " + ans);
        s.close();
    }
}
