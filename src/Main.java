import java.util.ArrayList;

/**
 * Created by vasua on 19/10/2015.
 */
public class Main {

    public static void main(String[] args) {
        Environment world = new Environment();

        ArrayList<Buffalo> animals = new ArrayList<>();

        Buffalo timmy = new Buffalo(world, "Timmy", 3.0, 0, 0, 90, 90);
        animals.add(timmy);

        while(true) {
            for(Buffalo animal: animals) {
                Buffalo.performBDI();
            }
        }
    }
}
