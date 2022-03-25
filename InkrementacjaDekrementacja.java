public class InkrementacjaDekrementacja {

    public static void main(String[] args) {
//Inkremetacja
        int a = 0;
        System.out.println("Wartość a:"+a);
        int b = a++; //postinkrementacja
        System.out.println("Wartość b:" +b);
        System.out.println("Wartość a:" + a);
        int c = ++a; //preinkrementacja
        System.out.println("Wartość c:" + c);
        System.out.println("Wartość a:" + a);

//Dekrementacja
        int d = 0;
        System.out.println("Wartość d:" + d);
        int e = d--; //postdekrementacja
        System.out.println("Wartość e:" + e);
        System.out.println("Wartosć d:" + d);
        int f = --d; //predekrementacja
        System.out.println("Wartość f:" + f);
        System.out.println("Wartość d:" + d);

    }
}
