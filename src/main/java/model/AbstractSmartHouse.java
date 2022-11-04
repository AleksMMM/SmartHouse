package model;

public class AbstractSmartHouse {

    protected final String modelName;
    protected String name;
    protected final Long id;

    public AbstractSmartHouse(String modelName, String name, Long id) {
        this.modelName = modelName;
        this.name = name;
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }
}
