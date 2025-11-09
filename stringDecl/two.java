import java.util.*;
public class two {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.print("Enter your name");
         String name=sc.next();
         System.out.print("Enter your caste");

         String caste= sc.next();
         String merged= name + caste;
         System.out.println("Your name is "+ merged );

    }
    
}
