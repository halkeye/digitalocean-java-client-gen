package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DomainRecordNs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DomainRecordNsTests {
    @Test
    public void testDeserialize() {
        DomainRecordNs model =
                BinaryData.fromString(
                                "{\"id\":331811785,\"type\":\"ebiphryvcjwqwoq\",\"name\":\"atjhdhzybspijhf\",\"data\":\"gdkkagvwukh\",\"priority\":136799145,\"port\":410918688,\"ttl\":239027728,\"weight\":713274939,\"flags\":1320194875,\"tag\":\"ilz\"}")
                        .toObject(DomainRecordNs.class);
        Assertions.assertEquals("ebiphryvcjwqwoq", model.getType());
        Assertions.assertEquals("atjhdhzybspijhf", model.getName());
        Assertions.assertEquals("gdkkagvwukh", model.getData());
        Assertions.assertEquals(136799145, model.getPriority());
        Assertions.assertEquals(410918688, model.getPort());
        Assertions.assertEquals(239027728, model.getTtl());
        Assertions.assertEquals(713274939, model.getWeight());
        Assertions.assertEquals(1320194875, model.getFlags());
        Assertions.assertEquals("ilz", model.getTag());
    }

    @Test
    public void testSerialize() {
        DomainRecordNs model =
                new DomainRecordNs()
                        .setType("ebiphryvcjwqwoq")
                        .setName("atjhdhzybspijhf")
                        .setData("gdkkagvwukh")
                        .setPriority(136799145)
                        .setPort(410918688)
                        .setTtl(239027728)
                        .setWeight(713274939)
                        .setFlags(1320194875)
                        .setTag("ilz");
        model = BinaryData.fromObject(model).toObject(DomainRecordNs.class);
        Assertions.assertEquals("ebiphryvcjwqwoq", model.getType());
        Assertions.assertEquals("atjhdhzybspijhf", model.getName());
        Assertions.assertEquals("gdkkagvwukh", model.getData());
        Assertions.assertEquals(136799145, model.getPriority());
        Assertions.assertEquals(410918688, model.getPort());
        Assertions.assertEquals(239027728, model.getTtl());
        Assertions.assertEquals(713274939, model.getWeight());
        Assertions.assertEquals(1320194875, model.getFlags());
        Assertions.assertEquals("ilz", model.getTag());
    }
}
