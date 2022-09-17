package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppServiceSpecHealthCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppServiceSpecHealthCheckTests {
    @Test
    public void testDeserialize() {
        AppServiceSpecHealthCheck model =
                BinaryData.fromString(
                                "{\"failure_threshold\":2125678810,\"port\":944157000221842248,\"http_path\":\"fhoqca\",\"initial_delay_seconds\":2104625260,\"period_seconds\":631291214,\"success_threshold\":1642223312,\"timeout_seconds\":668953670}")
                        .toObject(AppServiceSpecHealthCheck.class);
        Assertions.assertEquals(2125678810, model.getFailureThreshold());
        Assertions.assertEquals(944157000221842248L, model.getPort());
        Assertions.assertEquals("fhoqca", model.getHttpPath());
        Assertions.assertEquals(2104625260, model.getInitialDelaySeconds());
        Assertions.assertEquals(631291214, model.getPeriodSeconds());
        Assertions.assertEquals(1642223312, model.getSuccessThreshold());
        Assertions.assertEquals(668953670, model.getTimeoutSeconds());
    }

    @Test
    public void testSerialize() {
        AppServiceSpecHealthCheck model =
                new AppServiceSpecHealthCheck()
                        .setFailureThreshold(2125678810)
                        .setPort(944157000221842248L)
                        .setHttpPath("fhoqca")
                        .setInitialDelaySeconds(2104625260)
                        .setPeriodSeconds(631291214)
                        .setSuccessThreshold(1642223312)
                        .setTimeoutSeconds(668953670);
        model = BinaryData.fromObject(model).toObject(AppServiceSpecHealthCheck.class);
        Assertions.assertEquals(2125678810, model.getFailureThreshold());
        Assertions.assertEquals(944157000221842248L, model.getPort());
        Assertions.assertEquals("fhoqca", model.getHttpPath());
        Assertions.assertEquals(2104625260, model.getInitialDelaySeconds());
        Assertions.assertEquals(631291214, model.getPeriodSeconds());
        Assertions.assertEquals(1642223312, model.getSuccessThreshold());
        Assertions.assertEquals(668953670, model.getTimeoutSeconds());
    }
}
