public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher();
        teacher.name = "Tom";
        teacher.age = 29;
        teacher.walk();
        teacher.eat();
        teacher.teachMath();
        teacher.sayHello();

        Fooballer fooballer = new Fooballer();
        fooballer.name = "Mike";
        fooballer.age = 21;
        fooballer.walk();
        fooballer.eat();
        fooballer.footballClub = "ManUtd";
        fooballer.palFootball();

    }
}
