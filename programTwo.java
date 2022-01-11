import java.util.Scanner;
public class programTwo {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter car manufacture year");

        int y = scan.nextInt();
        String word = scan.nextLine();
                    //And
        if(y >= 2008 && y <= 2022){
            System.out.println("This car does not pass the 15 year rule and cannot be imported into Canada.");
        }
        else if(y >= 1886 && y <= 2007){
            System.out.println("This car passes the 15 year rule and can be imported into Canada.");
        }
        else{
            System.out.println("Please enter a valid car manufacture date.");
        }
    }
}