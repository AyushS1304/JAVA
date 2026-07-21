public class BinarySearch {
    public static void Search(int []arr,int x){
        int left=0;
        int right=arr.length-1;
        boolean found=false;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==x){
                found=true;
                break;
            }
            else if(arr[mid]<x){
                left=mid+1;
            }
            else{
                right=mid-1;
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
