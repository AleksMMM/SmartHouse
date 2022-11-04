package model;

public class RobotUser extends AbstractUser {

    private String modelName;

    public RobotUser(String name, String login, String password) {
        super(name, login, password);
    }
}
