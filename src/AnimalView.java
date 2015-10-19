/**
 * Created by vasua on 19/10/2015.
 */
public class AnimalView {

    private Area[][] view;

    public AnimalView(Area[][] world, int xPosition, int yPosition) {
        updateView(world, xPosition, yPosition);
    }

    public void updateView(Area[][] world, int xPosition, int yPosition) {
        this.view = new Area[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.view[i][j] = new Area(world[xPosition][yPosition].getTemperature(), world[xPosition][yPosition].getGroundType(), world[xPosition][yPosition].getWeather());
            }
        }
    }
}
