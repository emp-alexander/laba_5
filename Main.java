//lab5

public class Main {
    public static void main (String[] args) {
		
		System.out.println("First auto");
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
		
		Auto_show.Racingset(5);
	    System.out.println("Acceleration to 100 " + Auto_show.Racing());
    }

}
