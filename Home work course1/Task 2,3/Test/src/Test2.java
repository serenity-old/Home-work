import java.util.Scanner;

public class Test2 {
        public static void main(String[] args) {

            System.out.println("Введите зарплату в рублях без вычета налога");
            Scanner scan = new Scanner (System.in);
            double number = scan.nextDouble();
            System.out.println("Зарплата чистыми на руки = " + (number*0.87) + " рублей");
        }
    }

