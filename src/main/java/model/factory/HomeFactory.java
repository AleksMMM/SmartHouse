package model.factory;

import model.AbstractSmartHouse;
import model.SmartHouseBig;
import model.SmartHouseSmall;
import model.exeption.TypeException;

public class HomeFactory {

    private static Long id = 0L;

    public static AbstractSmartHouse createNewHouse(String name, String model) throws TypeException {
        switch (model) {
            case "smallHouse":
                return new SmartHouseSmall(model, name, id++);
            case "bigHouse":
                return new SmartHouseBig(model, name, id++);
            default:
                throw new TypeException("type not found " + model);

        }
    }
}
