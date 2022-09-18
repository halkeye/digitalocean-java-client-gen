package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppDatabaseSpec;
import com.digitalocean.api.models.AppDatabaseSpecEngine;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppDatabaseSpecTests {
    @Test
    public void testDeserialize() {
        AppDatabaseSpec model = BinaryData.fromString("{\"cluster_name\":\"fnwmbtmvpdvj\",\"db_name\":\"ttzaefed\",\"db_user\":\"hchrphkmcrjdqn\",\"engine\":\"PG\",\"name\":\"zpbgtgkylkdg\",\"production\":false,\"version\":\"uutlwxezwzhok\"}").toObject(AppDatabaseSpec.class);
        Assertions.assertEquals("fnwmbtmvpdvj", model.getClusterName());
        Assertions.assertEquals("ttzaefed", model.getDbName());
        Assertions.assertEquals("hchrphkmcrjdqn", model.getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.PG, model.getEngine());
        Assertions.assertEquals("zpbgtgkylkdg", model.getName());
        Assertions.assertEquals(false, model.isProduction());
        Assertions.assertEquals("uutlwxezwzhok", model.getVersion());
    }

    @Test
    public void testSerialize() {
        AppDatabaseSpec model = new AppDatabaseSpec().setClusterName("fnwmbtmvpdvj").setDbName("ttzaefed").setDbUser("hchrphkmcrjdqn").setEngine(AppDatabaseSpecEngine.PG).setName("zpbgtgkylkdg").setProduction(false).setVersion("uutlwxezwzhok");
        model = BinaryData.fromObject(model).toObject(AppDatabaseSpec.class);
        Assertions.assertEquals("fnwmbtmvpdvj", model.getClusterName());
        Assertions.assertEquals("ttzaefed", model.getDbName());
        Assertions.assertEquals("hchrphkmcrjdqn", model.getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.PG, model.getEngine());
        Assertions.assertEquals("zpbgtgkylkdg", model.getName());
        Assertions.assertEquals(false, model.isProduction());
        Assertions.assertEquals("uutlwxezwzhok", model.getVersion());
    }
}
