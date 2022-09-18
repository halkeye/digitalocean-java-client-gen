package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Pgbouncer;
import com.digitalocean.api.models.PgbouncerAutodbPoolMode;
import com.digitalocean.api.models.PgbouncerIgnoreStartupParametersItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PgbouncerTests {
    @Test
    public void testDeserialize() {
        Pgbouncer model = BinaryData.fromString("{\"server_reset_query_always\":false,\"ignore_startup_parameters\":[\"search_path\",\"search_path\",\"search_path\",\"search_path\"],\"min_pool_size\":885862938,\"server_lifetime\":561158106,\"server_idle_timeout\":1446277117,\"autodb_pool_size\":1698760010,\"autodb_pool_mode\":\"transaction\",\"autodb_max_db_connections\":977143635,\"autodb_idle_timeout\":815843697}").toObject(Pgbouncer.class);
        Assertions.assertEquals(false, model.isServerResetQueryAlways());
        Assertions.assertEquals(PgbouncerIgnoreStartupParametersItem.SEARCH_PATH, model.getIgnoreStartupParameters().get(0));
        Assertions.assertEquals(885862938, model.getMinPoolSize());
        Assertions.assertEquals(561158106, model.getServerLifetime());
        Assertions.assertEquals(1446277117, model.getServerIdleTimeout());
        Assertions.assertEquals(1698760010, model.getAutodbPoolSize());
        Assertions.assertEquals(PgbouncerAutodbPoolMode.TRANSACTION, model.getAutodbPoolMode());
        Assertions.assertEquals(977143635, model.getAutodbMaxDbConnections());
        Assertions.assertEquals(815843697, model.getAutodbIdleTimeout());
    }

    @Test
    public void testSerialize() {
        Pgbouncer model = new Pgbouncer().setServerResetQueryAlways(false).setIgnoreStartupParameters(Arrays.asList(PgbouncerIgnoreStartupParametersItem.SEARCH_PATH, PgbouncerIgnoreStartupParametersItem.SEARCH_PATH, PgbouncerIgnoreStartupParametersItem.SEARCH_PATH, PgbouncerIgnoreStartupParametersItem.SEARCH_PATH)).setMinPoolSize(885862938).setServerLifetime(561158106).setServerIdleTimeout(1446277117).setAutodbPoolSize(1698760010).setAutodbPoolMode(PgbouncerAutodbPoolMode.TRANSACTION).setAutodbMaxDbConnections(977143635).setAutodbIdleTimeout(815843697);
        model = BinaryData.fromObject(model).toObject(Pgbouncer.class);
        Assertions.assertEquals(false, model.isServerResetQueryAlways());
        Assertions.assertEquals(PgbouncerIgnoreStartupParametersItem.SEARCH_PATH, model.getIgnoreStartupParameters().get(0));
        Assertions.assertEquals(885862938, model.getMinPoolSize());
        Assertions.assertEquals(561158106, model.getServerLifetime());
        Assertions.assertEquals(1446277117, model.getServerIdleTimeout());
        Assertions.assertEquals(1698760010, model.getAutodbPoolSize());
        Assertions.assertEquals(PgbouncerAutodbPoolMode.TRANSACTION, model.getAutodbPoolMode());
        Assertions.assertEquals(977143635, model.getAutodbMaxDbConnections());
        Assertions.assertEquals(815843697, model.getAutodbIdleTimeout());
    }
}
