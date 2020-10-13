//lab5

public class Main {
    public static void main (String[] args) {
        System.out.println("First auto");
        Auto_show first_auto = new Auto_show();
        Engine autoeng = new Engine(4, 2, 100);

        first_auto.init("Lada", "granta", 300, 150, 2017, autoeng);
        first_auto.display();

        System.out.println("Second auto");
        Auto_show second_auto = new Auto_show();
        second_auto.read();
        second_auto.display();
    }
}
