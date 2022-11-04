package model.detector;

public class DetectorTemperature {

    private final Long id;
    private double temperature;

    public DetectorTemperature(Long id, double temperature) {
        this.id = id;
        this.temperature = temperature;
    }

    public Long getId() {
        return id;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
