public class questiontwo {

    // Function to print odd numbers from 1 to 10 and their sum
    public static void printOddNumbersAndSum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { 
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers = " + sum);
    }

    public static void main(String[] args) {
        printOddNumbersAndSum();
    }
}
