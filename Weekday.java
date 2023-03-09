import java.util.*;
class Weekday
 {
    public static void main(String[] args) 
    {
	 int n,rem;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Date - ");
	n=sc.nextInt();
	rem=n%7;

	if(rem==1)
		System.out.print(n+" is Sunday.");
	else if(rem==2)
		System.out.print(n+" is Monday.");
	else if(rem==3)
		System.out.print(n+" is Tuesday.");
	else if(rem==4)
		System.out.print(n+" is Wednesday.");
	else if(rem==5)
		System.out.print(n+" is Thursday.");
	else if(rem==6)
		System.out.print(n+" is Friday.");
	else
		System.out.print(n+" is Saturday.");
    }
}