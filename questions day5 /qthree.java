import java.util.*;
public class qthree {
    //Greater number entered by the user.
    public static void greaterNumber(int n, int m) {
        if(n>m){
            System.err.println("The first number is greater");
        }
        else{
            System.err.println("The second number is greater");
        }    
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.println("Enter the first number");
        int num1=sc.nextInt();
        System.err.println("Enter the second number");
        int num2=sc.nextInt();
        greaterNumber(num2, num2);

        

    }

    
}
