package qsp;

import org.testng.annotations.Test;

public class Demo2 
{
     @Test
     public void test2() 
     {
    	 for(int i=1;i<=3;i++)
 		{
 			for(int j=1;j<=i;j++)
 			{
 				System.out.print("*");
 			}
 			System.out.println();
 		}
 		for(int i =2;i>=1;i--)
 		{
 			for(int j=1;j<=i;j++) 
 			{
 				System.out.print("*");
 				
 			}
 			System.out.println();
 		}
    	 
     }

}
