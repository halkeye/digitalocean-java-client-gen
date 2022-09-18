package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppRollbackValidationCondition;
import com.digitalocean.api.models.AppRollbackValidationConditionCode;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppRollbackValidationConditionTests {
    @Test
    public void testDeserialize() {
        AppRollbackValidationCondition model = BinaryData.fromString("{\"code\":\"exceeded_revision_limit\",\"message\":\"zvoaikna\",\"components\":[\"uwiguyxlyk\",\"phvxz\",\"wxh\",\"pejtl\"]}").toObject(AppRollbackValidationCondition.class);
        Assertions.assertEquals(AppRollbackValidationConditionCode.EXCEEDED_REVISION_LIMIT, model.getCode());
        Assertions.assertEquals("zvoaikna", model.getMessage());
        Assertions.assertEquals("uwiguyxlyk", model.getComponents().get(0));
    }

    @Test
    public void testSerialize() {
        AppRollbackValidationCondition model = new AppRollbackValidationCondition().setCode(AppRollbackValidationConditionCode.EXCEEDED_REVISION_LIMIT).setMessage("zvoaikna").setComponents(Arrays.asList("uwiguyxlyk", "phvxz", "wxh", "pejtl"));
        model = BinaryData.fromObject(model).toObject(AppRollbackValidationCondition.class);
        Assertions.assertEquals(AppRollbackValidationConditionCode.EXCEEDED_REVISION_LIMIT, model.getCode());
        Assertions.assertEquals("zvoaikna", model.getMessage());
        Assertions.assertEquals("uwiguyxlyk", model.getComponents().get(0));
    }
}
