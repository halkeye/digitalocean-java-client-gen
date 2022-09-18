package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ActionLink;
import com.digitalocean.api.models.DropletCreateApplicationJsonOneOfProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DropletCreateApplicationJsonOneOfPropertiesTests {
    @Test
    public void testDeserialize() {
        DropletCreateApplicationJsonOneOfProperties model = BinaryData.fromString("{\"actions\":[{\"id\":643700815,\"rel\":\"xnmxgnmguzb\",\"href\":\"vorbalkjnbk\"},{\"id\":42280374,\"rel\":\"ltqstqkqsygxiyn\",\"href\":\"ovagzkheuban\"},{\"id\":239129430,\"rel\":\"pqcckqiawzlz\",\"href\":\"aslgacizuxlrarwp\"},{\"id\":1124635117,\"rel\":\"udoejtighsxjp\",\"href\":\"nkqb\"}]}").toObject(DropletCreateApplicationJsonOneOfProperties.class);
        Assertions.assertEquals(643700815, model.getActions().get(0).getId());
        Assertions.assertEquals("xnmxgnmguzb", model.getActions().get(0).getRel());
        Assertions.assertEquals("vorbalkjnbk", model.getActions().get(0).getHref());
    }

    @Test
    public void testSerialize() {
        DropletCreateApplicationJsonOneOfProperties model = new DropletCreateApplicationJsonOneOfProperties().setActions(Arrays.asList(new ActionLink().setId(643700815).setRel("xnmxgnmguzb").setHref("vorbalkjnbk"), new ActionLink().setId(42280374).setRel("ltqstqkqsygxiyn").setHref("ovagzkheuban"), new ActionLink().setId(239129430).setRel("pqcckqiawzlz").setHref("aslgacizuxlrarwp"), new ActionLink().setId(1124635117).setRel("udoejtighsxjp").setHref("nkqb")));
        model = BinaryData.fromObject(model).toObject(DropletCreateApplicationJsonOneOfProperties.class);
        Assertions.assertEquals(643700815, model.getActions().get(0).getId());
        Assertions.assertEquals("xnmxgnmguzb", model.getActions().get(0).getRel());
        Assertions.assertEquals("vorbalkjnbk", model.getActions().get(0).getHref());
    }
}
