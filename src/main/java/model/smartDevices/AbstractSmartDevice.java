package model.smartDevices;

public class AbstractSmartDevice {

    protected final Long id;
    protected String name;
    protected String type;

    public AbstractSmartDevice(Long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}
