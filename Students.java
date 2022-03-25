public class Students {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

    public void przedstawSie() {
        System.out.println("Nazywam się " + imie + nazwisko);
    }
    public void zalogujSie() {
        System.out.println("Loguj się za pomocą " + nick);
    }
    public  void podajNumerIndeksu() {
        System.out.println("Moj numer indeksu to : " + numerIndeksu);
    }
    public void podajEmail () {
        System.out.println("Mój email to :" +email);
    }
}

