import java.util.Scanner;
public class Engine {
    private int cylinders;
    private int capacity;
    private int power;
    Engine(){

    }

    Engine(int cylinders, int capacity, int power){
        this.cylinders = cylinders;
        this.capacity = capacity;
        this.power = power;
    }

    public String GetInfo(){
        return ("Engine: cylinders = " + cylinders + " capacity  = " + capacity + " power = " + power);
    }
    Scanner in = new Scanner(System.in);
    public void Read(){
        System.out.println("Enter the number of cylinders:");
        this.cylinders = in.nextInt();
        System.out.println("Enter capacity:");
        this.capacity = in.nextInt();
        System.out.println("Enter power:");
        this.power = in.nextInt();
    }
}
