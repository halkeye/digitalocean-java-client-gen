package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.App;
import com.digitalocean.api.models.AppPinnedDeployment;
import com.digitalocean.api.models.AppResponse;
import com.digitalocean.api.models.AppSpec;
import com.digitalocean.api.models.AppSpecRegion;
import com.digitalocean.api.models.AppsDeployment;
import com.digitalocean.api.models.AppsDeploymentPhase;
import com.digitalocean.api.models.AppsRegion;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppResponseTests {
    @Test
    public void testDeserialize() {
        AppResponse model =
                BinaryData.fromString(
                                "{\"app\":{\"active_deployment\":{\"cause\":\"mowaziynknlqwzdv\",\"cloned_from\":\"w\",\"created_at\":\"2021-07-20T17:56:39Z\",\"id\":\"zdtmaajquhuxylrj\",\"jobs\":[],\"functions\":[],\"phase\":\"PENDING_DEPLOY\",\"phase_last_updated_at\":\"2021-03-27T05:29:46Z\",\"services\":[],\"static_sites\":[],\"tier_slug\":\"hckfkyjpmspbps\",\"updated_at\":\"2021-03-22T17:32:57Z\",\"workers\":[]},\"created_at\":\"2021-03-29T12:30:22Z\",\"default_ingress\":\"ieyujtvc\",\"domains\":[{\"id\":\"yxrxmunj\",\"phase\":\"CONFIGURING\"},{\"id\":\"kvxlxpa\",\"phase\":\"PENDING\"},{\"id\":\"gkcvkhpzvuq\",\"phase\":\"ERROR\"}],\"id\":\"iypfp\",\"in_progress_deployment\":{\"cause\":\"pzgpxtivhj\",\"cloned_from\":\"idibgqjxgpn\",\"created_at\":\"2021-03-28T18:40:43Z\",\"id\":\"vfgpikqmhhaowjrm\",\"jobs\":[],\"functions\":[],\"phase\":\"ERROR\",\"phase_last_updated_at\":\"2021-10-06T20:56:23Z\",\"services\":[],\"static_sites\":[],\"tier_slug\":\"fvxcnqmxqpswo\",\"updated_at\":\"2021-03-02T18:46:22Z\",\"workers\":[]},\"last_deployment_created_at\":\"2021-12-01T08:12:15Z\",\"live_domain\":\"dhbemzqkzszu\",\"live_url\":\"wtglxx\",\"live_url_base\":\"jfpgpicrmn\",\"owner_uuid\":\"rgmqgjs\",\"region\":{\"continent\":\"qcbfrmbodths\",\"data_centers\":[\"vriibakclacjfr\",\"xousxauzl\",\"vsg\"],\"default\":false,\"disabled\":false,\"flag\":\"zizvuxmmk\",\"label\":\"vthn\",\"reason\":\"zt\",\"slug\":\"ovmribiattg\"},\"spec\":{\"name\":\"lu\",\"region\":\"fra\",\"domains\":[],\"services\":[],\"static_sites\":[],\"jobs\":[],\"workers\":[],\"functions\":[],\"databases\":[]},\"tier_slug\":\"wvxwlmzqwmvt\",\"updated_at\":\"2021-10-20T07:22:43Z\",\"pinned_deployment\":{\"cause\":\"mcuqudtcvc\",\"cloned_from\":\"ynpdkvgfab\",\"created_at\":\"2021-06-17T05:28:42Z\",\"id\":\"ibuz\",\"jobs\":[],\"functions\":[],\"phase\":\"ERROR\",\"phase_last_updated_at\":\"2021-09-24T01:09:52Z\",\"services\":[],\"static_sites\":[],\"tier_slug\":\"iuqhibtozipqwj\",\"updated_at\":\"2021-07-24T04:45:31Z\",\"workers\":[]}}}")
                        .toObject(AppResponse.class);
        Assertions.assertEquals("mowaziynknlqwzdv", model.getApp().getActiveDeployment().getCause());
        Assertions.assertEquals("w", model.getApp().getActiveDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-20T17:56:39Z"), model.getApp().getActiveDeployment().getCreatedAt());
        Assertions.assertEquals("zdtmaajquhuxylrj", model.getApp().getActiveDeployment().getId());
        Assertions.assertEquals(AppsDeploymentPhase.PENDING_DEPLOY, model.getApp().getActiveDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-27T05:29:46Z"),
                model.getApp().getActiveDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-22T17:32:57Z"), model.getApp().getActiveDeployment().getUpdatedAt());
        Assertions.assertEquals("pzgpxtivhj", model.getApp().getInProgressDeployment().getCause());
        Assertions.assertEquals("idibgqjxgpn", model.getApp().getInProgressDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-28T18:40:43Z"), model.getApp().getInProgressDeployment().getCreatedAt());
        Assertions.assertEquals("vfgpikqmhhaowjrm", model.getApp().getInProgressDeployment().getId());
        Assertions.assertEquals(AppsDeploymentPhase.ERROR, model.getApp().getInProgressDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-06T20:56:23Z"),
                model.getApp().getInProgressDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-02T18:46:22Z"), model.getApp().getInProgressDeployment().getUpdatedAt());
        Assertions.assertEquals("lu", model.getApp().getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.FRA, model.getApp().getSpec().getRegion());
        Assertions.assertEquals("mcuqudtcvc", model.getApp().getPinnedDeployment().getCause());
        Assertions.assertEquals("ynpdkvgfab", model.getApp().getPinnedDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-06-17T05:28:42Z"), model.getApp().getPinnedDeployment().getCreatedAt());
        Assertions.assertEquals("ibuz", model.getApp().getPinnedDeployment().getId());
        Assertions.assertEquals(AppsDeploymentPhase.ERROR, model.getApp().getPinnedDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-24T01:09:52Z"),
                model.getApp().getPinnedDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-24T04:45:31Z"), model.getApp().getPinnedDeployment().getUpdatedAt());
    }

    @Test
    public void testSerialize() {
        AppResponse model =
                new AppResponse()
                        .setApp(
                                new App()
                                        .setActiveDeployment(
                                                new AppsDeployment()
                                                        .setCause("mowaziynknlqwzdv")
                                                        .setClonedFrom("w")
                                                        .setCreatedAt(OffsetDateTime.parse("2021-07-20T17:56:39Z"))
                                                        .setId("zdtmaajquhuxylrj")
                                                        .setJobs(Arrays.asList())
                                                        .setFunctions(Arrays.asList())
                                                        .setPhase(AppsDeploymentPhase.PENDING_DEPLOY)
                                                        .setPhaseLastUpdatedAt(
                                                                OffsetDateTime.parse("2021-03-27T05:29:46Z"))
                                                        .setServices(Arrays.asList())
                                                        .setStaticSites(Arrays.asList())
                                                        .setUpdatedAt(OffsetDateTime.parse("2021-03-22T17:32:57Z"))
                                                        .setWorkers(Arrays.asList()))
                                        .setInProgressDeployment(
                                                new AppsDeployment()
                                                        .setCause("pzgpxtivhj")
                                                        .setClonedFrom("idibgqjxgpn")
                                                        .setCreatedAt(OffsetDateTime.parse("2021-03-28T18:40:43Z"))
                                                        .setId("vfgpikqmhhaowjrm")
                                                        .setJobs(Arrays.asList())
                                                        .setFunctions(Arrays.asList())
                                                        .setPhase(AppsDeploymentPhase.ERROR)
                                                        .setPhaseLastUpdatedAt(
                                                                OffsetDateTime.parse("2021-10-06T20:56:23Z"))
                                                        .setServices(Arrays.asList())
                                                        .setStaticSites(Arrays.asList())
                                                        .setUpdatedAt(OffsetDateTime.parse("2021-03-02T18:46:22Z"))
                                                        .setWorkers(Arrays.asList()))
                                        .setRegion(new AppsRegion())
                                        .setSpec(
                                                new AppSpec()
                                                        .setName("lu")
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
                                                        .setCause("mcuqudtcvc")
                                                        .setClonedFrom("ynpdkvgfab")
                                                        .setCreatedAt(OffsetDateTime.parse("2021-06-17T05:28:42Z"))
                                                        .setId("ibuz")
                                                        .setJobs(Arrays.asList())
                                                        .setFunctions(Arrays.asList())
                                                        .setPhase(AppsDeploymentPhase.ERROR)
                                                        .setPhaseLastUpdatedAt(
                                                                OffsetDateTime.parse("2021-09-24T01:09:52Z"))
                                                        .setServices(Arrays.asList())
                                                        .setStaticSites(Arrays.asList())
                                                        .setUpdatedAt(OffsetDateTime.parse("2021-07-24T04:45:31Z"))
                                                        .setWorkers(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(AppResponse.class);
        Assertions.assertEquals("mowaziynknlqwzdv", model.getApp().getActiveDeployment().getCause());
        Assertions.assertEquals("w", model.getApp().getActiveDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-20T17:56:39Z"), model.getApp().getActiveDeployment().getCreatedAt());
        Assertions.assertEquals("zdtmaajquhuxylrj", model.getApp().getActiveDeployment().getId());
        Assertions.assertEquals(AppsDeploymentPhase.PENDING_DEPLOY, model.getApp().getActiveDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-27T05:29:46Z"),
                model.getApp().getActiveDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-22T17:32:57Z"), model.getApp().getActiveDeployment().getUpdatedAt());
        Assertions.assertEquals("pzgpxtivhj", model.getApp().getInProgressDeployment().getCause());
        Assertions.assertEquals("idibgqjxgpn", model.getApp().getInProgressDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-28T18:40:43Z"), model.getApp().getInProgressDeployment().getCreatedAt());
        Assertions.assertEquals("vfgpikqmhhaowjrm", model.getApp().getInProgressDeployment().getId());
        Assertions.assertEquals(AppsDeploymentPhase.ERROR, model.getApp().getInProgressDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-06T20:56:23Z"),
                model.getApp().getInProgressDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-02T18:46:22Z"), model.getApp().getInProgressDeployment().getUpdatedAt());
        Assertions.assertEquals("lu", model.getApp().getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.FRA, model.getApp().getSpec().getRegion());
        Assertions.assertEquals("mcuqudtcvc", model.getApp().getPinnedDeployment().getCause());
        Assertions.assertEquals("ynpdkvgfab", model.getApp().getPinnedDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-06-17T05:28:42Z"), model.getApp().getPinnedDeployment().getCreatedAt());
        Assertions.assertEquals("ibuz", model.getApp().getPinnedDeployment().getId());
        Assertions.assertEquals(AppsDeploymentPhase.ERROR, model.getApp().getPinnedDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-24T01:09:52Z"),
                model.getApp().getPinnedDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-24T04:45:31Z"), model.getApp().getPinnedDeployment().getUpdatedAt());
    }
}
