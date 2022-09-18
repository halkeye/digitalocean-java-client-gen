package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsB4R8U3ResponsesVpcMembersContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.VpcMember;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsB4R8U3ResponsesVpcMembersContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsB4R8U3ResponsesVpcMembersContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"members\":[{\"name\":\"y\",\"urn\":\"ylnkmmxzifbqg\",\"created_at\":\"xowqzrt\"},{\"name\":\"rqkk\",\"urn\":\"ygkuo\",\"created_at\":\"wainp\"}]}").toObject(ComponentsB4R8U3ResponsesVpcMembersContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("y", model.getMembers().get(0).getName());
        Assertions.assertEquals("ylnkmmxzifbqg", model.getMembers().get(0).getUrn());
        Assertions.assertEquals("xowqzrt", model.getMembers().get(0).getCreatedAt());
    }

    @Test
    public void testSerialize() {
        ComponentsB4R8U3ResponsesVpcMembersContentApplicationJsonSchemaAllof0 model = new ComponentsB4R8U3ResponsesVpcMembersContentApplicationJsonSchemaAllof0().setMembers(Arrays.asList(new VpcMember().setName("y").setUrn("ylnkmmxzifbqg").setCreatedAt("xowqzrt"), new VpcMember().setName("rqkk").setUrn("ygkuo").setCreatedAt("wainp")));
        model = BinaryData.fromObject(model).toObject(ComponentsB4R8U3ResponsesVpcMembersContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("y", model.getMembers().get(0).getName());
        Assertions.assertEquals("ylnkmmxzifbqg", model.getMembers().get(0).getUrn());
        Assertions.assertEquals("xowqzrt", model.getMembers().get(0).getCreatedAt());
    }
}
