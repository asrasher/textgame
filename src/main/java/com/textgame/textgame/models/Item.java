package com.textgame.textgame.models;

public class Item {

    private String name;

    private String description;

    public Item() {

    }

    public Item(String name, String description) {
        this.name = name;
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

}
