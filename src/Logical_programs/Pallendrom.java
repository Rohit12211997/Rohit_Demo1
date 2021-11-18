package Logical_programs;

public class Pallendrom 
{
public static void main(String[] args) 
{
	String org="madam";
	String rev="";
	
	for(int i=org.length()-1;i>=0;i--)
	{
		rev=rev+org.charAt(i);
	}
	System.out.println("origional string"+" "+org);
	System.out.println("origional string"+" "+rev);
	
	if(org.equals(rev)) 
	{
		System.out.println("given String is pallendrom");
		
	}
	else
	{
		System.out.println("given String is not pallendro");
	}
}
}
