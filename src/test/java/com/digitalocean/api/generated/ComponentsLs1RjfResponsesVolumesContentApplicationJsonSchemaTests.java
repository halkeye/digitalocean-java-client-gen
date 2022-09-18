package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Knr07QResponsesVolumesContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.ComponentsLs1RjfResponsesVolumesContentApplicationJsonSchema;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.VolumeFull;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsLs1RjfResponsesVolumesContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsLs1RjfResponsesVolumesContentApplicationJsonSchema model = BinaryData.fromString("{\"links\":{},\"meta\":{\"total\":1118640339},\"volumes\":[{\"region\":{\"name\":\"zfpsf\",\"slug\":\"akidfhmlxrqk\",\"available\":false},\"filesystem_type\":\"umkq\",\"filesystem_label\":\"zvptriysj\",\"id\":\"truwpuqps\",\"droplet_ids\":[1497307172],\"name\":\"vvoydwedggwg\",\"description\":\"vbwa\",\"size_gigabytes\":2042529839,\"created_at\":\"rjbjngoarsr\",\"tags\":[\"i\",\"mzc\",\"niapypi\"]},{\"region\":{\"name\":\"xirqwipz\",\"slug\":\"ss\",\"available\":false},\"filesystem_type\":\"nytkmlfupjzc\",\"filesystem_label\":\"vzjoyxjgahxue\",\"id\":\"daktnytkbcerf\",\"droplet_ids\":[978369009,1157754371,2083801790],\"name\":\"j\",\"description\":\"mpwyv\",\"size_gigabytes\":1740957154,\"created_at\":\"hcikhl\",\"tags\":[\"jgylsac\",\"giflr\",\"ygotoh\",\"wtoi\"]}]}").toObject(ComponentsLs1RjfResponsesVolumesContentApplicationJsonSchema.class);
        Assertions.assertEquals("vvoydwedggwg", model.getVolumes().get(0).getName());
        Assertions.assertEquals("vbwa", model.getVolumes().get(0).getDescription());
        Assertions.assertEquals(2042529839, model.getVolumes().get(0).getSizeGigabytes());
        Assertions.assertEquals("i", model.getVolumes().get(0).getTags().get(0));
        Assertions.assertEquals("umkq", model.getVolumes().get(0).getFilesystemType());
        Assertions.assertEquals("zvptriysj", model.getVolumes().get(0).getFilesystemLabel());
        Assertions.assertEquals(1118640339, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        ComponentsLs1RjfResponsesVolumesContentApplicationJsonSchema model = new ComponentsLs1RjfResponsesVolumesContentApplicationJsonSchema().setVolumes(Arrays.asList(new VolumeFull().setName("vvoydwedggwg").setDescription("vbwa").setSizeGigabytes(2042529839).setTags(Arrays.asList("i", "mzc", "niapypi")).setFilesystemType("umkq").setFilesystemLabel("zvptriysj"), new VolumeFull().setName("j").setDescription("mpwyv").setSizeGigabytes(1740957154).setTags(Arrays.asList("jgylsac", "giflr", "ygotoh", "wtoi")).setFilesystemType("nytkmlfupjzc").setFilesystemLabel("vzjoyxjgahxue"))).setLinks(new PageLinks()).setMeta(new MetaMeta().setTotal(1118640339));
        model = BinaryData.fromObject(model).toObject(ComponentsLs1RjfResponsesVolumesContentApplicationJsonSchema.class);
        Assertions.assertEquals("vvoydwedggwg", model.getVolumes().get(0).getName());
        Assertions.assertEquals("vbwa", model.getVolumes().get(0).getDescription());
        Assertions.assertEquals(2042529839, model.getVolumes().get(0).getSizeGigabytes());
        Assertions.assertEquals("i", model.getVolumes().get(0).getTags().get(0));
        Assertions.assertEquals("umkq", model.getVolumes().get(0).getFilesystemType());
        Assertions.assertEquals("zvptriysj", model.getVolumes().get(0).getFilesystemLabel());
        Assertions.assertEquals(1118640339, model.getMeta().getTotal());
    }
}
