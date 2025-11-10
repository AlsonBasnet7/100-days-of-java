public class three {
    public static void main(String[] args) {
        //String builder
        StringBuilder sb = new StringBuilder("Alson");
        System.out.print(sb);
        //Set character at index.
        sb.setCharAt(0, 'M');
        System.out.println(sb);
        //insert the character in the index.
        sb.insert(3, 'h');
        System.out.println(sb);
        //delete the comment or extra element in the program.
        sb.delete(1,3);
        System.out.print(sb);



    }
    
}
