package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppComponentInstanceBaseInstanceSizeSlug;
import com.digitalocean.api.models.AppDatabaseSpec;
import com.digitalocean.api.models.AppDatabaseSpecEngine;
import com.digitalocean.api.models.AppDomainSpec;
import com.digitalocean.api.models.AppDomainSpecMinimumTlsVersion;
import com.digitalocean.api.models.AppDomainSpecType;
import com.digitalocean.api.models.AppFunctionsSpec;
import com.digitalocean.api.models.AppJobSpec;
import com.digitalocean.api.models.AppJobSpecKind;
import com.digitalocean.api.models.AppServiceSpec;
import com.digitalocean.api.models.AppSpec;
import com.digitalocean.api.models.AppSpecRegion;
import com.digitalocean.api.models.AppStaticSiteSpec;
import com.digitalocean.api.models.AppWorkerSpec;
import com.digitalocean.api.models.AppsDeployment;
import com.digitalocean.api.models.AppsDeploymentFunctions;
import com.digitalocean.api.models.AppsDeploymentJob;
import com.digitalocean.api.models.AppsDeploymentPhase;
import com.digitalocean.api.models.AppsDeploymentProgress;
import com.digitalocean.api.models.AppsDeploymentProgressStep;
import com.digitalocean.api.models.AppsDeploymentProgressStepStatus;
import com.digitalocean.api.models.AppsDeploymentService;
import com.digitalocean.api.models.AppsDeploymentStaticSite;
import com.digitalocean.api.models.AppsDeploymentWorker;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsDeploymentTests {
    @Test
    public void testDeserialize() {
        AppsDeployment model =
                BinaryData.fromString(
                                "{\"cause\":\"wdmhdlxyjrxs\",\"cloned_from\":\"afcnih\",\"created_at\":\"2021-09-16T02:36:36Z\",\"id\":\"pnedgf\",\"jobs\":[{\"name\":\"cvqvpkeqdcv\",\"source_commit_hash\":\"hvoodsotbobzd\"},{\"name\":\"cjwvn\",\"source_commit_hash\":\"ld\"},{\"name\":\"gx\",\"source_commit_hash\":\"rslpmutwuoeg\"}],\"functions\":[{\"name\":\"jw\",\"source_commit_hash\":\"yqsluic\",\"namespace\":\"ggkzzlvmbmpa\"},{\"name\":\"odfvuefywsbp\",\"source_commit_hash\":\"mwyhr\",\"namespace\":\"uyfta\"}],\"phase\":\"DEPLOYING\",\"phase_last_updated_at\":\"2021-11-18T00:43:07Z\",\"progress\":{\"error_steps\":1040923285,\"pending_steps\":842537299,\"running_steps\":1679264198,\"steps\":[{\"component_name\":\"exkpzksmondjmq\",\"ended_at\":\"2021-06-21T21:58:07Z\",\"message_base\":\"pomgkopkwhojvp\",\"name\":\"qgxy\",\"started_at\":\"2021-04-04T17:01:54Z\",\"status\":\"ERROR\",\"steps\":[]}],\"success_steps\":1729730350,\"summary_steps\":[{\"component_name\":\"cxozapvhelxp\",\"ended_at\":\"2021-09-12T22:12:38Z\",\"message_base\":\"atddc\",\"name\":\"bcuejrjxgci\",\"started_at\":\"2021-10-12T15:58:19Z\",\"status\":\"UNKNOWN\",\"steps\":[]},{\"component_name\":\"sdqrhzoymibmrq\",\"ended_at\":\"2021-07-29T17:32:56Z\",\"message_base\":\"hwflu\",\"name\":\"dtmhrkwofyyvoqa\",\"started_at\":\"2021-02-16T07:05:48Z\",\"status\":\"PENDING\",\"steps\":[]},{\"component_name\":\"giwbwoenwa\",\"ended_at\":\"2021-03-28T20:58:03Z\",\"message_base\":\"dtkcnqxwbpokulp\",\"name\":\"jwaa\",\"started_at\":\"2021-01-28T12:35:49Z\",\"status\":\"ERROR\",\"steps\":[]}],\"total_steps\":675446410},\"services\":[{\"name\":\"rpqlp\",\"source_commit_hash\":\"cciuqgbdbutau\"},{\"name\":\"btkuwhh\",\"source_commit_hash\":\"ykojoxafnndlpic\"},{\"name\":\"o\",\"source_commit_hash\":\"kcdyhbpk\"}],\"spec\":{\"name\":\"wdreqnovvqfovl\",\"region\":\"ams\",\"domains\":[{\"domain\":\"uwsyrsndsytgadg\",\"type\":\"ALIAS\",\"wildcard\":true,\"zone\":\"neqn\",\"minimum_tls_version\":\"1.3\"},{\"domain\":\"rwlqu\",\"type\":\"DEFAULT\",\"wildcard\":false,\"zone\":\"acewiipfpubjibw\",\"minimum_tls_version\":\"1.2\"},{\"domain\":\"tohqkvpuvksgp\",\"type\":\"ALIAS\",\"wildcard\":true,\"zone\":\"n\",\"minimum_tls_version\":\"1.2\"}],\"services\":[{\"http_port\":6369380004296885865,\"internal_ports\":[],\"routes\":[],\"instance_count\":4359673283515658098,\"instance_size_slug\":\"professional-l\",\"name\":\"ntorzihleosjswsr\",\"dockerfile_path\":\"pzbchck\",\"build_command\":\"zqioxiysuii\",\"run_command\":\"nkedyatrwyhqmib\",\"source_dir\":\"hwit\",\"envs\":[],\"environment_slug\":\"pyy\"},{\"http_port\":6601309306098358089,\"internal_ports\":[],\"routes\":[],\"instance_count\":4287611654348954436,\"instance_size_slug\":\"basic-m\",\"name\":\"abikns\",\"dockerfile_path\":\"bldtlww\",\"build_command\":\"kdmtncvokotll\",\"run_command\":\"yhgsy\",\"source_dir\":\"ogjltdtbnnhad\",\"envs\":[],\"environment_slug\":\"rkvcikhnvpa\"},{\"http_port\":7776859938318021776,\"internal_ports\":[],\"routes\":[],\"instance_count\":7805373587347139701,\"instance_size_slug\":\"professional-xs\",\"name\":\"xkalla\",\"dockerfile_path\":\"ipicc\",\"build_command\":\"kzivgvvcnayrh\",\"run_command\":\"nxxmueedndrdv\",\"source_dir\":\"kwqqtchealmf\",\"envs\":[],\"environment_slug\":\"aayg\"}],\"static_sites\":[{\"index_document\":\"piohgwxrtfu\",\"error_document\":\"epxgyqagvr\",\"catchall_document\":\"npkukghimdblx\",\"output_dir\":\"imfnjhfjx\",\"routes\":[],\"name\":\"kkfoqr\",\"dockerfile_path\":\"kf\",\"build_command\":\"wneaiv\",\"run_command\":\"czelpcirel\",\"source_dir\":\"eae\",\"envs\":[],\"environment_slug\":\"bfatklddxbjhwu\"},{\"index_document\":\"oz\",\"error_document\":\"sphyoulpjrvxa\",\"catchall_document\":\"rvimjwosytxitcsk\",\"output_dir\":\"k\",\"routes\":[],\"name\":\"iekkezz\",\"dockerfile_path\":\"jhdgqggebdunyga\",\"build_command\":\"idb\",\"run_command\":\"atpxl\",\"source_dir\":\"xcyjmoadsuvarmy\",\"envs\":[],\"environment_slug\":\"jsjqbjhhyx\"},{\"index_document\":\"lyc\",\"error_document\":\"uhpkxkgymar\",\"catchall_document\":\"n\",\"output_dir\":\"xqugjhkycubedd\",\"routes\":[],\"name\":\"fwqmzqalkrmn\",\"dockerfile_path\":\"cqqudf\",\"build_command\":\"yxbaaabjyvayf\",\"run_command\":\"m\",\"source_dir\":\"rtuzqogs\",\"envs\":[],\"environment_slug\":\"evfdnwnwm\"}],\"jobs\":[{\"kind\":\"POST_DEPLOY\",\"instance_count\":6335921088837380808,\"instance_size_slug\":\"basic-m\",\"name\":\"i\",\"dockerfile_path\":\"rx\",\"build_command\":\"thzvaytdwkqbrqu\",\"run_command\":\"axhexiilivp\",\"source_dir\":\"iirqtd\",\"envs\":[],\"environment_slug\":\"xoruzfgsquyfxrx\"},{\"kind\":\"PRE_DEPLOY\",\"instance_count\":4173276744346571971,\"instance_size_slug\":\"professional-m\",\"name\":\"ezw\",\"dockerfile_path\":\"qlcvydy\",\"build_command\":\"tdooaoj\",\"run_command\":\"iodkooebwnujhem\",\"source_dir\":\"bvdkcrodtjin\",\"envs\":[],\"environment_slug\":\"lfltka\"},{\"kind\":\"PRE_DEPLOY\",\"instance_count\":6490344131392989957,\"instance_size_slug\":\"professional-s\",\"name\":\"akggkfpag\",\"dockerfile_path\":\"pqblylsyxkqjnsj\",\"build_command\":\"vti\",\"run_command\":\"xsdszuempsb\",\"source_dir\":\"f\",\"envs\":[],\"environment_slug\":\"yvpnqicvinvkjj\"},{\"kind\":\"FAILED_DEPLOY\",\"instance_count\":4841685687030485565,\"instance_size_slug\":\"professional-xs\",\"name\":\"lewyhmlwpaz\",\"dockerfile_path\":\"cckwyfzqwhxxbu\",\"build_command\":\"a\",\"run_command\":\"feqztppriol\",\"source_dir\":\"rjaltolmncw\",\"envs\":[],\"environment_slug\":\"qwcsdbnwdcfhuc\"}],\"workers\":[{\"instance_count\":1028769978978951070,\"instance_size_slug\":\"professional-xl\",\"name\":\"jjcanvxbvtv\",\"dockerfile_path\":\"ormrlxqtvcofudfl\",\"build_command\":\"gj\",\"run_command\":\"gdknnqv\",\"source_dir\":\"znqntoru\",\"envs\":[],\"environment_slug\":\"sahmky\"},{\"instance_count\":3000179800184836429,\"instance_size_slug\":\"professional-m\",\"name\":\"etaebu\",\"dockerfile_path\":\"vsmzlxwab\",\"build_command\":\"oefki\",\"run_command\":\"vtpuqujmqlgk\",\"source_dir\":\"tndoaongbjc\",\"envs\":[],\"environment_slug\":\"jitcjedftwwaez\"},{\"instance_count\":985316171720734071,\"instance_size_slug\":\"basic-xxs\",\"name\":\"foqouicybx\",\"dockerfile_path\":\"ufoxc\",\"build_command\":\"opidoamciodh\",\"run_command\":\"azxkhnzbonlwnto\",\"source_dir\":\"okdwb\",\"envs\":[],\"environment_slug\":\"szzcmrvexztv\"}],\"functions\":[{\"routes\":[],\"name\":\"ra\",\"source_dir\":\"zkoowtlmnguxawqa\",\"alerts\":[],\"envs\":[]},{\"routes\":[],\"name\":\"erqf\",\"source_dir\":\"wyznkbyku\",\"alerts\":[],\"envs\":[]},{\"routes\":[],\"name\":\"hrskdsnfd\",\"source_dir\":\"oakgtdlmkkzev\",\"alerts\":[],\"envs\":[]}],\"databases\":[{\"cluster_name\":\"ttwvogvbbe\",\"db_name\":\"cngqqmoakufgmjz\",\"db_user\":\"rdgrtw\",\"engine\":\"PG\",\"name\":\"u\",\"production\":true,\"version\":\"pbminr\"},{\"cluster_name\":\"woyuhhziuief\",\"db_name\":\"bhdmsmlmzqhof\",\"db_user\":\"maequiahxicslfa\",\"engine\":\"UNSET\",\"name\":\"piyylhalnswhccsp\",\"production\":true,\"version\":\"vwitqscyw\"}]},\"static_sites\":[{\"name\":\"oluhczbwemh\",\"source_commit_hash\":\"rsbrgzdwm\"}],\"tier_slug\":\"eypqwdxggicccn\",\"updated_at\":\"2021-08-10T18:32:54Z\",\"workers\":[{\"name\":\"mkttlstvlzywem\",\"source_commit_hash\":\"rncsdtclu\"}]}")
                        .toObject(AppsDeployment.class);
        Assertions.assertEquals("wdmhdlxyjrxs", model.getCause());
        Assertions.assertEquals("afcnih", model.getClonedFrom());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-16T02:36:36Z"), model.getCreatedAt());
        Assertions.assertEquals("pnedgf", model.getId());
        Assertions.assertEquals("cvqvpkeqdcv", model.getJobs().get(0).getName());
        Assertions.assertEquals("hvoodsotbobzd", model.getJobs().get(0).getSourceCommitHash());
        Assertions.assertEquals("jw", model.getFunctions().get(0).getName());
        Assertions.assertEquals("yqsluic", model.getFunctions().get(0).getSourceCommitHash());
        Assertions.assertEquals("ggkzzlvmbmpa", model.getFunctions().get(0).getNamespace());
        Assertions.assertEquals(AppsDeploymentPhase.DEPLOYING, model.getPhase());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-18T00:43:07Z"), model.getPhaseLastUpdatedAt());
        Assertions.assertEquals(1040923285, model.getProgress().getErrorSteps());
        Assertions.assertEquals(842537299, model.getProgress().getPendingSteps());
        Assertions.assertEquals(1679264198, model.getProgress().getRunningSteps());
        Assertions.assertEquals("exkpzksmondjmq", model.getProgress().getSteps().get(0).getComponentName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-06-21T21:58:07Z"), model.getProgress().getSteps().get(0).getEndedAt());
        Assertions.assertEquals("pomgkopkwhojvp", model.getProgress().getSteps().get(0).getMessageBase());
        Assertions.assertEquals("qgxy", model.getProgress().getSteps().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-04T17:01:54Z"), model.getProgress().getSteps().get(0).getStartedAt());
        Assertions.assertEquals(
                AppsDeploymentProgressStepStatus.ERROR, model.getProgress().getSteps().get(0).getStatus());
        Assertions.assertEquals(1729730350, model.getProgress().getSuccessSteps());
        Assertions.assertEquals("cxozapvhelxp", model.getProgress().getSummarySteps().get(0).getComponentName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-12T22:12:38Z"),
                model.getProgress().getSummarySteps().get(0).getEndedAt());
        Assertions.assertEquals("atddc", model.getProgress().getSummarySteps().get(0).getMessageBase());
        Assertions.assertEquals("bcuejrjxgci", model.getProgress().getSummarySteps().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-12T15:58:19Z"),
                model.getProgress().getSummarySteps().get(0).getStartedAt());
        Assertions.assertEquals(
                AppsDeploymentProgressStepStatus.UNKNOWN, model.getProgress().getSummarySteps().get(0).getStatus());
        Assertions.assertEquals(675446410, model.getProgress().getTotalSteps());
        Assertions.assertEquals("rpqlp", model.getServices().get(0).getName());
        Assertions.assertEquals("cciuqgbdbutau", model.getServices().get(0).getSourceCommitHash());
        Assertions.assertEquals("wdreqnovvqfovl", model.getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.AMS, model.getSpec().getRegion());
        Assertions.assertEquals("uwsyrsndsytgadg", model.getSpec().getDomains().get(0).getDomain());
        Assertions.assertEquals(AppDomainSpecType.ALIAS, model.getSpec().getDomains().get(0).getType());
        Assertions.assertEquals(true, model.getSpec().getDomains().get(0).isWildcard());
        Assertions.assertEquals("neqn", model.getSpec().getDomains().get(0).getZone());
        Assertions.assertEquals(
                AppDomainSpecMinimumTlsVersion.ONE3, model.getSpec().getDomains().get(0).getMinimumTlsVersion());
        Assertions.assertEquals("ntorzihleosjswsr", model.getSpec().getServices().get(0).getName());
        Assertions.assertEquals("pzbchck", model.getSpec().getServices().get(0).getDockerfilePath());
        Assertions.assertEquals("zqioxiysuii", model.getSpec().getServices().get(0).getBuildCommand());
        Assertions.assertEquals("nkedyatrwyhqmib", model.getSpec().getServices().get(0).getRunCommand());
        Assertions.assertEquals("hwit", model.getSpec().getServices().get(0).getSourceDir());
        Assertions.assertEquals("pyy", model.getSpec().getServices().get(0).getEnvironmentSlug());
        Assertions.assertEquals(6369380004296885865L, model.getSpec().getServices().get(0).getHttpPort());
        Assertions.assertEquals(4359673283515658098L, model.getSpec().getServices().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALL,
                model.getSpec().getServices().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("kkfoqr", model.getSpec().getStaticSites().get(0).getName());
        Assertions.assertEquals("kf", model.getSpec().getStaticSites().get(0).getDockerfilePath());
        Assertions.assertEquals("wneaiv", model.getSpec().getStaticSites().get(0).getBuildCommand());
        Assertions.assertEquals("czelpcirel", model.getSpec().getStaticSites().get(0).getRunCommand());
        Assertions.assertEquals("eae", model.getSpec().getStaticSites().get(0).getSourceDir());
        Assertions.assertEquals("bfatklddxbjhwu", model.getSpec().getStaticSites().get(0).getEnvironmentSlug());
        Assertions.assertEquals("piohgwxrtfu", model.getSpec().getStaticSites().get(0).getIndexDocument());
        Assertions.assertEquals("epxgyqagvr", model.getSpec().getStaticSites().get(0).getErrorDocument());
        Assertions.assertEquals("npkukghimdblx", model.getSpec().getStaticSites().get(0).getCatchallDocument());
        Assertions.assertEquals("imfnjhfjx", model.getSpec().getStaticSites().get(0).getOutputDir());
        Assertions.assertEquals("i", model.getSpec().getJobs().get(0).getName());
        Assertions.assertEquals("rx", model.getSpec().getJobs().get(0).getDockerfilePath());
        Assertions.assertEquals("thzvaytdwkqbrqu", model.getSpec().getJobs().get(0).getBuildCommand());
        Assertions.assertEquals("axhexiilivp", model.getSpec().getJobs().get(0).getRunCommand());
        Assertions.assertEquals("iirqtd", model.getSpec().getJobs().get(0).getSourceDir());
        Assertions.assertEquals("xoruzfgsquyfxrx", model.getSpec().getJobs().get(0).getEnvironmentSlug());
        Assertions.assertEquals(AppJobSpecKind.POST_DEPLOY, model.getSpec().getJobs().get(0).getKind());
        Assertions.assertEquals(6335921088837380808L, model.getSpec().getJobs().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.BASICM,
                model.getSpec().getJobs().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("jjcanvxbvtv", model.getSpec().getWorkers().get(0).getName());
        Assertions.assertEquals("ormrlxqtvcofudfl", model.getSpec().getWorkers().get(0).getDockerfilePath());
        Assertions.assertEquals("gj", model.getSpec().getWorkers().get(0).getBuildCommand());
        Assertions.assertEquals("gdknnqv", model.getSpec().getWorkers().get(0).getRunCommand());
        Assertions.assertEquals("znqntoru", model.getSpec().getWorkers().get(0).getSourceDir());
        Assertions.assertEquals("sahmky", model.getSpec().getWorkers().get(0).getEnvironmentSlug());
        Assertions.assertEquals(1028769978978951070L, model.getSpec().getWorkers().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL_XL,
                model.getSpec().getWorkers().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("ra", model.getSpec().getFunctions().get(0).getName());
        Assertions.assertEquals("zkoowtlmnguxawqa", model.getSpec().getFunctions().get(0).getSourceDir());
        Assertions.assertEquals("ttwvogvbbe", model.getSpec().getDatabases().get(0).getClusterName());
        Assertions.assertEquals("cngqqmoakufgmjz", model.getSpec().getDatabases().get(0).getDbName());
        Assertions.assertEquals("rdgrtw", model.getSpec().getDatabases().get(0).getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.PG, model.getSpec().getDatabases().get(0).getEngine());
        Assertions.assertEquals("u", model.getSpec().getDatabases().get(0).getName());
        Assertions.assertEquals(true, model.getSpec().getDatabases().get(0).isProduction());
        Assertions.assertEquals("pbminr", model.getSpec().getDatabases().get(0).getVersion());
        Assertions.assertEquals("oluhczbwemh", model.getStaticSites().get(0).getName());
        Assertions.assertEquals("rsbrgzdwm", model.getStaticSites().get(0).getSourceCommitHash());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-10T18:32:54Z"), model.getUpdatedAt());
        Assertions.assertEquals("mkttlstvlzywem", model.getWorkers().get(0).getName());
        Assertions.assertEquals("rncsdtclu", model.getWorkers().get(0).getSourceCommitHash());
    }

    @Test
    public void testSerialize() {
        AppsDeployment model =
                new AppsDeployment()
                        .setCause("wdmhdlxyjrxs")
                        .setClonedFrom("afcnih")
                        .setCreatedAt(OffsetDateTime.parse("2021-09-16T02:36:36Z"))
                        .setId("pnedgf")
                        .setJobs(
                                Arrays.asList(
                                        new AppsDeploymentJob()
                                                .setName("cvqvpkeqdcv")
                                                .setSourceCommitHash("hvoodsotbobzd"),
                                        new AppsDeploymentJob().setName("cjwvn").setSourceCommitHash("ld"),
                                        new AppsDeploymentJob().setName("gx").setSourceCommitHash("rslpmutwuoeg")))
                        .setFunctions(
                                Arrays.asList(
                                        new AppsDeploymentFunctions()
                                                .setName("jw")
                                                .setSourceCommitHash("yqsluic")
                                                .setNamespace("ggkzzlvmbmpa"),
                                        new AppsDeploymentFunctions()
                                                .setName("odfvuefywsbp")
                                                .setSourceCommitHash("mwyhr")
                                                .setNamespace("uyfta")))
                        .setPhase(AppsDeploymentPhase.DEPLOYING)
                        .setPhaseLastUpdatedAt(OffsetDateTime.parse("2021-11-18T00:43:07Z"))
                        .setProgress(
                                new AppsDeploymentProgress()
                                        .setErrorSteps(1040923285)
                                        .setPendingSteps(842537299)
                                        .setRunningSteps(1679264198)
                                        .setSteps(
                                                Arrays.asList(
                                                        new AppsDeploymentProgressStep()
                                                                .setComponentName("exkpzksmondjmq")
                                                                .setEndedAt(
                                                                        OffsetDateTime.parse("2021-06-21T21:58:07Z"))
                                                                .setMessageBase("pomgkopkwhojvp")
                                                                .setName("qgxy")
                                                                .setStartedAt(
                                                                        OffsetDateTime.parse("2021-04-04T17:01:54Z"))
                                                                .setStatus(AppsDeploymentProgressStepStatus.ERROR)
                                                                .setSteps(Arrays.asList())))
                                        .setSuccessSteps(1729730350)
                                        .setSummarySteps(
                                                Arrays.asList(
                                                        new AppsDeploymentProgressStep()
                                                                .setComponentName("cxozapvhelxp")
                                                                .setEndedAt(
                                                                        OffsetDateTime.parse("2021-09-12T22:12:38Z"))
                                                                .setMessageBase("atddc")
                                                                .setName("bcuejrjxgci")
                                                                .setStartedAt(
                                                                        OffsetDateTime.parse("2021-10-12T15:58:19Z"))
                                                                .setStatus(AppsDeploymentProgressStepStatus.UNKNOWN)
                                                                .setSteps(Arrays.asList()),
                                                        new AppsDeploymentProgressStep()
                                                                .setComponentName("sdqrhzoymibmrq")
                                                                .setEndedAt(
                                                                        OffsetDateTime.parse("2021-07-29T17:32:56Z"))
                                                                .setMessageBase("hwflu")
                                                                .setName("dtmhrkwofyyvoqa")
                                                                .setStartedAt(
                                                                        OffsetDateTime.parse("2021-02-16T07:05:48Z"))
                                                                .setStatus(AppsDeploymentProgressStepStatus.PENDING)
                                                                .setSteps(Arrays.asList()),
                                                        new AppsDeploymentProgressStep()
                                                                .setComponentName("giwbwoenwa")
                                                                .setEndedAt(
                                                                        OffsetDateTime.parse("2021-03-28T20:58:03Z"))
                                                                .setMessageBase("dtkcnqxwbpokulp")
                                                                .setName("jwaa")
                                                                .setStartedAt(
                                                                        OffsetDateTime.parse("2021-01-28T12:35:49Z"))
                                                                .setStatus(AppsDeploymentProgressStepStatus.ERROR)
                                                                .setSteps(Arrays.asList())))
                                        .setTotalSteps(675446410))
                        .setServices(
                                Arrays.asList(
                                        new AppsDeploymentService()
                                                .setName("rpqlp")
                                                .setSourceCommitHash("cciuqgbdbutau"),
                                        new AppsDeploymentService()
                                                .setName("btkuwhh")
                                                .setSourceCommitHash("ykojoxafnndlpic"),
                                        new AppsDeploymentService().setName("o").setSourceCommitHash("kcdyhbpk")))
                        .setSpec(
                                new AppSpec()
                                        .setName("wdreqnovvqfovl")
                                        .setRegion(AppSpecRegion.AMS)
                                        .setDomains(
                                                Arrays.asList(
                                                        new AppDomainSpec()
                                                                .setDomain("uwsyrsndsytgadg")
                                                                .setType(AppDomainSpecType.ALIAS)
                                                                .setWildcard(true)
                                                                .setZone("neqn")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE3),
                                                        new AppDomainSpec()
                                                                .setDomain("rwlqu")
                                                                .setType(AppDomainSpecType.DEFAULT)
                                                                .setWildcard(false)
                                                                .setZone("acewiipfpubjibw")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE2),
                                                        new AppDomainSpec()
                                                                .setDomain("tohqkvpuvksgp")
                                                                .setType(AppDomainSpecType.ALIAS)
                                                                .setWildcard(true)
                                                                .setZone("n")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE2)))
                                        .setServices(
                                                Arrays.asList(
                                                        new AppServiceSpec()
                                                                .setName("ntorzihleosjswsr")
                                                                .setDockerfilePath("pzbchck")
                                                                .setBuildCommand("zqioxiysuii")
                                                                .setRunCommand("nkedyatrwyhqmib")
                                                                .setSourceDir("hwit")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("pyy")
                                                                .setHttpPort(6369380004296885865L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(4359673283515658098L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALL),
                                                        new AppServiceSpec()
                                                                .setName("abikns")
                                                                .setDockerfilePath("bldtlww")
                                                                .setBuildCommand("kdmtncvokotll")
                                                                .setRunCommand("yhgsy")
                                                                .setSourceDir("ogjltdtbnnhad")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("rkvcikhnvpa")
                                                                .setHttpPort(6601309306098358089L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(4287611654348954436L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASICM),
                                                        new AppServiceSpec()
                                                                .setName("xkalla")
                                                                .setDockerfilePath("ipicc")
                                                                .setBuildCommand("kzivgvvcnayrh")
                                                                .setRunCommand("nxxmueedndrdv")
                                                                .setSourceDir("kwqqtchealmf")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("aayg")
                                                                .setHttpPort(7776859938318021776L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(7805373587347139701L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONAL_XS)))
                                        .setStaticSites(
                                                Arrays.asList(
                                                        new AppStaticSiteSpec()
                                                                .setName("kkfoqr")
                                                                .setDockerfilePath("kf")
                                                                .setBuildCommand("wneaiv")
                                                                .setRunCommand("czelpcirel")
                                                                .setSourceDir("eae")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("bfatklddxbjhwu")
                                                                .setIndexDocument("piohgwxrtfu")
                                                                .setErrorDocument("epxgyqagvr")
                                                                .setCatchallDocument("npkukghimdblx")
                                                                .setOutputDir("imfnjhfjx")
                                                                .setRoutes(Arrays.asList()),
                                                        new AppStaticSiteSpec()
                                                                .setName("iekkezz")
                                                                .setDockerfilePath("jhdgqggebdunyga")
                                                                .setBuildCommand("idb")
                                                                .setRunCommand("atpxl")
                                                                .setSourceDir("xcyjmoadsuvarmy")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("jsjqbjhhyx")
                                                                .setIndexDocument("oz")
                                                                .setErrorDocument("sphyoulpjrvxa")
                                                                .setCatchallDocument("rvimjwosytxitcsk")
                                                                .setOutputDir("k")
                                                                .setRoutes(Arrays.asList()),
                                                        new AppStaticSiteSpec()
                                                                .setName("fwqmzqalkrmn")
                                                                .setDockerfilePath("cqqudf")
                                                                .setBuildCommand("yxbaaabjyvayf")
                                                                .setRunCommand("m")
                                                                .setSourceDir("rtuzqogs")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("evfdnwnwm")
                                                                .setIndexDocument("lyc")
                                                                .setErrorDocument("uhpkxkgymar")
                                                                .setCatchallDocument("n")
                                                                .setOutputDir("xqugjhkycubedd")
                                                                .setRoutes(Arrays.asList())))
                                        .setJobs(
                                                Arrays.asList(
                                                        new AppJobSpec()
                                                                .setName("i")
                                                                .setDockerfilePath("rx")
                                                                .setBuildCommand("thzvaytdwkqbrqu")
                                                                .setRunCommand("axhexiilivp")
                                                                .setSourceDir("iirqtd")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("xoruzfgsquyfxrx")
                                                                .setKind(AppJobSpecKind.POST_DEPLOY)
                                                                .setInstanceCount(6335921088837380808L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASICM),
                                                        new AppJobSpec()
                                                                .setName("ezw")
                                                                .setDockerfilePath("qlcvydy")
                                                                .setBuildCommand("tdooaoj")
                                                                .setRunCommand("iodkooebwnujhem")
                                                                .setSourceDir("bvdkcrodtjin")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("lfltka")
                                                                .setKind(AppJobSpecKind.PREDEPLOY)
                                                                .setInstanceCount(4173276744346571971L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALM),
                                                        new AppJobSpec()
                                                                .setName("akggkfpag")
                                                                .setDockerfilePath("pqblylsyxkqjnsj")
                                                                .setBuildCommand("vti")
                                                                .setRunCommand("xsdszuempsb")
                                                                .setSourceDir("f")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("yvpnqicvinvkjj")
                                                                .setKind(AppJobSpecKind.PREDEPLOY)
                                                                .setInstanceCount(6490344131392989957L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALS),
                                                        new AppJobSpec()
                                                                .setName("lewyhmlwpaz")
                                                                .setDockerfilePath("cckwyfzqwhxxbu")
                                                                .setBuildCommand("a")
                                                                .setRunCommand("feqztppriol")
                                                                .setSourceDir("rjaltolmncw")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("qwcsdbnwdcfhuc")
                                                                .setKind(AppJobSpecKind.FAILED_DEPLOY)
                                                                .setInstanceCount(4841685687030485565L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONAL_XS)))
                                        .setWorkers(
                                                Arrays.asList(
                                                        new AppWorkerSpec()
                                                                .setName("jjcanvxbvtv")
                                                                .setDockerfilePath("ormrlxqtvcofudfl")
                                                                .setBuildCommand("gj")
                                                                .setRunCommand("gdknnqv")
                                                                .setSourceDir("znqntoru")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("sahmky")
                                                                .setInstanceCount(1028769978978951070L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONAL_XL),
                                                        new AppWorkerSpec()
                                                                .setName("etaebu")
                                                                .setDockerfilePath("vsmzlxwab")
                                                                .setBuildCommand("oefki")
                                                                .setRunCommand("vtpuqujmqlgk")
                                                                .setSourceDir("tndoaongbjc")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("jitcjedftwwaez")
                                                                .setInstanceCount(3000179800184836429L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALM),
                                                        new AppWorkerSpec()
                                                                .setName("foqouicybx")
                                                                .setDockerfilePath("ufoxc")
                                                                .setBuildCommand("opidoamciodh")
                                                                .setRunCommand("azxkhnzbonlwnto")
                                                                .setSourceDir("okdwb")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("szzcmrvexztv")
                                                                .setInstanceCount(985316171720734071L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASIC_XXS)))
                                        .setFunctions(
                                                Arrays.asList(
                                                        new AppFunctionsSpec()
                                                                .setRoutes(Arrays.asList())
                                                                .setName("ra")
                                                                .setSourceDir("zkoowtlmnguxawqa")
                                                                .setAlerts(Arrays.asList())
                                                                .setEnvs(Arrays.asList()),
                                                        new AppFunctionsSpec()
                                                                .setRoutes(Arrays.asList())
                                                                .setName("erqf")
                                                                .setSourceDir("wyznkbyku")
                                                                .setAlerts(Arrays.asList())
                                                                .setEnvs(Arrays.asList()),
                                                        new AppFunctionsSpec()
                                                                .setRoutes(Arrays.asList())
                                                                .setName("hrskdsnfd")
                                                                .setSourceDir("oakgtdlmkkzev")
                                                                .setAlerts(Arrays.asList())
                                                                .setEnvs(Arrays.asList())))
                                        .setDatabases(
                                                Arrays.asList(
                                                        new AppDatabaseSpec()
                                                                .setClusterName("ttwvogvbbe")
                                                                .setDbName("cngqqmoakufgmjz")
                                                                .setDbUser("rdgrtw")
                                                                .setEngine(AppDatabaseSpecEngine.PG)
                                                                .setName("u")
                                                                .setProduction(true)
                                                                .setVersion("pbminr"),
                                                        new AppDatabaseSpec()
                                                                .setClusterName("woyuhhziuief")
                                                                .setDbName("bhdmsmlmzqhof")
                                                                .setDbUser("maequiahxicslfa")
                                                                .setEngine(AppDatabaseSpecEngine.UNSET)
                                                                .setName("piyylhalnswhccsp")
                                                                .setProduction(true)
                                                                .setVersion("vwitqscyw"))))
                        .setStaticSites(
                                Arrays.asList(
                                        new AppsDeploymentStaticSite()
                                                .setName("oluhczbwemh")
                                                .setSourceCommitHash("rsbrgzdwm")))
                        .setUpdatedAt(OffsetDateTime.parse("2021-08-10T18:32:54Z"))
                        .setWorkers(
                                Arrays.asList(
                                        new AppsDeploymentWorker()
                                                .setName("mkttlstvlzywem")
                                                .setSourceCommitHash("rncsdtclu")));
        model = BinaryData.fromObject(model).toObject(AppsDeployment.class);
        Assertions.assertEquals("wdmhdlxyjrxs", model.getCause());
        Assertions.assertEquals("afcnih", model.getClonedFrom());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-16T02:36:36Z"), model.getCreatedAt());
        Assertions.assertEquals("pnedgf", model.getId());
        Assertions.assertEquals("cvqvpkeqdcv", model.getJobs().get(0).getName());
        Assertions.assertEquals("hvoodsotbobzd", model.getJobs().get(0).getSourceCommitHash());
        Assertions.assertEquals("jw", model.getFunctions().get(0).getName());
        Assertions.assertEquals("yqsluic", model.getFunctions().get(0).getSourceCommitHash());
        Assertions.assertEquals("ggkzzlvmbmpa", model.getFunctions().get(0).getNamespace());
        Assertions.assertEquals(AppsDeploymentPhase.DEPLOYING, model.getPhase());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-18T00:43:07Z"), model.getPhaseLastUpdatedAt());
        Assertions.assertEquals(1040923285, model.getProgress().getErrorSteps());
        Assertions.assertEquals(842537299, model.getProgress().getPendingSteps());
        Assertions.assertEquals(1679264198, model.getProgress().getRunningSteps());
        Assertions.assertEquals("exkpzksmondjmq", model.getProgress().getSteps().get(0).getComponentName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-06-21T21:58:07Z"), model.getProgress().getSteps().get(0).getEndedAt());
        Assertions.assertEquals("pomgkopkwhojvp", model.getProgress().getSteps().get(0).getMessageBase());
        Assertions.assertEquals("qgxy", model.getProgress().getSteps().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-04T17:01:54Z"), model.getProgress().getSteps().get(0).getStartedAt());
        Assertions.assertEquals(
                AppsDeploymentProgressStepStatus.ERROR, model.getProgress().getSteps().get(0).getStatus());
        Assertions.assertEquals(1729730350, model.getProgress().getSuccessSteps());
        Assertions.assertEquals("cxozapvhelxp", model.getProgress().getSummarySteps().get(0).getComponentName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-12T22:12:38Z"),
                model.getProgress().getSummarySteps().get(0).getEndedAt());
        Assertions.assertEquals("atddc", model.getProgress().getSummarySteps().get(0).getMessageBase());
        Assertions.assertEquals("bcuejrjxgci", model.getProgress().getSummarySteps().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-12T15:58:19Z"),
                model.getProgress().getSummarySteps().get(0).getStartedAt());
        Assertions.assertEquals(
                AppsDeploymentProgressStepStatus.UNKNOWN, model.getProgress().getSummarySteps().get(0).getStatus());
        Assertions.assertEquals(675446410, model.getProgress().getTotalSteps());
        Assertions.assertEquals("rpqlp", model.getServices().get(0).getName());
        Assertions.assertEquals("cciuqgbdbutau", model.getServices().get(0).getSourceCommitHash());
        Assertions.assertEquals("wdreqnovvqfovl", model.getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.AMS, model.getSpec().getRegion());
        Assertions.assertEquals("uwsyrsndsytgadg", model.getSpec().getDomains().get(0).getDomain());
        Assertions.assertEquals(AppDomainSpecType.ALIAS, model.getSpec().getDomains().get(0).getType());
        Assertions.assertEquals(true, model.getSpec().getDomains().get(0).isWildcard());
        Assertions.assertEquals("neqn", model.getSpec().getDomains().get(0).getZone());
        Assertions.assertEquals(
                AppDomainSpecMinimumTlsVersion.ONE3, model.getSpec().getDomains().get(0).getMinimumTlsVersion());
        Assertions.assertEquals("ntorzihleosjswsr", model.getSpec().getServices().get(0).getName());
        Assertions.assertEquals("pzbchck", model.getSpec().getServices().get(0).getDockerfilePath());
        Assertions.assertEquals("zqioxiysuii", model.getSpec().getServices().get(0).getBuildCommand());
        Assertions.assertEquals("nkedyatrwyhqmib", model.getSpec().getServices().get(0).getRunCommand());
        Assertions.assertEquals("hwit", model.getSpec().getServices().get(0).getSourceDir());
        Assertions.assertEquals("pyy", model.getSpec().getServices().get(0).getEnvironmentSlug());
        Assertions.assertEquals(6369380004296885865L, model.getSpec().getServices().get(0).getHttpPort());
        Assertions.assertEquals(4359673283515658098L, model.getSpec().getServices().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALL,
                model.getSpec().getServices().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("kkfoqr", model.getSpec().getStaticSites().get(0).getName());
        Assertions.assertEquals("kf", model.getSpec().getStaticSites().get(0).getDockerfilePath());
        Assertions.assertEquals("wneaiv", model.getSpec().getStaticSites().get(0).getBuildCommand());
        Assertions.assertEquals("czelpcirel", model.getSpec().getStaticSites().get(0).getRunCommand());
        Assertions.assertEquals("eae", model.getSpec().getStaticSites().get(0).getSourceDir());
        Assertions.assertEquals("bfatklddxbjhwu", model.getSpec().getStaticSites().get(0).getEnvironmentSlug());
        Assertions.assertEquals("piohgwxrtfu", model.getSpec().getStaticSites().get(0).getIndexDocument());
        Assertions.assertEquals("epxgyqagvr", model.getSpec().getStaticSites().get(0).getErrorDocument());
        Assertions.assertEquals("npkukghimdblx", model.getSpec().getStaticSites().get(0).getCatchallDocument());
        Assertions.assertEquals("imfnjhfjx", model.getSpec().getStaticSites().get(0).getOutputDir());
        Assertions.assertEquals("i", model.getSpec().getJobs().get(0).getName());
        Assertions.assertEquals("rx", model.getSpec().getJobs().get(0).getDockerfilePath());
        Assertions.assertEquals("thzvaytdwkqbrqu", model.getSpec().getJobs().get(0).getBuildCommand());
        Assertions.assertEquals("axhexiilivp", model.getSpec().getJobs().get(0).getRunCommand());
        Assertions.assertEquals("iirqtd", model.getSpec().getJobs().get(0).getSourceDir());
        Assertions.assertEquals("xoruzfgsquyfxrx", model.getSpec().getJobs().get(0).getEnvironmentSlug());
        Assertions.assertEquals(AppJobSpecKind.POST_DEPLOY, model.getSpec().getJobs().get(0).getKind());
        Assertions.assertEquals(6335921088837380808L, model.getSpec().getJobs().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.BASICM,
                model.getSpec().getJobs().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("jjcanvxbvtv", model.getSpec().getWorkers().get(0).getName());
        Assertions.assertEquals("ormrlxqtvcofudfl", model.getSpec().getWorkers().get(0).getDockerfilePath());
        Assertions.assertEquals("gj", model.getSpec().getWorkers().get(0).getBuildCommand());
        Assertions.assertEquals("gdknnqv", model.getSpec().getWorkers().get(0).getRunCommand());
        Assertions.assertEquals("znqntoru", model.getSpec().getWorkers().get(0).getSourceDir());
        Assertions.assertEquals("sahmky", model.getSpec().getWorkers().get(0).getEnvironmentSlug());
        Assertions.assertEquals(1028769978978951070L, model.getSpec().getWorkers().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL_XL,
                model.getSpec().getWorkers().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("ra", model.getSpec().getFunctions().get(0).getName());
        Assertions.assertEquals("zkoowtlmnguxawqa", model.getSpec().getFunctions().get(0).getSourceDir());
        Assertions.assertEquals("ttwvogvbbe", model.getSpec().getDatabases().get(0).getClusterName());
        Assertions.assertEquals("cngqqmoakufgmjz", model.getSpec().getDatabases().get(0).getDbName());
        Assertions.assertEquals("rdgrtw", model.getSpec().getDatabases().get(0).getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.PG, model.getSpec().getDatabases().get(0).getEngine());
        Assertions.assertEquals("u", model.getSpec().getDatabases().get(0).getName());
        Assertions.assertEquals(true, model.getSpec().getDatabases().get(0).isProduction());
        Assertions.assertEquals("pbminr", model.getSpec().getDatabases().get(0).getVersion());
        Assertions.assertEquals("oluhczbwemh", model.getStaticSites().get(0).getName());
        Assertions.assertEquals("rsbrgzdwm", model.getStaticSites().get(0).getSourceCommitHash());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-10T18:32:54Z"), model.getUpdatedAt());
        Assertions.assertEquals("mkttlstvlzywem", model.getWorkers().get(0).getName());
        Assertions.assertEquals("rncsdtclu", model.getWorkers().get(0).getSourceCommitHash());
    }
}
