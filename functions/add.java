// This is with the no return fuction type.
import java.util.*;
public class add {
    public static void addNUm(int num1, int num2) {
        System.out.println( num1+num2);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.println("Enter the first number");
        int num1 = sc.nextInt();
        System.err.println("Enter the second number");

        int num2 = sc.nextInt();
        int sum=num1+num2;
        System.err.println("The sum of the two number is ");

        addNUm(num1, num2);

    }
    
}
