import java.util.Scanner;
class Shape
{
	double length, breadth;
	Shape(double l, double b)
	{
		 length = l;
		 breadth= b;
	 }
	 Shape(double len)
	{
		 length = breadth = len;
	 }
	 // To calculate the area of a shape object	
	 double calculate()
	{
		 return length * breadth ;
	 }
}
	class Test1 extends Shape
	{
	
	//Create a derived class constructor which can call the one parametrized constructor of the base class
	double height;
	Test1(double l,double h)
	{	
 		super(l);
 	this.length = l;
	 this.height = h;
	}

	//Create a derived class constructor which can call the two parametrized constructor of the base class
	Test1(double l,double b,double h)
	{
		 super(l,b);
		 this.length=l;
		 this.breadth=b;
		 this.height=h;
	}

	//Override the method calculate() in the derived class to find the volume of a shape instead of finding the area of a shape
	double calculate()
	{
	 return length*breadth*height;
	}
}

class VolumeOfShape
{
	public static void main(String[] args)
	{
	 System.out.println("Enter the length, breadth and height\n");
	Scanner sc = new Scanner(System.in);//Create an object to read input
	 double l=sc.nextDouble(); //Read length
	 double b=sc.nextDouble(); //Read breadth
	 double h=sc.nextDouble(); //Read height	
	 Test1 myshape1 = new Test1(l,h);
	 Test1 myshape2 = new Test1(l,b,h);
	 double volume1;
	 double volume2;
	 volume1 = myshape1.calculate();
	 volume2=myshape2.calculate();
	 System.out.println("The volume using length and height is : "+volume1);
	 System.out.println("The volume using all 3 parameters is : "+volume2);
 	}
} 
