package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseReplicaConnection;
import com.digitalocean.api.models.DatabaseReplicaPrivateConnection;
import com.digitalocean.api.models.PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"name\":\"jpxpqhttqhnmhkre\",\"region\":\"dsuxheqdgcrux\",\"size\":\"inymmqgwokmikp\",\"status\":\"forking\",\"tags\":[\"jxuvj\",\"pfdvhaxdv\",\"zaehpphthd\",\"lmv\"],\"created_at\":\"2021-08-03T05:36:45Z\",\"private_network_uuid\":\"lakf\",\"connection\":{\"uri\":\"xwgiks\",\"database\":\"vtooxrpo\",\"host\":\"phchgjtnhtukfaci\",\"port\":1114566909,\"user\":\"ntumeezbxvq\",\"password\":\"nuvwcgasgomtmjzw\",\"ssl\":false},\"private_connection\":{\"uri\":\"vs\",\"database\":\"wwztj\",\"host\":\"kkhtgfredmlscgrl\",\"port\":1807188661,\"user\":\"aovjow\",\"password\":\"hpa\",\"ssl\":true}}")
                        .toObject(
                                PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals("jpxpqhttqhnmhkre", model.getName());
        Assertions.assertEquals("dsuxheqdgcrux", model.getRegion());
        Assertions.assertEquals("inymmqgwokmikp", model.getSize());
        Assertions.assertEquals("jxuvj", model.getTags().get(0));
        Assertions.assertEquals("lakf", model.getPrivateNetworkUuid());
    }

    @Test
    public void testSerialize() {
        PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema model =
                new PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema()
                        .setName("jpxpqhttqhnmhkre")
                        .setRegion("dsuxheqdgcrux")
                        .setSize("inymmqgwokmikp")
                        .setTags(Arrays.asList("jxuvj", "pfdvhaxdv", "zaehpphthd", "lmv"))
                        .setPrivateNetworkUuid("lakf")
                        .setConnection(new DatabaseReplicaConnection())
                        .setPrivateConnection(new DatabaseReplicaPrivateConnection());
        model =
                BinaryData.fromObject(model)
                        .toObject(
                                PathsQqxkghV2DatabasesDatabaseClusterUuidReplicasPostRequestbodyContentApplicationJsonSchema
                                        .class);
        Assertions.assertEquals("jpxpqhttqhnmhkre", model.getName());
        Assertions.assertEquals("dsuxheqdgcrux", model.getRegion());
        Assertions.assertEquals("inymmqgwokmikp", model.getSize());
        Assertions.assertEquals("jxuvj", model.getTags().get(0));
        Assertions.assertEquals("lakf", model.getPrivateNetworkUuid());
    }
}
