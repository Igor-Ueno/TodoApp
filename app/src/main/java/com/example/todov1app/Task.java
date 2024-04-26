package com.example.todov1app;

import java.io.Serializable;
import java.util.Objects;

public class Task implements Serializable {
    String name, description, priority;

    public Task(String name, String description, String priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String description) {
        this.priority = priority;
    }

    public boolean increasePriority() {
        if(Objects.equals(this.priority, "Low")) {
            this.priority = "Medium";
            return true;
        } else if(Objects.equals(this.priority, "Medium")) {
            this.priority = "High";
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getName();
    }
}
