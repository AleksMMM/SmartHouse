package model.controllers;

public class AbstractController {

    protected final Long id;
    protected String name;
    protected String type;


    public AbstractController(Long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}
