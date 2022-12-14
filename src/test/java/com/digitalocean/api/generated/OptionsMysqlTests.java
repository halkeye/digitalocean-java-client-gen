package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseLayoutOption;
import com.digitalocean.api.models.DatabaseRegionOptions;
import com.digitalocean.api.models.OptionsMysql;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OptionsMysqlTests {
    @Test
    public void testDeserialize() {
        OptionsMysql model = BinaryData.fromString("{\"versions\":[\"m\",\"lswbnf\"],\"layouts\":[{\"num_nodes\":1004373323,\"sizes\":[\"qjn\",\"f\",\"ygleexa\",\"vmywhsbrcarycsjj\"]}],\"regions\":[\"oaqa\",\"uvehzptd\",\"krrbhmpful\",\"be\"]}").toObject(OptionsMysql.class);
    }

    @Test
    public void testSerialize() {
        OptionsMysql model = new OptionsMysql();
        model = BinaryData.fromObject(model).toObject(OptionsMysql.class);
    }
}
