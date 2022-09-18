package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ActionLink;
import com.digitalocean.api.models.Components10LqvkkResponsesDropletCreateContentApplicationJsonSchemaOneof1PropertiesLinks;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components10LqvkkResponsesDropletCreateContentApplicationJsonSchemaOneof1PropertiesLinksTests {
    @Test
    public void testDeserialize() {
        Components10LqvkkResponsesDropletCreateContentApplicationJsonSchemaOneof1PropertiesLinks model = BinaryData.fromString("{\"actions\":[{\"id\":750233600,\"rel\":\"gbvm\",\"href\":\"wrqbebjnfv\"},{\"id\":843963341,\"rel\":\"btvkbi\",\"href\":\"nhtfgfi\"},{\"id\":977950573,\"rel\":\"hizpaczmuh\",\"href\":\"akznhokhoitwhr\"}]}").toObject(Components10LqvkkResponsesDropletCreateContentApplicationJsonSchemaOneof1PropertiesLinks.class);
        Assertions.assertEquals(750233600, model.getActions().get(0).getId());
        Assertions.assertEquals("gbvm", model.getActions().get(0).getRel());
        Assertions.assertEquals("wrqbebjnfv", model.getActions().get(0).getHref());
    }

    @Test
    public void testSerialize() {
        Components10LqvkkResponsesDropletCreateContentApplicationJsonSchemaOneof1PropertiesLinks model = new Components10LqvkkResponsesDropletCreateContentApplicationJsonSchemaOneof1PropertiesLinks().setActions(Arrays.asList(new ActionLink().setId(750233600).setRel("gbvm").setHref("wrqbebjnfv"), new ActionLink().setId(843963341).setRel("btvkbi").setHref("nhtfgfi"), new ActionLink().setId(977950573).setRel("hizpaczmuh").setHref("akznhokhoitwhr")));
        model = BinaryData.fromObject(model).toObject(Components10LqvkkResponsesDropletCreateContentApplicationJsonSchemaOneof1PropertiesLinks.class);
        Assertions.assertEquals(750233600, model.getActions().get(0).getId());
        Assertions.assertEquals("gbvm", model.getActions().get(0).getRel());
        Assertions.assertEquals("wrqbebjnfv", model.getActions().get(0).getHref());
    }
}
