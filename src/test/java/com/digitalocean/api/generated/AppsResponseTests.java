package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.App;
import com.digitalocean.api.models.AppPinnedDeployment;
import com.digitalocean.api.models.AppSpec;
import com.digitalocean.api.models.AppSpecRegion;
import com.digitalocean.api.models.AppsDeployment;
import com.digitalocean.api.models.AppsDeploymentPhase;
import com.digitalocean.api.models.AppsRegion;
import com.digitalocean.api.models.AppsResponse;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsResponseTests {
    @Test
    public void testDeserialize() {
        AppsResponse model =
                BinaryData.fromString(
                                "{\"apps\":[{\"active_deployment\":{\"cause\":\"kbasyypn\",\"cloned_from\":\"hsgcbacphejkot\",\"created_at\":\"2021-05-11T13:05:51Z\",\"id\":\"oulzndlikwyq\",\"jobs\":[],\"functions\":[],\"phase\":\"DEPLOYING\",\"phase_last_updated_at\":\"2021-12-05T16:09:15Z\",\"services\":[],\"static_sites\":[],\"tier_slug\":\"eqsrxybzqqedqyt\",\"updated_at\":\"2021-07-02T01:03:40Z\",\"workers\":[]},\"created_at\":\"2021-07-23T02:13:33Z\",\"default_ingress\":\"flmmnk\",\"domains\":[],\"id\":\"dmgloug\",\"in_progress_deployment\":{\"cause\":\"wtmutduq\",\"cloned_from\":\"ap\",\"created_at\":\"2021-10-12T00:21:31Z\",\"id\":\"cuertu\",\"jobs\":[],\"functions\":[],\"phase\":\"SUPERSEDED\",\"phase_last_updated_at\":\"2021-06-08T21:13:45Z\",\"services\":[],\"static_sites\":[],\"tier_slug\":\"gbbjfddgmbmbe\",\"updated_at\":\"2021-10-01T04:14:33Z\",\"workers\":[]},\"last_deployment_created_at\":\"2021-04-11T05:58:57Z\",\"live_domain\":\"qrolfpf\",\"live_url\":\"algbquxigjyjg\",\"live_url_base\":\"aoyfhrtxilnerkuj\",\"owner_uuid\":\"vlejuvfqa\",\"region\":{\"continent\":\"yxwjkcp\",\"data_centers\":[],\"default\":false,\"disabled\":false,\"flag\":\"jvtbvpyss\",\"label\":\"nruj\",\"reason\":\"uhmuouqfprwzwbn\",\"slug\":\"itnwuizgazxufi\"},\"spec\":{\"name\":\"uckyf\",\"region\":\"nyc\",\"domains\":[],\"services\":[],\"static_sites\":[],\"jobs\":[],\"workers\":[],\"functions\":[],\"databases\":[]},\"tier_slug\":\"zuhtymwisdkfthwx\",\"updated_at\":\"2021-12-09T20:21:41Z\",\"pinned_deployment\":{\"cause\":\"waopvkmijcmmxd\",\"cloned_from\":\"fufsrpymzi\",\"created_at\":\"2021-08-05T10:27:23Z\",\"id\":\"zcxtbzsgfyccsn\",\"jobs\":[],\"functions\":[],\"phase\":\"PENDING_DEPLOY\",\"phase_last_updated_at\":\"2021-01-08T04:58:25Z\",\"services\":[],\"static_sites\":[],\"tier_slug\":\"boo\",\"updated_at\":\"2021-07-31T08:54:57Z\",\"workers\":[]}},{\"active_deployment\":{\"cause\":\"sfqpteehz\",\"cloned_from\":\"ypyqrimzinp\",\"created_at\":\"2021-01-25T11:13:44Z\",\"id\":\"dkirsoodqxhcr\",\"jobs\":[],\"functions\":[],\"phase\":\"CANCELED\",\"phase_last_updated_at\":\"2021-01-19T09:55:19Z\",\"services\":[],\"static_sites\":[],\"tier_slug\":\"oifiyipjxsqwpgr\",\"updated_at\":\"2021-03-31T15:02:13Z\",\"workers\":[]},\"created_at\":\"2021-01-10T20:57:48Z\",\"default_ingress\":\"jxvsnbyxqabn\",\"domains\":[],\"id\":\"cyshurzafbljjgp\",\"in_progress_deployment\":{\"cause\":\"qcjm\",\"cloned_from\":\"javbqidtqajz\",\"created_at\":\"2021-10-05T17:16:42Z\",\"id\":\"kudjkrlkhb\",\"jobs\":[],\"functions\":[],\"phase\":\"ERROR\",\"phase_last_updated_at\":\"2021-06-07T23:39:04Z\",\"services\":[],\"static_sites\":[],\"tier_slug\":\"locx\",\"updated_at\":\"2021-09-10T14:15:58Z\",\"workers\":[]},\"last_deployment_created_at\":\"2021-01-30T19:49:48Z\",\"live_domain\":\"hhbcsglummajtjao\",\"live_url\":\"obnbdxkqpxokaj\",\"live_url_base\":\"npime\",\"owner_uuid\":\"stxgc\",\"region\":{\"continent\":\"gmaajrm\",\"data_centers\":[],\"default\":true,\"disabled\":true,\"flag\":\"ovmclwhijcoejct\",\"label\":\"aqsqsycbkbfk\",\"reason\":\"kdkexxp\",\"slug\":\"fmxa\"},\"spec\":{\"name\":\"c\",\"region\":\"ams\",\"domains\":[],\"services\":[],\"static_sites\":[],\"jobs\":[],\"workers\":[],\"functions\":[],\"databases\":[]},\"tier_slug\":\"xhvpmoue\",\"updated_at\":\"2021-06-30T20:07:19Z\",\"pinned_deployment\":{\"cause\":\"i\",\"cloned_from\":\"eojnxqbzvddn\",\"created_at\":\"2021-06-13T14:44:36Z\",\"id\":\"eic\",\"jobs\":[],\"functions\":[],\"phase\":\"ACTIVE\",\"phase_last_updated_at\":\"2021-05-19T05:05:09Z\",\"services\":[],\"static_sites\":[],\"tier_slug\":\"rhcffcydd\",\"updated_at\":\"2021-02-12T03:02:37Z\",\"workers\":[]}},{\"active_deployment\":{\"cause\":\"jqkwpyeicx\",\"cloned_from\":\"ciwqvhk\",\"created_at\":\"2021-01-03T15:56:28Z\",\"id\":\"igdtopbob\",\"jobs\":[],\"functions\":[],\"phase\":\"BUILDING\",\"phase_last_updated_at\":\"2021-04-17T11:58:30Z\",\"services\":[],\"static_sites\":[],\"tier_slug\":\"hrzayvvtpgvdf\",\"updated_at\":\"2021-06-28T04:08:22Z\",\"workers\":[]},\"created_at\":\"2021-02-01T05:17:40Z\",\"default_ingress\":\"utqxlngx\",\"domains\":[],\"id\":\"ugnxkrxdqmi\",\"in_progress_deployment\":{\"cause\":\"hzrvqd\",\"cloned_from\":\"bhj\",\"created_at\":\"2021-09-14T02:51:19Z\",\"id\":\"ehoqfbowskan\",\"jobs\":[],\"functions\":[],\"phase\":\"CANCELED\",\"phase_last_updated_at\":\"2021-08-28T08:23:16Z\",\"services\":[],\"static_sites\":[],\"tier_slug\":\"ywgndrv\",\"updated_at\":\"2021-03-27T22:11:53Z\",\"workers\":[]},\"last_deployment_created_at\":\"2021-05-17T00:23:41Z\",\"live_domain\":\"rcgyn\",\"live_url\":\"cpecfvmmcoofs\",\"live_url_base\":\"zevgb\",\"owner_uuid\":\"jqabcypmivkwlzuv\",\"region\":{\"continent\":\"wnfnbacf\",\"data_centers\":[],\"default\":false,\"disabled\":true,\"flag\":\"etqgtzxdpnq\",\"label\":\"qwxrjfeallnw\",\"reason\":\"bisnja\",\"slug\":\"mngnzscxaqw\"},\"spec\":{\"name\":\"ochcbonqvpkvl\",\"region\":\"fra\",\"domains\":[],\"services\":[],\"static_sites\":[],\"jobs\":[],\"workers\":[],\"functions\":[],\"databases\":[]},\"tier_slug\":\"eo\",\"updated_at\":\"2021-11-21T02:07:23Z\",\"pinned_deployment\":{\"cause\":\"yyien\",\"cloned_from\":\"dlwtgrhpdj\",\"created_at\":\"2021-05-17T12:08:11Z\",\"id\":\"asxazjpqyegualhb\",\"jobs\":[],\"functions\":[],\"phase\":\"PENDING_BUILD\",\"phase_last_updated_at\":\"2021-12-09T19:14:49Z\",\"services\":[],\"static_sites\":[],\"tier_slug\":\"gwdslfhotwm\",\"updated_at\":\"2021-03-06T02:52:56Z\",\"workers\":[]}},{\"active_deployment\":{\"cause\":\"bjnpg\",\"cloned_from\":\"ftadehxnltyfs\",\"created_at\":\"2021-10-02T19:16:03Z\",\"id\":\"suesnzw\",\"jobs\":[],\"functions\":[],\"phase\":\"PENDING_BUILD\",\"phase_last_updated_at\":\"2021-06-10T08:32:31Z\",\"services\":[],\"static_sites\":[],\"tier_slug\":\"ohctbqvudwx\",\"updated_at\":\"2021-03-23T22:55:01Z\",\"workers\":[]},\"created_at\":\"2021-04-03T23:08:08Z\",\"default_ingress\":\"ujjugwdkcglh\",\"domains\":[],\"id\":\"jdyggdtji\",\"in_progress_deployment\":{\"cause\":\"kuofqweykhme\",\"cloned_from\":\"vfyexfw\",\"created_at\":\"2021-04-10T19:11:58Z\",\"id\":\"i\",\"jobs\":[],\"functions\":[],\"phase\":\"PENDING_DEPLOY\",\"phase_last_updated_at\":\"2021-12-10T22:53:58Z\",\"services\":[],\"static_sites\":[],\"tier_slug\":\"aamdect\",\"updated_at\":\"2021-04-21T17:36:37Z\",\"workers\":[]},\"last_deployment_created_at\":\"2021-03-19T08:13:40Z\",\"live_domain\":\"jeyp\",\"live_url\":\"ezrkgqhcjrefo\",\"live_url_base\":\"mkqsleyyv\",\"owner_uuid\":\"qjpkcattpngjcrc\",\"region\":{\"continent\":\"qpjhvmda\",\"data_centers\":[],\"default\":false,\"disabled\":true,\"flag\":\"nqecanoaeup\",\"label\":\"yhltrpmopjmcm\",\"reason\":\"u\",\"slug\":\"thfuiuaodsfcpkvx\"},\"spec\":{\"name\":\"dpuozmyz\",\"region\":\"fra\",\"domains\":[],\"services\":[],\"static_sites\":[],\"jobs\":[],\"workers\":[],\"functions\":[],\"databases\":[]},\"tier_slug\":\"yiuokktwh\",\"updated_at\":\"2021-09-10T15:31:21Z\",\"pinned_deployment\":{\"cause\":\"ywqsmbsurexim\",\"cloned_from\":\"yocf\",\"created_at\":\"2021-06-07T20:06:41Z\",\"id\":\"ymddys\",\"jobs\":[],\"functions\":[],\"phase\":\"UNKNOWN\",\"phase_last_updated_at\":\"2021-01-17T08:36:03Z\",\"services\":[],\"static_sites\":[],\"tier_slug\":\"o\",\"updated_at\":\"2021-08-01T07:23:31Z\",\"workers\":[]}}],\"meta\":{\"total\":2107942439},\"links\":{}}")
                        .toObject(AppsResponse.class);
        Assertions.assertEquals("kbasyypn", model.getApps().get(0).getActiveDeployment().getCause());
        Assertions.assertEquals("hsgcbacphejkot", model.getApps().get(0).getActiveDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-11T13:05:51Z"),
                model.getApps().get(0).getActiveDeployment().getCreatedAt());
        Assertions.assertEquals("oulzndlikwyq", model.getApps().get(0).getActiveDeployment().getId());
        Assertions.assertEquals(AppsDeploymentPhase.DEPLOYING, model.getApps().get(0).getActiveDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-12-05T16:09:15Z"),
                model.getApps().get(0).getActiveDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-02T01:03:40Z"),
                model.getApps().get(0).getActiveDeployment().getUpdatedAt());
        Assertions.assertEquals("wtmutduq", model.getApps().get(0).getInProgressDeployment().getCause());
        Assertions.assertEquals("ap", model.getApps().get(0).getInProgressDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-12T00:21:31Z"),
                model.getApps().get(0).getInProgressDeployment().getCreatedAt());
        Assertions.assertEquals("cuertu", model.getApps().get(0).getInProgressDeployment().getId());
        Assertions.assertEquals(
                AppsDeploymentPhase.SUPERSEDED, model.getApps().get(0).getInProgressDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-06-08T21:13:45Z"),
                model.getApps().get(0).getInProgressDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-01T04:14:33Z"),
                model.getApps().get(0).getInProgressDeployment().getUpdatedAt());
        Assertions.assertEquals("uckyf", model.getApps().get(0).getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.NYC, model.getApps().get(0).getSpec().getRegion());
        Assertions.assertEquals("waopvkmijcmmxd", model.getApps().get(0).getPinnedDeployment().getCause());
        Assertions.assertEquals("fufsrpymzi", model.getApps().get(0).getPinnedDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-08-05T10:27:23Z"),
                model.getApps().get(0).getPinnedDeployment().getCreatedAt());
        Assertions.assertEquals("zcxtbzsgfyccsn", model.getApps().get(0).getPinnedDeployment().getId());
        Assertions.assertEquals(
                AppsDeploymentPhase.PENDING_DEPLOY, model.getApps().get(0).getPinnedDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-01-08T04:58:25Z"),
                model.getApps().get(0).getPinnedDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-31T08:54:57Z"),
                model.getApps().get(0).getPinnedDeployment().getUpdatedAt());
        Assertions.assertEquals(2107942439, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        AppsResponse model =
                new AppsResponse()
                        .setLinks(new PageLinks())
                        .setApps(
                                Arrays.asList(
                                        new App()
                                                .setActiveDeployment(
                                                        new AppsDeployment()
                                                                .setCause("kbasyypn")
                                                                .setClonedFrom("hsgcbacphejkot")
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-05-11T13:05:51Z"))
                                                                .setId("oulzndlikwyq")
                                                                .setJobs(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setPhase(AppsDeploymentPhase.DEPLOYING)
                                                                .setPhaseLastUpdatedAt(
                                                                        OffsetDateTime.parse("2021-12-05T16:09:15Z"))
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-07-02T01:03:40Z"))
                                                                .setWorkers(Arrays.asList()))
                                                .setInProgressDeployment(
                                                        new AppsDeployment()
                                                                .setCause("wtmutduq")
                                                                .setClonedFrom("ap")
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-10-12T00:21:31Z"))
                                                                .setId("cuertu")
                                                                .setJobs(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setPhase(AppsDeploymentPhase.SUPERSEDED)
                                                                .setPhaseLastUpdatedAt(
                                                                        OffsetDateTime.parse("2021-06-08T21:13:45Z"))
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-10-01T04:14:33Z"))
                                                                .setWorkers(Arrays.asList()))
                                                .setRegion(new AppsRegion())
                                                .setSpec(
                                                        new AppSpec()
                                                                .setName("uckyf")
                                                                .setRegion(AppSpecRegion.NYC)
                                                                .setDomains(Arrays.asList())
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setJobs(Arrays.asList())
                                                                .setWorkers(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setDatabases(Arrays.asList()))
                                                .setPinnedDeployment(
                                                        new AppPinnedDeployment()
                                                                .setCause("waopvkmijcmmxd")
                                                                .setClonedFrom("fufsrpymzi")
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-08-05T10:27:23Z"))
                                                                .setId("zcxtbzsgfyccsn")
                                                                .setJobs(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setPhase(AppsDeploymentPhase.PENDING_DEPLOY)
                                                                .setPhaseLastUpdatedAt(
                                                                        OffsetDateTime.parse("2021-01-08T04:58:25Z"))
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-07-31T08:54:57Z"))
                                                                .setWorkers(Arrays.asList())),
                                        new App()
                                                .setActiveDeployment(
                                                        new AppsDeployment()
                                                                .setCause("sfqpteehz")
                                                                .setClonedFrom("ypyqrimzinp")
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-01-25T11:13:44Z"))
                                                                .setId("dkirsoodqxhcr")
                                                                .setJobs(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setPhase(AppsDeploymentPhase.CANCELED)
                                                                .setPhaseLastUpdatedAt(
                                                                        OffsetDateTime.parse("2021-01-19T09:55:19Z"))
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-03-31T15:02:13Z"))
                                                                .setWorkers(Arrays.asList()))
                                                .setInProgressDeployment(
                                                        new AppsDeployment()
                                                                .setCause("qcjm")
                                                                .setClonedFrom("javbqidtqajz")
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-10-05T17:16:42Z"))
                                                                .setId("kudjkrlkhb")
                                                                .setJobs(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setPhase(AppsDeploymentPhase.ERROR)
                                                                .setPhaseLastUpdatedAt(
                                                                        OffsetDateTime.parse("2021-06-07T23:39:04Z"))
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-09-10T14:15:58Z"))
                                                                .setWorkers(Arrays.asList()))
                                                .setRegion(new AppsRegion())
                                                .setSpec(
                                                        new AppSpec()
                                                                .setName("c")
                                                                .setRegion(AppSpecRegion.AMS)
                                                                .setDomains(Arrays.asList())
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setJobs(Arrays.asList())
                                                                .setWorkers(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setDatabases(Arrays.asList()))
                                                .setPinnedDeployment(
                                                        new AppPinnedDeployment()
                                                                .setCause("i")
                                                                .setClonedFrom("eojnxqbzvddn")
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-06-13T14:44:36Z"))
                                                                .setId("eic")
                                                                .setJobs(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setPhase(AppsDeploymentPhase.ACTIVE)
                                                                .setPhaseLastUpdatedAt(
                                                                        OffsetDateTime.parse("2021-05-19T05:05:09Z"))
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-02-12T03:02:37Z"))
                                                                .setWorkers(Arrays.asList())),
                                        new App()
                                                .setActiveDeployment(
                                                        new AppsDeployment()
                                                                .setCause("jqkwpyeicx")
                                                                .setClonedFrom("ciwqvhk")
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-01-03T15:56:28Z"))
                                                                .setId("igdtopbob")
                                                                .setJobs(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setPhase(AppsDeploymentPhase.BUILDING)
                                                                .setPhaseLastUpdatedAt(
                                                                        OffsetDateTime.parse("2021-04-17T11:58:30Z"))
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-06-28T04:08:22Z"))
                                                                .setWorkers(Arrays.asList()))
                                                .setInProgressDeployment(
                                                        new AppsDeployment()
                                                                .setCause("hzrvqd")
                                                                .setClonedFrom("bhj")
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-09-14T02:51:19Z"))
                                                                .setId("ehoqfbowskan")
                                                                .setJobs(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setPhase(AppsDeploymentPhase.CANCELED)
                                                                .setPhaseLastUpdatedAt(
                                                                        OffsetDateTime.parse("2021-08-28T08:23:16Z"))
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-03-27T22:11:53Z"))
                                                                .setWorkers(Arrays.asList()))
                                                .setRegion(new AppsRegion())
                                                .setSpec(
                                                        new AppSpec()
                                                                .setName("ochcbonqvpkvl")
                                                                .setRegion(AppSpecRegion.FRA)
                                                                .setDomains(Arrays.asList())
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setJobs(Arrays.asList())
                                                                .setWorkers(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setDatabases(Arrays.asList()))
                                                .setPinnedDeployment(
                                                        new AppPinnedDeployment()
                                                                .setCause("yyien")
                                                                .setClonedFrom("dlwtgrhpdj")
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-05-17T12:08:11Z"))
                                                                .setId("asxazjpqyegualhb")
                                                                .setJobs(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setPhase(AppsDeploymentPhase.PENDING_BUILD)
                                                                .setPhaseLastUpdatedAt(
                                                                        OffsetDateTime.parse("2021-12-09T19:14:49Z"))
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-03-06T02:52:56Z"))
                                                                .setWorkers(Arrays.asList())),
                                        new App()
                                                .setActiveDeployment(
                                                        new AppsDeployment()
                                                                .setCause("bjnpg")
                                                                .setClonedFrom("ftadehxnltyfs")
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-10-02T19:16:03Z"))
                                                                .setId("suesnzw")
                                                                .setJobs(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setPhase(AppsDeploymentPhase.PENDING_BUILD)
                                                                .setPhaseLastUpdatedAt(
                                                                        OffsetDateTime.parse("2021-06-10T08:32:31Z"))
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-03-23T22:55:01Z"))
                                                                .setWorkers(Arrays.asList()))
                                                .setInProgressDeployment(
                                                        new AppsDeployment()
                                                                .setCause("kuofqweykhme")
                                                                .setClonedFrom("vfyexfw")
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-04-10T19:11:58Z"))
                                                                .setId("i")
                                                                .setJobs(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setPhase(AppsDeploymentPhase.PENDING_DEPLOY)
                                                                .setPhaseLastUpdatedAt(
                                                                        OffsetDateTime.parse("2021-12-10T22:53:58Z"))
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-04-21T17:36:37Z"))
                                                                .setWorkers(Arrays.asList()))
                                                .setRegion(new AppsRegion())
                                                .setSpec(
                                                        new AppSpec()
                                                                .setName("dpuozmyz")
                                                                .setRegion(AppSpecRegion.FRA)
                                                                .setDomains(Arrays.asList())
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setJobs(Arrays.asList())
                                                                .setWorkers(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setDatabases(Arrays.asList()))
                                                .setPinnedDeployment(
                                                        new AppPinnedDeployment()
                                                                .setCause("ywqsmbsurexim")
                                                                .setClonedFrom("yocf")
                                                                .setCreatedAt(
                                                                        OffsetDateTime.parse("2021-06-07T20:06:41Z"))
                                                                .setId("ymddys")
                                                                .setJobs(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setPhase(AppsDeploymentPhase.UNKNOWN)
                                                                .setPhaseLastUpdatedAt(
                                                                        OffsetDateTime.parse("2021-01-17T08:36:03Z"))
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setUpdatedAt(
                                                                        OffsetDateTime.parse("2021-08-01T07:23:31Z"))
                                                                .setWorkers(Arrays.asList()))))
                        .setMeta(new MetaMeta().setTotal(2107942439));
        model = BinaryData.fromObject(model).toObject(AppsResponse.class);
        Assertions.assertEquals("kbasyypn", model.getApps().get(0).getActiveDeployment().getCause());
        Assertions.assertEquals("hsgcbacphejkot", model.getApps().get(0).getActiveDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-11T13:05:51Z"),
                model.getApps().get(0).getActiveDeployment().getCreatedAt());
        Assertions.assertEquals("oulzndlikwyq", model.getApps().get(0).getActiveDeployment().getId());
        Assertions.assertEquals(AppsDeploymentPhase.DEPLOYING, model.getApps().get(0).getActiveDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-12-05T16:09:15Z"),
                model.getApps().get(0).getActiveDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-02T01:03:40Z"),
                model.getApps().get(0).getActiveDeployment().getUpdatedAt());
        Assertions.assertEquals("wtmutduq", model.getApps().get(0).getInProgressDeployment().getCause());
        Assertions.assertEquals("ap", model.getApps().get(0).getInProgressDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-12T00:21:31Z"),
                model.getApps().get(0).getInProgressDeployment().getCreatedAt());
        Assertions.assertEquals("cuertu", model.getApps().get(0).getInProgressDeployment().getId());
        Assertions.assertEquals(
                AppsDeploymentPhase.SUPERSEDED, model.getApps().get(0).getInProgressDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-06-08T21:13:45Z"),
                model.getApps().get(0).getInProgressDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-01T04:14:33Z"),
                model.getApps().get(0).getInProgressDeployment().getUpdatedAt());
        Assertions.assertEquals("uckyf", model.getApps().get(0).getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.NYC, model.getApps().get(0).getSpec().getRegion());
        Assertions.assertEquals("waopvkmijcmmxd", model.getApps().get(0).getPinnedDeployment().getCause());
        Assertions.assertEquals("fufsrpymzi", model.getApps().get(0).getPinnedDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-08-05T10:27:23Z"),
                model.getApps().get(0).getPinnedDeployment().getCreatedAt());
        Assertions.assertEquals("zcxtbzsgfyccsn", model.getApps().get(0).getPinnedDeployment().getId());
        Assertions.assertEquals(
                AppsDeploymentPhase.PENDING_DEPLOY, model.getApps().get(0).getPinnedDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-01-08T04:58:25Z"),
                model.getApps().get(0).getPinnedDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-31T08:54:57Z"),
                model.getApps().get(0).getPinnedDeployment().getUpdatedAt());
        Assertions.assertEquals(2107942439, model.getMeta().getTotal());
    }
}