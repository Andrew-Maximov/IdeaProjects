import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите действие:");
        System.out.println("1. Объём куба");
        System.out.println("2. Объём параллелепипеда");
        System.out.println("3. Объём сферы");
        System.out.println("4. Объём конуса");
        System.out.println("5. Объём цилиндра");

        int shapeType = (new Scanner(System.in)).nextInt();
        switch (shapeType) {
            case 1:
                System.out.println("ребро куба:");
                float a = sc.nextFloat();
                System.out.printf("Объём равен: %f\n", a*a*a);
                break;
            case 2:
                System.out.println("длина параллелепипеда:");
                float b = sc.nextFloat();
                System.out.println("ширина параллелепипеда:");
                float c = sc.nextFloat();
                System.out.println("высота параллелепипеда:");
                float d = sc.nextFloat();
                System.out.printf("Объём равен: %f\n", b*c*d);
                break;
            case 3:
                System.out.println("радиус сферы:");
                float e = sc.nextFloat();
                System.out.printf("Объём равен: %f\n", (float)Math.PI*((4/3)*e*e*e));
                break;
            case 4:
                System.out.println("радиус основания конуса:");
                float f = sc.nextFloat();
                System.out.println("высота конуса:");
                float g = sc.nextFloat();
                System.out.printf("Объём равен: %f\n", (float)Math.PI*(1/3)*f*f*g);
                break;
            case 5:
                System.out.println("радиус основания цилиндра:");
                float h = sc.nextFloat();
                System.out.println("высота цилиндра:");
                float i = sc.nextFloat();
                System.out.printf("Объём равен: %f\n", (float)Math.PI*h*h*i);
                break;
            default:
                System.out.println("неизвестная фигура");
        }
    }
}