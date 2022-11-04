package model.smartDevices;

public class Light extends AbstractSmartDevice {

    private boolean lightOnNo;
    private String color;

    public Light(Long id, String name, String type, boolean lightOnNo, String color) {
        super(id, name, type);
        this.lightOnNo = lightOnNo;
        this.color = color;
    }

    public boolean isLightOnNo() {
        return lightOnNo;
    }

    public void setLightOnNo(boolean lightOnNo) {
        this.lightOnNo = lightOnNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
