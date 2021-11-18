package Logical_programs;

public class ReverseString_practise 
{
public static void main(String[] args) 
{
	String org="Rohit";
	String rev="";
	
	for(int i=org.length()-1;i>=0;i--)
    {
		rev=rev+org.charAt(i);
	}
	
	System.out.println("origional String"+" "+org);
	System.out.println("Origional String"+" "+rev);
}
}
