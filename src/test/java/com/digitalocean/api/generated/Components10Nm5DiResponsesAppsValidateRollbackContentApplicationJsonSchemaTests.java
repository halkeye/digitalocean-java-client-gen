package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppRollbackValidationCondition;
import com.digitalocean.api.models.AppRollbackValidationConditionCode;
import com.digitalocean.api.models.AppsValidateRollbackApplicationJsonProperties;
import com.digitalocean.api.models.Components10Nm5DiResponsesAppsValidateRollbackContentApplicationJsonSchema;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components10Nm5DiResponsesAppsValidateRollbackContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components10Nm5DiResponsesAppsValidateRollbackContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"valid\":false,\"error\":{\"code\":\"incompatible_phase\",\"message\":\"ynojpziuw\",\"components\":[\"kkdtnhqsy\",\"ljselp\",\"pbafvafhlbylc\"]},\"warnings\":[{\"code\":\"image_source_missing_digest\",\"message\":\"hyzdfwrs\",\"components\":[\"ltdb\"]},{\"code\":\"exceeded_revision_limit\",\"message\":\"rhvhfnracwnpqigt\",\"components\":[\"wouhdawsi\",\"rb\"]}]}")
                        .toObject(Components10Nm5DiResponsesAppsValidateRollbackContentApplicationJsonSchema.class);
        Assertions.assertEquals(false, model.isValid());
        Assertions.assertEquals(AppRollbackValidationConditionCode.INCOMPATIBLE_PHASE, model.getError().getCode());
        Assertions.assertEquals("ynojpziuw", model.getError().getMessage());
        Assertions.assertEquals("kkdtnhqsy", model.getError().getComponents().get(0));
        Assertions.assertEquals(
                AppRollbackValidationConditionCode.IMAGE_SOURCE_MISSING_DIGEST, model.getWarnings().get(0).getCode());
        Assertions.assertEquals("hyzdfwrs", model.getWarnings().get(0).getMessage());
        Assertions.assertEquals("ltdb", model.getWarnings().get(0).getComponents().get(0));
    }

    @Test
    public void testSerialize() {
        Components10Nm5DiResponsesAppsValidateRollbackContentApplicationJsonSchema model =
                new Components10Nm5DiResponsesAppsValidateRollbackContentApplicationJsonSchema()
                        .setValid(false)
                        .setError(
                                new AppsValidateRollbackApplicationJsonProperties()
                                        .setCode(AppRollbackValidationConditionCode.INCOMPATIBLE_PHASE)
                                        .setMessage("ynojpziuw")
                                        .setComponents(Arrays.asList("kkdtnhqsy", "ljselp", "pbafvafhlbylc")))
                        .setWarnings(
                                Arrays.asList(
                                        new AppRollbackValidationCondition()
                                                .setCode(AppRollbackValidationConditionCode.IMAGE_SOURCE_MISSING_DIGEST)
                                                .setMessage("hyzdfwrs")
                                                .setComponents(Arrays.asList("ltdb")),
                                        new AppRollbackValidationCondition()
                                                .setCode(AppRollbackValidationConditionCode.EXCEEDED_REVISION_LIMIT)
                                                .setMessage("rhvhfnracwnpqigt")
                                                .setComponents(Arrays.asList("wouhdawsi", "rb"))));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components10Nm5DiResponsesAppsValidateRollbackContentApplicationJsonSchema.class);
        Assertions.assertEquals(false, model.isValid());
        Assertions.assertEquals(AppRollbackValidationConditionCode.INCOMPATIBLE_PHASE, model.getError().getCode());
        Assertions.assertEquals("ynojpziuw", model.getError().getMessage());
        Assertions.assertEquals("kkdtnhqsy", model.getError().getComponents().get(0));
        Assertions.assertEquals(
                AppRollbackValidationConditionCode.IMAGE_SOURCE_MISSING_DIGEST, model.getWarnings().get(0).getCode());
        Assertions.assertEquals("hyzdfwrs", model.getWarnings().get(0).getMessage());
        Assertions.assertEquals("ltdb", model.getWarnings().get(0).getComponents().get(0));
    }
}
