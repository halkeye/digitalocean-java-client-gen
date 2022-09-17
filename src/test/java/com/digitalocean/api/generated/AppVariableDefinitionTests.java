package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppVariableDefinition;
import com.digitalocean.api.models.AppVariableDefinitionScope;
import com.digitalocean.api.models.AppVariableDefinitionType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppVariableDefinitionTests {
    @Test
    public void testDeserialize() {
        AppVariableDefinition model =
                BinaryData.fromString(
                                "{\"key\":\"jazysdzhezwwvaiq\",\"scope\":\"UNSET\",\"type\":\"SECRET\",\"value\":\"nk\"}")
                        .toObject(AppVariableDefinition.class);
        Assertions.assertEquals("jazysdzhezwwvaiq", model.getKey());
        Assertions.assertEquals(AppVariableDefinitionScope.UNSET, model.getScope());
        Assertions.assertEquals(AppVariableDefinitionType.SECRET, model.getType());
        Assertions.assertEquals("nk", model.getValue());
    }

    @Test
    public void testSerialize() {
        AppVariableDefinition model =
                new AppVariableDefinition()
                        .setKey("jazysdzhezwwvaiq")
                        .setScope(AppVariableDefinitionScope.UNSET)
                        .setType(AppVariableDefinitionType.SECRET)
                        .setValue("nk");
        model = BinaryData.fromObject(model).toObject(AppVariableDefinition.class);
        Assertions.assertEquals("jazysdzhezwwvaiq", model.getKey());
        Assertions.assertEquals(AppVariableDefinitionScope.UNSET, model.getScope());
        Assertions.assertEquals(AppVariableDefinitionType.SECRET, model.getType());
        Assertions.assertEquals("nk", model.getValue());
    }
}
