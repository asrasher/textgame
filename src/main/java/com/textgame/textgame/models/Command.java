package com.textgame.textgame.models;

import java.util.List;

public class Command {
    
    private String name;

    private List<String> synonyms;

    public Command() {

    }

    public Command(String name, List<String> synonyms) {
        this.name = name;
        this.synonyms = synonyms;
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
     * @return List<String> return the synonyms
     */
    public List<String> getSynonyms() {
        return synonyms;
    }

    /**
     * @param synonyms the synonyms to set
     */
    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

}
