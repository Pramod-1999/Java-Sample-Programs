import java.util.*;
class Pyramid
 {
    public static void main(String[] args) 
    {
	 int n,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Number -");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		if(i!=n)
			System.out.println();
	}
    }
}