import java.util.*;
class Greaternumber
{
    public static void main(String[] args)
    {
        	int a,b,c;
        	Scanner sc=new Scanner(System.in);

        	System.out.println("Enter first number :");
        	a=sc.nextInt();

        	System.out.println("Enter second number :");
        	b=sc.nextInt();

        	System.out.println("Enter third number :");
        	c=sc.nextInt();

       	if(a>=b && a>=c)
            		System.out.println(a+" is Greater");

        	else if(b>=a && b>=c)
            		System.out.println(b+" is Greater");

        	else
            		System.out.println(c+" is Greater");
    }
}