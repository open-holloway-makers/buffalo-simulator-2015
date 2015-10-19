/**
 * Created by vasua on 19/10/2015.
 */
public class Buffalo {

    private String name;
    private double age;

    private int hungerLevel;
    private int thirstLevel;

    private int xPosition;
    private int yPosition;
    private AnimalView currentView;

    private boolean pregnant = false;
    private boolean alive = true;

    public Buffalo(Environment world, String name, double age, int hungerLevel, int thirstLevel, int xPosition, int yPosition) {
        this.name = name;
        this.age = age;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        currentView = new AnimalView(world.getWorld(), xPosition, yPosition);
    }

    public static void performBDI() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public void setThirstLevel(int thirstLevel) {
        this.thirstLevel = thirstLevel;
    }

    public boolean isPregnant() {
        return pregnant;
    }

    public void setPregnant(boolean pregnant) {
        this.pregnant = pregnant;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
}
