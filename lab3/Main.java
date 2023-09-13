import java.lang.String;
import java.util.Scanner;

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

    }
}
