package day20;
import java.util.*;

public class ThrowThrowsDemo
{
	public static void main(String[] args) //throws NullPointerException,InputMismatchException
	{
		if(2==1)
			
			{
			throw new NullPointerException("if condition true null value");
			}
		else 
		{
			throw new InputMismatchException("sorrry mismatch input");
			
		}
	}
}
