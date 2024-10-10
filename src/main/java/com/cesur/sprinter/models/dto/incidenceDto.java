package com.cesur.sprinter.models.dto;

import com.cesur.sprinter.models.User;

public class incidenceDto {
    


    private String category;
    private String description;
    private String priority;
    private User createdUser;

    incidenceDto(String category, String description, String priority,User createdUser){
        this.category = category;
        this.description = description;
        this.priority = priority;
        this.createdUser = createdUser;
    }

    public String getCategory() {
        return category;
    }

    // Step 3: Create the setter for category
    public void setCategory(String category) {
        this.category = category;
    }

    // Step 4: Create the getter for description
    public String getDescription() {
        return description;
    }

    // Step 5: Create the setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Step 6: Create the getter for priority
    public String getPriority() {
        return priority;
    }

    // Step 7: Create the setter for priority
    public void setPriority(String priority) {
        this.priority = priority;
    }

    // Step 8: Create the getter for createdUser
    public User getCreatedUser() {
        return createdUser;
    }

    // Step 9: Create the setter for createdUser
    public void setCreatedUser(User createdUser) {
        this.createdUser = createdUser;
    }
}
