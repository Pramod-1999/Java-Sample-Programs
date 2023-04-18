import java.util.*;

class Replacevowels
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String :  ");
		String str = sc.nextLine();
		System.out.println("The string after replacing vowels : ");
		str = str.replaceAll("[aeiou]","*");
		System.out.print(str);
	}
}	