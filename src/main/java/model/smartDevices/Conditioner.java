package model.smartDevices;

public class Conditioner extends AbstractSmartDevice {

    private boolean onOff;
    private double temperatureCond;

    public Conditioner(Long id, String name, String type) {
        super(id, name, type);
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public double getTemperatureCond() {
        return temperatureCond;
    }

    public void setTemperatureCond(double temperatureCond) {
        this.temperatureCond = temperatureCond;
    }
}
