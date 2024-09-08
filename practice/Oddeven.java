package practice;

import java.util.*;

public class Oddeven {
public static void main(String[] args) {

    Scanner sc =new Scanner( System.in);
System.out.println("enter you number");
    int num= sc.nextInt();

    if(num%2 == 0){
        System.out.println("its even");
    }
    else{
        System.out.println("its odd");
    }
}
};