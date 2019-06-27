import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        do {
            System.out.println("Please enter your Integer: ");
            value = scanner.nextInt();
        } while ( value != 5 );
        System.out.println("You have entered the right Value !! " + value);
        value = scanner.nextInt();
        System.out.println("Your second value: " + value);
    }
}
