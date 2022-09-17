package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.OptionsMongodb;
import org.junit.jupiter.api.Test;

public final class OptionsMongodbTests {
    @Test
    public void testDeserialize() {
        OptionsMongodb model =
                BinaryData.fromString(
                                "{\"versions\":[\"wkpphefsb\",\"xlb\",\"xomeikjclwzacn\"],\"layouts\":[{\"num_nodes\":586433470,\"sizes\":[\"t\",\"azyqbxyxoyfp\",\"qqi\"]},{\"num_nodes\":1347016461,\"sizes\":[\"hdjzqdcadwvpsoz\",\"iihjriybmrzo\"]},{\"num_nodes\":417980218,\"sizes\":[\"dvwnjkgvfnmxa\",\"rsqftib\",\"yibuyvpirfqjpnqn\",\"owsbedenrexkxbh\"]}],\"regions\":[\"cnulgmnhjevdy\",\"nfa\",\"svkskmqoz\"]}")
                        .toObject(OptionsMongodb.class);
    }

    @Test
    public void testSerialize() {
        OptionsMongodb model = new OptionsMongodb();
        model = BinaryData.fromObject(model).toObject(OptionsMongodb.class);
    }
}
