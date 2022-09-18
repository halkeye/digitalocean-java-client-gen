package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.SelectiveDestroyAssociatedResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SelectiveDestroyAssociatedResourceTests {
    @Test
    public void testDeserialize() {
        SelectiveDestroyAssociatedResource model = BinaryData.fromString("{\"floating_ips\":[\"qqyeqfcb\",\"ulpyuflq\",\"fsh\",\"ujcyohigimwdc\"],\"reserved_ips\":[\"kqnqvkixnmbzme\"],\"snapshots\":[\"rzwimbzayspz\",\"rietvfp\"],\"volumes\":[\"zxplgtpvdvatlz\",\"gschnzrsbk\"],\"volume_snapshots\":[\"vlzdmnfm\",\"ws\"]}").toObject(SelectiveDestroyAssociatedResource.class);
        Assertions.assertEquals("qqyeqfcb", model.getFloatingIps().get(0));
        Assertions.assertEquals("kqnqvkixnmbzme", model.getReservedIps().get(0));
        Assertions.assertEquals("rzwimbzayspz", model.getSnapshots().get(0));
        Assertions.assertEquals("zxplgtpvdvatlz", model.getVolumes().get(0));
        Assertions.assertEquals("vlzdmnfm", model.getVolumeSnapshots().get(0));
    }

    @Test
    public void testSerialize() {
        SelectiveDestroyAssociatedResource model = new SelectiveDestroyAssociatedResource().setFloatingIps(Arrays.asList("qqyeqfcb", "ulpyuflq", "fsh", "ujcyohigimwdc")).setReservedIps(Arrays.asList("kqnqvkixnmbzme")).setSnapshots(Arrays.asList("rzwimbzayspz", "rietvfp")).setVolumes(Arrays.asList("zxplgtpvdvatlz", "gschnzrsbk")).setVolumeSnapshots(Arrays.asList("vlzdmnfm", "ws"));
        model = BinaryData.fromObject(model).toObject(SelectiveDestroyAssociatedResource.class);
        Assertions.assertEquals("qqyeqfcb", model.getFloatingIps().get(0));
        Assertions.assertEquals("kqnqvkixnmbzme", model.getReservedIps().get(0));
        Assertions.assertEquals("rzwimbzayspz", model.getSnapshots().get(0));
        Assertions.assertEquals("zxplgtpvdvatlz", model.getVolumes().get(0));
        Assertions.assertEquals("vlzdmnfm", model.getVolumeSnapshots().get(0));
    }
}
