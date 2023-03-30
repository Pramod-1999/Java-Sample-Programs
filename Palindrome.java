import java.util.*;
class Palindrome
 {
    public static void main(String[] args) 
    {
	 int n,temp,rem,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Number - ");
	n=sc.nextInt();
	temp=n;
	while(n>0)
	{
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
	}
	if(temp==sum)
		System.out.print(temp+" is Palindrome.");
	else
		System.out.print(temp+" is not Palindrome.");
    }
}