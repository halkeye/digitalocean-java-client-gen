package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseLayoutOption;
import com.digitalocean.api.models.DatabaseRegionOptions;
import com.digitalocean.api.models.OptionsRedis;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OptionsRedisTests {
    @Test
    public void testDeserialize() {
        OptionsRedis model = BinaryData.fromString("{\"versions\":[\"bpmfbfununmpzkrv\",\"yifkdschlzvf\"],\"layouts\":[{\"num_nodes\":1943203627,\"sizes\":[\"wgcwnp\"]},{\"num_nodes\":635632818,\"sizes\":[\"y\",\"togmhmjpjscdfpd\",\"wtyg\"]},{\"num_nodes\":806895875,\"sizes\":[\"sehar\",\"ifvqnr\"]},{\"num_nodes\":606206862,\"sizes\":[\"jptnvwjhrsidqpx\",\"btpakftngatw\"]}],\"regions\":[\"yutrymd\",\"mfjhpycvjqdvdwkq\",\"ldrlefgnaavua\",\"n\"]}").toObject(OptionsRedis.class);
    }

    @Test
    public void testSerialize() {
        OptionsRedis model = new OptionsRedis();
        model = BinaryData.fromObject(model).toObject(OptionsRedis.class);
    }
}
