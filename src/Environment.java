/**
 * Created by vasua on 19/10/2015.
 */
public class Environment {

    private Area[][] world;

    public Environment(int xSize, int ySize) {
        world = new Area[xSize][ySize];
    }

    public Area getArea(int xPosition, int yPosition) {
        return world[xPosition][yPosition];
    }

    public void setArea(Area area, int xPosition, int yPosition) {
        world[xPosition][yPosition] = area;
    }

    public Area[][] getWorld() {
        return world;
    }

    public void setWorld(Area[][] world) {
        this.world = world;
    }
}
