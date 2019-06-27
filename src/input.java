import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter an Interger: ");
        int value = user_input.nextInt();
        System.out.println("You are entered : " + value);
    }
}
