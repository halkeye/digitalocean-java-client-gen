package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Mgw0OqResponsesAllVpcsContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Vpc;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Mgw0OqResponsesAllVpcsContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1Mgw0OqResponsesAllVpcsContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"vpcs\":[{\"region\":\"avtfyz\",\"ip_range\":\"dfmzukryx\",\"default\":true,\"urn\":\"peakf\",\"created_at\":\"2021-07-26T06:09:44Z\",\"name\":\"dliklxkyoddoq\",\"description\":\"nqtrkicwhqyr\"},{\"region\":\"mndkrwwmurhvif\",\"ip_range\":\"qfsrnack\",\"default\":true,\"urn\":\"ebylpzjelda\",\"created_at\":\"2021-11-19T22:27:38Z\",\"name\":\"nilnijhwcbr\",\"description\":\"ypo\"},{\"region\":\"pkbvzpkodngvnq\",\"ip_range\":\"gsbtwgnldxu\",\"default\":true,\"urn\":\"b\",\"created_at\":\"2021-09-17T20:42Z\",\"name\":\"nrirpiiuvc\",\"description\":\"qkqwucqsdgb\"}]}").toObject(Components1Mgw0OqResponsesAllVpcsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("dliklxkyoddoq", model.getVpcs().get(0).getName());
        Assertions.assertEquals("nqtrkicwhqyr", model.getVpcs().get(0).getDescription());
        Assertions.assertEquals("avtfyz", model.getVpcs().get(0).getRegion());
        Assertions.assertEquals("dfmzukryx", model.getVpcs().get(0).getIpRange());
        Assertions.assertEquals(true, model.getVpcs().get(0).isDefaultProperty());
        Assertions.assertEquals("peakf", model.getVpcs().get(0).getUrn());
    }

    @Test
    public void testSerialize() {
        Components1Mgw0OqResponsesAllVpcsContentApplicationJsonSchemaAllof0 model = new Components1Mgw0OqResponsesAllVpcsContentApplicationJsonSchemaAllof0().setVpcs(Arrays.asList(new Vpc().setName("dliklxkyoddoq").setDescription("nqtrkicwhqyr").setRegion("avtfyz").setIpRange("dfmzukryx").setDefaultProperty(true).setUrn("peakf"), new Vpc().setName("nilnijhwcbr").setDescription("ypo").setRegion("mndkrwwmurhvif").setIpRange("qfsrnack").setDefaultProperty(true).setUrn("ebylpzjelda"), new Vpc().setName("nrirpiiuvc").setDescription("qkqwucqsdgb").setRegion("pkbvzpkodngvnq").setIpRange("gsbtwgnldxu").setDefaultProperty(true).setUrn("b")));
        model = BinaryData.fromObject(model).toObject(Components1Mgw0OqResponsesAllVpcsContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("dliklxkyoddoq", model.getVpcs().get(0).getName());
        Assertions.assertEquals("nqtrkicwhqyr", model.getVpcs().get(0).getDescription());
        Assertions.assertEquals("avtfyz", model.getVpcs().get(0).getRegion());
        Assertions.assertEquals("dfmzukryx", model.getVpcs().get(0).getIpRange());
        Assertions.assertEquals(true, model.getVpcs().get(0).isDefaultProperty());
        Assertions.assertEquals("peakf", model.getVpcs().get(0).getUrn());
    }
}
