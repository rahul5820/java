package practice;
import java.util.*;



public class quiizp {
    public static void main(String[] args) {
        // int total=10;

        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int total=0;

      do{
        total =total+i;
            //  System.out.println(total);
             i++;
      }while(i<=n);
        System.out.println(total);
    }


}
