package day37;

public class Asserdemo2 {
	
		  public static void main(String[] args)
		  {
		    // Enable assertions
		    ClassLoader loader = ClassLoader.getSystemClassLoader();
		    loader.setDefaultAssertionStatus(true);
		    
			  
		    // Run the assert example
		    AssertExample example = new AssertExample();
		    example.run();
		  }
		}

		class AssertExample
		{
		  public void run() 
		  {
		    int a = 12;
		    try {
		     // assert a == 12:"pass"; // Assertion without a fail message
		      assert a == 12 : "a is not 12"; //assertion with message
		     assert a == 14: "a is not 15";
		    } 
		    catch (AssertionError e) {
		      System.out.println(e.getMessage());
		    }
		  }
		}


