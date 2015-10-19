/**
 * Created by vasua on 19/10/2015.
 */
public class Area {

    private double temperature;
    private String groundType;
    private String weather;

    public Area(double temperature, String groundType, String weather) {
        this.temperature = temperature;
        this.groundType = groundType;
        this.weather = weather;
    }


    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getGroundType() {
        return groundType;
    }

    public void setGroundType(String groundType) {
        this.groundType = groundType;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
