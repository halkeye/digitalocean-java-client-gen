package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.regex.Pattern;

/**
 * The FloatingIPsAction model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = FloatingIPsAction.class)
@JsonTypeName("FloatingIPsAction")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "assign", value = FloatingIpActionAssign.class),
    @JsonSubTypes.Type(name = "unassign", value = FloatingIpActionUnassign.class)
})
@Immutable
public class FloatingIPsAction {
}
