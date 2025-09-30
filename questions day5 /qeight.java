import java.util.*;
public class qeight {
    // greater common divisor.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1,num2;
        while (true) {
            //entering the number
            System.out.print("Enter the first number");
            num1=sc.nextInt();
            System.err.println("Enter the second number"); 
            num2=sc.nextInt();
            //now to calculate 
            int gcd=findGCD(num1,num2);
            System.err.println("GCD of"+num1+"and"+num2+"is"+gcd);
            System.err.println("Do you want to change the number(yes/no)");
            String choice=sc.next();
            if(choice.equalsIgnoreCase("no")){
                break;//here we exit the loop
        
            }

        }
        sc.close();
        System.err.println("Program Ended");

    }
    //Function to find GCD using Euclidean Algorithm.
    public static int findGCD(int x,int y) {
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        return x;
        
    }
    }

    

    

