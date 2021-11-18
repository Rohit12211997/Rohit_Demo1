package Logical_programs;

public class reverse_String_without_changing_index
{
public static void main(String[] args) 
{
	String Input= "I am an Automation Engineer";  

//Output: "i ma na noitamotua reenigne"

String ar[]=Input.split(" ");

for(int i=0; i<=ar.length-1; i++)

{
String value=ar[i];
String rev="";
for(int j=value.length()-1; j>=0; j--)
{
rev=rev+value.charAt(j);
}

System.out.print(rev+" ");

}
//	String org="I am automation engineer";
//
//	String ar[]=org.split(" ");
//
//	for(int i=0; i<=ar.length-1;i++)
//	{
//		String org1=ar[i];
//
//		String rev="";
//		for(int j=org1.length()-1; j>=0;j--)
//		{
//			rev=rev+org1.charAt(j);
//		}
//		System.out.print(rev+" ");
//	}


}
}
