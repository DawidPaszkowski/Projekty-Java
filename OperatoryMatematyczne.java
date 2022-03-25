public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secoundNumber = 6;
        float thirdNumber = 4;

        int addition = firstNumber + secoundNumber;
        int subtraction = firstNumber - secoundNumber;
        int multiplication = firstNumber * secoundNumber;
        float division = thirdNumber/secoundNumber;
        int mod = secoundNumber%firstNumber;

        System.out.println("Wynik dodawnia "+ addition);
        System.out.println("Wynik odejmowania "+ subtraction);
        System.out.println("Wynik mnozenia " + multiplication);
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Wynik modulo " + mod);

        firstNumber+=secoundNumber; //firstNumber = firstNumner + secoundNmber
        System.out.println("Po dodaniu "+firstNumber);
        firstNumber-=secoundNumber; //czyli wynik z wiersza powyżej (firstNumber = 10) - secoundNumber itd.)
        System.out.println("Po odejmowaniu "+ firstNumber);
        firstNumber*=secoundNumber;
        System.out.println("Po mnozeniu "+ firstNumber);
        firstNumber/=secoundNumber;
        System.out.println("Po dzieleniu "+ firstNumber);
        firstNumber%=secoundNumber;
        System.out.println("Po modulo " + firstNumber);
    }
}
