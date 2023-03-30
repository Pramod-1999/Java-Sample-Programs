import java.util.*;

class Addition
{
	public static void main(String[] args)
	{
		int num1,num2,sum=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the first number : ");
		num1=sc.nextInt();

		System.out.println("Enter the Second number ");
		num2=sc.nextInt();

		sum=num1+num2;
		System.out.println("The Sum is :"+sum);
	}
}