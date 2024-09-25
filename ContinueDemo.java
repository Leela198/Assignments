package day37;

public class ContinueDemo {

	public static void main(String[] args) 
	{
		for(int i=0;i<=10;i++)
		{
			if(i==5)
				continue; // wont print 5 value in output
			System.out.println("i value is"+i);
		}
	}

}
