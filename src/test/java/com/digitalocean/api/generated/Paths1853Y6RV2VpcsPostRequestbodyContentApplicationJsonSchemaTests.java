package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Paths1853Y6RV2VpcsPostRequestbodyContentApplicationJsonSchema;
import com.digitalocean.api.models.VpcUpdatable;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Paths1853Y6RV2VpcsPostRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Paths1853Y6RV2VpcsPostRequestbodyContentApplicationJsonSchema model = BinaryData.fromString("{\"region\":\"qbkxdtbfkihainz\",\"ip_range\":\"fkzlxvcozcgo\",\"name\":\"zlibcbnunzuysaj\",\"description\":\"qlho\"}").toObject(Paths1853Y6RV2VpcsPostRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals("zlibcbnunzuysaj", model.getName());
        Assertions.assertEquals("qlho", model.getDescription());
        Assertions.assertEquals("qbkxdtbfkihainz", model.getRegion());
        Assertions.assertEquals("fkzlxvcozcgo", model.getIpRange());
    }

    @Test
    public void testSerialize() {
        Paths1853Y6RV2VpcsPostRequestbodyContentApplicationJsonSchema model = new Paths1853Y6RV2VpcsPostRequestbodyContentApplicationJsonSchema().setName("zlibcbnunzuysaj").setDescription("qlho").setRegion("qbkxdtbfkihainz").setIpRange("fkzlxvcozcgo");
        model = BinaryData.fromObject(model).toObject(Paths1853Y6RV2VpcsPostRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals("zlibcbnunzuysaj", model.getName());
        Assertions.assertEquals("qlho", model.getDescription());
        Assertions.assertEquals("qbkxdtbfkihainz", model.getRegion());
        Assertions.assertEquals("fkzlxvcozcgo", model.getIpRange());
    }
}
