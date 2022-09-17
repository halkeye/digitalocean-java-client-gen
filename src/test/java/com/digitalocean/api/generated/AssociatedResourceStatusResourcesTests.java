package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AssociatedResourceStatusResources;
import com.digitalocean.api.models.DestroyedAssociatedResource;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AssociatedResourceStatusResourcesTests {
    @Test
    public void testDeserialize() {
        AssociatedResourceStatusResources model =
                BinaryData.fromString(
                                "{\"reserved_ips\":[{\"id\":\"vmdmzenlr\",\"name\":\"gfc\",\"destroyed_at\":\"2021-02-10T10:42:45Z\",\"error_message\":\"n\"},{\"id\":\"dtjva\",\"name\":\"yznm\",\"destroyed_at\":\"2021-11-14T08:40:08Z\",\"error_message\":\"ogcvucgytoxuwht\"},{\"id\":\"zqsa\",\"name\":\"ebg\",\"destroyed_at\":\"2021-05-13T16:02:37Z\",\"error_message\":\"usdekpd\"},{\"id\":\"mssgpgvokyejidbd\",\"name\":\"squnycwztlv\",\"destroyed_at\":\"2021-11-24T09:41Z\",\"error_message\":\"mrkkyjtr\"}],\"floating_ips\":[{\"id\":\"wfkcauxuvavcpf\",\"name\":\"ofuckc\",\"destroyed_at\":\"2021-10-08T02:43:01Z\",\"error_message\":\"luevsolzwilfng\"},{\"id\":\"fsqebuuxjxhfxf\",\"name\":\"pdkktpmbmxbmbr\",\"destroyed_at\":\"2021-10-31T23:33:56Z\",\"error_message\":\"xljbkhxsd\"},{\"id\":\"au\",\"name\":\"dmhweqjfyxydgto\",\"destroyed_at\":\"2021-04-22T19:52:59Z\",\"error_message\":\"vwglgwzpv\"}],\"snapshots\":[{\"id\":\"lhpses\",\"name\":\"gamqiydvxcgdhy\",\"destroyed_at\":\"2021-05-28T03:42:04Z\",\"error_message\":\"gs\"},{\"id\":\"q\",\"name\":\"yjrcbqpb\",\"destroyed_at\":\"2021-07-05T20:11:08Z\",\"error_message\":\"lqjoxtda\"},{\"id\":\"eaoo\",\"name\":\"yjz\",\"destroyed_at\":\"2021-10-19T08:20:18Z\",\"error_message\":\"wjlofzekfsrm\"}],\"volumes\":[{\"id\":\"ajvcfoczhapej\",\"name\":\"tkwxnhwhhnoyrzaa\",\"destroyed_at\":\"2021-07-04T10:30:12Z\",\"error_message\":\"pmjen\"},{\"id\":\"eat\",\"name\":\"xxcrxoxdjxld\",\"destroyed_at\":\"2021-08-11T15:06:52Z\",\"error_message\":\"yi\"},{\"id\":\"kd\",\"name\":\"rndwdbvxvzaled\",\"destroyed_at\":\"2020-12-25T13:58:52Z\",\"error_message\":\"lunkf\"}],\"volume_snapshots\":[{\"id\":\"xqqxmyzkla\",\"name\":\"n\",\"destroyed_at\":\"2021-04-06T07:53:10Z\",\"error_message\":\"vmzrq\"},{\"id\":\"zadi\",\"name\":\"nllaslkskh\",\"destroyed_at\":\"2021-06-25T07:20:26Z\",\"error_message\":\"vbaihxjt\"},{\"id\":\"gtaiywbq\",\"name\":\"oig\",\"destroyed_at\":\"2021-03-08T03:03:38Z\",\"error_message\":\"gsaenw\"},{\"id\":\"fmhl\",\"name\":\"lxspmrjct\",\"destroyed_at\":\"2021-11-03T18:45:02Z\",\"error_message\":\"sxe\"}]}")
                        .toObject(AssociatedResourceStatusResources.class);
        Assertions.assertEquals("vmdmzenlr", model.getReservedIps().get(0).getId());
        Assertions.assertEquals("gfc", model.getReservedIps().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-02-10T10:42:45Z"), model.getReservedIps().get(0).getDestroyedAt());
        Assertions.assertEquals("n", model.getReservedIps().get(0).getErrorMessage());
        Assertions.assertEquals("wfkcauxuvavcpf", model.getFloatingIps().get(0).getId());
        Assertions.assertEquals("ofuckc", model.getFloatingIps().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-08T02:43:01Z"), model.getFloatingIps().get(0).getDestroyedAt());
        Assertions.assertEquals("luevsolzwilfng", model.getFloatingIps().get(0).getErrorMessage());
        Assertions.assertEquals("lhpses", model.getSnapshots().get(0).getId());
        Assertions.assertEquals("gamqiydvxcgdhy", model.getSnapshots().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-28T03:42:04Z"), model.getSnapshots().get(0).getDestroyedAt());
        Assertions.assertEquals("gs", model.getSnapshots().get(0).getErrorMessage());
        Assertions.assertEquals("ajvcfoczhapej", model.getVolumes().get(0).getId());
        Assertions.assertEquals("tkwxnhwhhnoyrzaa", model.getVolumes().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-04T10:30:12Z"), model.getVolumes().get(0).getDestroyedAt());
        Assertions.assertEquals("pmjen", model.getVolumes().get(0).getErrorMessage());
        Assertions.assertEquals("xqqxmyzkla", model.getVolumeSnapshots().get(0).getId());
        Assertions.assertEquals("n", model.getVolumeSnapshots().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-06T07:53:10Z"), model.getVolumeSnapshots().get(0).getDestroyedAt());
        Assertions.assertEquals("vmzrq", model.getVolumeSnapshots().get(0).getErrorMessage());
    }

    @Test
    public void testSerialize() {
        AssociatedResourceStatusResources model =
                new AssociatedResourceStatusResources()
                        .setReservedIps(
                                Arrays.asList(
                                        new DestroyedAssociatedResource()
                                                .setId("vmdmzenlr")
                                                .setName("gfc")
                                                .setDestroyedAt(OffsetDateTime.parse("2021-02-10T10:42:45Z"))
                                                .setErrorMessage("n"),
                                        new DestroyedAssociatedResource()
                                                .setId("dtjva")
                                                .setName("yznm")
                                                .setDestroyedAt(OffsetDateTime.parse("2021-11-14T08:40:08Z"))
                                                .setErrorMessage("ogcvucgytoxuwht"),
                                        new DestroyedAssociatedResource()
                                                .setId("zqsa")
                                                .setName("ebg")
                                                .setDestroyedAt(OffsetDateTime.parse("2021-05-13T16:02:37Z"))
                                                .setErrorMessage("usdekpd"),
                                        new DestroyedAssociatedResource()
                                                .setId("mssgpgvokyejidbd")
                                                .setName("squnycwztlv")
                                                .setDestroyedAt(OffsetDateTime.parse("2021-11-24T09:41Z"))
                                                .setErrorMessage("mrkkyjtr")))
                        .setFloatingIps(
                                Arrays.asList(
                                        new DestroyedAssociatedResource()
                                                .setId("wfkcauxuvavcpf")
                                                .setName("ofuckc")
                                                .setDestroyedAt(OffsetDateTime.parse("2021-10-08T02:43:01Z"))
                                                .setErrorMessage("luevsolzwilfng"),
                                        new DestroyedAssociatedResource()
                                                .setId("fsqebuuxjxhfxf")
                                                .setName("pdkktpmbmxbmbr")
                                                .setDestroyedAt(OffsetDateTime.parse("2021-10-31T23:33:56Z"))
                                                .setErrorMessage("xljbkhxsd"),
                                        new DestroyedAssociatedResource()
                                                .setId("au")
                                                .setName("dmhweqjfyxydgto")
                                                .setDestroyedAt(OffsetDateTime.parse("2021-04-22T19:52:59Z"))
                                                .setErrorMessage("vwglgwzpv")))
                        .setSnapshots(
                                Arrays.asList(
                                        new DestroyedAssociatedResource()
                                                .setId("lhpses")
                                                .setName("gamqiydvxcgdhy")
                                                .setDestroyedAt(OffsetDateTime.parse("2021-05-28T03:42:04Z"))
                                                .setErrorMessage("gs"),
                                        new DestroyedAssociatedResource()
                                                .setId("q")
                                                .setName("yjrcbqpb")
                                                .setDestroyedAt(OffsetDateTime.parse("2021-07-05T20:11:08Z"))
                                                .setErrorMessage("lqjoxtda"),
                                        new DestroyedAssociatedResource()
                                                .setId("eaoo")
                                                .setName("yjz")
                                                .setDestroyedAt(OffsetDateTime.parse("2021-10-19T08:20:18Z"))
                                                .setErrorMessage("wjlofzekfsrm")))
                        .setVolumes(
                                Arrays.asList(
                                        new DestroyedAssociatedResource()
                                                .setId("ajvcfoczhapej")
                                                .setName("tkwxnhwhhnoyrzaa")
                                                .setDestroyedAt(OffsetDateTime.parse("2021-07-04T10:30:12Z"))
                                                .setErrorMessage("pmjen"),
                                        new DestroyedAssociatedResource()
                                                .setId("eat")
                                                .setName("xxcrxoxdjxld")
                                                .setDestroyedAt(OffsetDateTime.parse("2021-08-11T15:06:52Z"))
                                                .setErrorMessage("yi"),
                                        new DestroyedAssociatedResource()
                                                .setId("kd")
                                                .setName("rndwdbvxvzaled")
                                                .setDestroyedAt(OffsetDateTime.parse("2020-12-25T13:58:52Z"))
                                                .setErrorMessage("lunkf")))
                        .setVolumeSnapshots(
                                Arrays.asList(
                                        new DestroyedAssociatedResource()
                                                .setId("xqqxmyzkla")
                                                .setName("n")
                                                .setDestroyedAt(OffsetDateTime.parse("2021-04-06T07:53:10Z"))
                                                .setErrorMessage("vmzrq"),
                                        new DestroyedAssociatedResource()
                                                .setId("zadi")
                                                .setName("nllaslkskh")
                                                .setDestroyedAt(OffsetDateTime.parse("2021-06-25T07:20:26Z"))
                                                .setErrorMessage("vbaihxjt"),
                                        new DestroyedAssociatedResource()
                                                .setId("gtaiywbq")
                                                .setName("oig")
                                                .setDestroyedAt(OffsetDateTime.parse("2021-03-08T03:03:38Z"))
                                                .setErrorMessage("gsaenw"),
                                        new DestroyedAssociatedResource()
                                                .setId("fmhl")
                                                .setName("lxspmrjct")
                                                .setDestroyedAt(OffsetDateTime.parse("2021-11-03T18:45:02Z"))
                                                .setErrorMessage("sxe")));
        model = BinaryData.fromObject(model).toObject(AssociatedResourceStatusResources.class);
        Assertions.assertEquals("vmdmzenlr", model.getReservedIps().get(0).getId());
        Assertions.assertEquals("gfc", model.getReservedIps().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-02-10T10:42:45Z"), model.getReservedIps().get(0).getDestroyedAt());
        Assertions.assertEquals("n", model.getReservedIps().get(0).getErrorMessage());
        Assertions.assertEquals("wfkcauxuvavcpf", model.getFloatingIps().get(0).getId());
        Assertions.assertEquals("ofuckc", model.getFloatingIps().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-08T02:43:01Z"), model.getFloatingIps().get(0).getDestroyedAt());
        Assertions.assertEquals("luevsolzwilfng", model.getFloatingIps().get(0).getErrorMessage());
        Assertions.assertEquals("lhpses", model.getSnapshots().get(0).getId());
        Assertions.assertEquals("gamqiydvxcgdhy", model.getSnapshots().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-28T03:42:04Z"), model.getSnapshots().get(0).getDestroyedAt());
        Assertions.assertEquals("gs", model.getSnapshots().get(0).getErrorMessage());
        Assertions.assertEquals("ajvcfoczhapej", model.getVolumes().get(0).getId());
        Assertions.assertEquals("tkwxnhwhhnoyrzaa", model.getVolumes().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-04T10:30:12Z"), model.getVolumes().get(0).getDestroyedAt());
        Assertions.assertEquals("pmjen", model.getVolumes().get(0).getErrorMessage());
        Assertions.assertEquals("xqqxmyzkla", model.getVolumeSnapshots().get(0).getId());
        Assertions.assertEquals("n", model.getVolumeSnapshots().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-06T07:53:10Z"), model.getVolumeSnapshots().get(0).getDestroyedAt());
        Assertions.assertEquals("vmzrq", model.getVolumeSnapshots().get(0).getErrorMessage());
    }
}
