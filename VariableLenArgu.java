//Program to pass the variable length arguments.

class VariableLenArgu
{
	public static void main(String args[])
	{
		System.out.print("\nProgram to display the variable lenght Arguments passing ....\n");
		VariableArgu va = new VariableArgu();
		System.out.print("\nOnly one Arguments -\n");
		va.print_arguments("Pramod");
		System.out.print("\nMultiple Arguments -\n");
		va.print_arguments("Revanth\n", "Teja\n", "Pramod\n");

	}
}
class VariableArgu
{
	void print_arguments(String... str)
	{
		for(String s:str)
			{
				System.out.print(s);
			}
	}
}