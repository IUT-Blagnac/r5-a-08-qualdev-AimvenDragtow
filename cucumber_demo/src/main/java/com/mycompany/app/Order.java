package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String owner;
    private String target;
    private List<String> cocktails;
    private String message = "";

    public void declareOwner(String owner) {
        this.owner = owner;
    }

    public void declareTarget(String target) {
        this.target = target;
    }

    public List<String> getCocktails() {
        if (cocktails == null)
            cocktails = new ArrayList<>();

        return cocktails;
    }

    public void addMessage(String message) {
        this.message = message;
    }

    public String getTicket() {
        return "From " + owner + " to " + target + ": " + message;
    }
}
