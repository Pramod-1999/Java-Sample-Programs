import java.util.*;

class Subtraction
{
	public static void main(String[] args)
	{
		int num1,num2,difference=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the first number : ");
		num1=sc.nextInt();

		System.out.println("Enter the Second number ");
		num2=sc.nextInt();

		difference=num1-num2;
		System.out.println("The Differnce is :"+difference);
	}
}