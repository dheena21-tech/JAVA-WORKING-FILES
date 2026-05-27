import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        // Your Code goes here!

    
    {
    Scanner sc = new Scanner(System.in);
    System.out.println ("Enter the loop value");

    int n =sc.nextInt();

    for(int i=0;i<=n;i++)
    {
        System.out.print((i%2!=0) ? i: "  ");
    }
     sc.close(); 
    }
}
}