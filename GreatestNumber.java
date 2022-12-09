
import java.util.Scanner;


public class GreatestNumber {
    public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter your frist number");
   int a=sc.nextInt();
   System.out.println("Enter your socend number");
   int b=sc.nextInt();
   System.out.println("Enter your therd number");
   int c=sc.nextInt();
    if(a>b&&a>c){
        System.out.println("a is greter");  
    }else if(b>a&&b>c){
        System.out.println("b is greter");
        
    }else{
        System.out.println("c is greter");
    }
    }
    
}
