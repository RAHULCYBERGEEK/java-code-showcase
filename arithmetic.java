import java.util.Scanner;
class arithmetic
{

    public static void main(String ...args)
    {

        int a,b;
        System.out.println("enter two numbers..");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("ADDITION "+(a+b));
        System.out.println("SUBTRACTION "+(a-b));
        System.out.println("MULTIPLICATION "+(a*b));
        System.out.println("DIVISION "+(a/b));
     }
}
        