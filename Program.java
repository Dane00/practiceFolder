import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
     System.out.println("Enter number of days to be converted to seconds.");

        int days = scan.nextInt();

     int h = days*24;
     int m = h*60;
     int s = m*60;
     int result = s;
      System.out.println(result + " seconds are in that or those day(s)" );
    }
}
