package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.Components7K4Gv0ResponsesDatabaseClustersContentApplicationJsonSchema;
import com.digitalocean.api.models.DatabaseCluster;
import com.digitalocean.api.models.DatabaseClusterConnection;
import com.digitalocean.api.models.DatabaseClusterEngine;
import com.digitalocean.api.models.DatabaseClusterMaintenanceWindow;
import com.digitalocean.api.models.DatabaseClusterPrivateConnection;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components7K4Gv0ResponsesDatabaseClustersContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        Components7K4Gv0ResponsesDatabaseClustersContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"databases\":[{\"name\":\"outnpdctuhspfefy\",\"engine\":\"redis\",\"version\":\"uyeuyl\",\"num_nodes\":599363082,\"size\":\"hmtybkcgsuthhll\",\"region\":\"mwynefxexlfciatx\",\"status\":\"forking\",\"created_at\":\"2021-03-04T21:02:41Z\",\"private_network_uuid\":\"mdskjhhxdlajfoxc\",\"tags\":[\"vslxlh\",\"a\",\"krmukmyjmkxett\",\"slojfkqidnqt\"],\"db_names\":[\"jhqxc\",\"qhtkbt\",\"qlrn\"],\"connection\":{\"uri\":\"mbiipsnawwlqk\",\"database\":\"xhhllxricct\",\"host\":\"muqqoajxei\",\"port\":1812448469,\"user\":\"srwvaexhdctrce\",\"password\":\"kbrup\",\"ssl\":true},\"private_connection\":{\"uri\":\"mljzacv\",\"database\":\"epj\",\"host\":\"ibnzp\",\"port\":1681557167,\"user\":\"ifexleqirccjcly\",\"password\":\"gxvrpjl\",\"ssl\":true},\"users\":[],\"maintenance_window\":{\"day\":\"ac\",\"hour\":\"u\",\"pending\":true,\"description\":[]},\"rules\":[]},{\"name\":\"xq\",\"engine\":\"redis\",\"version\":\"oy\",\"num_nodes\":1495517843,\"size\":\"iylpck\",\"region\":\"ewsedveskwxe\",\"status\":\"forking\",\"created_at\":\"2021-05-28T01:25:51Z\",\"private_network_uuid\":\"fn\",\"tags\":[\"tmjtsghp\",\"c\",\"cp\",\"arpzeqacdldtzm\"],\"db_names\":[\"efcpczshn\",\"qndaizupfkhuytus\"],\"connection\":{\"uri\":\"mtvtvegwqiukvzwy\",\"database\":\"tthaokgkskj\",\"host\":\"bs\",\"port\":637412167,\"user\":\"qfukpeexpgeumi\",\"password\":\"wuit\",\"ssl\":true},\"private_connection\":{\"uri\":\"iono\",\"database\":\"inbd\",\"host\":\"s\",\"port\":1883901064,\"user\":\"qrs\",\"password\":\"cbbprtugav\",\"ssl\":true},\"users\":[],\"maintenance_window\":{\"day\":\"sivmfogdrtbfcmk\",\"hour\":\"ftsjcwj\",\"pending\":true,\"description\":[]},\"rules\":[]},{\"name\":\"vifdxkecifhocjx\",\"engine\":\"pg\",\"version\":\"ooz\",\"num_nodes\":403548767,\"size\":\"txvcm\",\"region\":\"funlcpxxvi\",\"status\":\"resizing\",\"created_at\":\"2021-05-14T15:23:24Z\",\"private_network_uuid\":\"jgvrquvpyggl\",\"tags\":[\"rdcueljtiahx\",\"fqryarvsx\",\"qbglcjkaysp\"],\"db_names\":[\"odubtlmjt\",\"blioskkfmkmf\"],\"connection\":{\"uri\":\"yxgbkkqvjcteoedl\",\"database\":\"lskkzpxvj\",\"host\":\"dpvocojhpcn\",\"port\":2105029866,\"user\":\"fsnggytexvzilm\",\"password\":\"vzkwwwncknr\",\"ssl\":true},\"private_connection\":{\"uri\":\"skzptjxulweucyr\",\"database\":\"xqlehmc\",\"host\":\"jei\",\"port\":339742901,\"user\":\"oka\",\"password\":\"fejvqn\",\"ssl\":true},\"users\":[],\"maintenance_window\":{\"day\":\"abzfivf\",\"hour\":\"kpysthhzagjf\",\"pending\":false,\"description\":[]},\"rules\":[]}]}")
                        .toObject(Components7K4Gv0ResponsesDatabaseClustersContentApplicationJsonSchema.class);
        Assertions.assertEquals("outnpdctuhspfefy", model.getDatabases().get(0).getName());
        Assertions.assertEquals(DatabaseClusterEngine.REDIS, model.getDatabases().get(0).getEngine());
        Assertions.assertEquals("uyeuyl", model.getDatabases().get(0).getVersion());
        Assertions.assertEquals(599363082, model.getDatabases().get(0).getNumNodes());
        Assertions.assertEquals("hmtybkcgsuthhll", model.getDatabases().get(0).getSize());
        Assertions.assertEquals("mwynefxexlfciatx", model.getDatabases().get(0).getRegion());
        Assertions.assertEquals("mdskjhhxdlajfoxc", model.getDatabases().get(0).getPrivateNetworkUuid());
        Assertions.assertEquals("vslxlh", model.getDatabases().get(0).getTags().get(0));
        Assertions.assertEquals("ac", model.getDatabases().get(0).getMaintenanceWindow().getDay());
        Assertions.assertEquals("u", model.getDatabases().get(0).getMaintenanceWindow().getHour());
    }

    @Test
    public void testSerialize() {
        Components7K4Gv0ResponsesDatabaseClustersContentApplicationJsonSchema model =
                new Components7K4Gv0ResponsesDatabaseClustersContentApplicationJsonSchema()
                        .setDatabases(
                                Arrays.asList(
                                        new DatabaseCluster()
                                                .setName("outnpdctuhspfefy")
                                                .setEngine(DatabaseClusterEngine.REDIS)
                                                .setVersion("uyeuyl")
                                                .setNumNodes(599363082)
                                                .setSize("hmtybkcgsuthhll")
                                                .setRegion("mwynefxexlfciatx")
                                                .setPrivateNetworkUuid("mdskjhhxdlajfoxc")
                                                .setTags(Arrays.asList("vslxlh", "a", "krmukmyjmkxett", "slojfkqidnqt"))
                                                .setConnection(new DatabaseClusterConnection())
                                                .setPrivateConnection(new DatabaseClusterPrivateConnection())
                                                .setMaintenanceWindow(
                                                        new DatabaseClusterMaintenanceWindow()
                                                                .setDay("ac")
                                                                .setHour("u"))
                                                .setRules(Arrays.asList()),
                                        new DatabaseCluster()
                                                .setName("xq")
                                                .setEngine(DatabaseClusterEngine.REDIS)
                                                .setVersion("oy")
                                                .setNumNodes(1495517843)
                                                .setSize("iylpck")
                                                .setRegion("ewsedveskwxe")
                                                .setPrivateNetworkUuid("fn")
                                                .setTags(Arrays.asList("tmjtsghp", "c", "cp", "arpzeqacdldtzm"))
                                                .setConnection(new DatabaseClusterConnection())
                                                .setPrivateConnection(new DatabaseClusterPrivateConnection())
                                                .setMaintenanceWindow(
                                                        new DatabaseClusterMaintenanceWindow()
                                                                .setDay("sivmfogdrtbfcmk")
                                                                .setHour("ftsjcwj"))
                                                .setRules(Arrays.asList()),
                                        new DatabaseCluster()
                                                .setName("vifdxkecifhocjx")
                                                .setEngine(DatabaseClusterEngine.PG)
                                                .setVersion("ooz")
                                                .setNumNodes(403548767)
                                                .setSize("txvcm")
                                                .setRegion("funlcpxxvi")
                                                .setPrivateNetworkUuid("jgvrquvpyggl")
                                                .setTags(Arrays.asList("rdcueljtiahx", "fqryarvsx", "qbglcjkaysp"))
                                                .setConnection(new DatabaseClusterConnection())
                                                .setPrivateConnection(new DatabaseClusterPrivateConnection())
                                                .setMaintenanceWindow(
                                                        new DatabaseClusterMaintenanceWindow()
                                                                .setDay("abzfivf")
                                                                .setHour("kpysthhzagjf"))
                                                .setRules(Arrays.asList())));
        model =
                BinaryData.fromObject(model)
                        .toObject(Components7K4Gv0ResponsesDatabaseClustersContentApplicationJsonSchema.class);
        Assertions.assertEquals("outnpdctuhspfefy", model.getDatabases().get(0).getName());
        Assertions.assertEquals(DatabaseClusterEngine.REDIS, model.getDatabases().get(0).getEngine());
        Assertions.assertEquals("uyeuyl", model.getDatabases().get(0).getVersion());
        Assertions.assertEquals(599363082, model.getDatabases().get(0).getNumNodes());
        Assertions.assertEquals("hmtybkcgsuthhll", model.getDatabases().get(0).getSize());
        Assertions.assertEquals("mwynefxexlfciatx", model.getDatabases().get(0).getRegion());
        Assertions.assertEquals("mdskjhhxdlajfoxc", model.getDatabases().get(0).getPrivateNetworkUuid());
        Assertions.assertEquals("vslxlh", model.getDatabases().get(0).getTags().get(0));
        Assertions.assertEquals("ac", model.getDatabases().get(0).getMaintenanceWindow().getDay());
        Assertions.assertEquals("u", model.getDatabases().get(0).getMaintenanceWindow().getHour());
    }
}
