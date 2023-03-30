import java.util.*;

class Multiplication
{
	public static void main(String[] args)
	{
		int num1,num2,product=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the first number : ");
		num1=sc.nextInt();

		System.out.println("Enter the Second number ");
		num2=sc.nextInt();

		product=num1*num2;
		System.out.println("The  Product is :"+product);
	}
}