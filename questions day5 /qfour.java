import java.util.*;
public class qfour {
    //Function to print if you're eligible to vote or not.
    public static void yourAge(int age) {
        if(age>18){
            System.out.println("You're are eligible to Vote");
        }
        else{
            System.out.println("You're not eligible t0 Vote");
        } }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.println("Enter your age");
        int age= sc.nextInt();
        yourAge(age);

        



    }
    
}
