package day37;
//encapsulation is wrapping of data nd methods into single unit
//all the variabels should be private(no one can access,each variabel have 2 methods setters nd getteres using for accessing the
//v´class variubles,all the methods to be public
class Demo
{
	private	String un="kontakt@gmail.com";
	private int pwd;
	
	
public int getPwd()
{
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

public	void setUn(String un)
	{
		this.un=un;
	}

public String  getUn()
{
	return un;
}
}


public class EncapsulationDemo
{

	public static void main(String[] args) 
	{
	
		Demo d1=new Demo();
		d1.setUn("leela.rani2@gmail.com");
		System.out.println(d1.getUn());
		d1.setPwd(12345);
		System.out.println(d1.getPwd());
	}
		

	}


