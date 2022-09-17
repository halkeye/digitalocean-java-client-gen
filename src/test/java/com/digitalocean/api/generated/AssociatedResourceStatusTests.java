package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AssociatedResourceStatus;
import com.digitalocean.api.models.AssociatedResourceStatusResources;
import com.digitalocean.api.models.DestroyedAssociatedResource;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AssociatedResourceStatusTests {
    @Test
    public void testDeserialize() {
        AssociatedResourceStatus model =
                BinaryData.fromString(
                                "{\"droplet\":{\"id\":\"ofuworimmovzwde\",\"name\":\"kmvhzfo\",\"destroyed_at\":\"2021-06-22T15:32:22Z\",\"error_message\":\"rvaprtgelgwe\"},\"resources\":{\"reserved_ips\":[{\"id\":\"aq\",\"name\":\"dmym\",\"destroyed_at\":\"2021-07-24T03:38:36Z\",\"error_message\":\"j\"},{\"id\":\"ovsfb\",\"name\":\"vzopaxmfmvsm\",\"destroyed_at\":\"2021-05-05T02:31:52Z\",\"error_message\":\"faxdtnqifbsa\"},{\"id\":\"oiauesugmocpcj\",\"name\":\"boel\",\"destroyed_at\":\"2021-01-02T13:26:34Z\",\"error_message\":\"wfldsiuorinik\"},{\"id\":\"dpk\",\"name\":\"iwm\",\"destroyed_at\":\"2021-07-28T17:30:39Z\",\"error_message\":\"rx\"}],\"floating_ips\":[{\"id\":\"vyczyayubt\",\"name\":\"bxiqahragpxmibpl\",\"destroyed_at\":\"2020-12-28T14:21:32Z\",\"error_message\":\"yryefqm\"},{\"id\":\"vyztxlno\",\"name\":\"pbjceegvy\",\"destroyed_at\":\"2021-03-19T02:35:38Z\",\"error_message\":\"kutnjillukkrehy\"},{\"id\":\"mjodu\",\"name\":\"vulxfar\",\"destroyed_at\":\"2021-07-11T09:28:07Z\",\"error_message\":\"lgdezvjqw\"}],\"snapshots\":[{\"id\":\"iyaxqvjweiwt\",\"name\":\"kddn\",\"destroyed_at\":\"2021-04-27T11:59:52Z\",\"error_message\":\"ooq\"},{\"id\":\"dqrxygla\",\"name\":\"scflwtjdtlri\",\"destroyed_at\":\"2021-10-21T06:26:55Z\",\"error_message\":\"y\"}],\"volumes\":[{\"id\":\"dtzcqi\",\"name\":\"dudgcozzomeh\",\"destroyed_at\":\"2021-09-19T11:39:45Z\",\"error_message\":\"tolamlbijuxkq\"},{\"id\":\"czipvwdtgck\",\"name\":\"qiqdlratrkwxoau\",\"destroyed_at\":\"2021-07-29T07:46:01Z\",\"error_message\":\"ykznhrfgslglhp\"}],\"volume_snapshots\":[{\"id\":\"zihuioaeo\",\"name\":\"ajtfey\",\"destroyed_at\":\"2021-11-10T21:04:40Z\",\"error_message\":\"gdd\"},{\"id\":\"hdccxb\",\"name\":\"uqutkzwtjww\",\"destroyed_at\":\"2021-06-11T12:35:16Z\",\"error_message\":\"tijcxfnondegjdy\"},{\"id\":\"qkkkbjuckcatuqbh\",\"name\":\"wcnxtpzdlyseid\",\"destroyed_at\":\"2021-01-09T04:30:08Z\",\"error_message\":\"atprytgrhzbq\"},{\"id\":\"pfaw\",\"name\":\"tvcshtkutzcttb\",\"destroyed_at\":\"2021-08-09T18:30:06Z\",\"error_message\":\"rdammtzj\"}]},\"completed_at\":\"2021-01-26T20:33:34Z\",\"failures\":1534454423}")
                        .toObject(AssociatedResourceStatus.class);
        Assertions.assertEquals("ofuworimmovzwde", model.getDroplet().getId());
        Assertions.assertEquals("kmvhzfo", model.getDroplet().getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-22T15:32:22Z"), model.getDroplet().getDestroyedAt());
        Assertions.assertEquals("rvaprtgelgwe", model.getDroplet().getErrorMessage());
        Assertions.assertEquals("aq", model.getResources().getReservedIps().get(0).getId());
        Assertions.assertEquals("dmym", model.getResources().getReservedIps().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-24T03:38:36Z"),
                model.getResources().getReservedIps().get(0).getDestroyedAt());
        Assertions.assertEquals("j", model.getResources().getReservedIps().get(0).getErrorMessage());
        Assertions.assertEquals("vyczyayubt", model.getResources().getFloatingIps().get(0).getId());
        Assertions.assertEquals("bxiqahragpxmibpl", model.getResources().getFloatingIps().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2020-12-28T14:21:32Z"),
                model.getResources().getFloatingIps().get(0).getDestroyedAt());
        Assertions.assertEquals("yryefqm", model.getResources().getFloatingIps().get(0).getErrorMessage());
        Assertions.assertEquals("iyaxqvjweiwt", model.getResources().getSnapshots().get(0).getId());
        Assertions.assertEquals("kddn", model.getResources().getSnapshots().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-27T11:59:52Z"),
                model.getResources().getSnapshots().get(0).getDestroyedAt());
        Assertions.assertEquals("ooq", model.getResources().getSnapshots().get(0).getErrorMessage());
        Assertions.assertEquals("dtzcqi", model.getResources().getVolumes().get(0).getId());
        Assertions.assertEquals("dudgcozzomeh", model.getResources().getVolumes().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-19T11:39:45Z"),
                model.getResources().getVolumes().get(0).getDestroyedAt());
        Assertions.assertEquals("tolamlbijuxkq", model.getResources().getVolumes().get(0).getErrorMessage());
        Assertions.assertEquals("zihuioaeo", model.getResources().getVolumeSnapshots().get(0).getId());
        Assertions.assertEquals("ajtfey", model.getResources().getVolumeSnapshots().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-11-10T21:04:40Z"),
                model.getResources().getVolumeSnapshots().get(0).getDestroyedAt());
        Assertions.assertEquals("gdd", model.getResources().getVolumeSnapshots().get(0).getErrorMessage());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-26T20:33:34Z"), model.getCompletedAt());
        Assertions.assertEquals(1534454423, model.getFailures());
    }

    @Test
    public void testSerialize() {
        AssociatedResourceStatus model =
                new AssociatedResourceStatus()
                        .setDroplet(
                                new DestroyedAssociatedResource()
                                        .setId("ofuworimmovzwde")
                                        .setName("kmvhzfo")
                                        .setDestroyedAt(OffsetDateTime.parse("2021-06-22T15:32:22Z"))
                                        .setErrorMessage("rvaprtgelgwe"))
                        .setResources(
                                new AssociatedResourceStatusResources()
                                        .setReservedIps(
                                                Arrays.asList(
                                                        new DestroyedAssociatedResource()
                                                                .setId("aq")
                                                                .setName("dmym")
                                                                .setDestroyedAt(
                                                                        OffsetDateTime.parse("2021-07-24T03:38:36Z"))
                                                                .setErrorMessage("j"),
                                                        new DestroyedAssociatedResource()
                                                                .setId("ovsfb")
                                                                .setName("vzopaxmfmvsm")
                                                                .setDestroyedAt(
                                                                        OffsetDateTime.parse("2021-05-05T02:31:52Z"))
                                                                .setErrorMessage("faxdtnqifbsa"),
                                                        new DestroyedAssociatedResource()
                                                                .setId("oiauesugmocpcj")
                                                                .setName("boel")
                                                                .setDestroyedAt(
                                                                        OffsetDateTime.parse("2021-01-02T13:26:34Z"))
                                                                .setErrorMessage("wfldsiuorinik"),
                                                        new DestroyedAssociatedResource()
                                                                .setId("dpk")
                                                                .setName("iwm")
                                                                .setDestroyedAt(
                                                                        OffsetDateTime.parse("2021-07-28T17:30:39Z"))
                                                                .setErrorMessage("rx")))
                                        .setFloatingIps(
                                                Arrays.asList(
                                                        new DestroyedAssociatedResource()
                                                                .setId("vyczyayubt")
                                                                .setName("bxiqahragpxmibpl")
                                                                .setDestroyedAt(
                                                                        OffsetDateTime.parse("2020-12-28T14:21:32Z"))
                                                                .setErrorMessage("yryefqm"),
                                                        new DestroyedAssociatedResource()
                                                                .setId("vyztxlno")
                                                                .setName("pbjceegvy")
                                                                .setDestroyedAt(
                                                                        OffsetDateTime.parse("2021-03-19T02:35:38Z"))
                                                                .setErrorMessage("kutnjillukkrehy"),
                                                        new DestroyedAssociatedResource()
                                                                .setId("mjodu")
                                                                .setName("vulxfar")
                                                                .setDestroyedAt(
                                                                        OffsetDateTime.parse("2021-07-11T09:28:07Z"))
                                                                .setErrorMessage("lgdezvjqw")))
                                        .setSnapshots(
                                                Arrays.asList(
                                                        new DestroyedAssociatedResource()
                                                                .setId("iyaxqvjweiwt")
                                                                .setName("kddn")
                                                                .setDestroyedAt(
                                                                        OffsetDateTime.parse("2021-04-27T11:59:52Z"))
                                                                .setErrorMessage("ooq"),
                                                        new DestroyedAssociatedResource()
                                                                .setId("dqrxygla")
                                                                .setName("scflwtjdtlri")
                                                                .setDestroyedAt(
                                                                        OffsetDateTime.parse("2021-10-21T06:26:55Z"))
                                                                .setErrorMessage("y")))
                                        .setVolumes(
                                                Arrays.asList(
                                                        new DestroyedAssociatedResource()
                                                                .setId("dtzcqi")
                                                                .setName("dudgcozzomeh")
                                                                .setDestroyedAt(
                                                                        OffsetDateTime.parse("2021-09-19T11:39:45Z"))
                                                                .setErrorMessage("tolamlbijuxkq"),
                                                        new DestroyedAssociatedResource()
                                                                .setId("czipvwdtgck")
                                                                .setName("qiqdlratrkwxoau")
                                                                .setDestroyedAt(
                                                                        OffsetDateTime.parse("2021-07-29T07:46:01Z"))
                                                                .setErrorMessage("ykznhrfgslglhp")))
                                        .setVolumeSnapshots(
                                                Arrays.asList(
                                                        new DestroyedAssociatedResource()
                                                                .setId("zihuioaeo")
                                                                .setName("ajtfey")
                                                                .setDestroyedAt(
                                                                        OffsetDateTime.parse("2021-11-10T21:04:40Z"))
                                                                .setErrorMessage("gdd"),
                                                        new DestroyedAssociatedResource()
                                                                .setId("hdccxb")
                                                                .setName("uqutkzwtjww")
                                                                .setDestroyedAt(
                                                                        OffsetDateTime.parse("2021-06-11T12:35:16Z"))
                                                                .setErrorMessage("tijcxfnondegjdy"),
                                                        new DestroyedAssociatedResource()
                                                                .setId("qkkkbjuckcatuqbh")
                                                                .setName("wcnxtpzdlyseid")
                                                                .setDestroyedAt(
                                                                        OffsetDateTime.parse("2021-01-09T04:30:08Z"))
                                                                .setErrorMessage("atprytgrhzbq"),
                                                        new DestroyedAssociatedResource()
                                                                .setId("pfaw")
                                                                .setName("tvcshtkutzcttb")
                                                                .setDestroyedAt(
                                                                        OffsetDateTime.parse("2021-08-09T18:30:06Z"))
                                                                .setErrorMessage("rdammtzj"))))
                        .setCompletedAt(OffsetDateTime.parse("2021-01-26T20:33:34Z"))
                        .setFailures(1534454423);
        model = BinaryData.fromObject(model).toObject(AssociatedResourceStatus.class);
        Assertions.assertEquals("ofuworimmovzwde", model.getDroplet().getId());
        Assertions.assertEquals("kmvhzfo", model.getDroplet().getName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-22T15:32:22Z"), model.getDroplet().getDestroyedAt());
        Assertions.assertEquals("rvaprtgelgwe", model.getDroplet().getErrorMessage());
        Assertions.assertEquals("aq", model.getResources().getReservedIps().get(0).getId());
        Assertions.assertEquals("dmym", model.getResources().getReservedIps().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-24T03:38:36Z"),
                model.getResources().getReservedIps().get(0).getDestroyedAt());
        Assertions.assertEquals("j", model.getResources().getReservedIps().get(0).getErrorMessage());
        Assertions.assertEquals("vyczyayubt", model.getResources().getFloatingIps().get(0).getId());
        Assertions.assertEquals("bxiqahragpxmibpl", model.getResources().getFloatingIps().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2020-12-28T14:21:32Z"),
                model.getResources().getFloatingIps().get(0).getDestroyedAt());
        Assertions.assertEquals("yryefqm", model.getResources().getFloatingIps().get(0).getErrorMessage());
        Assertions.assertEquals("iyaxqvjweiwt", model.getResources().getSnapshots().get(0).getId());
        Assertions.assertEquals("kddn", model.getResources().getSnapshots().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-27T11:59:52Z"),
                model.getResources().getSnapshots().get(0).getDestroyedAt());
        Assertions.assertEquals("ooq", model.getResources().getSnapshots().get(0).getErrorMessage());
        Assertions.assertEquals("dtzcqi", model.getResources().getVolumes().get(0).getId());
        Assertions.assertEquals("dudgcozzomeh", model.getResources().getVolumes().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-19T11:39:45Z"),
                model.getResources().getVolumes().get(0).getDestroyedAt());
        Assertions.assertEquals("tolamlbijuxkq", model.getResources().getVolumes().get(0).getErrorMessage());
        Assertions.assertEquals("zihuioaeo", model.getResources().getVolumeSnapshots().get(0).getId());
        Assertions.assertEquals("ajtfey", model.getResources().getVolumeSnapshots().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-11-10T21:04:40Z"),
                model.getResources().getVolumeSnapshots().get(0).getDestroyedAt());
        Assertions.assertEquals("gdd", model.getResources().getVolumeSnapshots().get(0).getErrorMessage());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-26T20:33:34Z"), model.getCompletedAt());
        Assertions.assertEquals(1534454423, model.getFailures());
    }
}
