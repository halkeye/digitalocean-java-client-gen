package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Credentials;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CredentialsTests {
    @Test
    public void testDeserialize() {
        Credentials model =
                BinaryData.fromString(
                                "{\"server\":\"kzzertkounzsiy\",\"token\":\"mfpopikzebqnnf\",\"expires_at\":\"2021-09-07T18:51:20Z\"}")
                        .toObject(Credentials.class);
        Assertions.assertEquals("kzzertkounzsiy", model.getServer());
        Assertions.assertEquals("mfpopikzebqnnf", model.getToken());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-07T18:51:20Z"), model.getExpiresAt());
    }

    @Test
    public void testSerialize() {
        Credentials model =
                new Credentials()
                        .setServer("kzzertkounzsiy")
                        .setToken("mfpopikzebqnnf")
                        .setExpiresAt(OffsetDateTime.parse("2021-09-07T18:51:20Z"));
        model = BinaryData.fromObject(model).toObject(Credentials.class);
        Assertions.assertEquals("kzzertkounzsiy", model.getServer());
        Assertions.assertEquals("mfpopikzebqnnf", model.getToken());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-07T18:51:20Z"), model.getExpiresAt());
    }
}
