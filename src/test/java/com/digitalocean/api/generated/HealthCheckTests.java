package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.HealthCheck;
import com.digitalocean.api.models.HealthCheckProtocol;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class HealthCheckTests {
    @Test
    public void testDeserialize() {
        HealthCheck model =
                BinaryData.fromString(
                                "{\"protocol\":\"http\",\"port\":1710348012,\"path\":\"pmw\",\"check_interval_seconds\":658607362,\"response_timeout_seconds\":816933848,\"unhealthy_threshold\":1394061441,\"healthy_threshold\":699538327}")
                        .toObject(HealthCheck.class);
        Assertions.assertEquals(HealthCheckProtocol.HTTP, model.getProtocol());
        Assertions.assertEquals(1710348012, model.getPort());
        Assertions.assertEquals("pmw", model.getPath());
        Assertions.assertEquals(658607362, model.getCheckIntervalSeconds());
        Assertions.assertEquals(816933848, model.getResponseTimeoutSeconds());
        Assertions.assertEquals(1394061441, model.getUnhealthyThreshold());
        Assertions.assertEquals(699538327, model.getHealthyThreshold());
    }

    @Test
    public void testSerialize() {
        HealthCheck model =
                new HealthCheck()
                        .setProtocol(HealthCheckProtocol.HTTP)
                        .setPort(1710348012)
                        .setPath("pmw")
                        .setCheckIntervalSeconds(658607362)
                        .setResponseTimeoutSeconds(816933848)
                        .setUnhealthyThreshold(1394061441)
                        .setHealthyThreshold(699538327);
        model = BinaryData.fromObject(model).toObject(HealthCheck.class);
        Assertions.assertEquals(HealthCheckProtocol.HTTP, model.getProtocol());
        Assertions.assertEquals(1710348012, model.getPort());
        Assertions.assertEquals("pmw", model.getPath());
        Assertions.assertEquals(658607362, model.getCheckIntervalSeconds());
        Assertions.assertEquals(816933848, model.getResponseTimeoutSeconds());
        Assertions.assertEquals(1394061441, model.getUnhealthyThreshold());
        Assertions.assertEquals(699538327, model.getHealthyThreshold());
    }
}
