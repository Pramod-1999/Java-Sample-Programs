import java.util.*;
class Calcualtor
 {
	public static int addition(int a, int b)
	{
		return a+b;
	}
	public static int subtraction(int a, int b)		
	{
		return a-b;
	}
	public static int multiplication(int a, int b)
	{
		return a*b;
	}
	public static int division(int a, int b)
	{
		return a/b;
	}
	public static int modulus(int a, int b)
	{
		return a%b;
	}		
                    public static void main(String[] args) 
                    {
		 int n1,n2,x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First Number -");
		n1=sc.nextInt();
		System.out.print("Enter the Second Number :- "); 
		n2=sc.nextInt();
		System.out.print("Enter 1 to Add.  Enter 2 to Subtract.  Enter 3 to Multiply.  Enter 4 to Divide.  Enter 5 to Modulus.");
		x=sc.nextInt();
		
		if(x==1)
		{
			int d=addition(n1,n2);
			System.out.print("The sum of "+n1+" and	"+n2+" is : "+d);
		}

		else if(x==2)
		{
			int d=subtraction(n1,n2);
			System.out.print("The diffence of "+n1+" and "+n2+" is : "+d);
		}
		
		else if(x==3)
		{
			int d=multiplication(n1,n2);
			System.out.print("The Product of "+n1+" and "+n2+" is : "+d);
		}

		else if(x==4)
		{
			int d=division(n1,n2);
			System.out.print("The Quotient of "+n1+" and "+n2+" is : "+d);
		}

		else if(x==5)
		{
			int d=modulus(n1,n2);
			System.out.print("The Reminder of "+n1+" and "+n2+" is : "+d);
		}		
	
    }
}