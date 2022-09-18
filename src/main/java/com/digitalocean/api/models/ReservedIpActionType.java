package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.regex.Pattern;

/**
 * The ReservedIpActionType model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = ReservedIpActionType.class)
@JsonTypeName("ReservedIpActionType")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "unassign", value = ReservedIpActionUnassign.class),
    @JsonSubTypes.Type(name = "assign", value = ReservedIpActionAssign.class)
})
@Immutable
public class ReservedIpActionType {
}
