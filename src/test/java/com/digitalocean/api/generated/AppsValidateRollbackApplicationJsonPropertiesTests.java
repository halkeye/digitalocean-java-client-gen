package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppRollbackValidationConditionCode;
import com.digitalocean.api.models.AppsValidateRollbackApplicationJsonProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsValidateRollbackApplicationJsonPropertiesTests {
    @Test
    public void testDeserialize() {
        AppsValidateRollbackApplicationJsonProperties model =
                BinaryData.fromString(
                                "{\"code\":\"region_conflict\",\"message\":\"jybvit\",\"components\":[\"jyaznumtggmu\",\"dchozfnkfexl\",\"xn\"]}")
                        .toObject(AppsValidateRollbackApplicationJsonProperties.class);
        Assertions.assertEquals(AppRollbackValidationConditionCode.REGION_CONFLICT, model.getCode());
        Assertions.assertEquals("jybvit", model.getMessage());
        Assertions.assertEquals("jyaznumtggmu", model.getComponents().get(0));
    }

    @Test
    public void testSerialize() {
        AppsValidateRollbackApplicationJsonProperties model =
                new AppsValidateRollbackApplicationJsonProperties()
                        .setCode(AppRollbackValidationConditionCode.REGION_CONFLICT)
                        .setMessage("jybvit")
                        .setComponents(Arrays.asList("jyaznumtggmu", "dchozfnkfexl", "xn"));
        model = BinaryData.fromObject(model).toObject(AppsValidateRollbackApplicationJsonProperties.class);
        Assertions.assertEquals(AppRollbackValidationConditionCode.REGION_CONFLICT, model.getCode());
        Assertions.assertEquals("jybvit", model.getMessage());
        Assertions.assertEquals("jyaznumtggmu", model.getComponents().get(0));
    }
}
