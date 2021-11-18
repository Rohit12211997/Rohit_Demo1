package Logical_programs;

public class Counting_of_zero_and_one
{
public static void main(String[] args) 
{
	String a="010101011101";
	
	int zero=0;
	int one=0;
	
	for(int i=0; i<=a.length()-1; i++)	
	{
		char num = a.charAt(i);
		if(num =='0')
		{
			zero++;
		}
		else
		{
			one++;
		}
	
	}
	System.out.println("Total count of Zero= "+zero);
	System.out.println("Total count of one= "+one);
}
}
