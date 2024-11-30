public class TableOfFive {
    public static void main(String args[]) {
        int table = 5;
        for (int i = 1; i <= 10; i++) {
            // Concatenate the parts of the message correctly
            System.out.println("5 x " + i + " = " + (table * i));
        }
    }
}
