/** Составить алгоритм: если введенное число больше 7, то вывести “Привет”
 */
import java.util.Scanner;

 public class Hello {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое число: ");

        try {
            int num = scan.nextInt();
            if (num > 7) {
                System.out.println("Привет");
            }
        } catch (Exception e) {
            System.out.println("Введенный символ не является числом");
        }
    }
}
