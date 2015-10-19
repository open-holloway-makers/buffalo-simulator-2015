/**
 * Created by vasua on 19/10/2015.
 */
public class Environment {

    private Area[][] world;

    public Environment() {
        world = new Area[180][180];
    }

    public Area[][] getWorld() {
        return world;
    }

    public void setWorld(Area[][] world) {
        this.world = world;
    }
}
