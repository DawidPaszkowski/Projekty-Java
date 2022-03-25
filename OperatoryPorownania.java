import java.util.Scanner;

public class OperatoryPorownania {
   /* public static void main(String[] args) {

        int firstNumber = 4;
        int secoundNumber = 6;

        boolean resoult = secoundNumber > firstNumber; //true

        System.out.println(resoult);
        System.out.println(firstNumber > secoundNumber);
        System.out.println(firstNumber < secoundNumber);
        System.out.println(firstNumber>= secoundNumber);
        System.out.println(firstNumber <= secoundNumber);
        System.out.println(firstNumber == secoundNumber);//czy są równe
        System.out.println(firstNumber != secoundNumber);// czy nie są równe

    }*/
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Podaj liczbę: ");
       int firsNumber = scanner.nextInt();
       System.out.println("Podaj drugą liczbę: ");
       int secounNumber = scanner.nextInt();

       System.out.println(firsNumber>secounNumber);
       System.out.println(firsNumber<secounNumber);
       System.out.println(firsNumber>=secounNumber);
       System.out.println(firsNumber<=secounNumber);
       System.out.println(firsNumber==secounNumber);
       System.out.println(firsNumber!=secounNumber);





   }
}
