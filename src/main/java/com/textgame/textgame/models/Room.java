package com.textgame.textgame.models;

import java.util.List;

public class Room {
    
    private String name;
    
    private String description;

    private List<Integer> location;

    private List<Item> items;

    public Room() {

    }

    public Room(String name, List<Item> items, List<Integer> location, String description) {
        this.name = name;
        this.items = items;
        this.location = location;
        this.description = description;
    }

    

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return List<Integer> return the location
     */
    public List<Integer> getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(List<Integer> location) {
        this.location = location;
    }

    /**
     * @return List<Item> return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

}
