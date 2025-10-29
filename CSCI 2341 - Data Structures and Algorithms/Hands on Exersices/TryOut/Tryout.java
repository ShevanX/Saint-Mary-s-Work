import java.util.Scanner;
public class Tryout {
    private static final Scanner kbd = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Encode or Decode (Enter e or d):  ");
        String input = kbd.next();
        char mode = input.charAt(0);
        System.out.print("Enter the first letter (Capital): ");
        char upper = kbd.next().charAt(0);
        System.out.print("Enter the second letter (Simple): ");               
        char lower = kbd.next().charAt(0);

        
        System.out.println(mode + upper + lower);



    }
}
