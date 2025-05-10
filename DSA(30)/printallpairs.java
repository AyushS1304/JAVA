public class printallpairs {
    public static void printallpairs(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==5){
                    System.out.println("(" + arr[i] + "," + arr[j]+ ")");
                }
                else if(arr[i]==5){
                    System.out.println("(" + arr[i]+ ")");
                }
                
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,2,6};
        printallpairs(arr);
    }
}
