public class Program1{
    public static void main(String args[]){
        int i=13;
        int sum = 0;
      while(i<=99){
        if(i%2==0){
            sum += i;
        }
            i++;
      }
      System.out.println(sum);
    }
}