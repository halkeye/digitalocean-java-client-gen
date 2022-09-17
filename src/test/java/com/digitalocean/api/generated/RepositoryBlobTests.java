package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.RepositoryBlob;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RepositoryBlobTests {
    @Test
    public void testDeserialize() {
        RepositoryBlob model =
                BinaryData.fromString("{\"digest\":\"hfmdoiiyobq\",\"compressed_size_bytes\":374086744}")
                        .toObject(RepositoryBlob.class);
        Assertions.assertEquals("hfmdoiiyobq", model.getDigest());
        Assertions.assertEquals(374086744, model.getCompressedSizeBytes());
    }

    @Test
    public void testSerialize() {
        RepositoryBlob model = new RepositoryBlob().setDigest("hfmdoiiyobq").setCompressedSizeBytes(374086744);
        model = BinaryData.fromObject(model).toObject(RepositoryBlob.class);
        Assertions.assertEquals("hfmdoiiyobq", model.getDigest());
        Assertions.assertEquals(374086744, model.getCompressedSizeBytes());
    }
}
