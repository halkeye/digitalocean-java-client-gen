package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ErrorWithRootCauses;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ErrorWithRootCausesTests {
    @Test
    public void testDeserialize() {
        ErrorWithRootCauses model =
                BinaryData.fromString(
                                "{\"error\":\"oqwrnfckjthlok\",\"messages\":[\"awfubkngejjxu\",\"owynj\"],\"root_causes\":[\"o\",\"mxuktdrsjtmnkxj\"]}")
                        .toObject(ErrorWithRootCauses.class);
        Assertions.assertEquals("oqwrnfckjthlok", model.getError());
        Assertions.assertEquals("awfubkngejjxu", model.getMessages().get(0));
        Assertions.assertEquals("o", model.getRootCauses().get(0));
    }

    @Test
    public void testSerialize() {
        ErrorWithRootCauses model =
                new ErrorWithRootCauses()
                        .setError("oqwrnfckjthlok")
                        .setMessages(Arrays.asList("awfubkngejjxu", "owynj"))
                        .setRootCauses(Arrays.asList("o", "mxuktdrsjtmnkxj"));
        model = BinaryData.fromObject(model).toObject(ErrorWithRootCauses.class);
        Assertions.assertEquals("oqwrnfckjthlok", model.getError());
        Assertions.assertEquals("awfubkngejjxu", model.getMessages().get(0));
        Assertions.assertEquals("o", model.getRootCauses().get(0));
    }
}
