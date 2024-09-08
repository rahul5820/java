public class Sort {
    public static boolean isSort(int arr[]){
        for(int i = 1; i < arr.length-1; i++){
            
                if (arr[i] > arr[i+1]) {
            
                    return false;
        
            }
            
        }
        return true;
    }
    public static void main(String[] args){
        int arr[] = {5,2,3,1};
        System.out.println(isSort(arr));
    }
}
