import java.util.Scanner;

public class HomeWork7ask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str1 = in.nextLine();
        String str2 = str1.replaceAll(" ", "");

        System.out.println("str2 = " + str2);
    }
}