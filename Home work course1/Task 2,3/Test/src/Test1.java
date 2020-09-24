import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        System.out.println("Введите количество литров бензина");
        Scanner scan = new Scanner (System.in);
        double number = scan.nextDouble();
        System.out.println("Стоимость 92-го бензина=" + (42.6 * number) + " рублей");
    }
}