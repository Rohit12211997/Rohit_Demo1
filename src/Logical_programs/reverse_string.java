package Logical_programs;

public class reverse_string 
{
public static void main(String[] args)
{
	String str ="I LOVE INDIA";
	// convert from string object to string buffer
	StringBuffer sbr=new StringBuffer(str);
	// to reverse the string
	sbr.reverse();
	System.out.println(sbr);
	
	
}
}
