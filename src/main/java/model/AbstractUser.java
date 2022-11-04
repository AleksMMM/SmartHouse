package model;

import java.util.List;

public abstract class AbstractUser {

    protected String name;
    protected final String login;
    protected String password;
//    protected Long id;

    protected List<AbstractSmartHouse> abstractSmartHouses;

    public AbstractUser(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.abstractSmartHouses = abstractSmartHouses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<AbstractSmartHouse> getAbstractSmartHouses() {
        return abstractSmartHouses;
    }

    public void setAbstractSmartHouses(AbstractSmartHouse abstractSmartHouse) {
        this.abstractSmartHouses.add(abstractSmartHouse);
    }
}
