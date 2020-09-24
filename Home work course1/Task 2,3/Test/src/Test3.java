import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        System.out.println("Введите количество секунд");
        Scanner scan = new Scanner (System.in);
        double number = scan.nextDouble();
        System.out.println("Количество часов = " + (number/3600));
    }
}