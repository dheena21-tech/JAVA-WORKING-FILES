import java.util.Scanner;
public class fun {
    public static void main(String[] args) {
        // Your Code goes here!
String n;
  Scanner sc= new Scanner (System.in);
  System.out.print("Enter the String value: ");
  n=sc.nextLine();

  switch(n)
  {
    case "green":
    System.out.println("goooo");
    break;

    case "red":
    System.out.println("stop");
    break;

    case "yellow ":
    System.out.println("start");
    break;
     
     default:
     System.out.println(" No exsist value");
     break;
  } sc.close ();
    }
  }
