import java.util.*;

public class Switch {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("press any button");
        int Button = sc.nextInt();

        switch (Button) {
            case 1:
                System.out.println("enter into the game");
                break;
           case 2:
               System.out.println("back ");
                
                break; 
           case 3:        
                System.out.println("fire");
                 
                 break; 
            default:
            System.out.println("press any valid  button");
                break;
        }
        
    }
}
