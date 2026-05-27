import java.util.Scanner;
public class odd {
    public static void main(String[] args) {
        // Your Code goes here!
        Scanner scanner= new Scanner(System.in);
       System.out.println("Enter the number");
 
        int number = scanner.nextInt();
        
        if(number%2==0)
        {
            System.out.println( " even number:");
        
        }
        else {
            System.out.println("odd number");
        }

    }
}