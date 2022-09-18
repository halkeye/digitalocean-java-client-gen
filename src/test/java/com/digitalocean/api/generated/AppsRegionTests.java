package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppsRegion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsRegionTests {
    @Test
    public void testDeserialize() {
        AppsRegion model = BinaryData.fromString("{\"continent\":\"dnjzh\",\"data_centers\":[\"ylhjlm\",\"oyxprimr\",\"opteecj\",\"eislstvasylwx\"],\"default\":true,\"disabled\":false,\"flag\":\"eoohguufuzboyj\",\"label\":\"hwtzolb\",\"reason\":\"mwmdxmebwjscjpa\",\"slug\":\"xveabf\"}").toObject(AppsRegion.class);
    }

    @Test
    public void testSerialize() {
        AppsRegion model = new AppsRegion();
        model = BinaryData.fromObject(model).toObject(AppsRegion.class);
    }
}
