package day23;

public class StringStrBuffStrBilDemo {

	public static void main(String[] args)
	{  //string immutable
		
		
		System.out.println("String class demo");
	String s="welcome";
	System.out.println(s);
	s.concat("to java");
	System.out.println(s);
	System.out.println("lenght of string is::"+s.length());
	//System.out.println("after reversing string"+s.reverse()); not fro string 
	boolean b=s.contains("c");
	System.out.println(b);
	
	
	//StrinBuffer--mutable
	System.out.println("*******StringBuffer DEmo******");
	StringBuffer str=new StringBuffer("welcome");
	str.append(" to java");
	System.out.println(str);
	System.out.println("lenght of stringbuffere is::"+str.length());
	StringBuffer ss=str.insert(15,"leela");
	System.out.println("after inserting string in string buffer"+ss);
	
	System.out.println("after reversing string    "+ss.reverse());
	/*boolean b1=ss.contains("");
	System.out.println(b1);*/
	//StringBilder--->mutable
	
	System.out.println("******Stringbuilder  demo******");
	StringBuilder str1=new StringBuilder("welcome");
	str1.append(" to java");
	System.out.println(str1);
	System.out.println("lenght of stringbuilder is::"+str1.length());
	StringBuilder ss1=str1.insert(15,"leela");
	System.out.println("after inserting string in string builder"+ss1);
	System.out.println("after reversing string    "+ss1.reverse());
	  /*boolean b2=str1.contains("to");
	System.out.println(b2);*/
	}

}
