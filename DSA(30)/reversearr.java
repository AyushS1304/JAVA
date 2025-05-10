import java.util.Scanner;

public class reversearr {
    public static void reversearr(int arr[]){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of the Array: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("The original Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        reversearr(arr);
        System.out.print("The reversed Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        s.close();
        
    }
    
}
