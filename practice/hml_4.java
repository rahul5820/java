package practice;
import java.util.*;

public class hml_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int n= sc.nextInt();

    for(int i=1;i<=n;i++){
        if( i%2 !=0 && i%i !=0  ){
            System.out.println(i);
        }
    }

  

    }
}
