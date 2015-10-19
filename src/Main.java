import java.util.ArrayList;

/**
 * Created by vasua on 19/10/2015.
 */
public class Main {

    public static void main(String[] args) {
        Environment world = new Environment(5, 5);

        //create a mock world
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                Area area = new Area(i+20, "Grassland", "Sunny");
                world.setArea(area, i, j);
            }
        }

        ArrayList<Buffalo> animals = new ArrayList<>();

        Buffalo tommy = new Buffalo(world, "Tommy", 3.0, 0, 0, 2, 2);
        animals.add(tommy);

        while(true) {
            for(Buffalo animal: animals) {
                Buffalo.performBDI();
            }
        }
    }
}
