//lab5

public class Main {
    public static void main (String[] args) {
		//Scanner in = new Scanner(System.in);
		System.out.println("������ auto");
        Auto_show[] first_auto = new Auto_show[10];
        Engine autoeng = new Engine(4, 2, 100);



        for(int i = 0; i < 10; i++)
        {
            first_auto[i] = new Auto_show();
            first_auto[i].init("lada", "priora", 100, 100, 2018, autoeng);
        }

        first_auto[1].display();


        System.out.println("Cost: " + first_auto[1].CostAndSpeed().add1());
        System.out.println("Speed: " + first_auto[1].CostAndSpeed().add2());
    }

}
