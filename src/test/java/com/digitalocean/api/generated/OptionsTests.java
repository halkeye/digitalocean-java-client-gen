package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Options;
import com.digitalocean.api.models.OptionsMongodb;
import com.digitalocean.api.models.OptionsMysql;
import com.digitalocean.api.models.OptionsOptions;
import com.digitalocean.api.models.OptionsPg;
import com.digitalocean.api.models.OptionsRedis;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OptionsTests {
    @Test
    public void testDeserialize() {
        Options model = BinaryData.fromString("{\"options\":{\"mongodb\":{\"versions\":[\"tlgflwfgz\",\"iucijjcea\",\"lijjjrtvam\"],\"layouts\":[],\"regions\":[\"nxkvccxetyvku\",\"mignohikkg\",\"ogjwpindedvabbxb\",\"medeil\"]},\"pg\":{\"versions\":[\"fcfxzirzzihvwy\",\"usuv\",\"slczwciidjsllf\"],\"layouts\":[],\"regions\":[\"vxadqacfrgnawbab\",\"fbktyjmfczlf\"]},\"mysql\":{\"versions\":[\"frbzgowo\",\"qmje\",\"jcx\",\"yqgxhlus\"],\"layouts\":[],\"regions\":[\"i\",\"jceagb\",\"qvlsumywzas\",\"xgo\"]},\"redis\":{\"versions\":[\"fq\",\"puby\",\"nclkfkeeb\",\"vop\"],\"layouts\":[],\"regions\":[\"qujlyegqa\",\"nigflqqbtnyj\",\"ylxd\"]}}}").toObject(Options.class);
    }

    @Test
    public void testSerialize() {
        Options model = new Options().setOptions(new OptionsOptions().setMongodb(new OptionsMongodb()).setPg(new OptionsPg()).setMysql(new OptionsMysql()).setRedis(new OptionsRedis()));
        model = BinaryData.fromObject(model).toObject(Options.class);
    }
}
