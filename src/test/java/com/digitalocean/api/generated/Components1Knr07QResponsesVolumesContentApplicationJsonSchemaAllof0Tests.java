package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components1Knr07QResponsesVolumesContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.VolumeFull;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Knr07QResponsesVolumesContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1Knr07QResponsesVolumesContentApplicationJsonSchemaAllof0 model = BinaryData.fromString("{\"volumes\":[{\"region\":{\"name\":\"xitr\",\"slug\":\"p\",\"available\":true},\"filesystem_type\":\"lutjsjzels\",\"filesystem_label\":\"emvupmeak\",\"id\":\"ysy\",\"droplet_ids\":[511522930],\"name\":\"ehcbs\",\"description\":\"pus\",\"size_gigabytes\":1251046581,\"created_at\":\"egbvbbd\",\"tags\":[\"fflzvslua\"]},{\"region\":{\"name\":\"xfjveug\",\"slug\":\"xzeempupbscboxra\",\"available\":true},\"filesystem_type\":\"zmrjgo\",\"filesystem_label\":\"kxeheowse\",\"id\":\"fdr\",\"droplet_ids\":[351473490,194925157],\"name\":\"wrjsbd\",\"description\":\"seesacuicnvq\",\"size_gigabytes\":1738107936,\"created_at\":\"ivmrfap\",\"tags\":[\"rmm\",\"lh\",\"k\",\"xrqkekcdavi\"]},{\"region\":{\"name\":\"beqrfzavqymcwts\",\"slug\":\"uceplbrzgkuorwp\",\"available\":false},\"filesystem_type\":\"tweobptscruykkie\",\"filesystem_label\":\"yyno\",\"id\":\"yflsmsbnlyo\",\"droplet_ids\":[605057505],\"name\":\"zjqthykcvo\",\"description\":\"cwfzotkxxl\",\"size_gigabytes\":1815938169,\"created_at\":\"xgbsdzcgcvypj\",\"tags\":[\"dmgobxehujcqg\",\"wvxwi\",\"aoibmjk\"]},{\"region\":{\"name\":\"rljd\",\"slug\":\"uky\",\"available\":false},\"filesystem_type\":\"rjiqoqovqhgphgxu\",\"filesystem_label\":\"d\",\"id\":\"yqruvumryddnqiva\",\"droplet_ids\":[1417318272,1410212761],\"name\":\"jzebp\",\"description\":\"ciyoypoedk\",\"size_gigabytes\":261309443,\"created_at\":\"ibpybqei\",\"tags\":[\"yxsx\",\"euikhzn\"]}]}").toObject(Components1Knr07QResponsesVolumesContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("ehcbs", model.getVolumes().get(0).getName());
        Assertions.assertEquals("pus", model.getVolumes().get(0).getDescription());
        Assertions.assertEquals(1251046581, model.getVolumes().get(0).getSizeGigabytes());
        Assertions.assertEquals("fflzvslua", model.getVolumes().get(0).getTags().get(0));
        Assertions.assertEquals("lutjsjzels", model.getVolumes().get(0).getFilesystemType());
        Assertions.assertEquals("emvupmeak", model.getVolumes().get(0).getFilesystemLabel());
    }

    @Test
    public void testSerialize() {
        Components1Knr07QResponsesVolumesContentApplicationJsonSchemaAllof0 model = new Components1Knr07QResponsesVolumesContentApplicationJsonSchemaAllof0().setVolumes(Arrays.asList(new VolumeFull().setName("ehcbs").setDescription("pus").setSizeGigabytes(1251046581).setTags(Arrays.asList("fflzvslua")).setFilesystemType("lutjsjzels").setFilesystemLabel("emvupmeak"), new VolumeFull().setName("wrjsbd").setDescription("seesacuicnvq").setSizeGigabytes(1738107936).setTags(Arrays.asList("rmm", "lh", "k", "xrqkekcdavi")).setFilesystemType("zmrjgo").setFilesystemLabel("kxeheowse"), new VolumeFull().setName("zjqthykcvo").setDescription("cwfzotkxxl").setSizeGigabytes(1815938169).setTags(Arrays.asList("dmgobxehujcqg", "wvxwi", "aoibmjk")).setFilesystemType("tweobptscruykkie").setFilesystemLabel("yyno"), new VolumeFull().setName("jzebp").setDescription("ciyoypoedk").setSizeGigabytes(261309443).setTags(Arrays.asList("yxsx", "euikhzn")).setFilesystemType("rjiqoqovqhgphgxu").setFilesystemLabel("d")));
        model = BinaryData.fromObject(model).toObject(Components1Knr07QResponsesVolumesContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("ehcbs", model.getVolumes().get(0).getName());
        Assertions.assertEquals("pus", model.getVolumes().get(0).getDescription());
        Assertions.assertEquals(1251046581, model.getVolumes().get(0).getSizeGigabytes());
        Assertions.assertEquals("fflzvslua", model.getVolumes().get(0).getTags().get(0));
        Assertions.assertEquals("lutjsjzels", model.getVolumes().get(0).getFilesystemType());
        Assertions.assertEquals("emvupmeak", model.getVolumes().get(0).getFilesystemLabel());
    }
}
