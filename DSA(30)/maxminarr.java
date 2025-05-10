import java.util.Scanner;

public class maxminarr {
    public static int max(int arr[]){
        int n=arr.length;
        int max=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int arr[]){
        int n=arr.length;
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        
        System.out.print("Enter the Elements of the Array: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("The Array is: ");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int maximum=max(arr);
        int minimum=min(arr);
        System.out.println("The maximum element of array is: "+maximum);
        System.out.println("The minimum element of array is: "+minimum);
        s.close();
    }
    
}
