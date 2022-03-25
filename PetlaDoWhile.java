public class PetlaDoWhile {
    public static void main(String[] args) {

        int number = 5;
        do {
            System.out.println("Moja wartośc to: " + number + " i jestem mniejsza od 20" );
            number++;
        } while (number<20);
//w petli DoWhile wykonujemy kod co najmniej raz nawet jak warunek while nie jest spełniony
// (w przeciwienstwie do petli While!)

    }
}
