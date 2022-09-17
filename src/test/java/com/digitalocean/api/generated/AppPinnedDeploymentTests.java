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
import com.digitalocean.api.models.AppPinnedDeployment;
import com.digitalocean.api.models.AppServiceSpec;
import com.digitalocean.api.models.AppSpec;
import com.digitalocean.api.models.AppSpecRegion;
import com.digitalocean.api.models.AppStaticSiteSpec;
import com.digitalocean.api.models.AppWorkerSpec;
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

public final class AppPinnedDeploymentTests {
    @Test
    public void testDeserialize() {
        AppPinnedDeployment model =
                BinaryData.fromString(
                                "{\"cause\":\"nmwmqtibx\",\"cloned_from\":\"jddtvqct\",\"created_at\":\"2021-02-01T02:02:10Z\",\"id\":\"jaeukmrsieekpn\",\"jobs\":[{\"name\":\"pmudqmeqwig\",\"source_commit_hash\":\"bu\"}],\"functions\":[{\"name\":\"xebeybpmz\",\"source_commit_hash\":\"rtffyaqitmh\",\"namespace\":\"ioqaqhvs\"},{\"name\":\"fuqyrxpdlcgqlsi\",\"source_commit_hash\":\"jqfrddgamquh\",\"namespace\":\"srsjuivfc\"},{\"name\":\"syirnx\",\"source_commit_hash\":\"czexrxzbujrtrhqv\",\"namespace\":\"evkh\"}],\"phase\":\"PENDING_DEPLOY\",\"phase_last_updated_at\":\"2021-02-26T15:00:21Z\",\"progress\":{\"error_steps\":1051874879,\"pending_steps\":100699091,\"running_steps\":155304322,\"steps\":[{\"component_name\":\"ncvjts\",\"ended_at\":\"2021-11-06T01:54:44Z\",\"message_base\":\"izehtdhgbjk\",\"name\":\"eljeamurvzmlovua\",\"started_at\":\"2021-04-08T06:13:02Z\",\"status\":\"SUCCESS\",\"steps\":[]}],\"success_steps\":1846794278,\"summary_steps\":[{\"component_name\":\"bdkelvidizo\",\"ended_at\":\"2021-07-19T10:38:32Z\",\"message_base\":\"ccxjm\",\"name\":\"fdgnwncypuuwwlt\",\"started_at\":\"2021-04-17T06:33:56Z\",\"status\":\"UNKNOWN\",\"steps\":[]},{\"component_name\":\"nkeifz\",\"ended_at\":\"2021-11-19T10:45:07Z\",\"message_base\":\"dasvfl\",\"name\":\"bxcudchx\",\"started_at\":\"2021-04-30T11:51:23Z\",\"status\":\"PENDING\",\"steps\":[]}],\"total_steps\":477372699},\"services\":[{\"name\":\"wjlvizbfhfov\",\"source_commit_hash\":\"cqpbtuo\"},{\"name\":\"eszabbelawumuas\",\"source_commit_hash\":\"kwrrwo\"},{\"name\":\"qucwyhahnom\",\"source_commit_hash\":\"kywuhpsvfuu\"}],\"spec\":{\"name\":\"tlwexxwlalniexz\",\"region\":\"nyc\",\"domains\":[{\"domain\":\"epqtybb\",\"type\":\"PRIMARY\",\"wildcard\":true,\"zone\":\"k\",\"minimum_tls_version\":\"1.2\"},{\"domain\":\"yvlixqnrk\",\"type\":\"ALIAS\",\"wildcard\":false,\"zone\":\"nxm\",\"minimum_tls_version\":\"1.3\"},{\"domain\":\"xs\",\"type\":\"PRIMARY\",\"wildcard\":true,\"zone\":\"lwi\",\"minimum_tls_version\":\"1.2\"}],\"services\":[{\"http_port\":1056642097255171720,\"internal_ports\":[],\"routes\":[],\"instance_count\":4532373317471421992,\"instance_size_slug\":\"basic-s\",\"name\":\"hruncuwmq\",\"dockerfile_path\":\"zhlctddunqndyfpc\",\"build_command\":\"qbnj\",\"run_command\":\"cgegydcwbo\",\"source_dir\":\"umvq\",\"envs\":[],\"environment_slug\":\"ihrraiouaub\"},{\"http_port\":2652282357276335541,\"internal_ports\":[],\"routes\":[],\"instance_count\":6619739056622145122,\"instance_size_slug\":\"basic-m\",\"name\":\"flrzpas\",\"dockerfile_path\":\"mzdlyjdfqwmkyo\",\"build_command\":\"fdvruz\",\"run_command\":\"zojhpctfnmd\",\"source_dir\":\"tngfdgugeyzihgr\",\"envs\":[],\"environment_slug\":\"i\"},{\"http_port\":3001413149063858536,\"internal_ports\":[],\"routes\":[],\"instance_count\":6510974356016534844,\"instance_size_slug\":\"professional-m\",\"name\":\"yhyhsgzfczb\",\"dockerfile_path\":\"eglqgleohibetn\",\"build_command\":\"ankrrfxee\",\"run_command\":\"tijv\",\"source_dir\":\"vbmqzbqq\",\"envs\":[],\"environment_slug\":\"jrnwxacev\"}],\"static_sites\":[{\"index_document\":\"yxoaf\",\"error_document\":\"oqltfae\",\"catchall_document\":\"inmfgvxirp\",\"output_dir\":\"riypoqeyhlqhyk\",\"routes\":[],\"name\":\"yznuciqd\",\"dockerfile_path\":\"tdfuxt\",\"build_command\":\"siibmiybnnustgn\",\"run_command\":\"hnmgixhcm\",\"source_dir\":\"mqfoudorh\",\"envs\":[],\"environment_slug\":\"yprotwyp\"},{\"index_document\":\"mbxhugcmjkav\",\"error_document\":\"or\",\"catchall_document\":\"ftpmdtzfjltfv\",\"output_dir\":\"cyjtotpvop\",\"routes\":[],\"name\":\"bzqgqqi\",\"dockerfile_path\":\"wthmkyib\",\"build_command\":\"sihsgqcwdhohsd\",\"run_command\":\"cdzsu\",\"source_dir\":\"ohdxbzlmcmu\",\"envs\":[],\"environment_slug\":\"vhdbevwqqxey\"}],\"jobs\":[{\"kind\":\"FAILED_DEPLOY\",\"instance_count\":903861230057569847,\"instance_size_slug\":\"professional-xl\",\"name\":\"gbzbowxeqo\",\"dockerfile_path\":\"vkzqk\",\"build_command\":\"eokbze\",\"run_command\":\"zrxcczurt\",\"source_dir\":\"ipqxbkwvzgnzv\",\"envs\":[],\"environment_slug\":\"zdix\"}],\"workers\":[{\"instance_count\":8281398224809060796,\"instance_size_slug\":\"professional-l\",\"name\":\"pqhe\",\"dockerfile_path\":\"gsbos\",\"build_command\":\"eln\",\"run_command\":\"atutmzlbiojlvfhr\",\"source_dir\":\"pn\",\"envs\":[],\"environment_slug\":\"cwwyyur\"},{\"instance_count\":4406544619983764230,\"instance_size_slug\":\"professional-s\",\"name\":\"rsnm\",\"dockerfile_path\":\"jnhlbkpbzpcpiljh\",\"build_command\":\"zv\",\"run_command\":\"h\",\"source_dir\":\"bnwieholew\",\"envs\":[],\"environment_slug\":\"uubw\"},{\"instance_count\":3707229542320357928,\"instance_size_slug\":\"professional-l\",\"name\":\"qtferrqwexjkmf\",\"dockerfile_path\":\"gqqnobpudcda\",\"build_command\":\"qwpwyawbzasqbuc\",\"run_command\":\"gkyexaoguy\",\"source_dir\":\"p\",\"envs\":[],\"environment_slug\":\"daultxijjumfq\"}],\"functions\":[{\"routes\":[],\"name\":\"nm\",\"source_dir\":\"ngz\",\"alerts\":[],\"envs\":[]},{\"routes\":[],\"name\":\"nyfusfzsvtuikzh\",\"source_dir\":\"qglcfhmlrqryxynq\",\"alerts\":[],\"envs\":[]}],\"databases\":[{\"cluster_name\":\"zn\",\"db_name\":\"goeiybbabpfhvfsl\",\"db_user\":\"ntjlr\",\"engine\":\"MYSQL\",\"name\":\"kskyrioovzid\",\"production\":true,\"version\":\"abzmifrygznmmaxr\"},{\"cluster_name\":\"kzobgopxlhsln\",\"db_name\":\"xieixynllxec\",\"db_user\":\"rojphslhcawjutif\",\"engine\":\"REDIS\",\"name\":\"mvi\",\"production\":false,\"version\":\"jbt\"},{\"cluster_name\":\"h\",\"db_name\":\"glka\",\"db_user\":\"onqjujeickpzvcpo\",\"engine\":\"MYSQL\",\"name\":\"elnwclt\",\"production\":true,\"version\":\"ex\"}]},\"static_sites\":[{\"name\":\"mkqscaz\",\"source_commit_hash\":\"wxtzxpuamwab\"}],\"tier_slug\":\"rvxcush\",\"updated_at\":\"2021-03-22T04:27:33Z\",\"workers\":[{\"name\":\"mxyasflvgsgzw\",\"source_commit_hash\":\"akoi\"},{\"name\":\"nsmjbl\",\"source_commit_hash\":\"jhlnymzotqyryu\"},{\"name\":\"bmqqvxmvw\",\"source_commit_hash\":\"tayx\"}]}")
                        .toObject(AppPinnedDeployment.class);
        Assertions.assertEquals("nmwmqtibx", model.getCause());
        Assertions.assertEquals("jddtvqct", model.getClonedFrom());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-01T02:02:10Z"), model.getCreatedAt());
        Assertions.assertEquals("jaeukmrsieekpn", model.getId());
        Assertions.assertEquals("pmudqmeqwig", model.getJobs().get(0).getName());
        Assertions.assertEquals("bu", model.getJobs().get(0).getSourceCommitHash());
        Assertions.assertEquals("xebeybpmz", model.getFunctions().get(0).getName());
        Assertions.assertEquals("rtffyaqitmh", model.getFunctions().get(0).getSourceCommitHash());
        Assertions.assertEquals("ioqaqhvs", model.getFunctions().get(0).getNamespace());
        Assertions.assertEquals(AppsDeploymentPhase.PENDING_DEPLOY, model.getPhase());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-26T15:00:21Z"), model.getPhaseLastUpdatedAt());
        Assertions.assertEquals(1051874879, model.getProgress().getErrorSteps());
        Assertions.assertEquals(100699091, model.getProgress().getPendingSteps());
        Assertions.assertEquals(155304322, model.getProgress().getRunningSteps());
        Assertions.assertEquals("ncvjts", model.getProgress().getSteps().get(0).getComponentName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-11-06T01:54:44Z"), model.getProgress().getSteps().get(0).getEndedAt());
        Assertions.assertEquals("izehtdhgbjk", model.getProgress().getSteps().get(0).getMessageBase());
        Assertions.assertEquals("eljeamurvzmlovua", model.getProgress().getSteps().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-08T06:13:02Z"), model.getProgress().getSteps().get(0).getStartedAt());
        Assertions.assertEquals(
                AppsDeploymentProgressStepStatus.SUCCESS, model.getProgress().getSteps().get(0).getStatus());
        Assertions.assertEquals(1846794278, model.getProgress().getSuccessSteps());
        Assertions.assertEquals("bdkelvidizo", model.getProgress().getSummarySteps().get(0).getComponentName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-19T10:38:32Z"),
                model.getProgress().getSummarySteps().get(0).getEndedAt());
        Assertions.assertEquals("ccxjm", model.getProgress().getSummarySteps().get(0).getMessageBase());
        Assertions.assertEquals("fdgnwncypuuwwlt", model.getProgress().getSummarySteps().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-17T06:33:56Z"),
                model.getProgress().getSummarySteps().get(0).getStartedAt());
        Assertions.assertEquals(
                AppsDeploymentProgressStepStatus.UNKNOWN, model.getProgress().getSummarySteps().get(0).getStatus());
        Assertions.assertEquals(477372699, model.getProgress().getTotalSteps());
        Assertions.assertEquals("wjlvizbfhfov", model.getServices().get(0).getName());
        Assertions.assertEquals("cqpbtuo", model.getServices().get(0).getSourceCommitHash());
        Assertions.assertEquals("tlwexxwlalniexz", model.getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.NYC, model.getSpec().getRegion());
        Assertions.assertEquals("epqtybb", model.getSpec().getDomains().get(0).getDomain());
        Assertions.assertEquals(AppDomainSpecType.PRIMARY, model.getSpec().getDomains().get(0).getType());
        Assertions.assertEquals(true, model.getSpec().getDomains().get(0).isWildcard());
        Assertions.assertEquals("k", model.getSpec().getDomains().get(0).getZone());
        Assertions.assertEquals(
                AppDomainSpecMinimumTlsVersion.ONE2, model.getSpec().getDomains().get(0).getMinimumTlsVersion());
        Assertions.assertEquals("hruncuwmq", model.getSpec().getServices().get(0).getName());
        Assertions.assertEquals("zhlctddunqndyfpc", model.getSpec().getServices().get(0).getDockerfilePath());
        Assertions.assertEquals("qbnj", model.getSpec().getServices().get(0).getBuildCommand());
        Assertions.assertEquals("cgegydcwbo", model.getSpec().getServices().get(0).getRunCommand());
        Assertions.assertEquals("umvq", model.getSpec().getServices().get(0).getSourceDir());
        Assertions.assertEquals("ihrraiouaub", model.getSpec().getServices().get(0).getEnvironmentSlug());
        Assertions.assertEquals(1056642097255171720L, model.getSpec().getServices().get(0).getHttpPort());
        Assertions.assertEquals(4532373317471421992L, model.getSpec().getServices().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.BASICS,
                model.getSpec().getServices().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("yznuciqd", model.getSpec().getStaticSites().get(0).getName());
        Assertions.assertEquals("tdfuxt", model.getSpec().getStaticSites().get(0).getDockerfilePath());
        Assertions.assertEquals("siibmiybnnustgn", model.getSpec().getStaticSites().get(0).getBuildCommand());
        Assertions.assertEquals("hnmgixhcm", model.getSpec().getStaticSites().get(0).getRunCommand());
        Assertions.assertEquals("mqfoudorh", model.getSpec().getStaticSites().get(0).getSourceDir());
        Assertions.assertEquals("yprotwyp", model.getSpec().getStaticSites().get(0).getEnvironmentSlug());
        Assertions.assertEquals("yxoaf", model.getSpec().getStaticSites().get(0).getIndexDocument());
        Assertions.assertEquals("oqltfae", model.getSpec().getStaticSites().get(0).getErrorDocument());
        Assertions.assertEquals("inmfgvxirp", model.getSpec().getStaticSites().get(0).getCatchallDocument());
        Assertions.assertEquals("riypoqeyhlqhyk", model.getSpec().getStaticSites().get(0).getOutputDir());
        Assertions.assertEquals("gbzbowxeqo", model.getSpec().getJobs().get(0).getName());
        Assertions.assertEquals("vkzqk", model.getSpec().getJobs().get(0).getDockerfilePath());
        Assertions.assertEquals("eokbze", model.getSpec().getJobs().get(0).getBuildCommand());
        Assertions.assertEquals("zrxcczurt", model.getSpec().getJobs().get(0).getRunCommand());
        Assertions.assertEquals("ipqxbkwvzgnzv", model.getSpec().getJobs().get(0).getSourceDir());
        Assertions.assertEquals("zdix", model.getSpec().getJobs().get(0).getEnvironmentSlug());
        Assertions.assertEquals(AppJobSpecKind.FAILED_DEPLOY, model.getSpec().getJobs().get(0).getKind());
        Assertions.assertEquals(903861230057569847L, model.getSpec().getJobs().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL_XL,
                model.getSpec().getJobs().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("pqhe", model.getSpec().getWorkers().get(0).getName());
        Assertions.assertEquals("gsbos", model.getSpec().getWorkers().get(0).getDockerfilePath());
        Assertions.assertEquals("eln", model.getSpec().getWorkers().get(0).getBuildCommand());
        Assertions.assertEquals("atutmzlbiojlvfhr", model.getSpec().getWorkers().get(0).getRunCommand());
        Assertions.assertEquals("pn", model.getSpec().getWorkers().get(0).getSourceDir());
        Assertions.assertEquals("cwwyyur", model.getSpec().getWorkers().get(0).getEnvironmentSlug());
        Assertions.assertEquals(8281398224809060796L, model.getSpec().getWorkers().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALL,
                model.getSpec().getWorkers().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("nm", model.getSpec().getFunctions().get(0).getName());
        Assertions.assertEquals("ngz", model.getSpec().getFunctions().get(0).getSourceDir());
        Assertions.assertEquals("zn", model.getSpec().getDatabases().get(0).getClusterName());
        Assertions.assertEquals("goeiybbabpfhvfsl", model.getSpec().getDatabases().get(0).getDbName());
        Assertions.assertEquals("ntjlr", model.getSpec().getDatabases().get(0).getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.MYSQL, model.getSpec().getDatabases().get(0).getEngine());
        Assertions.assertEquals("kskyrioovzid", model.getSpec().getDatabases().get(0).getName());
        Assertions.assertEquals(true, model.getSpec().getDatabases().get(0).isProduction());
        Assertions.assertEquals("abzmifrygznmmaxr", model.getSpec().getDatabases().get(0).getVersion());
        Assertions.assertEquals("mkqscaz", model.getStaticSites().get(0).getName());
        Assertions.assertEquals("wxtzxpuamwab", model.getStaticSites().get(0).getSourceCommitHash());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-22T04:27:33Z"), model.getUpdatedAt());
        Assertions.assertEquals("mxyasflvgsgzw", model.getWorkers().get(0).getName());
        Assertions.assertEquals("akoi", model.getWorkers().get(0).getSourceCommitHash());
    }

    @Test
    public void testSerialize() {
        AppPinnedDeployment model =
                new AppPinnedDeployment()
                        .setCause("nmwmqtibx")
                        .setClonedFrom("jddtvqct")
                        .setCreatedAt(OffsetDateTime.parse("2021-02-01T02:02:10Z"))
                        .setId("jaeukmrsieekpn")
                        .setJobs(
                                Arrays.asList(new AppsDeploymentJob().setName("pmudqmeqwig").setSourceCommitHash("bu")))
                        .setFunctions(
                                Arrays.asList(
                                        new AppsDeploymentFunctions()
                                                .setName("xebeybpmz")
                                                .setSourceCommitHash("rtffyaqitmh")
                                                .setNamespace("ioqaqhvs"),
                                        new AppsDeploymentFunctions()
                                                .setName("fuqyrxpdlcgqlsi")
                                                .setSourceCommitHash("jqfrddgamquh")
                                                .setNamespace("srsjuivfc"),
                                        new AppsDeploymentFunctions()
                                                .setName("syirnx")
                                                .setSourceCommitHash("czexrxzbujrtrhqv")
                                                .setNamespace("evkh")))
                        .setPhase(AppsDeploymentPhase.PENDING_DEPLOY)
                        .setPhaseLastUpdatedAt(OffsetDateTime.parse("2021-02-26T15:00:21Z"))
                        .setProgress(
                                new AppsDeploymentProgress()
                                        .setErrorSteps(1051874879)
                                        .setPendingSteps(100699091)
                                        .setRunningSteps(155304322)
                                        .setSteps(
                                                Arrays.asList(
                                                        new AppsDeploymentProgressStep()
                                                                .setComponentName("ncvjts")
                                                                .setEndedAt(
                                                                        OffsetDateTime.parse("2021-11-06T01:54:44Z"))
                                                                .setMessageBase("izehtdhgbjk")
                                                                .setName("eljeamurvzmlovua")
                                                                .setStartedAt(
                                                                        OffsetDateTime.parse("2021-04-08T06:13:02Z"))
                                                                .setStatus(AppsDeploymentProgressStepStatus.SUCCESS)
                                                                .setSteps(Arrays.asList())))
                                        .setSuccessSteps(1846794278)
                                        .setSummarySteps(
                                                Arrays.asList(
                                                        new AppsDeploymentProgressStep()
                                                                .setComponentName("bdkelvidizo")
                                                                .setEndedAt(
                                                                        OffsetDateTime.parse("2021-07-19T10:38:32Z"))
                                                                .setMessageBase("ccxjm")
                                                                .setName("fdgnwncypuuwwlt")
                                                                .setStartedAt(
                                                                        OffsetDateTime.parse("2021-04-17T06:33:56Z"))
                                                                .setStatus(AppsDeploymentProgressStepStatus.UNKNOWN)
                                                                .setSteps(Arrays.asList()),
                                                        new AppsDeploymentProgressStep()
                                                                .setComponentName("nkeifz")
                                                                .setEndedAt(
                                                                        OffsetDateTime.parse("2021-11-19T10:45:07Z"))
                                                                .setMessageBase("dasvfl")
                                                                .setName("bxcudchx")
                                                                .setStartedAt(
                                                                        OffsetDateTime.parse("2021-04-30T11:51:23Z"))
                                                                .setStatus(AppsDeploymentProgressStepStatus.PENDING)
                                                                .setSteps(Arrays.asList())))
                                        .setTotalSteps(477372699))
                        .setServices(
                                Arrays.asList(
                                        new AppsDeploymentService()
                                                .setName("wjlvizbfhfov")
                                                .setSourceCommitHash("cqpbtuo"),
                                        new AppsDeploymentService()
                                                .setName("eszabbelawumuas")
                                                .setSourceCommitHash("kwrrwo"),
                                        new AppsDeploymentService()
                                                .setName("qucwyhahnom")
                                                .setSourceCommitHash("kywuhpsvfuu")))
                        .setSpec(
                                new AppSpec()
                                        .setName("tlwexxwlalniexz")
                                        .setRegion(AppSpecRegion.NYC)
                                        .setDomains(
                                                Arrays.asList(
                                                        new AppDomainSpec()
                                                                .setDomain("epqtybb")
                                                                .setType(AppDomainSpecType.PRIMARY)
                                                                .setWildcard(true)
                                                                .setZone("k")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE2),
                                                        new AppDomainSpec()
                                                                .setDomain("yvlixqnrk")
                                                                .setType(AppDomainSpecType.ALIAS)
                                                                .setWildcard(false)
                                                                .setZone("nxm")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE3),
                                                        new AppDomainSpec()
                                                                .setDomain("xs")
                                                                .setType(AppDomainSpecType.PRIMARY)
                                                                .setWildcard(true)
                                                                .setZone("lwi")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE2)))
                                        .setServices(
                                                Arrays.asList(
                                                        new AppServiceSpec()
                                                                .setName("hruncuwmq")
                                                                .setDockerfilePath("zhlctddunqndyfpc")
                                                                .setBuildCommand("qbnj")
                                                                .setRunCommand("cgegydcwbo")
                                                                .setSourceDir("umvq")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("ihrraiouaub")
                                                                .setHttpPort(1056642097255171720L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(4532373317471421992L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASICS),
                                                        new AppServiceSpec()
                                                                .setName("flrzpas")
                                                                .setDockerfilePath("mzdlyjdfqwmkyo")
                                                                .setBuildCommand("fdvruz")
                                                                .setRunCommand("zojhpctfnmd")
                                                                .setSourceDir("tngfdgugeyzihgr")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("i")
                                                                .setHttpPort(2652282357276335541L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(6619739056622145122L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASICM),
                                                        new AppServiceSpec()
                                                                .setName("yhyhsgzfczb")
                                                                .setDockerfilePath("eglqgleohibetn")
                                                                .setBuildCommand("ankrrfxee")
                                                                .setRunCommand("tijv")
                                                                .setSourceDir("vbmqzbqq")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("jrnwxacev")
                                                                .setHttpPort(3001413149063858536L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(6510974356016534844L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALM)))
                                        .setStaticSites(
                                                Arrays.asList(
                                                        new AppStaticSiteSpec()
                                                                .setName("yznuciqd")
                                                                .setDockerfilePath("tdfuxt")
                                                                .setBuildCommand("siibmiybnnustgn")
                                                                .setRunCommand("hnmgixhcm")
                                                                .setSourceDir("mqfoudorh")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("yprotwyp")
                                                                .setIndexDocument("yxoaf")
                                                                .setErrorDocument("oqltfae")
                                                                .setCatchallDocument("inmfgvxirp")
                                                                .setOutputDir("riypoqeyhlqhyk")
                                                                .setRoutes(Arrays.asList()),
                                                        new AppStaticSiteSpec()
                                                                .setName("bzqgqqi")
                                                                .setDockerfilePath("wthmkyib")
                                                                .setBuildCommand("sihsgqcwdhohsd")
                                                                .setRunCommand("cdzsu")
                                                                .setSourceDir("ohdxbzlmcmu")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("vhdbevwqqxey")
                                                                .setIndexDocument("mbxhugcmjkav")
                                                                .setErrorDocument("or")
                                                                .setCatchallDocument("ftpmdtzfjltfv")
                                                                .setOutputDir("cyjtotpvop")
                                                                .setRoutes(Arrays.asList())))
                                        .setJobs(
                                                Arrays.asList(
                                                        new AppJobSpec()
                                                                .setName("gbzbowxeqo")
                                                                .setDockerfilePath("vkzqk")
                                                                .setBuildCommand("eokbze")
                                                                .setRunCommand("zrxcczurt")
                                                                .setSourceDir("ipqxbkwvzgnzv")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("zdix")
                                                                .setKind(AppJobSpecKind.FAILED_DEPLOY)
                                                                .setInstanceCount(903861230057569847L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONAL_XL)))
                                        .setWorkers(
                                                Arrays.asList(
                                                        new AppWorkerSpec()
                                                                .setName("pqhe")
                                                                .setDockerfilePath("gsbos")
                                                                .setBuildCommand("eln")
                                                                .setRunCommand("atutmzlbiojlvfhr")
                                                                .setSourceDir("pn")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("cwwyyur")
                                                                .setInstanceCount(8281398224809060796L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALL),
                                                        new AppWorkerSpec()
                                                                .setName("rsnm")
                                                                .setDockerfilePath("jnhlbkpbzpcpiljh")
                                                                .setBuildCommand("zv")
                                                                .setRunCommand("h")
                                                                .setSourceDir("bnwieholew")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("uubw")
                                                                .setInstanceCount(4406544619983764230L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALS),
                                                        new AppWorkerSpec()
                                                                .setName("qtferrqwexjkmf")
                                                                .setDockerfilePath("gqqnobpudcda")
                                                                .setBuildCommand("qwpwyawbzasqbuc")
                                                                .setRunCommand("gkyexaoguy")
                                                                .setSourceDir("p")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("daultxijjumfq")
                                                                .setInstanceCount(3707229542320357928L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALL)))
                                        .setFunctions(
                                                Arrays.asList(
                                                        new AppFunctionsSpec()
                                                                .setRoutes(Arrays.asList())
                                                                .setName("nm")
                                                                .setSourceDir("ngz")
                                                                .setAlerts(Arrays.asList())
                                                                .setEnvs(Arrays.asList()),
                                                        new AppFunctionsSpec()
                                                                .setRoutes(Arrays.asList())
                                                                .setName("nyfusfzsvtuikzh")
                                                                .setSourceDir("qglcfhmlrqryxynq")
                                                                .setAlerts(Arrays.asList())
                                                                .setEnvs(Arrays.asList())))
                                        .setDatabases(
                                                Arrays.asList(
                                                        new AppDatabaseSpec()
                                                                .setClusterName("zn")
                                                                .setDbName("goeiybbabpfhvfsl")
                                                                .setDbUser("ntjlr")
                                                                .setEngine(AppDatabaseSpecEngine.MYSQL)
                                                                .setName("kskyrioovzid")
                                                                .setProduction(true)
                                                                .setVersion("abzmifrygznmmaxr"),
                                                        new AppDatabaseSpec()
                                                                .setClusterName("kzobgopxlhsln")
                                                                .setDbName("xieixynllxec")
                                                                .setDbUser("rojphslhcawjutif")
                                                                .setEngine(AppDatabaseSpecEngine.REDIS)
                                                                .setName("mvi")
                                                                .setProduction(false)
                                                                .setVersion("jbt"),
                                                        new AppDatabaseSpec()
                                                                .setClusterName("h")
                                                                .setDbName("glka")
                                                                .setDbUser("onqjujeickpzvcpo")
                                                                .setEngine(AppDatabaseSpecEngine.MYSQL)
                                                                .setName("elnwclt")
                                                                .setProduction(true)
                                                                .setVersion("ex"))))
                        .setStaticSites(
                                Arrays.asList(
                                        new AppsDeploymentStaticSite()
                                                .setName("mkqscaz")
                                                .setSourceCommitHash("wxtzxpuamwab")))
                        .setUpdatedAt(OffsetDateTime.parse("2021-03-22T04:27:33Z"))
                        .setWorkers(
                                Arrays.asList(
                                        new AppsDeploymentWorker().setName("mxyasflvgsgzw").setSourceCommitHash("akoi"),
                                        new AppsDeploymentWorker()
                                                .setName("nsmjbl")
                                                .setSourceCommitHash("jhlnymzotqyryu"),
                                        new AppsDeploymentWorker().setName("bmqqvxmvw").setSourceCommitHash("tayx")));
        model = BinaryData.fromObject(model).toObject(AppPinnedDeployment.class);
        Assertions.assertEquals("nmwmqtibx", model.getCause());
        Assertions.assertEquals("jddtvqct", model.getClonedFrom());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-01T02:02:10Z"), model.getCreatedAt());
        Assertions.assertEquals("jaeukmrsieekpn", model.getId());
        Assertions.assertEquals("pmudqmeqwig", model.getJobs().get(0).getName());
        Assertions.assertEquals("bu", model.getJobs().get(0).getSourceCommitHash());
        Assertions.assertEquals("xebeybpmz", model.getFunctions().get(0).getName());
        Assertions.assertEquals("rtffyaqitmh", model.getFunctions().get(0).getSourceCommitHash());
        Assertions.assertEquals("ioqaqhvs", model.getFunctions().get(0).getNamespace());
        Assertions.assertEquals(AppsDeploymentPhase.PENDING_DEPLOY, model.getPhase());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-26T15:00:21Z"), model.getPhaseLastUpdatedAt());
        Assertions.assertEquals(1051874879, model.getProgress().getErrorSteps());
        Assertions.assertEquals(100699091, model.getProgress().getPendingSteps());
        Assertions.assertEquals(155304322, model.getProgress().getRunningSteps());
        Assertions.assertEquals("ncvjts", model.getProgress().getSteps().get(0).getComponentName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-11-06T01:54:44Z"), model.getProgress().getSteps().get(0).getEndedAt());
        Assertions.assertEquals("izehtdhgbjk", model.getProgress().getSteps().get(0).getMessageBase());
        Assertions.assertEquals("eljeamurvzmlovua", model.getProgress().getSteps().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-08T06:13:02Z"), model.getProgress().getSteps().get(0).getStartedAt());
        Assertions.assertEquals(
                AppsDeploymentProgressStepStatus.SUCCESS, model.getProgress().getSteps().get(0).getStatus());
        Assertions.assertEquals(1846794278, model.getProgress().getSuccessSteps());
        Assertions.assertEquals("bdkelvidizo", model.getProgress().getSummarySteps().get(0).getComponentName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-19T10:38:32Z"),
                model.getProgress().getSummarySteps().get(0).getEndedAt());
        Assertions.assertEquals("ccxjm", model.getProgress().getSummarySteps().get(0).getMessageBase());
        Assertions.assertEquals("fdgnwncypuuwwlt", model.getProgress().getSummarySteps().get(0).getName());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-17T06:33:56Z"),
                model.getProgress().getSummarySteps().get(0).getStartedAt());
        Assertions.assertEquals(
                AppsDeploymentProgressStepStatus.UNKNOWN, model.getProgress().getSummarySteps().get(0).getStatus());
        Assertions.assertEquals(477372699, model.getProgress().getTotalSteps());
        Assertions.assertEquals("wjlvizbfhfov", model.getServices().get(0).getName());
        Assertions.assertEquals("cqpbtuo", model.getServices().get(0).getSourceCommitHash());
        Assertions.assertEquals("tlwexxwlalniexz", model.getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.NYC, model.getSpec().getRegion());
        Assertions.assertEquals("epqtybb", model.getSpec().getDomains().get(0).getDomain());
        Assertions.assertEquals(AppDomainSpecType.PRIMARY, model.getSpec().getDomains().get(0).getType());
        Assertions.assertEquals(true, model.getSpec().getDomains().get(0).isWildcard());
        Assertions.assertEquals("k", model.getSpec().getDomains().get(0).getZone());
        Assertions.assertEquals(
                AppDomainSpecMinimumTlsVersion.ONE2, model.getSpec().getDomains().get(0).getMinimumTlsVersion());
        Assertions.assertEquals("hruncuwmq", model.getSpec().getServices().get(0).getName());
        Assertions.assertEquals("zhlctddunqndyfpc", model.getSpec().getServices().get(0).getDockerfilePath());
        Assertions.assertEquals("qbnj", model.getSpec().getServices().get(0).getBuildCommand());
        Assertions.assertEquals("cgegydcwbo", model.getSpec().getServices().get(0).getRunCommand());
        Assertions.assertEquals("umvq", model.getSpec().getServices().get(0).getSourceDir());
        Assertions.assertEquals("ihrraiouaub", model.getSpec().getServices().get(0).getEnvironmentSlug());
        Assertions.assertEquals(1056642097255171720L, model.getSpec().getServices().get(0).getHttpPort());
        Assertions.assertEquals(4532373317471421992L, model.getSpec().getServices().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.BASICS,
                model.getSpec().getServices().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("yznuciqd", model.getSpec().getStaticSites().get(0).getName());
        Assertions.assertEquals("tdfuxt", model.getSpec().getStaticSites().get(0).getDockerfilePath());
        Assertions.assertEquals("siibmiybnnustgn", model.getSpec().getStaticSites().get(0).getBuildCommand());
        Assertions.assertEquals("hnmgixhcm", model.getSpec().getStaticSites().get(0).getRunCommand());
        Assertions.assertEquals("mqfoudorh", model.getSpec().getStaticSites().get(0).getSourceDir());
        Assertions.assertEquals("yprotwyp", model.getSpec().getStaticSites().get(0).getEnvironmentSlug());
        Assertions.assertEquals("yxoaf", model.getSpec().getStaticSites().get(0).getIndexDocument());
        Assertions.assertEquals("oqltfae", model.getSpec().getStaticSites().get(0).getErrorDocument());
        Assertions.assertEquals("inmfgvxirp", model.getSpec().getStaticSites().get(0).getCatchallDocument());
        Assertions.assertEquals("riypoqeyhlqhyk", model.getSpec().getStaticSites().get(0).getOutputDir());
        Assertions.assertEquals("gbzbowxeqo", model.getSpec().getJobs().get(0).getName());
        Assertions.assertEquals("vkzqk", model.getSpec().getJobs().get(0).getDockerfilePath());
        Assertions.assertEquals("eokbze", model.getSpec().getJobs().get(0).getBuildCommand());
        Assertions.assertEquals("zrxcczurt", model.getSpec().getJobs().get(0).getRunCommand());
        Assertions.assertEquals("ipqxbkwvzgnzv", model.getSpec().getJobs().get(0).getSourceDir());
        Assertions.assertEquals("zdix", model.getSpec().getJobs().get(0).getEnvironmentSlug());
        Assertions.assertEquals(AppJobSpecKind.FAILED_DEPLOY, model.getSpec().getJobs().get(0).getKind());
        Assertions.assertEquals(903861230057569847L, model.getSpec().getJobs().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL_XL,
                model.getSpec().getJobs().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("pqhe", model.getSpec().getWorkers().get(0).getName());
        Assertions.assertEquals("gsbos", model.getSpec().getWorkers().get(0).getDockerfilePath());
        Assertions.assertEquals("eln", model.getSpec().getWorkers().get(0).getBuildCommand());
        Assertions.assertEquals("atutmzlbiojlvfhr", model.getSpec().getWorkers().get(0).getRunCommand());
        Assertions.assertEquals("pn", model.getSpec().getWorkers().get(0).getSourceDir());
        Assertions.assertEquals("cwwyyur", model.getSpec().getWorkers().get(0).getEnvironmentSlug());
        Assertions.assertEquals(8281398224809060796L, model.getSpec().getWorkers().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALL,
                model.getSpec().getWorkers().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("nm", model.getSpec().getFunctions().get(0).getName());
        Assertions.assertEquals("ngz", model.getSpec().getFunctions().get(0).getSourceDir());
        Assertions.assertEquals("zn", model.getSpec().getDatabases().get(0).getClusterName());
        Assertions.assertEquals("goeiybbabpfhvfsl", model.getSpec().getDatabases().get(0).getDbName());
        Assertions.assertEquals("ntjlr", model.getSpec().getDatabases().get(0).getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.MYSQL, model.getSpec().getDatabases().get(0).getEngine());
        Assertions.assertEquals("kskyrioovzid", model.getSpec().getDatabases().get(0).getName());
        Assertions.assertEquals(true, model.getSpec().getDatabases().get(0).isProduction());
        Assertions.assertEquals("abzmifrygznmmaxr", model.getSpec().getDatabases().get(0).getVersion());
        Assertions.assertEquals("mkqscaz", model.getStaticSites().get(0).getName());
        Assertions.assertEquals("wxtzxpuamwab", model.getStaticSites().get(0).getSourceCommitHash());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-22T04:27:33Z"), model.getUpdatedAt());
        Assertions.assertEquals("mxyasflvgsgzw", model.getWorkers().get(0).getName());
        Assertions.assertEquals("akoi", model.getWorkers().get(0).getSourceCommitHash());
    }
}
