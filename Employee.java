class Employee{
    int  salary=50000;

}
class Programmer extends Employee{
  
    int Bonus =10000;
}

class Backend extends Programmer{
    int DBonus=10000;

public static void main( String args[]){

    Backend B=new  Backend();
    System.out.println( "The salary of Backend is :"+ B.salary);
    System.out.println( "The Bonus of Backend is :"+ B.Bonus);
    System.out.println( "The DBonus of Backend is :"+ B.DBonus);
    System.out.println( "The Total Inhand  of Backend is :"+ (B.DBonus+B.Bonus+B.salary));



}}