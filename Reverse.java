public class Reverse{
    public static void main(String args[]){
      int num = 128;
      int sum = 0;
      int rem;
      while(num>0){
        rem = num%10;
        sum = sum*10 + rem;
        num=num/10;
      }
      System.out.println(sum);
    }
}