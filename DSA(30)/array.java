import java.util.Scanner;

public class array {
    public static int[] takeinput(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = s.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the Elements of Array: ");
        for(int i=0; i<size;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void print(int arr[]){
        int size=arr.length;
        for(int i=0;i<size;i++){
        System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void increment(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }
    public static int sum(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]=takeinput();
        System.out.print("Original Array: "+ " ");
        print(arr);
        System.out.println("The Sum of elements of array are: ");
        sum(arr);
        increment(arr);
        System.out.print("updated array: "+ " ");
        print(arr);
        
    }
}
