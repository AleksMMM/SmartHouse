package model.controllers;

import java.util.List;

public class ControllerTemperature extends AbstractController {

    private List<Double> temperatures;

    public ControllerTemperature(Long id, String name, String type) {
        super(id, name, type);
    }
}
