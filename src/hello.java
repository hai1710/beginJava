import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        System.out.println("Enter your name:");
        a = scanner.nextLine();
        System.out.println("Hello: " + a);
    }
}
