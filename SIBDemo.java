package day37;

public class SIBDemo
{
	SIBDemo()  // constructor will execute after instance initialization block executed
	{
		System.out.println("demo to diffrentiate IIB nd constructor");
	}
	
	static  // first stmt that willl executre even before main method follws by mai() executoin
	{
		System.out.println("Sib demo program block 1");
	}

	{
		System.out.println("IIib demo program block 1");
	}
	static //sib block-2
	{
		System.out.println("Sib block 2");
	}
	
	{
		System.out.println("IIib block 2");
	}
	static  
	{
		System.out.println("Sib block 3");
	}
	public static void main(String[] args)
	{
		System.out.println("main method after sib ecexution");
		SIBDemo ss=new SIBDemo(); //iib will execute after creating  an object to class
		SIBDemo ss1=new SIBDemo();
	}

}
