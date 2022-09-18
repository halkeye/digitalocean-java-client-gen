package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppAlertSpec;
import com.digitalocean.api.models.AppAlertSpecOperator;
import com.digitalocean.api.models.AppAlertSpecRule;
import com.digitalocean.api.models.AppAlertSpecWindow;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppAlertSpecTests {
    @Test
    public void testDeserialize() {
        AppAlertSpec model = BinaryData.fromString("{\"rule\":\"MEM_UTILIZATION\",\"disabled\":false,\"operator\":\"GREATER_THAN\",\"value\":76.667114,\"window\":\"ONE_HOUR\"}").toObject(AppAlertSpec.class);
        Assertions.assertEquals(AppAlertSpecRule.MEMUTILIZATION, model.getRule());
        Assertions.assertEquals(false, model.isDisabled());
        Assertions.assertEquals(AppAlertSpecOperator.GREATER_THAN, model.getOperator());
        Assertions.assertEquals(76.667114F, model.getValue());
        Assertions.assertEquals(AppAlertSpecWindow.ONEHOUR, model.getWindow());
    }

    @Test
    public void testSerialize() {
        AppAlertSpec model = new AppAlertSpec().setRule(AppAlertSpecRule.MEMUTILIZATION).setDisabled(false).setOperator(AppAlertSpecOperator.GREATER_THAN).setValue(76.667114F).setWindow(AppAlertSpecWindow.ONEHOUR);
        model = BinaryData.fromObject(model).toObject(AppAlertSpec.class);
        Assertions.assertEquals(AppAlertSpecRule.MEMUTILIZATION, model.getRule());
        Assertions.assertEquals(false, model.isDisabled());
        Assertions.assertEquals(AppAlertSpecOperator.GREATER_THAN, model.getOperator());
        Assertions.assertEquals(76.667114F, model.getValue());
        Assertions.assertEquals(AppAlertSpecWindow.ONEHOUR, model.getWindow());
    }
}
