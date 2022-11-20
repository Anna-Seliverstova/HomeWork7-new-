import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork7Task4 {
    public static void main(String[] args) {
        String str = "aNna24.sEliverstovaania13@gmail.com";
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{1,20}\\.[a-zA-Z0-9]{1,20}@[a-z]{2,10}\\.[a-z]{2,3}");
        Matcher matcher = pattern.matcher(str);

        int counter = 0;
        while (matcher.find()) {
            counter++;
            int starIndex = matcher.start();
            int endIndex = matcher.end();
            String matchedValue = str.substring(starIndex, endIndex);

            System.out.println("counter = " + counter + ", matchedValue = " + matchedValue);
        }
    }
}
