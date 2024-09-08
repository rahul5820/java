class Calculator{

    public int add(int num1, int num2){
        return num1+num2;
    }
    public int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }

}
class Done{

    public static void  main (  String args []){


Calculator c=new Calculator();

int  r1= c.add(3,4);
int r2= c.add( 4,400,4000);
 
System.out.println(r1);
System.out.println(r2);

    }


} 