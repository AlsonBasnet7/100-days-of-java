// Add of two numbers using return fuction.
import java.util.*;
public class addi {
    public static int addMy(int num1,int num2) {
    int sum= num1+num2;
    return sum;    
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.println("Enter the first number");
        int num1= sc.nextInt();
        System.err.println("Enter the second number");
        int num2=sc.nextInt();
        int sum=addMy(num1, num2);
        System.err.println("The addition of two numbers with return function in Java is " + sum);
        
    
        
    }
    
}
