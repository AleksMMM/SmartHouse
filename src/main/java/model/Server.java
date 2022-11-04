package model;

import model.exeption.ObjectExistException;
import model.exeption.TypeException;
import model.factory.HomeFactory;
import model.factory.UserFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Server {

    private static Server server;
    Map<String, AbstractUser> users = new HashMap<>();
    Map<Long, AbstractSmartHouse> smartHouses = new HashMap<>();
    Map<Long, List<AbstractSmartHouse>> addHumanHouses = new HashMap<>();

    private Server() {

    }

    public static Server getInstance() {
        if (server != null) {
          return server;
        }

        server = new Server();
        return server;
    }

    public void registerNewUser(String login, String password, String userType, String name) throws Exception {
        if (!users.containsKey(login)) {
            users.put(login, UserFactory.createNewUser(login, password, userType, name));
        } else {

            throw new ObjectExistException("Server side, this user is exist" + name);
        }
     }

     public void registerNewSmartHouse(String model, String name) throws Exception {

        var home = HomeFactory.createNewHouse(name, model);

        if (!smartHouses.containsKey(home.getId())) {

            smartHouses.put(home.getId(), home);

        } else {

            throw new ObjectExistException("Server side, this user is exist" + name);
        }
     }

     public void addHumanSmartHouse(User user, AbstractSmartHouse sh) throws ObjectExistException {

        if (!user.getAbstractSmartHouses().contains(sh)) {

            user.setAbstractSmartHouses(sh);
        } else {
            throw new ObjectExistException(String.format("this smarthouse add this user ", sh.getName()));
        }


     }
}
