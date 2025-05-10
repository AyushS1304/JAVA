import java.util.Scanner;

public class linearsearch {
    public static boolean linearsearch(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
            }   
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=5;
        int arr[]=new int[size];
        System.out.print("Enter the elements of array: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("Enter the Number to be searched: ");
        int x=s.nextInt();
        if(linearsearch(arr, x)){
            System.out.println("Found!!!");
        }
        else{   
            System.out.println("Not Found!!!");
        }
        s.close();
    }
}
