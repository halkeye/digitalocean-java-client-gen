package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Components1Wk333ZResponsesUsersContentApplicationJsonSchema model.
 */
@Fluent
public final class Components1Wk333ZResponsesUsersContentApplicationJsonSchema {
    /*
     * The users property.
     */
    @JsonProperty(value = "users")
    private List<DatabaseUser> users;

    /**
     * Get the users property: The users property.
     * 
     * @return the users value.
     */
    public List<DatabaseUser> getUsers() {
        return this.users;
    }

    /**
     * Set the users property: The users property.
     * 
     * @param users the users value to set.
     * @return the Components1Wk333ZResponsesUsersContentApplicationJsonSchema object itself.
     */
    public Components1Wk333ZResponsesUsersContentApplicationJsonSchema setUsers(List<DatabaseUser> users) {
        this.users = users;
        return this;
    }
}
