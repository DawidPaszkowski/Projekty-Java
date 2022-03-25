import java.util.Scanner;

public class CalculatorHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaje pierwszą licznę: ");
        int firtsNumber = scanner.nextInt();
        System.out.println("Podaj druga liczbę: ");
        int secounNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        int addition = calculator.addition(firtsNumber, secounNumber);
        int subtraction = calculator.subtraction(firtsNumber, secounNumber);
        int multipication = calculator.multiplication(firtsNumber, secounNumber);
        int divison = calculator.division(firtsNumber, secounNumber);
        int modulo = calculator.modulo(firtsNumber, secounNumber);

        System.out.println("Wynik dodawnia: " + addition);
        System.out.println("Wynik odejmowania: " + subtraction);
        System.out.println("Wynik mnożenia: " + multipication);
        System.out.println("Wynik dzielenie: " + divison);
        System.out.println("Wynik modulo " + modulo);
    }
}
