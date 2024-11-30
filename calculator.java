import java.util.Scanner;
public class calculator{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your first number : ");
      long firstNum = sc.nextLong();
      System.out.println("Enter your second number : ");
      long secondNum = sc.nextLong();
      System.out.println("Enter 1 for add 2 for subtract 3 for multiplication and 4 for divide");
      int operation = sc.nextInt();
      long total;
      switch(operation){
         case 1 :
             total = firstNum + secondNum;
            System.out.println("Sum of two number is :"+total);
            break;
         
         case 2 :
             total = firstNum - secondNum;
            System.out.println("Subtract of two number :"+total);
            break;
         case 3 :
             total = firstNum*secondNum;
            System.out.println("Product of two number is :"+total);
            break;
         
         case 4 :
             total = firstNum/secondNum;
            System.out.println("Divide of two number is :"+total);
            break;
         
      }
    }
}