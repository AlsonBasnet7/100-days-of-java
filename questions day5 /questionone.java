// take the input from the user and print their average.
import java.util.*;
public class questionone {
    public static int avv(int num1,int num2, int num3) {
        int avg=(num1+num2+num3)/3;
        // System.err.println("The average of a number is "+ avg);
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.println("Enter the first number");
        int num1=sc.nextInt();
        System.err.println("Enter the second number");
        int num2=sc.nextInt();
        System.err.println("Enter the third number");
        int num3=sc.nextInt();

        int average=avv(num1, num2, num3);
        System.err.println("The average of the 3 number is "+average);


    }


    
}
