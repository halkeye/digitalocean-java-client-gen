package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AssociatedResource;
import com.digitalocean.api.models.ComponentsWqokeaResponsesAssociatedResourcesListContentApplicationJsonSchema;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsWqokeaResponsesAssociatedResourcesListContentApplicationJsonSchemaTests {
    @Test
    public void testDeserialize() {
        ComponentsWqokeaResponsesAssociatedResourcesListContentApplicationJsonSchema model =
                BinaryData.fromString(
                                "{\"reserved_ips\":[{\"id\":\"oeysfp\",\"name\":\"mtwuuh\",\"cost\":\"egnkwmnfeubtzjy\"},{\"id\":\"wfugiph\",\"name\":\"kuumnqdurhzzfo\",\"cost\":\"eoq\"}],\"floating_ips\":[{\"id\":\"lujopwnibittozt\",\"name\":\"qumqvfmwcaddt\",\"cost\":\"txegtvgwyurbelfn\"},{\"id\":\"ryizwbxgde\",\"name\":\"layunomirhpfabe\",\"cost\":\"lamwmgewa\"},{\"id\":\"f\",\"name\":\"bcpjstbhem\",\"cost\":\"u\"}],\"snapshots\":[{\"id\":\"nxfbx\",\"name\":\"eapdrbzyv\",\"cost\":\"uadulpodkaxpfo\"},{\"id\":\"zh\",\"name\":\"jdqltdeluqro\",\"cost\":\"dhfztlra\"},{\"id\":\"rkgzkyhudbkuw\",\"name\":\"qxlcweakfecjvx\",\"cost\":\"qufqizj\"},{\"id\":\"pwooajeyyj\",\"name\":\"jxizxp\",\"cost\":\"nzlslekc\"}],\"volumes\":[{\"id\":\"kj\",\"name\":\"qpdwad\",\"cost\":\"hz\"}],\"volume_snapshots\":[{\"id\":\"vczdjiahuqymjzu\",\"name\":\"wmejjqhd\",\"cost\":\"vmqxi\"},{\"id\":\"okyfoz\",\"name\":\"nzxbyp\",\"cost\":\"pgaixwrgrkkderf\"}]}")
                        .toObject(ComponentsWqokeaResponsesAssociatedResourcesListContentApplicationJsonSchema.class);
        Assertions.assertEquals("oeysfp", model.getReservedIps().get(0).getId());
        Assertions.assertEquals("mtwuuh", model.getReservedIps().get(0).getName());
        Assertions.assertEquals("egnkwmnfeubtzjy", model.getReservedIps().get(0).getCost());
        Assertions.assertEquals("lujopwnibittozt", model.getFloatingIps().get(0).getId());
        Assertions.assertEquals("qumqvfmwcaddt", model.getFloatingIps().get(0).getName());
        Assertions.assertEquals("txegtvgwyurbelfn", model.getFloatingIps().get(0).getCost());
        Assertions.assertEquals("nxfbx", model.getSnapshots().get(0).getId());
        Assertions.assertEquals("eapdrbzyv", model.getSnapshots().get(0).getName());
        Assertions.assertEquals("uadulpodkaxpfo", model.getSnapshots().get(0).getCost());
        Assertions.assertEquals("kj", model.getVolumes().get(0).getId());
        Assertions.assertEquals("qpdwad", model.getVolumes().get(0).getName());
        Assertions.assertEquals("hz", model.getVolumes().get(0).getCost());
        Assertions.assertEquals("vczdjiahuqymjzu", model.getVolumeSnapshots().get(0).getId());
        Assertions.assertEquals("wmejjqhd", model.getVolumeSnapshots().get(0).getName());
        Assertions.assertEquals("vmqxi", model.getVolumeSnapshots().get(0).getCost());
    }

    @Test
    public void testSerialize() {
        ComponentsWqokeaResponsesAssociatedResourcesListContentApplicationJsonSchema model =
                new ComponentsWqokeaResponsesAssociatedResourcesListContentApplicationJsonSchema()
                        .setReservedIps(
                                Arrays.asList(
                                        new AssociatedResource()
                                                .setId("oeysfp")
                                                .setName("mtwuuh")
                                                .setCost("egnkwmnfeubtzjy"),
                                        new AssociatedResource()
                                                .setId("wfugiph")
                                                .setName("kuumnqdurhzzfo")
                                                .setCost("eoq")))
                        .setFloatingIps(
                                Arrays.asList(
                                        new AssociatedResource()
                                                .setId("lujopwnibittozt")
                                                .setName("qumqvfmwcaddt")
                                                .setCost("txegtvgwyurbelfn"),
                                        new AssociatedResource()
                                                .setId("ryizwbxgde")
                                                .setName("layunomirhpfabe")
                                                .setCost("lamwmgewa"),
                                        new AssociatedResource().setId("f").setName("bcpjstbhem").setCost("u")))
                        .setSnapshots(
                                Arrays.asList(
                                        new AssociatedResource()
                                                .setId("nxfbx")
                                                .setName("eapdrbzyv")
                                                .setCost("uadulpodkaxpfo"),
                                        new AssociatedResource()
                                                .setId("zh")
                                                .setName("jdqltdeluqro")
                                                .setCost("dhfztlra"),
                                        new AssociatedResource()
                                                .setId("rkgzkyhudbkuw")
                                                .setName("qxlcweakfecjvx")
                                                .setCost("qufqizj"),
                                        new AssociatedResource()
                                                .setId("pwooajeyyj")
                                                .setName("jxizxp")
                                                .setCost("nzlslekc")))
                        .setVolumes(Arrays.asList(new AssociatedResource().setId("kj").setName("qpdwad").setCost("hz")))
                        .setVolumeSnapshots(
                                Arrays.asList(
                                        new AssociatedResource()
                                                .setId("vczdjiahuqymjzu")
                                                .setName("wmejjqhd")
                                                .setCost("vmqxi"),
                                        new AssociatedResource()
                                                .setId("okyfoz")
                                                .setName("nzxbyp")
                                                .setCost("pgaixwrgrkkderf")));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsWqokeaResponsesAssociatedResourcesListContentApplicationJsonSchema.class);
        Assertions.assertEquals("oeysfp", model.getReservedIps().get(0).getId());
        Assertions.assertEquals("mtwuuh", model.getReservedIps().get(0).getName());
        Assertions.assertEquals("egnkwmnfeubtzjy", model.getReservedIps().get(0).getCost());
        Assertions.assertEquals("lujopwnibittozt", model.getFloatingIps().get(0).getId());
        Assertions.assertEquals("qumqvfmwcaddt", model.getFloatingIps().get(0).getName());
        Assertions.assertEquals("txegtvgwyurbelfn", model.getFloatingIps().get(0).getCost());
        Assertions.assertEquals("nxfbx", model.getSnapshots().get(0).getId());
        Assertions.assertEquals("eapdrbzyv", model.getSnapshots().get(0).getName());
        Assertions.assertEquals("uadulpodkaxpfo", model.getSnapshots().get(0).getCost());
        Assertions.assertEquals("kj", model.getVolumes().get(0).getId());
        Assertions.assertEquals("qpdwad", model.getVolumes().get(0).getName());
        Assertions.assertEquals("hz", model.getVolumes().get(0).getCost());
        Assertions.assertEquals("vczdjiahuqymjzu", model.getVolumeSnapshots().get(0).getId());
        Assertions.assertEquals("wmejjqhd", model.getVolumeSnapshots().get(0).getName());
        Assertions.assertEquals("vmqxi", model.getVolumeSnapshots().get(0).getCost());
    }
}
