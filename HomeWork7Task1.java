import java.util.Scanner;

public class HomeWork7Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = in.nextLine();

        if (str.startsWith("abc")) {
            str = "www";
        } else {
            str += "ttt";
        }
        System.out.println(str);
    }
}