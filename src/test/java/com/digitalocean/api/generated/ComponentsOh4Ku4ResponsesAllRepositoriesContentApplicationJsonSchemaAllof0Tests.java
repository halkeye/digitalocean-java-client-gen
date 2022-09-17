package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsOh4Ku4ResponsesAllRepositoriesContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.Repository;
import com.digitalocean.api.models.RepositoryTag;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsOh4Ku4ResponsesAllRepositoriesContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsOh4Ku4ResponsesAllRepositoriesContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"repositories\":[{\"registry_name\":\"fwlbghnkfr\",\"name\":\"oh\",\"latest_tag\":{\"registry_name\":\"snj\",\"repository\":\"chiypbfhm\",\"tag\":\"iktqozewbrsrj\",\"manifest_digest\":\"kbrauxboufq\",\"compressed_size_bytes\":2067026522,\"size_bytes\":2045280175,\"updated_at\":\"2021-04-14T15:03:21Z\"},\"tag_count\":522686990},{\"registry_name\":\"rerukbuudrizw\",\"name\":\"kjxl\",\"latest_tag\":{\"registry_name\":\"edikqelssybz\",\"repository\":\"vgb\",\"tag\":\"ommki\",\"manifest_digest\":\"ypwtmzyjjy\",\"compressed_size_bytes\":1033455110,\"size_bytes\":631471801,\"updated_at\":\"2021-12-02T06:04:50Z\"},\"tag_count\":2109159418},{\"registry_name\":\"gwiij\",\"name\":\"qiywhxpsbapial\",\"latest_tag\":{\"registry_name\":\"ydp\",\"repository\":\"udegefxlieggoto\",\"tag\":\"hssfnwh\",\"manifest_digest\":\"ah\",\"compressed_size_bytes\":669510356,\"size_bytes\":2081384520,\"updated_at\":\"2021-07-04T07:47:27Z\"},\"tag_count\":1530602992},{\"registry_name\":\"fthdgwuzronodv\",\"name\":\"fkd\",\"latest_tag\":{\"registry_name\":\"sodcikgx\",\"repository\":\"zzfzdjek\",\"tag\":\"awnxzsjwyf\",\"manifest_digest\":\"irgcjfai\",\"compressed_size_bytes\":670453617,\"size_bytes\":1110190751,\"updated_at\":\"2021-02-12T18:19:52Z\"},\"tag_count\":857839732}]}")
                        .toObject(ComponentsOh4Ku4ResponsesAllRepositoriesContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("fwlbghnkfr", model.getRepositories().get(0).getRegistryName());
        Assertions.assertEquals("oh", model.getRepositories().get(0).getName());
        Assertions.assertEquals("snj", model.getRepositories().get(0).getLatestTag().getRegistryName());
        Assertions.assertEquals("chiypbfhm", model.getRepositories().get(0).getLatestTag().getRepository());
        Assertions.assertEquals("iktqozewbrsrj", model.getRepositories().get(0).getLatestTag().getTag());
        Assertions.assertEquals("kbrauxboufq", model.getRepositories().get(0).getLatestTag().getManifestDigest());
        Assertions.assertEquals(2067026522, model.getRepositories().get(0).getLatestTag().getCompressedSizeBytes());
        Assertions.assertEquals(2045280175, model.getRepositories().get(0).getLatestTag().getSizeBytes());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-14T15:03:21Z"),
                model.getRepositories().get(0).getLatestTag().getUpdatedAt());
        Assertions.assertEquals(522686990, model.getRepositories().get(0).getTagCount());
    }

    @Test
    public void testSerialize() {
        ComponentsOh4Ku4ResponsesAllRepositoriesContentApplicationJsonSchemaAllof0 model =
                new ComponentsOh4Ku4ResponsesAllRepositoriesContentApplicationJsonSchemaAllof0()
                        .setRepositories(
                                Arrays.asList(
                                        new Repository()
                                                .setRegistryName("fwlbghnkfr")
                                                .setName("oh")
                                                .setLatestTag(
                                                        new RepositoryTag()
                                                                .setRegistryName("snj")
                                                                .setRepository("chiypbfhm")
                                                                .setTag("iktqozewbrsrj")
                                                                .setManifestDigest("kbrauxboufq")
                                                                .setCompressedSizeBytes(2067026522)
                                                                .setSizeBytes(2045280175)
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-04-14T15:03:21Z")))
                                                .setTagCount(522686990),
                                        new Repository()
                                                .setRegistryName("rerukbuudrizw")
                                                .setName("kjxl")
                                                .setLatestTag(
                                                        new RepositoryTag()
                                                                .setRegistryName("edikqelssybz")
                                                                .setRepository("vgb")
                                                                .setTag("ommki")
                                                                .setManifestDigest("ypwtmzyjjy")
                                                                .setCompressedSizeBytes(1033455110)
                                                                .setSizeBytes(631471801)
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-12-02T06:04:50Z")))
                                                .setTagCount(2109159418),
                                        new Repository()
                                                .setRegistryName("gwiij")
                                                .setName("qiywhxpsbapial")
                                                .setLatestTag(
                                                        new RepositoryTag()
                                                                .setRegistryName("ydp")
                                                                .setRepository("udegefxlieggoto")
                                                                .setTag("hssfnwh")
                                                                .setManifestDigest("ah")
                                                                .setCompressedSizeBytes(669510356)
                                                                .setSizeBytes(2081384520)
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-07-04T07:47:27Z")))
                                                .setTagCount(1530602992),
                                        new Repository()
                                                .setRegistryName("fthdgwuzronodv")
                                                .setName("fkd")
                                                .setLatestTag(
                                                        new RepositoryTag()
                                                                .setRegistryName("sodcikgx")
                                                                .setRepository("zzfzdjek")
                                                                .setTag("awnxzsjwyf")
                                                                .setManifestDigest("irgcjfai")
                                                                .setCompressedSizeBytes(670453617)
                                                                .setSizeBytes(1110190751)
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-02-12T18:19:52Z")))
                                                .setTagCount(857839732)));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsOh4Ku4ResponsesAllRepositoriesContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("fwlbghnkfr", model.getRepositories().get(0).getRegistryName());
        Assertions.assertEquals("oh", model.getRepositories().get(0).getName());
        Assertions.assertEquals("snj", model.getRepositories().get(0).getLatestTag().getRegistryName());
        Assertions.assertEquals("chiypbfhm", model.getRepositories().get(0).getLatestTag().getRepository());
        Assertions.assertEquals("iktqozewbrsrj", model.getRepositories().get(0).getLatestTag().getTag());
        Assertions.assertEquals("kbrauxboufq", model.getRepositories().get(0).getLatestTag().getManifestDigest());
        Assertions.assertEquals(2067026522, model.getRepositories().get(0).getLatestTag().getCompressedSizeBytes());
        Assertions.assertEquals(2045280175, model.getRepositories().get(0).getLatestTag().getSizeBytes());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-14T15:03:21Z"),
                model.getRepositories().get(0).getLatestTag().getUpdatedAt());
        Assertions.assertEquals(522686990, model.getRepositories().get(0).getTagCount());
    }
}
