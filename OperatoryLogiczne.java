public class OperatoryLogiczne {

    public static void main(String[] args) {
      boolean firsValue = 2>1;
      boolean secoundValue = 2<1;
      boolean thirdValue = true;
      boolean fourthValue = false;

      //&& -> true wtedy gdy wyrazenia skladowe sa rowne true
        System.out.println(firsValue && secoundValue); // false
        System.out.println(firsValue && thirdValue); // true
        System.out.println((secoundValue && fourthValue));// false

        // || lu -> gdy jedno wyrazenie skladowe jest rowne true

        System.out.println(firsValue || secoundValue); // true
        System.out.println(firsValue || fourthValue); // true
        System.out.println(secoundValue || fourthValue); // false

        // ! negacja - zwraca wartosc przeciwna do wyrazenia przed ktorym sie znajduje
        System.out.println(!firsValue);// false
        System.out.println(!secoundValue); // true
        System.out.println(!(firsValue&&secoundValue));//true

    }
}
