/** Составить алгоритм: если введенное имя совпадает с Вячеслав,
 * то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
*/
import java.util.Scanner;

 public class Name {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Напишите имя: ");
        String str = scan.nextLine();
        if (str.equals("Вячеслав") || str.equals("вячеслав")) {
            System.out.println("Привет, Вячеслав!");
        } else {
            System.out.println("Нет такого имени");
        }
    }
 }