import java.util.*;
class Factorial
 {
    public static void main(String[] args) 
    {
	int n,i,fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Number -");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
		fact=fact*i;
	System.out.print(n+" factorial is "+fact);
    }
}