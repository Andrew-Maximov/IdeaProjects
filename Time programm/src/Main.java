import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
            int sec = sc.nextInt();
            int hourSum = 0;
            int minSum = 0;
        if (sec >= 3600) hourSum = sec / 3600;
        if (sec - (hourSum * 3600) >= 60) minSum = (sec - (hourSum * 3600)) / 60;
                int secSum = sec - (hourSum * 3600) - (minSum * 60);
                System.out.printf ("%d секунд -> %02d:%02d:%02d", sec, hourSum, minSum, secSum);
            }
        }