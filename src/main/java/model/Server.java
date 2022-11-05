package model;

import model.exeption.NotSupportedOperation;
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

    public boolean registerNewSmartHouse(String model, String name, String login, String password) throws Exception {

        User user = hasUserAccess(login, password);



            if (user != null) {
                var home = HomeFactory.createNewHouse(name, model);

                if (!smartHouses.containsKey(home.getId())) {

                    smartHouses.put(home.getId(), home);

                } else {

                    throw new ObjectExistException("Server side, this house is exist" + name);
                }

                user.addAbstractSmartHouse(home);
                home.addAdminToSmartHouse(user);

            }

        return false;
    }

    public User hasUserAccess(String login, String password) throws NotSupportedOperation {

        User user = null;

        if (users.containsKey(login)) {
            if (users.get(login) instanceof RobotUser) {

                throw new NotSupportedOperation("this operation not supported this user Robot");

            }

            user = (User) users.get(login);

            if (user.getPassword().equals(password)) {
                return user;
            }

        }
        return null;
    }

    public void addUserHouse(String login, String password, Long id, String role, String loginAddUser) {

    }
}