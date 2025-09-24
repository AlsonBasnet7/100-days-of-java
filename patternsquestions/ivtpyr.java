//Inverted half pyramid(rotated by 180)
public class ivtpyr {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            //inner loop to print space.
            for(int j=1;j<=n-i;j++){
                System.err.print(" ");
            
            }
            //inner loop to print star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        //this is to create a next line in the program so we get the desired output.
            System.err.println("");
    }
    
}}
