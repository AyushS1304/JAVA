public class sortzeroesandones {
    public static void sortzeroesandones(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right && arr[left]==0){
            left++;
        }
        while(left<right && arr[right]==1){
            right--;
        }
        while(left<right){
            arr[left]=0;
            arr[right]=1;
            left++;
            right--;
        }
        while(left<right && arr[left]==0){
            left++;
        }
        while(left<right && arr[right]==1){
            right--;
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,1,0,1,1,0,0,1};
        sortzeroesandones(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
