import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork7Task3 {
    public static void main(String[] args) {
        String str = "Listen to the news from today, read the text at the same time! Listen to the news from today - without reading the text.";
        Pattern punct = Pattern.compile("\\p{Punct}");
        String[] arrayText = str.split("\\s");
        int puncts = 0;
        Matcher m;

        for (String s : arrayText) {
            int count = 0;
            m = punct.matcher(s);
            while (m.find()) {
                ++count;
            }
            puncts += count;
        }
        System.out.println("The number of punctuations exists in the string is: " + puncts);
    }
}
