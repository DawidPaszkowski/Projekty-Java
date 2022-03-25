public class StudentChecker {

    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();

        Student kasia = new Student();
        kasia.imie = "Kasia";
        kasia.nazwisko = "Paszkowska";
        kasia.nick = "Szalona Kasia";
        kasia.email = "kasiapaszkowska@gmail.com";
        kasia.numerIndeksu = 1;
        String uczeniaKasi = kasia.nazwaUczelni;
        kasia.infoUczelnia();

        Student dawid = new Student();
        dawid.imie = "Dawid";
        dawid.nazwisko = "Paszkowski";
        dawid.nick = "Szkocki Aligator";
        dawid.email = "dawidpaszkowski@gmail.com";
        dawid.numerIndeksu = 2;
        Student.infoUczelnia();

        Student lukasz = new Student();
        lukasz.imie = "Lukasz";
        lukasz.nazwisko = "Gniazdowski";
        lukasz.nick = "Niesluk";
        lukasz.email = "lukaszgniazdowski@gmail.com";
        lukasz.numerIndeksu = 3;
        Student.infoUczelnia();

        Student[] students = new Student[3];
        students [0] = kasia;
        students [1] = dawid;
        students [2] = lukasz;

        for (int i = 0; i < students.length; i++) {
            students[i].podajNumerIndeksu();
            students[i].zalogujSie();
            students[i].przedstawSie();
            students[i].podajEmail();

        }
     }

    }