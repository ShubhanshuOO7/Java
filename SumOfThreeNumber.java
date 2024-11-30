public class SumOfThreeNumber{
    public static void main(String args[]){
       int input = 999;
       int num = input%10;
       int sum = 0;
        sum = sum + num;
       input = input/10;
       num = input%10;
       sum = sum + num;
       input = input/10;
       sum = sum + input;
       System.out.println(sum);
    }
}