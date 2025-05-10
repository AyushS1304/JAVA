public class BinarySearch {
    public static void Search(int []arr,int x){
        int n=arr.length;
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                found=true;
                break;
            }           
        }
        if(!found){
            System.out.println("NO SUCH ELEMENT FOUND!!!");
        }
        if(found==true){
            System.out.println("Element Found!!!");
        }
        
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        Search(arr, 5);

    }
}
