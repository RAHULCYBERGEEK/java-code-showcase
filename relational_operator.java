import java.util.Scanner;
class relational_operator
{
   public static void main(String ... args)
   {

      int a,b;
      System.out.print("enter two numbers");
      Scanner obj = new Scanner(System.in);
      a = obj.nextInt();
      b = obj.nextInt();
      System.out.println("true/false "+ (a<b));
      System.out.println("true/false "+ (a>b));
      System.out.println("true/false "+ (a==b));
      System.out.println("true/false "+ (a!=b));
   }
}