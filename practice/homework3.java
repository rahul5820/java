package practice;
import java.util.*;
public class homework3 {
    public static void main(String[] args) {
        System.out.println("enetr the vlalue of A");
        Scanner sc = new Scanner (System.in);
         int A= sc.nextInt();
        System.out.println("enetr the vlalue of B");
         int B= sc.nextInt();
        
         System.out.println( "enter the value of operator");
         int Operator = sc.nextInt();

         switch (Operator) {
            case 1:
                System.out.println(A+B);
                break;
            case 2:
            System.out.println(A-B);
                
                break;
            case 3:  
            System.out.println(A*B);

               break;
            case 4:
            System.out.println(A/B);
                break;   
            default:
                break;
         }
         

    }
}
