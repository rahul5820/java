package practice;
import java.util.*;

public class compare {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       System.out.println("enter the value of a");
        int a= sc.nextInt();
        System.out.println("enter the value of b");
        int b= sc.nextInt();

        if(a==b){
            System.out.println("equal number");

        }else if(a>b){
                System.out.println("a is greater than b");
            }
            else{
                System.out.println("a is less than b");
            
        }


    }
}
;

