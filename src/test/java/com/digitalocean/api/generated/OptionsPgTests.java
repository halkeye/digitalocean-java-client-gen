package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.OptionsPg;
import org.junit.jupiter.api.Test;

public final class OptionsPgTests {
    @Test
    public void testDeserialize() {
        OptionsPg model =
                BinaryData.fromString(
                                "{\"versions\":[\"kywymxgaabj\",\"dtfohfaog\",\"vkiwrsiwdyjqu\"],\"layouts\":[{\"num_nodes\":647553561,\"sizes\":[\"ueekcsue\",\"ogd\",\"acbcb\"]}],\"regions\":[\"lqidywmhm\",\"tyrilkfbnrqqxvz\",\"pbnfnqtx\"]}")
                        .toObject(OptionsPg.class);
    }

    @Test
    public void testSerialize() {
        OptionsPg model = new OptionsPg();
        model = BinaryData.fromObject(model).toObject(OptionsPg.class);
    }
}
