import java.util.*;

public class write {
     static void greet( int Age,String name){
    {
        System.out.println("your age is "+Age+"yor name is  "+ name);

        }

     }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your Age ");
        int Age=sc.nextInt();
        // System.out.println("enter your name ");
         sc.nextLine();

        System.out.println("enter your name ");
        String name= sc.nextLine();
        
  greet(Age, name);

    }
    
}
