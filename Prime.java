import java.util.*;
class Prime
 {
    public static void main(String[] args) 
    {
	 int n,i,temp=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Number -");
	n=sc.nextInt();
	if(n==0 || n==1)
	{
		System.out.print(n+" neither Prime nor Composite.");
		temp=-1;
	}
	for(i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			temp=1;
			break;
		}
	}
	if(temp==0)
		System.out.print(n+" is Prime.");
	else
		System.out.print(n+" is not Prime.");
    }
}
