
import java.util.Scanner;


public class  InvalidMailException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email id");
		String email = sc.next();
		int i = email.indexOf('@');
		if(i == -1)
		{
			System.out.println(email + " invalid. there is no @");
			return;
		}
		int j = email.indexOf('.', i);
		if (j == -1)
		{
			System.out.println(email + " invalid. there is no dot AFter @");
			return;
		}
		if((i+1) == j)
		{
			System.out.println(email + " invalid. dot should not immedetly after @");
			return;
		}
		
		if (j == email.length()-1)
		{
			System.out.println(email + " invalid. dot should not be at the end");
			return;
		}
		System.out.println(email + " is Valid");
	}
}
