package model.factory;

import model.AbstractUser;
import model.RobotUser;
import model.User;
import model.exeption.TypeException;

public class UserFactory {

    public static AbstractUser createNewUser(String login, String password, String userType, String name) throws Exception {

        switch (userType) {
                case "robot":
                    return new RobotUser(name, login, password);
                case "human":
                    return new User(name, login, password);
                default:
                    throw new TypeException("Server side, not this type user " + userType);
            }
    }
}