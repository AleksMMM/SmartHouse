package model;

public class SmartHouseSmall extends AbstractSmartHouse {

    private final int countUser = 3;
    private final int countRobot = 5;

    public SmartHouseSmall(String modelName, String name, Long id) {
        super(modelName, name, id);
    }
}
