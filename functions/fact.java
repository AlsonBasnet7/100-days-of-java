//  factorial of a enter number by the user.

import java.util.Scanner;

public class fact {
    public static void oral(int num) {
        if(num<0){
            System.err.println("Number you have entered is invaild");
         return;
        }
        int fact=1;

        for(int i=num;i>=1;i--){
            fact = fact * i;
        }
        System.err.println("The factorial of a number is "+fact);
        return;
        
    }
        public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            System.err.println("Enter the number");
            int num=sc.nextInt();
            oral(num);
            



            

        }
        }

    
