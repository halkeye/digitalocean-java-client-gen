package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.VpcMember;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VpcMemberTests {
    @Test
    public void testDeserialize() {
        VpcMember model =
                BinaryData.fromString(
                                "{\"name\":\"bothxiew\",\"urn\":\"nyjtuqgzyvextchs\",\"created_at\":\"oldowuwh\"}")
                        .toObject(VpcMember.class);
        Assertions.assertEquals("bothxiew", model.getName());
        Assertions.assertEquals("nyjtuqgzyvextchs", model.getUrn());
        Assertions.assertEquals("oldowuwh", model.getCreatedAt());
    }

    @Test
    public void testSerialize() {
        VpcMember model = new VpcMember().setName("bothxiew").setUrn("nyjtuqgzyvextchs").setCreatedAt("oldowuwh");
        model = BinaryData.fromObject(model).toObject(VpcMember.class);
        Assertions.assertEquals("bothxiew", model.getName());
        Assertions.assertEquals("nyjtuqgzyvextchs", model.getUrn());
        Assertions.assertEquals("oldowuwh", model.getCreatedAt());
    }
}
