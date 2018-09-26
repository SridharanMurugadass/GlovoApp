package com.glovoapp.backender.model;

/**
 * Created by Sridharan Murugadass on 2018-09-26
 */
public class OrderVM {
    private String id;
    private String description;

    public OrderVM(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
