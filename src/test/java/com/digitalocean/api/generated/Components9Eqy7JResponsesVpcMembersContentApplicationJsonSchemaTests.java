package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components9Eqy7JResponsesVpcMembersContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.VpcMember;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components9Eqy7JResponsesVpcMembersContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components9Eqy7JResponsesVpcMembersContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"links\":{},\"meta\":{\"total\":447713703},\"members\":[{\"name\":\"depemziayf\",\"urn\":\"ii\",\"created_at\":\"corjvudyhgtrt\"}]}")
                        .toObject(Components9Eqy7JResponsesVpcMembersContentApplicationJsonSchema.class);
        Assertions.assertEquals("depemziayf", model.getMembers().get(0).getName());
        Assertions.assertEquals("ii", model.getMembers().get(0).getUrn());
        Assertions.assertEquals("corjvudyhgtrt", model.getMembers().get(0).getCreatedAt());
        Assertions.assertEquals(447713703, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        Components9Eqy7JResponsesVpcMembersContentApplicationJsonSchema model =
                new Components9Eqy7JResponsesVpcMembersContentApplicationJsonSchema()
                        .setMembers(
                                Arrays.asList(
                                        new VpcMember()
                                                .setName("depemziayf")
                                                .setUrn("ii")
                                                .setCreatedAt("corjvudyhgtrt")))
                        .setLinks(new PageLinks())
                        .setMeta(new MetaMeta().setTotal(447713703));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components9Eqy7JResponsesVpcMembersContentApplicationJsonSchema.class);
        Assertions.assertEquals("depemziayf", model.getMembers().get(0).getName());
        Assertions.assertEquals("ii", model.getMembers().get(0).getUrn());
        Assertions.assertEquals("corjvudyhgtrt", model.getMembers().get(0).getCreatedAt());
        Assertions.assertEquals(447713703, model.getMeta().getTotal());
    }
}
