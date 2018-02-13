import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * (1 % (a / b + 1)) + b * (1 % (b / a + 1)) * (1 % ((a * b) - (a * a) + 1)));
    }
}
