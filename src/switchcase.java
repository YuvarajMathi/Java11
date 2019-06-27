import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your command : ");
        String text = input.next();
        switch (text) {
            case "STOP":
                System.out.println("System is going down......");
                break;
            case "START":
                System.out.println("System is starting.........");
                break;
            default:
                System.out.println("Command not regonized..");
                break;
        }
    }
}