package com.textgame.textgame.models;

import java.util.List;

public class Adventurer {

    private String name;

    private List<Item> items;

    private List<Integer> location;

    private int hitPoints;

    public Adventurer() {

    }

    public Adventurer(String name, List<Item> items, List<Integer> location, int hitPoints) {
        this.name = name;
        this.items = items;
        this.location = location;
        this.hitPoints = hitPoints;
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
     * @return int return the hitPoints
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * @param hitPoints the hitPoints to set
     */
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

}
