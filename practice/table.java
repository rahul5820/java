package practice;
import java.util.*;


public class table {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        
        System.out.println("enter the the nubmber of table you want");
        int n =sc.nextInt();
        int table =0;

     for (int i=1;i<=10;i++){
         table=n*i;
     System.out.println(table);

     }

    }
}
