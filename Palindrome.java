public class Reverse{
    public static void main(String args[]){
      int num = 128;
      int rev = 0;
      int rem;
      while(num>0){
        rem = num%10;
        rev = sum*10 + rem;
        num=num/10;
      }
      if(num==rev){
        System.out.println("thi")
      }
      System.out.println(sum);
    }
}