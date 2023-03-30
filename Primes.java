import java.util.*;
class Primes
 {
    public static void main(String[] args) 
    {
	 int n1,n2,i,temp=0,rem=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter First Number -");
	n1=sc.nextInt();
	System.out.print("Enter Second Number -");
	n2=sc.nextInt();
	if(n1==0 || n1==1)
		System.out.print(n1+ " neither Prime nor Composite.");
	else if(n1==0 || n1==1)
		System.out.print(n1+ " neither Prime nor Composite.");
	for(i=2;i<=n1/2;i++)
	{
		if(n1%i==0)
		{
			temp=1;
			break;
		}
	}
	if(temp==0)
		System.out.print(n1+" is Prime.");
	else
		System.out.print(n1+" is not Prime.");
	if(temp==1)
		System.out.print(n2+" is Prime.");
	else
		System.out.print(n2+" is not Prime.");
	if(n1>n2)
	{
		rem=n1%n2;
		System.out.print("Reminder is "+rem);
	}	
	else
	{
		rem=n2%n1;
		System.out.print("Reminder is "+rem);
	}
    }
}