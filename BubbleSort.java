public class BubbleSort {
    static void swap (int a[],int i ,int j){
     
         int temp =a[i];
         a[i]=a[j];
         a[j]=temp;
    }
    static void  bubbleSort( int a[]){
       for(int i=0;i<a.length-1;i++){
        for(int j=0;j<a.length-i-1;i++){
         if(a[j+1]<a[j]){
            swap(a,j,j+1);
         }
        }
       }
    }
    public static void main(String[] args) {
        int a[]={22,7,9,8,4,8};
        bubbleSort(a);
        for(int e:a){

            System.out.print(e+" ");
        }

    }
}
