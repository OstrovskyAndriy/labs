import java.lang.String;
import java.util.StringTokenizer;

public class TextChanger {
    private String text;
    private String changedtext; //якщо в подальшому знадобиться отримати змінений текст
    private int index;
    private char symbol;


    public TextChanger(final String text, final int index, char symbol) {
        this.text = text;
        this.index = index;
        this.symbol = symbol;
        changedtext = "";
    }

    public void changeText() {
        //токенайзер ділить рядок на слова по роздільникам-пробілам
        StringTokenizer tokenizer = new StringTokenizer(text);

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();

            if (index < word.length() && index >= 0) {
                StringBuffer buffer = new StringBuffer(word);
                buffer.setCharAt(index, symbol);
                word = buffer.toString();
            }

            changedtext = changedtext + word + " ";
        }
        System.out.println(changedtext.length());
    }

    public final String getChangedText(){
        return changedtext;
    }
}
