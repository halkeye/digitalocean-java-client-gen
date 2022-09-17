package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppSpec;
import com.digitalocean.api.models.AppSpecRegion;
import com.digitalocean.api.models.AppsDeployment;
import com.digitalocean.api.models.AppsDeploymentPhase;
import com.digitalocean.api.models.AppsDeploymentProgress;
import com.digitalocean.api.models.AppsDeploymentsResponse;
import com.digitalocean.api.models.MetaMeta;
import com.digitalocean.api.models.PageLinks;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsDeploymentsResponseTests {
    @Test
    public void testDeserialize() {
        AppsDeploymentsResponse model =
                BinaryData.fromString(
                                "{\"deployments\":[{\"cause\":\"fcaabe\",\"cloned_from\":\"hbhlvbm\",\"created_at\":\"2021-04-28T18:22:28Z\",\"id\":\"bsxtkcudfbsfarfs\",\"jobs\":[],\"functions\":[],\"phase\":\"DEPLOYING\",\"phase_last_updated_at\":\"2021-02-09T06:58:59Z\",\"progress\":{\"error_steps\":1173279607,\"pending_steps\":1994631745,\"running_steps\":1896459173,\"steps\":[],\"success_steps\":970859098,\"summary_steps\":[],\"total_steps\":1864942425},\"services\":[],\"spec\":{\"name\":\"ksaoafcluqvox\",\"region\":\"ams\",\"domains\":[],\"services\":[],\"static_sites\":[],\"jobs\":[],\"workers\":[],\"functions\":[],\"databases\":[]},\"static_sites\":[],\"tier_slug\":\"wpbmzgwesydsxwef\",\"updated_at\":\"2020-12-20T06:52:39Z\",\"workers\":[]}],\"meta\":{\"total\":1099901211},\"links\":{}}")
                        .toObject(AppsDeploymentsResponse.class);
        Assertions.assertEquals("fcaabe", model.getDeployments().get(0).getCause());
        Assertions.assertEquals("hbhlvbm", model.getDeployments().get(0).getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-28T18:22:28Z"), model.getDeployments().get(0).getCreatedAt());
        Assertions.assertEquals("bsxtkcudfbsfarfs", model.getDeployments().get(0).getId());
        Assertions.assertEquals(AppsDeploymentPhase.DEPLOYING, model.getDeployments().get(0).getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-02-09T06:58:59Z"), model.getDeployments().get(0).getPhaseLastUpdatedAt());
        Assertions.assertEquals(1173279607, model.getDeployments().get(0).getProgress().getErrorSteps());
        Assertions.assertEquals(1994631745, model.getDeployments().get(0).getProgress().getPendingSteps());
        Assertions.assertEquals(1896459173, model.getDeployments().get(0).getProgress().getRunningSteps());
        Assertions.assertEquals(970859098, model.getDeployments().get(0).getProgress().getSuccessSteps());
        Assertions.assertEquals(1864942425, model.getDeployments().get(0).getProgress().getTotalSteps());
        Assertions.assertEquals("ksaoafcluqvox", model.getDeployments().get(0).getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.AMS, model.getDeployments().get(0).getSpec().getRegion());
        Assertions.assertEquals(
                OffsetDateTime.parse("2020-12-20T06:52:39Z"), model.getDeployments().get(0).getUpdatedAt());
        Assertions.assertEquals(1099901211, model.getMeta().getTotal());
    }

    @Test
    public void testSerialize() {
        AppsDeploymentsResponse model =
                new AppsDeploymentsResponse()
                        .setLinks(new PageLinks())
                        .setDeployments(
                                Arrays.asList(
                                        new AppsDeployment()
                                                .setCause("fcaabe")
                                                .setClonedFrom("hbhlvbm")
                                                .setCreatedAt(OffsetDateTime.parse("2021-04-28T18:22:28Z"))
                                                .setId("bsxtkcudfbsfarfs")
                                                .setJobs(Arrays.asList())
                                                .setFunctions(Arrays.asList())
                                                .setPhase(AppsDeploymentPhase.DEPLOYING)
                                                .setPhaseLastUpdatedAt(OffsetDateTime.parse("2021-02-09T06:58:59Z"))
                                                .setProgress(
                                                        new AppsDeploymentProgress()
                                                                .setErrorSteps(1173279607)
                                                                .setPendingSteps(1994631745)
                                                                .setRunningSteps(1896459173)
                                                                .setSteps(Arrays.asList())
                                                                .setSuccessSteps(970859098)
                                                                .setSummarySteps(Arrays.asList())
                                                                .setTotalSteps(1864942425))
                                                .setServices(Arrays.asList())
                                                .setSpec(
                                                        new AppSpec()
                                                                .setName("ksaoafcluqvox")
                                                                .setRegion(AppSpecRegion.AMS)
                                                                .setDomains(Arrays.asList())
                                                                .setServices(Arrays.asList())
                                                                .setStaticSites(Arrays.asList())
                                                                .setJobs(Arrays.asList())
                                                                .setWorkers(Arrays.asList())
                                                                .setFunctions(Arrays.asList())
                                                                .setDatabases(Arrays.asList()))
                                                .setStaticSites(Arrays.asList())
                                                .setUpdatedAt(OffsetDateTime.parse("2020-12-20T06:52:39Z"))
                                                .setWorkers(Arrays.asList())))
                        .setMeta(new MetaMeta().setTotal(1099901211));
        model = BinaryData.fromObject(model).toObject(AppsDeploymentsResponse.class);
        Assertions.assertEquals("fcaabe", model.getDeployments().get(0).getCause());
        Assertions.assertEquals("hbhlvbm", model.getDeployments().get(0).getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-28T18:22:28Z"), model.getDeployments().get(0).getCreatedAt());
        Assertions.assertEquals("bsxtkcudfbsfarfs", model.getDeployments().get(0).getId());
        Assertions.assertEquals(AppsDeploymentPhase.DEPLOYING, model.getDeployments().get(0).getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-02-09T06:58:59Z"), model.getDeployments().get(0).getPhaseLastUpdatedAt());
        Assertions.assertEquals(1173279607, model.getDeployments().get(0).getProgress().getErrorSteps());
        Assertions.assertEquals(1994631745, model.getDeployments().get(0).getProgress().getPendingSteps());
        Assertions.assertEquals(1896459173, model.getDeployments().get(0).getProgress().getRunningSteps());
        Assertions.assertEquals(970859098, model.getDeployments().get(0).getProgress().getSuccessSteps());
        Assertions.assertEquals(1864942425, model.getDeployments().get(0).getProgress().getTotalSteps());
        Assertions.assertEquals("ksaoafcluqvox", model.getDeployments().get(0).getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.AMS, model.getDeployments().get(0).getSpec().getRegion());
        Assertions.assertEquals(
                OffsetDateTime.parse("2020-12-20T06:52:39Z"), model.getDeployments().get(0).getUpdatedAt());
        Assertions.assertEquals(1099901211, model.getMeta().getTotal());
    }
}
