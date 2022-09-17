package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DestroyedAssociatedResource;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DestroyedAssociatedResourceTests {
    @Test
    public void testDeserialize() {
        DestroyedAssociatedResource model =
                BinaryData.fromString(
                                "{\"id\":\"tbwjjirmuydgftt\",\"name\":\"ofgeoagf\",\"destroyed_at\":\"2021-08-26T07:31:46Z\",\"error_message\":\"nxodwxmdajwiyg\"}")
                        .toObject(DestroyedAssociatedResource.class);
        Assertions.assertEquals("tbwjjirmuydgftt", model.getId());
        Assertions.assertEquals("ofgeoagf", model.getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-26T07:31:46Z"), model.getDestroyedAt());
        Assertions.assertEquals("nxodwxmdajwiyg", model.getErrorMessage());
    }

    @Test
    public void testSerialize() {
        DestroyedAssociatedResource model =
                new DestroyedAssociatedResource()
                        .setId("tbwjjirmuydgftt")
                        .setName("ofgeoagf")
                        .setDestroyedAt(OffsetDateTime.parse("2021-08-26T07:31:46Z"))
                        .setErrorMessage("nxodwxmdajwiyg");
        model = BinaryData.fromObject(model).toObject(DestroyedAssociatedResource.class);
        Assertions.assertEquals("tbwjjirmuydgftt", model.getId());
        Assertions.assertEquals("ofgeoagf", model.getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-26T07:31:46Z"), model.getDestroyedAt());
        Assertions.assertEquals("nxodwxmdajwiyg", model.getErrorMessage());
    }
}
