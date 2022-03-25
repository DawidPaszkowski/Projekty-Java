import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj sówj wiek: ");
        int age = scanner.nextInt();

        if (age < 18 && age >= 0) {
            System.out.println("Zakaz sprzedaży alkoholu nieletnim");
        }else if (age < 0 )  {
            System.out.println("Podaj poprawną wartość");
        } else if (age >= 18) {
            System.out.println("Na zdrowie");
        }
    }
}
