import java.util.Scanner;

public class IfElseg{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        boolean criminal = true;

        if (age < 18) {
            System.out.println("You cannot vote");
        } else {
            // This covers all ages 18 and above.
            if(!criminal){
            System.out.println("You are eligible to vote");

            if (age >= 21) {
                System.out.println("You can also take part in elections");
            }
            else{
                System.out.println("You are a fucking criminal");
            }
            }
        }
    }
}
