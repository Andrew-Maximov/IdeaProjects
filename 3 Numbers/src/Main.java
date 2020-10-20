import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;

        if (a % 2 == 0)
        count = count + 1;
        if (b % 2 == 0)
        count = count + 1;
        if (c % 2 == 0)
        count = count + 1;

        if (count >= 2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
