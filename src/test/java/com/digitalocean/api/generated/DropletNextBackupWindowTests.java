package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DropletNextBackupWindow;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DropletNextBackupWindowTests {
    @Test
    public void testDeserialize() {
        DropletNextBackupWindow model =
                BinaryData.fromString("{\"start\":\"2021-10-28T14:39:50Z\",\"end\":\"2021-11-13T00:25:40Z\"}")
                        .toObject(DropletNextBackupWindow.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-28T14:39:50Z"), model.getStart());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-13T00:25:40Z"), model.getEnd());
    }

    @Test
    public void testSerialize() {
        DropletNextBackupWindow model =
                new DropletNextBackupWindow()
                        .setStart(OffsetDateTime.parse("2021-10-28T14:39:50Z"))
                        .setEnd(OffsetDateTime.parse("2021-11-13T00:25:40Z"));
        model = BinaryData.fromObject(model).toObject(DropletNextBackupWindow.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-28T14:39:50Z"), model.getStart());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-13T00:25:40Z"), model.getEnd());
    }
}
