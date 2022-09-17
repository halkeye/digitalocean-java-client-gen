package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.OptionsMongodb;
import com.digitalocean.api.models.OptionsMysql;
import com.digitalocean.api.models.OptionsOptions;
import com.digitalocean.api.models.OptionsPg;
import com.digitalocean.api.models.OptionsRedis;
import org.junit.jupiter.api.Test;

public final class OptionsOptionsTests {
    @Test
    public void testDeserialize() {
        OptionsOptions model =
                BinaryData.fromString(
                                "{\"mongodb\":{\"versions\":[\"bmvmsxba\",\"vwjcnkottlwuh\",\"ajmailfemjjza\",\"zwjiqullq\"],\"layouts\":[{\"num_nodes\":384732164,\"sizes\":[]}],\"regions\":[\"mqerndb\"]},\"pg\":{\"versions\":[\"ofltfnnxrkadjfy\"],\"layouts\":[{\"num_nodes\":318187556,\"sizes\":[]}],\"regions\":[\"ri\",\"fohyk\",\"kxbbcbrwjiutgnj\"]},\"mysql\":{\"versions\":[\"ewoi\",\"mrvz\",\"juyrsrziuctixg\"],\"layouts\":[{\"num_nodes\":1580639257,\"sizes\":[]}],\"regions\":[\"vka\",\"pezkis\"]},\"redis\":{\"versions\":[\"dghsy\",\"arybjufptbjc\",\"jnciui\"],\"layouts\":[{\"num_nodes\":1702782871,\"sizes\":[]},{\"num_nodes\":1317646289,\"sizes\":[]}],\"regions\":[\"i\",\"qqzlgcndhz\",\"rr\",\"cfsrhkhgsn\"]}}")
                        .toObject(OptionsOptions.class);
    }

    @Test
    public void testSerialize() {
        OptionsOptions model =
                new OptionsOptions()
                        .setMongodb(new OptionsMongodb())
                        .setPg(new OptionsPg())
                        .setMysql(new OptionsMysql())
                        .setRedis(new OptionsRedis());
        model = BinaryData.fromObject(model).toObject(OptionsOptions.class);
    }
}
