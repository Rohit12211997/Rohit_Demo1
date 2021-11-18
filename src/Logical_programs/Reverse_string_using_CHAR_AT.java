package Logical_programs;

public class Reverse_string_using_CHAR_AT 
{
public static void main(String[] args)
{
	 String org ="Rohit";
	 String rev ="";
	 
	 for(int i=org.length()-1;i>=0;i--)
	 {
		 rev=rev+org.charAt(i);
	 }
	  System.out.println("origional string:"+" "+org);
	  System.out.println("Reverse string:"+" "+rev);
}     
}
