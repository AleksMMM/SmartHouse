package model;

import model.exeption.ObjectExistException;

import java.util.List;

public class AbstractSmartHouse {

    protected final String modelName;
    protected String name;
    protected final Long id;
    protected List<User> admins;
    protected List<AbstractUser> users;

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

    public void addAdminToSmartHouse(User user) throws ObjectExistException {

        if (!admins.contains(user)) {

            admins.add(user);
        } else {
            throw new ObjectExistException(String.format("this smarthouse add this user ", user.getName()));
        }
    }

    public void addUserToSmartHouse(AbstractUser user) throws ObjectExistException {

        if (!users.contains(user)) {

            users.add(user);
        } else {
            throw new ObjectExistException(String.format("this smarthouse add this user ", user.getName()));
        }
    }
}