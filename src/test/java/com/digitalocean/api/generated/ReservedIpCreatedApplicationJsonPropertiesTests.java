package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ActionLink;
import com.digitalocean.api.models.ReservedIpCreatedApplicationJsonProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ReservedIpCreatedApplicationJsonPropertiesTests {
    @Test
    public void testDeserialize() {
        ReservedIpCreatedApplicationJsonProperties model = BinaryData.fromString("{\"droplets\":[{\"id\":749853791,\"rel\":\"momggewd\",\"href\":\"xexfyznv\"},{\"id\":536239457,\"rel\":\"qkslw\",\"href\":\"xayzqbyeyw\"},{\"id\":1079382720,\"rel\":\"nrtlikffy\",\"href\":\"tkqrfbgyn\"},{\"id\":1574772690,\"rel\":\"zdteqjmyqxuhg\",\"href\":\"xnyprijyoxxj\"}],\"actions\":[{\"id\":346483180,\"rel\":\"rlcck\",\"href\":\"fpjmspau\"}]}").toObject(ReservedIpCreatedApplicationJsonProperties.class);
        Assertions.assertEquals(749853791, model.getDroplets().get(0).getId());
        Assertions.assertEquals("momggewd", model.getDroplets().get(0).getRel());
        Assertions.assertEquals("xexfyznv", model.getDroplets().get(0).getHref());
        Assertions.assertEquals(346483180, model.getActions().get(0).getId());
        Assertions.assertEquals("rlcck", model.getActions().get(0).getRel());
        Assertions.assertEquals("fpjmspau", model.getActions().get(0).getHref());
    }

    @Test
    public void testSerialize() {
        ReservedIpCreatedApplicationJsonProperties model = new ReservedIpCreatedApplicationJsonProperties().setDroplets(Arrays.asList(new ActionLink().setId(749853791).setRel("momggewd").setHref("xexfyznv"), new ActionLink().setId(536239457).setRel("qkslw").setHref("xayzqbyeyw"), new ActionLink().setId(1079382720).setRel("nrtlikffy").setHref("tkqrfbgyn"), new ActionLink().setId(1574772690).setRel("zdteqjmyqxuhg").setHref("xnyprijyoxxj"))).setActions(Arrays.asList(new ActionLink().setId(346483180).setRel("rlcck").setHref("fpjmspau")));
        model = BinaryData.fromObject(model).toObject(ReservedIpCreatedApplicationJsonProperties.class);
        Assertions.assertEquals(749853791, model.getDroplets().get(0).getId());
        Assertions.assertEquals("momggewd", model.getDroplets().get(0).getRel());
        Assertions.assertEquals("xexfyznv", model.getDroplets().get(0).getHref());
        Assertions.assertEquals(346483180, model.getActions().get(0).getId());
        Assertions.assertEquals("rlcck", model.getActions().get(0).getRel());
        Assertions.assertEquals("fpjmspau", model.getActions().get(0).getHref());
    }
}
