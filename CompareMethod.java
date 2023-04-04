//Program to design a class to overload a method compare() to return the greater of two as follows:
//		void compare(int, int)
//		void compare(char, char)
//		void compare(String, String)

import java.util.Scanner;

public class CompareMethod
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Program to denmonstrate the Overloading of Methods.");
		MethodOverloaded mo = new MethodOverloaded();
		
		System.out.println("Enter two Integers :-");
		System.out.println("First - ");
		int n1 = sc.nextInt();	
		System.out.println("Second - ");
		int n2 = sc.nextInt();
		mo.compare(n1,n2);
	
		System.out.println("Enter two Characters :-");
		System.out.println("First - ");
		char c1 = sc.next().charAt(0);	
		System.out.println("Second - ");
		char c2 = sc.next().charAt(0);
		mo.compare(c1,c2);

		System.out.println("Enter two Strings :-");
		System.out.println("First - ");
		String s1 = sc.next();	
		System.out.println("Second - ");
		String s2 = sc.next();
		mo.compare(s1,s2);
	}
}

class MethodOverloaded
{
	public void compare(int x, int y)
	{
		if(x>y)
			System.out.println("First number is Greater.");
		else
			System.out.println("Second number is Greater.");
	}
	
	public void compare(char ch1, char ch2)
	{
		int x = (int) ch1;
		int y = (int) ch2;
		if(x>y)
			System.out.println("First Character is Greater.");
		else
			System.out.println("Second Character is Greater.");
	}

	public void compare(String str1, String str2)
	{
		if(str1.compareTo (str2) >0)
			System.out.println("First String is Greater.");
		else
			System.out.println("Second String is Greater.");
	}
}

//OR

//Program to design a class to overload a method compare() to return the greater of two as follows:
//		void compare(int, int)
//		void compare(char, char)
//		void compare(String, String)

import java.util.Scanner;

public class CompareMethod
{
	public static void main(String args[])
	{
		System.out.print("\nProgram to demonstate the Overloading of methods");
		MethodOverloaded mo = new MethodOverloaded();
		Scanner reader = new Scanner(System.in);
		System.out.print("\n\nEnter two integers: ");
		System.out.print("\nFirst: ");
		int num1 = reader.nextInt();
		System.out.print("\nSecond: ");
		int num2 = reader.nextInt();
		mo.compare(num1, num2);
		
		System.out.print("\n\nEnter two characters: ");
		System.out.print("\nFirst: ");
		char c1 = reader.next().charAt(0) ;
		System.out.print("\nSecond: ");
		char c2 = reader.next().charAt(0) ;
		mo.compare(c1, c2);	

		System.out.print("\n\nEnter two Strings: ");
		System.out.print("\nFirst: ");
		String s1 = reader.next();
		System.out.print("\nSecond: ");
		String s2 = reader.next();
		mo.compare(s1, s2);
	}
}

class MethodOverloaded
{
  public void compare(int x, int y)
  {
  	if (x > y)
  	{
  		System.out.print("\nFirst number is greater.");
  	}
  	else
  	{
  		System.out.print("\nSecond number is greater");
  	}
  }

  public void compare(char ch1, char ch2)
  {
  	int x = (int) ch1;
  	int y = (int) ch2;
  	 if (x > y)
  	{
  		System.out.print("\nFirst character is greater.");
  	}
  	else
  	{
  		System.out.print("\nSecond character is greater");
  	}
  }

  public void compare(String str1, String str2)
  {
  	if(str1.compareTo(str2) > 0)
  	{
  		System.out.print("\nFirst String is greater.");
  	}
  	else
  	{
  		System.out.print("\nSecond String is greater");
  	}	
  }
}
