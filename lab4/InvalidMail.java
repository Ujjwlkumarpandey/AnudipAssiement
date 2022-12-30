package assiment;


   
import java.util.Scanner;
public class InvalidMail {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter E-mail::");
		String email = sc.next();
		
		try 
		{ 
			if (!email.contains(".") || !email.contains("@") || !email.substring(email.indexOf("@")).contains("."))
			{
				throw new ArithmeticException("Invalid E-mail"); 
			}
			System.out.println("valid");
		} 
		
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println(e); 
		}
			    
		finally
		{
			sc.close(); 
		}
		
	}
}
    

