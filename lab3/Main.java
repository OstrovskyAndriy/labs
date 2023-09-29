import entity.TextChanger;
import entity.PasswordValidator;

import java.lang.String;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter index: ");
        int index = scanner.nextInt();

        System.out.print("Enter symbol: ");
        char symbol = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        TextChanger textChanger = new TextChanger(text, index, symbol);
        textChanger.changeText();

        System.out.println(textChanger.getChangedText());

        try {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            PasswordValidator passwordValidator = new PasswordValidator(password);
            if(passwordValidator.isValidPassword()) {
                System.out.println("corect password");
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
