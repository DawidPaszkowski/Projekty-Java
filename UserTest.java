public class UserTest {

    public static void main(String[] args) {

      //  User user = new User();
        User user = new User("Dawid", "hello");

        /*user.username = "Dawid";
        user.password = "QWERTY";*/
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHallo();
    }
}
