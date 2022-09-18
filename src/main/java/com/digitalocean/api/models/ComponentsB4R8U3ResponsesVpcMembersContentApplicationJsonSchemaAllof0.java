package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The ComponentsB4R8U3ResponsesVpcMembersContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class ComponentsB4R8U3ResponsesVpcMembersContentApplicationJsonSchemaAllof0 {
    /*
     * The members property.
     */
    @JsonProperty(value = "members")
    private List<VpcMember> members;

    /**
     * Get the members property: The members property.
     * 
     * @return the members value.
     */
    public List<VpcMember> getMembers() {
        return this.members;
    }

    /**
     * Set the members property: The members property.
     * 
     * @param members the members value to set.
     * @return the ComponentsB4R8U3ResponsesVpcMembersContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsB4R8U3ResponsesVpcMembersContentApplicationJsonSchemaAllof0 setMembers(List<VpcMember> members) {
        this.members = members;
        return this;
    }
}
