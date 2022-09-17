package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppSpec;
import com.digitalocean.api.models.AppSpecRegion;
import com.digitalocean.api.models.AppsDeployment;
import com.digitalocean.api.models.AppsDeploymentFunctions;
import com.digitalocean.api.models.AppsDeploymentJob;
import com.digitalocean.api.models.AppsDeploymentPhase;
import com.digitalocean.api.models.AppsDeploymentProgress;
import com.digitalocean.api.models.AppsDeploymentResponse;
import com.digitalocean.api.models.AppsDeploymentService;
import com.digitalocean.api.models.AppsDeploymentStaticSite;
import com.digitalocean.api.models.AppsDeploymentWorker;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsDeploymentResponseTests {
    @Test
    public void testDeserialize() {
        AppsDeploymentResponse model =
                BinaryData.fromString(
                                "{\"deployment\":{\"cause\":\"leallklm\",\"cloned_from\":\"hlowkx\",\"created_at\":\"2021-06-16T07:34:23Z\",\"id\":\"rdfjmzsyzfhotl\",\"jobs\":[{\"name\":\"yych\",\"source_commit_hash\":\"sjlpjrtwszhv\"}],\"functions\":[{\"name\":\"phvtrrmhwrb\",\"source_commit_hash\":\"pyf\",\"namespace\":\"bhvjglr\"},{\"name\":\"uyzlw\",\"source_commit_hash\":\"memhooclutnpq\",\"namespace\":\"mczjkm\"},{\"name\":\"kyujxsglhsrrr\",\"source_commit_hash\":\"jylmbkzudnigr\",\"namespace\":\"hotj\"}],\"phase\":\"PENDING_BUILD\",\"phase_last_updated_at\":\"2021-11-23T05:17:09Z\",\"progress\":{\"error_steps\":289344898,\"pending_steps\":446095930,\"running_steps\":1271933494,\"steps\":[],\"success_steps\":1865358517,\"summary_steps\":[],\"total_steps\":659940169},\"services\":[{\"name\":\"iqakydiwfbr\",\"source_commit_hash\":\"pzdqtvhcspod\"},{\"name\":\"axsipietgb\",\"source_commit_hash\":\"jfulbmoic\"},{\"name\":\"lpnfpubntnb\",\"source_commit_hash\":\"zviqsowsaae\"}],\"spec\":{\"name\":\"attcju\",\"region\":\"nyc\",\"domains\":[],\"services\":[],\"static_sites\":[],\"jobs\":[],\"workers\":[],\"functions\":[],\"databases\":[]},\"static_sites\":[{\"name\":\"kyylizr\",\"source_commit_hash\":\"jpsfxsfu\"},{\"name\":\"lvt\",\"source_commit_hash\":\"agb\"},{\"name\":\"dqlvhukoveof\",\"source_commit_hash\":\"rvjfnmjmvlw\"}],\"tier_slug\":\"giblkujrllf\",\"updated_at\":\"2021-05-11T11:22:01Z\",\"workers\":[{\"name\":\"puuyjucejik\",\"source_commit_hash\":\"eovvtzej\"},{\"name\":\"jklntikyj\",\"source_commit_hash\":\"k\"},{\"name\":\"qzolxrzvhqjw\",\"source_commit_hash\":\"htgv\"}]}}")
                        .toObject(AppsDeploymentResponse.class);
        Assertions.assertEquals("leallklm", model.getDeployment().getCause());
        Assertions.assertEquals("hlowkx", model.getDeployment().getClonedFrom());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-16T07:34:23Z"), model.getDeployment().getCreatedAt());
        Assertions.assertEquals("rdfjmzsyzfhotl", model.getDeployment().getId());
        Assertions.assertEquals("yych", model.getDeployment().getJobs().get(0).getName());
        Assertions.assertEquals("sjlpjrtwszhv", model.getDeployment().getJobs().get(0).getSourceCommitHash());
        Assertions.assertEquals("phvtrrmhwrb", model.getDeployment().getFunctions().get(0).getName());
        Assertions.assertEquals("pyf", model.getDeployment().getFunctions().get(0).getSourceCommitHash());
        Assertions.assertEquals("bhvjglr", model.getDeployment().getFunctions().get(0).getNamespace());
        Assertions.assertEquals(AppsDeploymentPhase.PENDING_BUILD, model.getDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-11-23T05:17:09Z"), model.getDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(289344898, model.getDeployment().getProgress().getErrorSteps());
        Assertions.assertEquals(446095930, model.getDeployment().getProgress().getPendingSteps());
        Assertions.assertEquals(1271933494, model.getDeployment().getProgress().getRunningSteps());
        Assertions.assertEquals(1865358517, model.getDeployment().getProgress().getSuccessSteps());
        Assertions.assertEquals(659940169, model.getDeployment().getProgress().getTotalSteps());
        Assertions.assertEquals("iqakydiwfbr", model.getDeployment().getServices().get(0).getName());
        Assertions.assertEquals("pzdqtvhcspod", model.getDeployment().getServices().get(0).getSourceCommitHash());
        Assertions.assertEquals("attcju", model.getDeployment().getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.NYC, model.getDeployment().getSpec().getRegion());
        Assertions.assertEquals("kyylizr", model.getDeployment().getStaticSites().get(0).getName());
        Assertions.assertEquals("jpsfxsfu", model.getDeployment().getStaticSites().get(0).getSourceCommitHash());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-11T11:22:01Z"), model.getDeployment().getUpdatedAt());
        Assertions.assertEquals("puuyjucejik", model.getDeployment().getWorkers().get(0).getName());
        Assertions.assertEquals("eovvtzej", model.getDeployment().getWorkers().get(0).getSourceCommitHash());
    }

    @Test
    public void testSerialize() {
        AppsDeploymentResponse model =
                new AppsDeploymentResponse()
                        .setDeployment(
                                new AppsDeployment()
                                        .setCause("leallklm")
                                        .setClonedFrom("hlowkx")
                                        .setCreatedAt(OffsetDateTime.parse("2021-06-16T07:34:23Z"))
                                        .setId("rdfjmzsyzfhotl")
                                        .setJobs(
                                                Arrays.asList(
                                                        new AppsDeploymentJob()
                                                                .setName("yych")
                                                                .setSourceCommitHash("sjlpjrtwszhv")))
                                        .setFunctions(
                                                Arrays.asList(
                                                        new AppsDeploymentFunctions()
                                                                .setName("phvtrrmhwrb")
                                                                .setSourceCommitHash("pyf")
                                                                .setNamespace("bhvjglr"),
                                                        new AppsDeploymentFunctions()
                                                                .setName("uyzlw")
                                                                .setSourceCommitHash("memhooclutnpq")
                                                                .setNamespace("mczjkm"),
                                                        new AppsDeploymentFunctions()
                                                                .setName("kyujxsglhsrrr")
                                                                .setSourceCommitHash("jylmbkzudnigr")
                                                                .setNamespace("hotj")))
                                        .setPhase(AppsDeploymentPhase.PENDING_BUILD)
                                        .setPhaseLastUpdatedAt(OffsetDateTime.parse("2021-11-23T05:17:09Z"))
                                        .setProgress(
                                                new AppsDeploymentProgress()
                                                        .setErrorSteps(289344898)
                                                        .setPendingSteps(446095930)
                                                        .setRunningSteps(1271933494)
                                                        .setSteps(Arrays.asList())
                                                        .setSuccessSteps(1865358517)
                                                        .setSummarySteps(Arrays.asList())
                                                        .setTotalSteps(659940169))
                                        .setServices(
                                                Arrays.asList(
                                                        new AppsDeploymentService()
                                                                .setName("iqakydiwfbr")
                                                                .setSourceCommitHash("pzdqtvhcspod"),
                                                        new AppsDeploymentService()
                                                                .setName("axsipietgb")
                                                                .setSourceCommitHash("jfulbmoic"),
                                                        new AppsDeploymentService()
                                                                .setName("lpnfpubntnb")
                                                                .setSourceCommitHash("zviqsowsaae")))
                                        .setSpec(
                                                new AppSpec()
                                                        .setName("attcju")
                                                        .setRegion(AppSpecRegion.NYC)
                                                        .setDomains(Arrays.asList())
                                                        .setServices(Arrays.asList())
                                                        .setStaticSites(Arrays.asList())
                                                        .setJobs(Arrays.asList())
                                                        .setWorkers(Arrays.asList())
                                                        .setFunctions(Arrays.asList())
                                                        .setDatabases(Arrays.asList()))
                                        .setStaticSites(
                                                Arrays.asList(
                                                        new AppsDeploymentStaticSite()
                                                                .setName("kyylizr")
                                                                .setSourceCommitHash("jpsfxsfu"),
                                                        new AppsDeploymentStaticSite()
                                                                .setName("lvt")
                                                                .setSourceCommitHash("agb"),
                                                        new AppsDeploymentStaticSite()
                                                                .setName("dqlvhukoveof")
                                                                .setSourceCommitHash("rvjfnmjmvlw")))
                                        .setUpdatedAt(OffsetDateTime.parse("2021-05-11T11:22:01Z"))
                                        .setWorkers(
                                                Arrays.asList(
                                                        new AppsDeploymentWorker()
                                                                .setName("puuyjucejik")
                                                                .setSourceCommitHash("eovvtzej"),
                                                        new AppsDeploymentWorker()
                                                                .setName("jklntikyj")
                                                                .setSourceCommitHash("k"),
                                                        new AppsDeploymentWorker()
                                                                .setName("qzolxrzvhqjw")
                                                                .setSourceCommitHash("htgv"))));
        model = BinaryData.fromObject(model).toObject(AppsDeploymentResponse.class);
        Assertions.assertEquals("leallklm", model.getDeployment().getCause());
        Assertions.assertEquals("hlowkx", model.getDeployment().getClonedFrom());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-16T07:34:23Z"), model.getDeployment().getCreatedAt());
        Assertions.assertEquals("rdfjmzsyzfhotl", model.getDeployment().getId());
        Assertions.assertEquals("yych", model.getDeployment().getJobs().get(0).getName());
        Assertions.assertEquals("sjlpjrtwszhv", model.getDeployment().getJobs().get(0).getSourceCommitHash());
        Assertions.assertEquals("phvtrrmhwrb", model.getDeployment().getFunctions().get(0).getName());
        Assertions.assertEquals("pyf", model.getDeployment().getFunctions().get(0).getSourceCommitHash());
        Assertions.assertEquals("bhvjglr", model.getDeployment().getFunctions().get(0).getNamespace());
        Assertions.assertEquals(AppsDeploymentPhase.PENDING_BUILD, model.getDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-11-23T05:17:09Z"), model.getDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(289344898, model.getDeployment().getProgress().getErrorSteps());
        Assertions.assertEquals(446095930, model.getDeployment().getProgress().getPendingSteps());
        Assertions.assertEquals(1271933494, model.getDeployment().getProgress().getRunningSteps());
        Assertions.assertEquals(1865358517, model.getDeployment().getProgress().getSuccessSteps());
        Assertions.assertEquals(659940169, model.getDeployment().getProgress().getTotalSteps());
        Assertions.assertEquals("iqakydiwfbr", model.getDeployment().getServices().get(0).getName());
        Assertions.assertEquals("pzdqtvhcspod", model.getDeployment().getServices().get(0).getSourceCommitHash());
        Assertions.assertEquals("attcju", model.getDeployment().getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.NYC, model.getDeployment().getSpec().getRegion());
        Assertions.assertEquals("kyylizr", model.getDeployment().getStaticSites().get(0).getName());
        Assertions.assertEquals("jpsfxsfu", model.getDeployment().getStaticSites().get(0).getSourceCommitHash());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-11T11:22:01Z"), model.getDeployment().getUpdatedAt());
        Assertions.assertEquals("puuyjucejik", model.getDeployment().getWorkers().get(0).getName());
        Assertions.assertEquals("eovvtzej", model.getDeployment().getWorkers().get(0).getSourceCommitHash());
    }
}
