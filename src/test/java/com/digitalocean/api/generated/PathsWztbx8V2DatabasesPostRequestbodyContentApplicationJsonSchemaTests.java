package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.DatabaseBackup;
import com.digitalocean.api.models.DatabaseCluster;
import com.digitalocean.api.models.DatabaseClusterConnection;
import com.digitalocean.api.models.DatabaseClusterEngine;
import com.digitalocean.api.models.DatabaseClusterMaintenanceWindow;
import com.digitalocean.api.models.DatabaseClusterPrivateConnection;
import com.digitalocean.api.models.FirewallRule;
import com.digitalocean.api.models.FirewallRuleType;
import com.digitalocean.api.models.PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema model = BinaryData.fromString("{\"backup_restore\":{\"database_name\":\"sidsjtd\",\"backup_created_at\":\"2021-03-26T15:19:11Z\"},\"name\":\"injgazlsvbzfcpuo\",\"engine\":\"pg\",\"version\":\"wjcciklhsy\",\"num_nodes\":1148982233,\"size\":\"rdrenxo\",\"region\":\"riyehqbeivdlhy\",\"status\":\"online\",\"created_at\":\"2021-02-10T21:50:01Z\",\"private_network_uuid\":\"grlpuny\",\"tags\":[\"k\",\"smmpathubt\"],\"db_names\":[\"e\",\"niiwllbvgwz\"],\"connection\":{\"uri\":\"tedousnktjtgrava\",\"database\":\"gfkbebauzlqbtxx\",\"host\":\"f\",\"port\":133737711,\"user\":\"udrtpzkgme\",\"password\":\"ywhczzq\",\"ssl\":false},\"private_connection\":{\"uri\":\"qbedygisrzwn\",\"database\":\"d\",\"host\":\"jch\",\"port\":382282430,\"user\":\"wctofldseacdhz\",\"password\":\"kbrfgdrwji\",\"ssl\":true},\"users\":[{\"name\":\"jsrwqrxetf\",\"role\":\"primary\",\"password\":\"rrmdqntycna\",\"mysql_settings\":{\"auth_plugin\":\"caching_sha2_password\"}}],\"maintenance_window\":{\"day\":\"maxgnuyeamcmhudf\",\"hour\":\"ecehokw\",\"pending\":false,\"description\":[\"loesqrggvr\",\"nyrukoil\",\"ciduwjle\",\"pjlh\"]},\"rules\":[{\"uuid\":\"ruzythqkkwhbg\",\"cluster_uuid\":\"ellv\",\"type\":\"tag\",\"value\":\"nxdmnitmujdtv\",\"created_at\":\"2021-03-25T10:50:22Z\"}]}").toObject(PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals("injgazlsvbzfcpuo", model.getName());
        Assertions.assertEquals(DatabaseClusterEngine.PG, model.getEngine());
        Assertions.assertEquals("wjcciklhsy", model.getVersion());
        Assertions.assertEquals(1148982233, model.getNumNodes());
        Assertions.assertEquals("rdrenxo", model.getSize());
        Assertions.assertEquals("riyehqbeivdlhy", model.getRegion());
        Assertions.assertEquals("grlpuny", model.getPrivateNetworkUuid());
        Assertions.assertEquals("k", model.getTags().get(0));
        Assertions.assertEquals("maxgnuyeamcmhudf", model.getMaintenanceWindow().getDay());
        Assertions.assertEquals("ecehokw", model.getMaintenanceWindow().getHour());
        Assertions.assertEquals("ruzythqkkwhbg", model.getRules().get(0).getUuid());
        Assertions.assertEquals("ellv", model.getRules().get(0).getClusterUuid());
        Assertions.assertEquals(FirewallRuleType.TAG, model.getRules().get(0).getType());
        Assertions.assertEquals("nxdmnitmujdtv", model.getRules().get(0).getValue());
        Assertions.assertEquals("sidsjtd", model.getBackupRestore().getDatabaseName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-26T15:19:11Z"), model.getBackupRestore().getBackupCreatedAt());
    }

    @Test
    public void testSerialize() {
        PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema model = new PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema().setName("injgazlsvbzfcpuo").setEngine(DatabaseClusterEngine.PG).setVersion("wjcciklhsy").setNumNodes(1148982233).setSize("rdrenxo").setRegion("riyehqbeivdlhy").setPrivateNetworkUuid("grlpuny").setTags(Arrays.asList("k", "smmpathubt")).setConnection(new DatabaseClusterConnection()).setPrivateConnection(new DatabaseClusterPrivateConnection()).setMaintenanceWindow(new DatabaseClusterMaintenanceWindow().setDay("maxgnuyeamcmhudf").setHour("ecehokw")).setRules(Arrays.asList(new FirewallRule().setUuid("ruzythqkkwhbg").setClusterUuid("ellv").setType(FirewallRuleType.TAG).setValue("nxdmnitmujdtv"))).setBackupRestore(new DatabaseBackup().setDatabaseName("sidsjtd").setBackupCreatedAt(OffsetDateTime.parse("2021-03-26T15:19:11Z")));
        model = BinaryData.fromObject(model).toObject(PathsWztbx8V2DatabasesPostRequestbodyContentApplicationJsonSchema.class);
        Assertions.assertEquals("injgazlsvbzfcpuo", model.getName());
        Assertions.assertEquals(DatabaseClusterEngine.PG, model.getEngine());
        Assertions.assertEquals("wjcciklhsy", model.getVersion());
        Assertions.assertEquals(1148982233, model.getNumNodes());
        Assertions.assertEquals("rdrenxo", model.getSize());
        Assertions.assertEquals("riyehqbeivdlhy", model.getRegion());
        Assertions.assertEquals("grlpuny", model.getPrivateNetworkUuid());
        Assertions.assertEquals("k", model.getTags().get(0));
        Assertions.assertEquals("maxgnuyeamcmhudf", model.getMaintenanceWindow().getDay());
        Assertions.assertEquals("ecehokw", model.getMaintenanceWindow().getHour());
        Assertions.assertEquals("ruzythqkkwhbg", model.getRules().get(0).getUuid());
        Assertions.assertEquals("ellv", model.getRules().get(0).getClusterUuid());
        Assertions.assertEquals(FirewallRuleType.TAG, model.getRules().get(0).getType());
        Assertions.assertEquals("nxdmnitmujdtv", model.getRules().get(0).getValue());
        Assertions.assertEquals("sidsjtd", model.getBackupRestore().getDatabaseName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-26T15:19:11Z"), model.getBackupRestore().getBackupCreatedAt());
    }
}
