package qsp;

import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	public void test1()
	{
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
