import java.util.Scanner;

public class CalculatorTest {

   /* public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dodawanie");
        int firstNumber = scanner.nextInt();
        int sixthNumber = scanner.nextInt();
        int dodawanie = firstNumber + sixthNumber;
        System.out.println(" Wynik odejmowania: " + dodawanie);
        System.out.println("Odejmowanie ");
        int secoundNumber = scanner.nextInt();
        int seventhNumber = scanner.nextInt();
        int odejmowanie = secoundNumber - seventhNumber;
        System.out.println("Wynik odejmowania " + odejmowanie);
        System.out.println("Mnożenie");
        int thirdNumber = scanner.nextInt();
        int eigthNumber = scanner.nextInt();
        int mnożenie = thirdNumber*eigthNumber;
        System.out.println("Wynik mnożenia " + mnożenie);
        System.out.println("Dzielenie");
        int fourthNumber = scanner.nextInt();
        int ninthNumber = scanner.nextInt();
        int dzielenie = fourthNumber/ninthNumber;
        System.out.println("Wynik dzielenie "+dzielenie);
        System.out.println("Modulo");
        int fifthNumber = scanner.nextInt();
        int tenthNumber = scanner.nextInt();
        int modulo = fifthNumber%tenthNumber;
        System.out.println("Wynik modulo "+ modulo);
    }*/
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Podaje pierwszą licznę: ");
       int firtsNumber = scanner.nextInt();
       System.out.println("Podaj druga liczbę: ");
       int secounNumber = scanner.nextInt();

       int dodawanie = firtsNumber+secounNumber;
       int odejmowanie = firtsNumber-secounNumber;
       int mnożenie = firtsNumber*secounNumber;
       int dzielenie = firtsNumber/secounNumber;
       int modulo = firtsNumber%secounNumber;

       System.out.println("Wynik dodawnia: "+ dodawanie);
       System.out.println("Wynik odejmowania: "+ odejmowanie);
       System.out.println("Wynik mnożenia: " + mnożenie);
       System.out.println("Wynik dzielenie: " + dzielenie);
       System.out.println("Wynik modulo " + dzielenie);
   }
}
