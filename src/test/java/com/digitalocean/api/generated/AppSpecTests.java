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
import com.digitalocean.api.models.AppLogDestinationDefinition;
import com.digitalocean.api.models.AppServiceSpec;
import com.digitalocean.api.models.AppServiceSpecHealthCheck;
import com.digitalocean.api.models.AppSpec;
import com.digitalocean.api.models.AppSpecRegion;
import com.digitalocean.api.models.AppStaticSiteSpec;
import com.digitalocean.api.models.AppWorkerSpec;
import com.digitalocean.api.models.AppsCorsPolicy;
import com.digitalocean.api.models.AppsGitSourceSpec;
import com.digitalocean.api.models.AppsGithubSourceSpec;
import com.digitalocean.api.models.AppsGitlabSourceSpec;
import com.digitalocean.api.models.AppsImageSourceSpec;
import com.digitalocean.api.models.AppsImageSourceSpecRegistryType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppSpecTests {
    @Test
    public void testDeserialize() {
        AppSpec model =
                BinaryData.fromString(
                                "{\"name\":\"wbdsr\",\"region\":\"nyc\",\"domains\":[{\"domain\":\"hneuyowqkd\",\"type\":\"UNSPECIFIED\",\"wildcard\":true,\"zone\":\"bi\",\"minimum_tls_version\":\"1.3\"},{\"domain\":\"pikpz\",\"type\":\"DEFAULT\",\"wildcard\":false,\"zone\":\"nlfzxiavrmbz\",\"minimum_tls_version\":\"1.3\"},{\"domain\":\"kixrj\",\"type\":\"DEFAULT\",\"wildcard\":false,\"zone\":\"pfrlazsz\",\"minimum_tls_version\":\"1.2\"}],\"services\":[{\"cors\":{\"allow_origins\":[],\"allow_methods\":[],\"allow_headers\":[],\"expose_headers\":[],\"max_age\":\"pj\",\"allow_credentials\":true},\"health_check\":{\"failure_threshold\":1832307115,\"port\":5073664426821636107,\"http_path\":\"jcdh\",\"initial_delay_seconds\":1522734487,\"period_seconds\":2030266414,\"success_threshold\":29574674,\"timeout_seconds\":1004918836},\"http_port\":4854317837359079981,\"internal_ports\":[4038204930571080777],\"routes\":[],\"instance_count\":8174688426240026231,\"instance_size_slug\":\"professional-s\",\"name\":\"iiiojnalghf\",\"git\":{\"branch\":\"vsexsowuelu\",\"repo_clone_url\":\"hahhxvrhmzkwpj\"},\"github\":{\"branch\":\"spughftqsxhq\",\"deploy_on_push\":false,\"repo\":\"ukndxdigrjgu\"},\"gitlab\":{\"branch\":\"dmsyqtfihwhbo\",\"deploy_on_push\":false,\"repo\":\"gamv\"},\"image\":{\"registry\":\"o\",\"registry_type\":\"DOCKER_HUB\",\"repository\":\"udphqamvdkfwyn\",\"tag\":\"vtbvkayh\"},\"dockerfile_path\":\"nvyq\",\"build_command\":\"tkzwpcnpwzc\",\"run_command\":\"esgvvsccyaj\",\"source_dir\":\"qfhwyg\",\"envs\":[],\"environment_slug\":\"nk\",\"log_destinations\":{\"name\":\"usemdwzrmuhap\"}}],\"static_sites\":[{\"index_document\":\"xqv\",\"error_document\":\"vuoy\",\"catchall_document\":\"ccelve\",\"output_dir\":\"ypql\",\"cors\":{\"allow_origins\":[],\"allow_methods\":[],\"allow_headers\":[],\"expose_headers\":[],\"max_age\":\"qwkyhkobop\",\"allow_credentials\":true},\"routes\":[],\"name\":\"wep\",\"git\":{\"branch\":\"cr\",\"repo_clone_url\":\"bwccsnjvcdwxlpqe\"},\"github\":{\"branch\":\"nkhtjsyingw\",\"deploy_on_push\":true,\"repo\":\"mtdh\"},\"gitlab\":{\"branch\":\"vypgikdg\",\"deploy_on_push\":true,\"repo\":\"kbir\"},\"image\":{\"registry\":\"zh\",\"registry_type\":\"DOCKER_HUB\",\"repository\":\"oqrvqqaatjin\",\"tag\":\"goupmfiibfg\"},\"dockerfile_path\":\"ioolvrwxkvtkkgll\",\"build_command\":\"jygvjayvbl\",\"run_command\":\"vkzuhbxvvyhgso\",\"source_dir\":\"yrqufegxuvwz\",\"envs\":[],\"environment_slug\":\"lmctlpd\",\"log_destinations\":{\"name\":\"itvgbmhrixkwm\"}},{\"index_document\":\"veg\",\"error_document\":\"bpnaixexccbdre\",\"catchall_document\":\"hcexdrrvqa\",\"output_dir\":\"kghtpwijnh\",\"cors\":{\"allow_origins\":[],\"allow_methods\":[],\"allow_headers\":[],\"expose_headers\":[],\"max_age\":\"xzb\",\"allow_credentials\":false},\"routes\":[],\"name\":\"rvmtgjq\",\"git\":{\"branch\":\"ostronz\",\"repo_clone_url\":\"hgfipnsxkmcw\"},\"github\":{\"branch\":\"rrjreafxtsgu\",\"deploy_on_push\":true,\"repo\":\"lik\"},\"gitlab\":{\"branch\":\"slol\",\"deploy_on_push\":false,\"repo\":\"uzlm\"},\"image\":{\"registry\":\"lfktgplcrpwjxe\",\"registry_type\":\"DOCKER_HUB\",\"repository\":\"gbrn\",\"tag\":\"mw\"},\"dockerfile_path\":\"nbsazejjoqkag\",\"build_command\":\"sxtta\",\"run_command\":\"zxnfaaz\",\"source_dir\":\"dtnkdmkq\",\"envs\":[],\"environment_slug\":\"uenvrkp\",\"log_destinations\":{\"name\":\"uaibrebqaaysj\"}}],\"jobs\":[{\"kind\":\"PRE_DEPLOY\",\"instance_count\":2784974934686338692,\"instance_size_slug\":\"basic-m\",\"name\":\"ffiakp\",\"git\":{\"branch\":\"qmt\",\"repo_clone_url\":\"ltmm\"},\"github\":{\"branch\":\"yeozphvwauyqncy\",\"deploy_on_push\":false,\"repo\":\"vipmdscwxqupevzh\"},\"gitlab\":{\"branch\":\"otxhojujby\",\"deploy_on_push\":true,\"repo\":\"c\"},\"image\":{\"registry\":\"ixbjx\",\"registry_type\":\"DOCKER_HUB\",\"repository\":\"yl\",\"tag\":\"ool\"},\"dockerfile_path\":\"tpkiwkkbnujry\",\"build_command\":\"tylbfpncurdoiw\",\"run_command\":\"thtywub\",\"source_dir\":\"bihwqknfdnt\",\"envs\":[],\"environment_slug\":\"rdgoihxumw\",\"log_destinations\":{\"name\":\"ond\"}},{\"kind\":\"POST_DEPLOY\",\"instance_count\":6768177995818301614,\"instance_size_slug\":\"professional-xs\",\"name\":\"ytsbwtovv\",\"git\":{\"branch\":\"einqf\",\"repo_clone_url\":\"fxqknpirgneptt\"},\"github\":{\"branch\":\"sniffc\",\"deploy_on_push\":true,\"repo\":\"r\"},\"gitlab\":{\"branch\":\"pij\",\"deploy_on_push\":false,\"repo\":\"frddhcrati\"},\"image\":{\"registry\":\"onasxifto\",\"registry_type\":\"DOCR\",\"repository\":\"hftwesgog\",\"tag\":\"honnxkrlgnyhmos\"},\"dockerfile_path\":\"kkgthr\",\"build_command\":\"hxjbdhqxvc\",\"run_command\":\"frpdsofbshrns\",\"source_dir\":\"uswdv\",\"envs\":[],\"environment_slug\":\"ycnunvjsrtk\",\"log_destinations\":{\"name\":\"wnopqgikyzirtx\"}}],\"workers\":[{\"instance_count\":3837774840348404858,\"instance_size_slug\":\"professional-1l\",\"name\":\"wgioilqukry\",\"git\":{\"branch\":\"qmi\",\"repo_clone_url\":\"xorgg\"},\"github\":{\"branch\":\"yaomtb\",\"deploy_on_push\":false,\"repo\":\"vgrvkffo\"},\"gitlab\":{\"branch\":\"hpjbib\",\"deploy_on_push\":true,\"repo\":\"xumvfcluyovw\"},\"image\":{\"registry\":\"kfezzxscyhwz\",\"registry_type\":\"DOCKER_HUB\",\"repository\":\"ujb\",\"tag\":\"omvzzbtd\"},\"dockerfile_path\":\"vp\",\"build_command\":\"yujviylwdshfssn\",\"run_command\":\"gy\",\"source_dir\":\"rymsgaojfmw\",\"envs\":[],\"environment_slug\":\"mrfhirctymox\",\"log_destinations\":{\"name\":\"tpipiwyczuhx\"}}],\"functions\":[{\"cors\":{\"allow_origins\":[],\"allow_methods\":[],\"allow_headers\":[],\"expose_headers\":[],\"max_age\":\"pskasdvlmfwdg\",\"allow_credentials\":false},\"routes\":[],\"name\":\"cvpa\",\"source_dir\":\"sreuzvxurisjnh\",\"alerts\":[],\"envs\":[],\"git\":{\"branch\":\"jzgxmrhublwp\",\"repo_clone_url\":\"sutrgjup\"},\"github\":{\"branch\":\"tpwoqhihejq\",\"deploy_on_push\":true,\"repo\":\"nfqn\"},\"gitlab\":{\"branch\":\"psxjvf\",\"deploy_on_push\":false,\"repo\":\"kslircizjxvydfc\"},\"log_destinations\":{\"name\":\"cvlhv\"}},{\"cors\":{\"allow_origins\":[],\"allow_methods\":[],\"allow_headers\":[],\"expose_headers\":[],\"max_age\":\"wnawjslbiw\",\"allow_credentials\":true},\"routes\":[],\"name\":\"yztsfmz\",\"source_dir\":\"aeqphchqnr\",\"alerts\":[],\"envs\":[],\"git\":{\"branch\":\"wrykqgai\",\"repo_clone_url\":\"viklb\"},\"github\":{\"branch\":\"khbejdznxc\",\"deploy_on_push\":false,\"repo\":\"hnjivo\"},\"gitlab\":{\"branch\":\"novqfzge\",\"deploy_on_push\":true,\"repo\":\"tul\"},\"log_destinations\":{\"name\":\"tduceamt\"}},{\"cors\":{\"allow_origins\":[],\"allow_methods\":[],\"allow_headers\":[],\"expose_headers\":[],\"max_age\":\"w\",\"allow_credentials\":true},\"routes\":[],\"name\":\"nssxmojmsvpk\",\"source_dir\":\"rvkwc\",\"alerts\":[],\"envs\":[],\"git\":{\"branch\":\"gtczheydb\",\"repo_clone_url\":\"shmkxmaehvbbxur\"},\"github\":{\"branch\":\"tfnhtbaxkgxywr\",\"deploy_on_push\":true,\"repo\":\"kl\"},\"gitlab\":{\"branch\":\"lu\",\"deploy_on_push\":false,\"repo\":\"ruud\"},\"log_destinations\":{\"name\":\"zibt\"}},{\"cors\":{\"allow_origins\":[],\"allow_methods\":[],\"allow_headers\":[],\"expose_headers\":[],\"max_age\":\"dxeclzedqbcvh\",\"allow_credentials\":false},\"routes\":[],\"name\":\"odqkdlwwqfb\",\"source_dir\":\"lkxt\",\"alerts\":[],\"envs\":[],\"git\":{\"branch\":\"mbtxhwgf\",\"repo_clone_url\":\"rtawcoezb\"},\"github\":{\"branch\":\"bskhudygoookkqfq\",\"deploy_on_push\":false,\"repo\":\"eorfm\"},\"gitlab\":{\"branch\":\"qtqzfavyv\",\"deploy_on_push\":true,\"repo\":\"bar\"},\"log_destinations\":{\"name\":\"uayjkqa\"}}],\"databases\":[{\"cluster_name\":\"sjc\",\"db_name\":\"ernntiewdjcvbquw\",\"db_user\":\"ehwagoh\",\"engine\":\"UNSET\",\"name\":\"fkmr\",\"production\":true,\"version\":\"vhmxtdrjfu\"},{\"cluster_name\":\"coebjvewzcj\",\"db_name\":\"m\",\"db_user\":\"pmguaadraufac\",\"engine\":\"REDIS\",\"name\":\"hzovaj\",\"production\":true,\"version\":\"xxpshneeku\"}]}")
                        .toObject(AppSpec.class);
        Assertions.assertEquals("wbdsr", model.getName());
        Assertions.assertEquals(AppSpecRegion.NYC, model.getRegion());
        Assertions.assertEquals("hneuyowqkd", model.getDomains().get(0).getDomain());
        Assertions.assertEquals(AppDomainSpecType.UNSPECIFIED, model.getDomains().get(0).getType());
        Assertions.assertEquals(true, model.getDomains().get(0).isWildcard());
        Assertions.assertEquals("bi", model.getDomains().get(0).getZone());
        Assertions.assertEquals(AppDomainSpecMinimumTlsVersion.ONE3, model.getDomains().get(0).getMinimumTlsVersion());
        Assertions.assertEquals("iiiojnalghf", model.getServices().get(0).getName());
        Assertions.assertEquals("vsexsowuelu", model.getServices().get(0).getGit().getBranch());
        Assertions.assertEquals("hahhxvrhmzkwpj", model.getServices().get(0).getGit().getRepoCloneUrl());
        Assertions.assertEquals("spughftqsxhq", model.getServices().get(0).getGithub().getBranch());
        Assertions.assertEquals(false, model.getServices().get(0).getGithub().isDeployOnPush());
        Assertions.assertEquals("ukndxdigrjgu", model.getServices().get(0).getGithub().getRepo());
        Assertions.assertEquals("dmsyqtfihwhbo", model.getServices().get(0).getGitlab().getBranch());
        Assertions.assertEquals(false, model.getServices().get(0).getGitlab().isDeployOnPush());
        Assertions.assertEquals("gamv", model.getServices().get(0).getGitlab().getRepo());
        Assertions.assertEquals("o", model.getServices().get(0).getImage().getRegistry());
        Assertions.assertEquals(
                AppsImageSourceSpecRegistryType.DOCKER_HUB, model.getServices().get(0).getImage().getRegistryType());
        Assertions.assertEquals("udphqamvdkfwyn", model.getServices().get(0).getImage().getRepository());
        Assertions.assertEquals("vtbvkayh", model.getServices().get(0).getImage().getTag());
        Assertions.assertEquals("nvyq", model.getServices().get(0).getDockerfilePath());
        Assertions.assertEquals("tkzwpcnpwzc", model.getServices().get(0).getBuildCommand());
        Assertions.assertEquals("esgvvsccyaj", model.getServices().get(0).getRunCommand());
        Assertions.assertEquals("qfhwyg", model.getServices().get(0).getSourceDir());
        Assertions.assertEquals("nk", model.getServices().get(0).getEnvironmentSlug());
        Assertions.assertEquals("usemdwzrmuhap", model.getServices().get(0).getLogDestinations().getName());
        Assertions.assertEquals("pj", model.getServices().get(0).getCors().getMaxAge());
        Assertions.assertEquals(true, model.getServices().get(0).getCors().isAllowCredentials());
        Assertions.assertEquals(1832307115, model.getServices().get(0).getHealthCheck().getFailureThreshold());
        Assertions.assertEquals(5073664426821636107L, model.getServices().get(0).getHealthCheck().getPort());
        Assertions.assertEquals("jcdh", model.getServices().get(0).getHealthCheck().getHttpPath());
        Assertions.assertEquals(1522734487, model.getServices().get(0).getHealthCheck().getInitialDelaySeconds());
        Assertions.assertEquals(2030266414, model.getServices().get(0).getHealthCheck().getPeriodSeconds());
        Assertions.assertEquals(29574674, model.getServices().get(0).getHealthCheck().getSuccessThreshold());
        Assertions.assertEquals(1004918836, model.getServices().get(0).getHealthCheck().getTimeoutSeconds());
        Assertions.assertEquals(4854317837359079981L, model.getServices().get(0).getHttpPort());
        Assertions.assertEquals(4038204930571080777L, model.getServices().get(0).getInternalPorts().get(0));
        Assertions.assertEquals(8174688426240026231L, model.getServices().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALS,
                model.getServices().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("wep", model.getStaticSites().get(0).getName());
        Assertions.assertEquals("cr", model.getStaticSites().get(0).getGit().getBranch());
        Assertions.assertEquals("bwccsnjvcdwxlpqe", model.getStaticSites().get(0).getGit().getRepoCloneUrl());
        Assertions.assertEquals("nkhtjsyingw", model.getStaticSites().get(0).getGithub().getBranch());
        Assertions.assertEquals(true, model.getStaticSites().get(0).getGithub().isDeployOnPush());
        Assertions.assertEquals("mtdh", model.getStaticSites().get(0).getGithub().getRepo());
        Assertions.assertEquals("vypgikdg", model.getStaticSites().get(0).getGitlab().getBranch());
        Assertions.assertEquals(true, model.getStaticSites().get(0).getGitlab().isDeployOnPush());
        Assertions.assertEquals("kbir", model.getStaticSites().get(0).getGitlab().getRepo());
        Assertions.assertEquals("zh", model.getStaticSites().get(0).getImage().getRegistry());
        Assertions.assertEquals(
                AppsImageSourceSpecRegistryType.DOCKER_HUB, model.getStaticSites().get(0).getImage().getRegistryType());
        Assertions.assertEquals("oqrvqqaatjin", model.getStaticSites().get(0).getImage().getRepository());
        Assertions.assertEquals("goupmfiibfg", model.getStaticSites().get(0).getImage().getTag());
        Assertions.assertEquals("ioolvrwxkvtkkgll", model.getStaticSites().get(0).getDockerfilePath());
        Assertions.assertEquals("jygvjayvbl", model.getStaticSites().get(0).getBuildCommand());
        Assertions.assertEquals("vkzuhbxvvyhgso", model.getStaticSites().get(0).getRunCommand());
        Assertions.assertEquals("yrqufegxuvwz", model.getStaticSites().get(0).getSourceDir());
        Assertions.assertEquals("lmctlpd", model.getStaticSites().get(0).getEnvironmentSlug());
        Assertions.assertEquals("itvgbmhrixkwm", model.getStaticSites().get(0).getLogDestinations().getName());
        Assertions.assertEquals("xqv", model.getStaticSites().get(0).getIndexDocument());
        Assertions.assertEquals("vuoy", model.getStaticSites().get(0).getErrorDocument());
        Assertions.assertEquals("ccelve", model.getStaticSites().get(0).getCatchallDocument());
        Assertions.assertEquals("ypql", model.getStaticSites().get(0).getOutputDir());
        Assertions.assertEquals("qwkyhkobop", model.getStaticSites().get(0).getCors().getMaxAge());
        Assertions.assertEquals(true, model.getStaticSites().get(0).getCors().isAllowCredentials());
        Assertions.assertEquals("ffiakp", model.getJobs().get(0).getName());
        Assertions.assertEquals("qmt", model.getJobs().get(0).getGit().getBranch());
        Assertions.assertEquals("ltmm", model.getJobs().get(0).getGit().getRepoCloneUrl());
        Assertions.assertEquals("yeozphvwauyqncy", model.getJobs().get(0).getGithub().getBranch());
        Assertions.assertEquals(false, model.getJobs().get(0).getGithub().isDeployOnPush());
        Assertions.assertEquals("vipmdscwxqupevzh", model.getJobs().get(0).getGithub().getRepo());
        Assertions.assertEquals("otxhojujby", model.getJobs().get(0).getGitlab().getBranch());
        Assertions.assertEquals(true, model.getJobs().get(0).getGitlab().isDeployOnPush());
        Assertions.assertEquals("c", model.getJobs().get(0).getGitlab().getRepo());
        Assertions.assertEquals("ixbjx", model.getJobs().get(0).getImage().getRegistry());
        Assertions.assertEquals(
                AppsImageSourceSpecRegistryType.DOCKER_HUB, model.getJobs().get(0).getImage().getRegistryType());
        Assertions.assertEquals("yl", model.getJobs().get(0).getImage().getRepository());
        Assertions.assertEquals("ool", model.getJobs().get(0).getImage().getTag());
        Assertions.assertEquals("tpkiwkkbnujry", model.getJobs().get(0).getDockerfilePath());
        Assertions.assertEquals("tylbfpncurdoiw", model.getJobs().get(0).getBuildCommand());
        Assertions.assertEquals("thtywub", model.getJobs().get(0).getRunCommand());
        Assertions.assertEquals("bihwqknfdnt", model.getJobs().get(0).getSourceDir());
        Assertions.assertEquals("rdgoihxumw", model.getJobs().get(0).getEnvironmentSlug());
        Assertions.assertEquals("ond", model.getJobs().get(0).getLogDestinations().getName());
        Assertions.assertEquals(AppJobSpecKind.PREDEPLOY, model.getJobs().get(0).getKind());
        Assertions.assertEquals(2784974934686338692L, model.getJobs().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.BASICM, model.getJobs().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("wgioilqukry", model.getWorkers().get(0).getName());
        Assertions.assertEquals("qmi", model.getWorkers().get(0).getGit().getBranch());
        Assertions.assertEquals("xorgg", model.getWorkers().get(0).getGit().getRepoCloneUrl());
        Assertions.assertEquals("yaomtb", model.getWorkers().get(0).getGithub().getBranch());
        Assertions.assertEquals(false, model.getWorkers().get(0).getGithub().isDeployOnPush());
        Assertions.assertEquals("vgrvkffo", model.getWorkers().get(0).getGithub().getRepo());
        Assertions.assertEquals("hpjbib", model.getWorkers().get(0).getGitlab().getBranch());
        Assertions.assertEquals(true, model.getWorkers().get(0).getGitlab().isDeployOnPush());
        Assertions.assertEquals("xumvfcluyovw", model.getWorkers().get(0).getGitlab().getRepo());
        Assertions.assertEquals("kfezzxscyhwz", model.getWorkers().get(0).getImage().getRegistry());
        Assertions.assertEquals(
                AppsImageSourceSpecRegistryType.DOCKER_HUB, model.getWorkers().get(0).getImage().getRegistryType());
        Assertions.assertEquals("ujb", model.getWorkers().get(0).getImage().getRepository());
        Assertions.assertEquals("omvzzbtd", model.getWorkers().get(0).getImage().getTag());
        Assertions.assertEquals("vp", model.getWorkers().get(0).getDockerfilePath());
        Assertions.assertEquals("yujviylwdshfssn", model.getWorkers().get(0).getBuildCommand());
        Assertions.assertEquals("gy", model.getWorkers().get(0).getRunCommand());
        Assertions.assertEquals("rymsgaojfmw", model.getWorkers().get(0).getSourceDir());
        Assertions.assertEquals("mrfhirctymox", model.getWorkers().get(0).getEnvironmentSlug());
        Assertions.assertEquals("tpipiwyczuhx", model.getWorkers().get(0).getLogDestinations().getName());
        Assertions.assertEquals(3837774840348404858L, model.getWorkers().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL1L,
                model.getWorkers().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("pskasdvlmfwdg", model.getFunctions().get(0).getCors().getMaxAge());
        Assertions.assertEquals(false, model.getFunctions().get(0).getCors().isAllowCredentials());
        Assertions.assertEquals("cvpa", model.getFunctions().get(0).getName());
        Assertions.assertEquals("sreuzvxurisjnh", model.getFunctions().get(0).getSourceDir());
        Assertions.assertEquals("jzgxmrhublwp", model.getFunctions().get(0).getGit().getBranch());
        Assertions.assertEquals("sutrgjup", model.getFunctions().get(0).getGit().getRepoCloneUrl());
        Assertions.assertEquals("tpwoqhihejq", model.getFunctions().get(0).getGithub().getBranch());
        Assertions.assertEquals(true, model.getFunctions().get(0).getGithub().isDeployOnPush());
        Assertions.assertEquals("nfqn", model.getFunctions().get(0).getGithub().getRepo());
        Assertions.assertEquals("psxjvf", model.getFunctions().get(0).getGitlab().getBranch());
        Assertions.assertEquals(false, model.getFunctions().get(0).getGitlab().isDeployOnPush());
        Assertions.assertEquals("kslircizjxvydfc", model.getFunctions().get(0).getGitlab().getRepo());
        Assertions.assertEquals("cvlhv", model.getFunctions().get(0).getLogDestinations().getName());
        Assertions.assertEquals("sjc", model.getDatabases().get(0).getClusterName());
        Assertions.assertEquals("ernntiewdjcvbquw", model.getDatabases().get(0).getDbName());
        Assertions.assertEquals("ehwagoh", model.getDatabases().get(0).getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.UNSET, model.getDatabases().get(0).getEngine());
        Assertions.assertEquals("fkmr", model.getDatabases().get(0).getName());
        Assertions.assertEquals(true, model.getDatabases().get(0).isProduction());
        Assertions.assertEquals("vhmxtdrjfu", model.getDatabases().get(0).getVersion());
    }

    @Test
    public void testSerialize() {
        AppSpec model =
                new AppSpec()
                        .setName("wbdsr")
                        .setRegion(AppSpecRegion.NYC)
                        .setDomains(
                                Arrays.asList(
                                        new AppDomainSpec()
                                                .setDomain("hneuyowqkd")
                                                .setType(AppDomainSpecType.UNSPECIFIED)
                                                .setWildcard(true)
                                                .setZone("bi")
                                                .setMinimumTlsVersion(AppDomainSpecMinimumTlsVersion.ONE3),
                                        new AppDomainSpec()
                                                .setDomain("pikpz")
                                                .setType(AppDomainSpecType.DEFAULT)
                                                .setWildcard(false)
                                                .setZone("nlfzxiavrmbz")
                                                .setMinimumTlsVersion(AppDomainSpecMinimumTlsVersion.ONE3),
                                        new AppDomainSpec()
                                                .setDomain("kixrj")
                                                .setType(AppDomainSpecType.DEFAULT)
                                                .setWildcard(false)
                                                .setZone("pfrlazsz")
                                                .setMinimumTlsVersion(AppDomainSpecMinimumTlsVersion.ONE2)))
                        .setServices(
                                Arrays.asList(
                                        new AppServiceSpec()
                                                .setName("iiiojnalghf")
                                                .setGit(
                                                        new AppsGitSourceSpec()
                                                                .setBranch("vsexsowuelu")
                                                                .setRepoCloneUrl("hahhxvrhmzkwpj"))
                                                .setGithub(
                                                        new AppsGithubSourceSpec()
                                                                .setBranch("spughftqsxhq")
                                                                .setDeployOnPush(false)
                                                                .setRepo("ukndxdigrjgu"))
                                                .setGitlab(
                                                        new AppsGitlabSourceSpec()
                                                                .setBranch("dmsyqtfihwhbo")
                                                                .setDeployOnPush(false)
                                                                .setRepo("gamv"))
                                                .setImage(
                                                        new AppsImageSourceSpec()
                                                                .setRegistry("o")
                                                                .setRegistryType(
                                                                        AppsImageSourceSpecRegistryType.DOCKER_HUB)
                                                                .setRepository("udphqamvdkfwyn")
                                                                .setTag("vtbvkayh"))
                                                .setDockerfilePath("nvyq")
                                                .setBuildCommand("tkzwpcnpwzc")
                                                .setRunCommand("esgvvsccyaj")
                                                .setSourceDir("qfhwyg")
                                                .setEnvs(Arrays.asList())
                                                .setEnvironmentSlug("nk")
                                                .setLogDestinations(
                                                        new AppLogDestinationDefinition().setName("usemdwzrmuhap"))
                                                .setCors(
                                                        new AppsCorsPolicy()
                                                                .setAllowOrigins(Arrays.asList())
                                                                .setAllowMethods(Arrays.asList())
                                                                .setAllowHeaders(Arrays.asList())
                                                                .setExposeHeaders(Arrays.asList())
                                                                .setMaxAge("pj")
                                                                .setAllowCredentials(true))
                                                .setHealthCheck(
                                                        new AppServiceSpecHealthCheck()
                                                                .setFailureThreshold(1832307115)
                                                                .setPort(5073664426821636107L)
                                                                .setHttpPath("jcdh")
                                                                .setInitialDelaySeconds(1522734487)
                                                                .setPeriodSeconds(2030266414)
                                                                .setSuccessThreshold(29574674)
                                                                .setTimeoutSeconds(1004918836))
                                                .setHttpPort(4854317837359079981L)
                                                .setInternalPorts(Arrays.asList(4038204930571080777L))
                                                .setRoutes(Arrays.asList())
                                                .setInstanceCount(8174688426240026231L)
                                                .setInstanceSizeSlug(
                                                        AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALS)))
                        .setStaticSites(
                                Arrays.asList(
                                        new AppStaticSiteSpec()
                                                .setName("wep")
                                                .setGit(
                                                        new AppsGitSourceSpec()
                                                                .setBranch("cr")
                                                                .setRepoCloneUrl("bwccsnjvcdwxlpqe"))
                                                .setGithub(
                                                        new AppsGithubSourceSpec()
                                                                .setBranch("nkhtjsyingw")
                                                                .setDeployOnPush(true)
                                                                .setRepo("mtdh"))
                                                .setGitlab(
                                                        new AppsGitlabSourceSpec()
                                                                .setBranch("vypgikdg")
                                                                .setDeployOnPush(true)
                                                                .setRepo("kbir"))
                                                .setImage(
                                                        new AppsImageSourceSpec()
                                                                .setRegistry("zh")
                                                                .setRegistryType(
                                                                        AppsImageSourceSpecRegistryType.DOCKER_HUB)
                                                                .setRepository("oqrvqqaatjin")
                                                                .setTag("goupmfiibfg"))
                                                .setDockerfilePath("ioolvrwxkvtkkgll")
                                                .setBuildCommand("jygvjayvbl")
                                                .setRunCommand("vkzuhbxvvyhgso")
                                                .setSourceDir("yrqufegxuvwz")
                                                .setEnvs(Arrays.asList())
                                                .setEnvironmentSlug("lmctlpd")
                                                .setLogDestinations(
                                                        new AppLogDestinationDefinition().setName("itvgbmhrixkwm"))
                                                .setIndexDocument("xqv")
                                                .setErrorDocument("vuoy")
                                                .setCatchallDocument("ccelve")
                                                .setOutputDir("ypql")
                                                .setCors(
                                                        new AppsCorsPolicy()
                                                                .setAllowOrigins(Arrays.asList())
                                                                .setAllowMethods(Arrays.asList())
                                                                .setAllowHeaders(Arrays.asList())
                                                                .setExposeHeaders(Arrays.asList())
                                                                .setMaxAge("qwkyhkobop")
                                                                .setAllowCredentials(true))
                                                .setRoutes(Arrays.asList()),
                                        new AppStaticSiteSpec()
                                                .setName("rvmtgjq")
                                                .setGit(
                                                        new AppsGitSourceSpec()
                                                                .setBranch("ostronz")
                                                                .setRepoCloneUrl("hgfipnsxkmcw"))
                                                .setGithub(
                                                        new AppsGithubSourceSpec()
                                                                .setBranch("rrjreafxtsgu")
                                                                .setDeployOnPush(true)
                                                                .setRepo("lik"))
                                                .setGitlab(
                                                        new AppsGitlabSourceSpec()
                                                                .setBranch("slol")
                                                                .setDeployOnPush(false)
                                                                .setRepo("uzlm"))
                                                .setImage(
                                                        new AppsImageSourceSpec()
                                                                .setRegistry("lfktgplcrpwjxe")
                                                                .setRegistryType(
                                                                        AppsImageSourceSpecRegistryType.DOCKER_HUB)
                                                                .setRepository("gbrn")
                                                                .setTag("mw"))
                                                .setDockerfilePath("nbsazejjoqkag")
                                                .setBuildCommand("sxtta")
                                                .setRunCommand("zxnfaaz")
                                                .setSourceDir("dtnkdmkq")
                                                .setEnvs(Arrays.asList())
                                                .setEnvironmentSlug("uenvrkp")
                                                .setLogDestinations(
                                                        new AppLogDestinationDefinition().setName("uaibrebqaaysj"))
                                                .setIndexDocument("veg")
                                                .setErrorDocument("bpnaixexccbdre")
                                                .setCatchallDocument("hcexdrrvqa")
                                                .setOutputDir("kghtpwijnh")
                                                .setCors(
                                                        new AppsCorsPolicy()
                                                                .setAllowOrigins(Arrays.asList())
                                                                .setAllowMethods(Arrays.asList())
                                                                .setAllowHeaders(Arrays.asList())
                                                                .setExposeHeaders(Arrays.asList())
                                                                .setMaxAge("xzb")
                                                                .setAllowCredentials(false))
                                                .setRoutes(Arrays.asList())))
                        .setJobs(
                                Arrays.asList(
                                        new AppJobSpec()
                                                .setName("ffiakp")
                                                .setGit(
                                                        new AppsGitSourceSpec()
                                                                .setBranch("qmt")
                                                                .setRepoCloneUrl("ltmm"))
                                                .setGithub(
                                                        new AppsGithubSourceSpec()
                                                                .setBranch("yeozphvwauyqncy")
                                                                .setDeployOnPush(false)
                                                                .setRepo("vipmdscwxqupevzh"))
                                                .setGitlab(
                                                        new AppsGitlabSourceSpec()
                                                                .setBranch("otxhojujby")
                                                                .setDeployOnPush(true)
                                                                .setRepo("c"))
                                                .setImage(
                                                        new AppsImageSourceSpec()
                                                                .setRegistry("ixbjx")
                                                                .setRegistryType(
                                                                        AppsImageSourceSpecRegistryType.DOCKER_HUB)
                                                                .setRepository("yl")
                                                                .setTag("ool"))
                                                .setDockerfilePath("tpkiwkkbnujry")
                                                .setBuildCommand("tylbfpncurdoiw")
                                                .setRunCommand("thtywub")
                                                .setSourceDir("bihwqknfdnt")
                                                .setEnvs(Arrays.asList())
                                                .setEnvironmentSlug("rdgoihxumw")
                                                .setLogDestinations(new AppLogDestinationDefinition().setName("ond"))
                                                .setKind(AppJobSpecKind.PREDEPLOY)
                                                .setInstanceCount(2784974934686338692L)
                                                .setInstanceSizeSlug(AppComponentInstanceBaseInstanceSizeSlug.BASICM),
                                        new AppJobSpec()
                                                .setName("ytsbwtovv")
                                                .setGit(
                                                        new AppsGitSourceSpec()
                                                                .setBranch("einqf")
                                                                .setRepoCloneUrl("fxqknpirgneptt"))
                                                .setGithub(
                                                        new AppsGithubSourceSpec()
                                                                .setBranch("sniffc")
                                                                .setDeployOnPush(true)
                                                                .setRepo("r"))
                                                .setGitlab(
                                                        new AppsGitlabSourceSpec()
                                                                .setBranch("pij")
                                                                .setDeployOnPush(false)
                                                                .setRepo("frddhcrati"))
                                                .setImage(
                                                        new AppsImageSourceSpec()
                                                                .setRegistry("onasxifto")
                                                                .setRegistryType(AppsImageSourceSpecRegistryType.DOCR)
                                                                .setRepository("hftwesgog")
                                                                .setTag("honnxkrlgnyhmos"))
                                                .setDockerfilePath("kkgthr")
                                                .setBuildCommand("hxjbdhqxvc")
                                                .setRunCommand("frpdsofbshrns")
                                                .setSourceDir("uswdv")
                                                .setEnvs(Arrays.asList())
                                                .setEnvironmentSlug("ycnunvjsrtk")
                                                .setLogDestinations(
                                                        new AppLogDestinationDefinition().setName("wnopqgikyzirtx"))
                                                .setKind(AppJobSpecKind.POST_DEPLOY)
                                                .setInstanceCount(6768177995818301614L)
                                                .setInstanceSizeSlug(
                                                        AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL_XS)))
                        .setWorkers(
                                Arrays.asList(
                                        new AppWorkerSpec()
                                                .setName("wgioilqukry")
                                                .setGit(
                                                        new AppsGitSourceSpec()
                                                                .setBranch("qmi")
                                                                .setRepoCloneUrl("xorgg"))
                                                .setGithub(
                                                        new AppsGithubSourceSpec()
                                                                .setBranch("yaomtb")
                                                                .setDeployOnPush(false)
                                                                .setRepo("vgrvkffo"))
                                                .setGitlab(
                                                        new AppsGitlabSourceSpec()
                                                                .setBranch("hpjbib")
                                                                .setDeployOnPush(true)
                                                                .setRepo("xumvfcluyovw"))
                                                .setImage(
                                                        new AppsImageSourceSpec()
                                                                .setRegistry("kfezzxscyhwz")
                                                                .setRegistryType(
                                                                        AppsImageSourceSpecRegistryType.DOCKER_HUB)
                                                                .setRepository("ujb")
                                                                .setTag("omvzzbtd"))
                                                .setDockerfilePath("vp")
                                                .setBuildCommand("yujviylwdshfssn")
                                                .setRunCommand("gy")
                                                .setSourceDir("rymsgaojfmw")
                                                .setEnvs(Arrays.asList())
                                                .setEnvironmentSlug("mrfhirctymox")
                                                .setLogDestinations(
                                                        new AppLogDestinationDefinition().setName("tpipiwyczuhx"))
                                                .setInstanceCount(3837774840348404858L)
                                                .setInstanceSizeSlug(
                                                        AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL1L)))
                        .setFunctions(
                                Arrays.asList(
                                        new AppFunctionsSpec()
                                                .setCors(
                                                        new AppsCorsPolicy()
                                                                .setAllowOrigins(Arrays.asList())
                                                                .setAllowMethods(Arrays.asList())
                                                                .setAllowHeaders(Arrays.asList())
                                                                .setExposeHeaders(Arrays.asList())
                                                                .setMaxAge("pskasdvlmfwdg")
                                                                .setAllowCredentials(false))
                                                .setRoutes(Arrays.asList())
                                                .setName("cvpa")
                                                .setSourceDir("sreuzvxurisjnh")
                                                .setAlerts(Arrays.asList())
                                                .setEnvs(Arrays.asList())
                                                .setGit(
                                                        new AppsGitSourceSpec()
                                                                .setBranch("jzgxmrhublwp")
                                                                .setRepoCloneUrl("sutrgjup"))
                                                .setGithub(
                                                        new AppsGithubSourceSpec()
                                                                .setBranch("tpwoqhihejq")
                                                                .setDeployOnPush(true)
                                                                .setRepo("nfqn"))
                                                .setGitlab(
                                                        new AppsGitlabSourceSpec()
                                                                .setBranch("psxjvf")
                                                                .setDeployOnPush(false)
                                                                .setRepo("kslircizjxvydfc"))
                                                .setLogDestinations(new AppLogDestinationDefinition().setName("cvlhv")),
                                        new AppFunctionsSpec()
                                                .setCors(
                                                        new AppsCorsPolicy()
                                                                .setAllowOrigins(Arrays.asList())
                                                                .setAllowMethods(Arrays.asList())
                                                                .setAllowHeaders(Arrays.asList())
                                                                .setExposeHeaders(Arrays.asList())
                                                                .setMaxAge("wnawjslbiw")
                                                                .setAllowCredentials(true))
                                                .setRoutes(Arrays.asList())
                                                .setName("yztsfmz")
                                                .setSourceDir("aeqphchqnr")
                                                .setAlerts(Arrays.asList())
                                                .setEnvs(Arrays.asList())
                                                .setGit(
                                                        new AppsGitSourceSpec()
                                                                .setBranch("wrykqgai")
                                                                .setRepoCloneUrl("viklb"))
                                                .setGithub(
                                                        new AppsGithubSourceSpec()
                                                                .setBranch("khbejdznxc")
                                                                .setDeployOnPush(false)
                                                                .setRepo("hnjivo"))
                                                .setGitlab(
                                                        new AppsGitlabSourceSpec()
                                                                .setBranch("novqfzge")
                                                                .setDeployOnPush(true)
                                                                .setRepo("tul"))
                                                .setLogDestinations(
                                                        new AppLogDestinationDefinition().setName("tduceamt")),
                                        new AppFunctionsSpec()
                                                .setCors(
                                                        new AppsCorsPolicy()
                                                                .setAllowOrigins(Arrays.asList())
                                                                .setAllowMethods(Arrays.asList())
                                                                .setAllowHeaders(Arrays.asList())
                                                                .setExposeHeaders(Arrays.asList())
                                                                .setMaxAge("w")
                                                                .setAllowCredentials(true))
                                                .setRoutes(Arrays.asList())
                                                .setName("nssxmojmsvpk")
                                                .setSourceDir("rvkwc")
                                                .setAlerts(Arrays.asList())
                                                .setEnvs(Arrays.asList())
                                                .setGit(
                                                        new AppsGitSourceSpec()
                                                                .setBranch("gtczheydb")
                                                                .setRepoCloneUrl("shmkxmaehvbbxur"))
                                                .setGithub(
                                                        new AppsGithubSourceSpec()
                                                                .setBranch("tfnhtbaxkgxywr")
                                                                .setDeployOnPush(true)
                                                                .setRepo("kl"))
                                                .setGitlab(
                                                        new AppsGitlabSourceSpec()
                                                                .setBranch("lu")
                                                                .setDeployOnPush(false)
                                                                .setRepo("ruud"))
                                                .setLogDestinations(new AppLogDestinationDefinition().setName("zibt")),
                                        new AppFunctionsSpec()
                                                .setCors(
                                                        new AppsCorsPolicy()
                                                                .setAllowOrigins(Arrays.asList())
                                                                .setAllowMethods(Arrays.asList())
                                                                .setAllowHeaders(Arrays.asList())
                                                                .setExposeHeaders(Arrays.asList())
                                                                .setMaxAge("dxeclzedqbcvh")
                                                                .setAllowCredentials(false))
                                                .setRoutes(Arrays.asList())
                                                .setName("odqkdlwwqfb")
                                                .setSourceDir("lkxt")
                                                .setAlerts(Arrays.asList())
                                                .setEnvs(Arrays.asList())
                                                .setGit(
                                                        new AppsGitSourceSpec()
                                                                .setBranch("mbtxhwgf")
                                                                .setRepoCloneUrl("rtawcoezb"))
                                                .setGithub(
                                                        new AppsGithubSourceSpec()
                                                                .setBranch("bskhudygoookkqfq")
                                                                .setDeployOnPush(false)
                                                                .setRepo("eorfm"))
                                                .setGitlab(
                                                        new AppsGitlabSourceSpec()
                                                                .setBranch("qtqzfavyv")
                                                                .setDeployOnPush(true)
                                                                .setRepo("bar"))
                                                .setLogDestinations(
                                                        new AppLogDestinationDefinition().setName("uayjkqa"))))
                        .setDatabases(
                                Arrays.asList(
                                        new AppDatabaseSpec()
                                                .setClusterName("sjc")
                                                .setDbName("ernntiewdjcvbquw")
                                                .setDbUser("ehwagoh")
                                                .setEngine(AppDatabaseSpecEngine.UNSET)
                                                .setName("fkmr")
                                                .setProduction(true)
                                                .setVersion("vhmxtdrjfu"),
                                        new AppDatabaseSpec()
                                                .setClusterName("coebjvewzcj")
                                                .setDbName("m")
                                                .setDbUser("pmguaadraufac")
                                                .setEngine(AppDatabaseSpecEngine.REDIS)
                                                .setName("hzovaj")
                                                .setProduction(true)
                                                .setVersion("xxpshneeku")));
        model = BinaryData.fromObject(model).toObject(AppSpec.class);
        Assertions.assertEquals("wbdsr", model.getName());
        Assertions.assertEquals(AppSpecRegion.NYC, model.getRegion());
        Assertions.assertEquals("hneuyowqkd", model.getDomains().get(0).getDomain());
        Assertions.assertEquals(AppDomainSpecType.UNSPECIFIED, model.getDomains().get(0).getType());
        Assertions.assertEquals(true, model.getDomains().get(0).isWildcard());
        Assertions.assertEquals("bi", model.getDomains().get(0).getZone());
        Assertions.assertEquals(AppDomainSpecMinimumTlsVersion.ONE3, model.getDomains().get(0).getMinimumTlsVersion());
        Assertions.assertEquals("iiiojnalghf", model.getServices().get(0).getName());
        Assertions.assertEquals("vsexsowuelu", model.getServices().get(0).getGit().getBranch());
        Assertions.assertEquals("hahhxvrhmzkwpj", model.getServices().get(0).getGit().getRepoCloneUrl());
        Assertions.assertEquals("spughftqsxhq", model.getServices().get(0).getGithub().getBranch());
        Assertions.assertEquals(false, model.getServices().get(0).getGithub().isDeployOnPush());
        Assertions.assertEquals("ukndxdigrjgu", model.getServices().get(0).getGithub().getRepo());
        Assertions.assertEquals("dmsyqtfihwhbo", model.getServices().get(0).getGitlab().getBranch());
        Assertions.assertEquals(false, model.getServices().get(0).getGitlab().isDeployOnPush());
        Assertions.assertEquals("gamv", model.getServices().get(0).getGitlab().getRepo());
        Assertions.assertEquals("o", model.getServices().get(0).getImage().getRegistry());
        Assertions.assertEquals(
                AppsImageSourceSpecRegistryType.DOCKER_HUB, model.getServices().get(0).getImage().getRegistryType());
        Assertions.assertEquals("udphqamvdkfwyn", model.getServices().get(0).getImage().getRepository());
        Assertions.assertEquals("vtbvkayh", model.getServices().get(0).getImage().getTag());
        Assertions.assertEquals("nvyq", model.getServices().get(0).getDockerfilePath());
        Assertions.assertEquals("tkzwpcnpwzc", model.getServices().get(0).getBuildCommand());
        Assertions.assertEquals("esgvvsccyaj", model.getServices().get(0).getRunCommand());
        Assertions.assertEquals("qfhwyg", model.getServices().get(0).getSourceDir());
        Assertions.assertEquals("nk", model.getServices().get(0).getEnvironmentSlug());
        Assertions.assertEquals("usemdwzrmuhap", model.getServices().get(0).getLogDestinations().getName());
        Assertions.assertEquals("pj", model.getServices().get(0).getCors().getMaxAge());
        Assertions.assertEquals(true, model.getServices().get(0).getCors().isAllowCredentials());
        Assertions.assertEquals(1832307115, model.getServices().get(0).getHealthCheck().getFailureThreshold());
        Assertions.assertEquals(5073664426821636107L, model.getServices().get(0).getHealthCheck().getPort());
        Assertions.assertEquals("jcdh", model.getServices().get(0).getHealthCheck().getHttpPath());
        Assertions.assertEquals(1522734487, model.getServices().get(0).getHealthCheck().getInitialDelaySeconds());
        Assertions.assertEquals(2030266414, model.getServices().get(0).getHealthCheck().getPeriodSeconds());
        Assertions.assertEquals(29574674, model.getServices().get(0).getHealthCheck().getSuccessThreshold());
        Assertions.assertEquals(1004918836, model.getServices().get(0).getHealthCheck().getTimeoutSeconds());
        Assertions.assertEquals(4854317837359079981L, model.getServices().get(0).getHttpPort());
        Assertions.assertEquals(4038204930571080777L, model.getServices().get(0).getInternalPorts().get(0));
        Assertions.assertEquals(8174688426240026231L, model.getServices().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALS,
                model.getServices().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("wep", model.getStaticSites().get(0).getName());
        Assertions.assertEquals("cr", model.getStaticSites().get(0).getGit().getBranch());
        Assertions.assertEquals("bwccsnjvcdwxlpqe", model.getStaticSites().get(0).getGit().getRepoCloneUrl());
        Assertions.assertEquals("nkhtjsyingw", model.getStaticSites().get(0).getGithub().getBranch());
        Assertions.assertEquals(true, model.getStaticSites().get(0).getGithub().isDeployOnPush());
        Assertions.assertEquals("mtdh", model.getStaticSites().get(0).getGithub().getRepo());
        Assertions.assertEquals("vypgikdg", model.getStaticSites().get(0).getGitlab().getBranch());
        Assertions.assertEquals(true, model.getStaticSites().get(0).getGitlab().isDeployOnPush());
        Assertions.assertEquals("kbir", model.getStaticSites().get(0).getGitlab().getRepo());
        Assertions.assertEquals("zh", model.getStaticSites().get(0).getImage().getRegistry());
        Assertions.assertEquals(
                AppsImageSourceSpecRegistryType.DOCKER_HUB, model.getStaticSites().get(0).getImage().getRegistryType());
        Assertions.assertEquals("oqrvqqaatjin", model.getStaticSites().get(0).getImage().getRepository());
        Assertions.assertEquals("goupmfiibfg", model.getStaticSites().get(0).getImage().getTag());
        Assertions.assertEquals("ioolvrwxkvtkkgll", model.getStaticSites().get(0).getDockerfilePath());
        Assertions.assertEquals("jygvjayvbl", model.getStaticSites().get(0).getBuildCommand());
        Assertions.assertEquals("vkzuhbxvvyhgso", model.getStaticSites().get(0).getRunCommand());
        Assertions.assertEquals("yrqufegxuvwz", model.getStaticSites().get(0).getSourceDir());
        Assertions.assertEquals("lmctlpd", model.getStaticSites().get(0).getEnvironmentSlug());
        Assertions.assertEquals("itvgbmhrixkwm", model.getStaticSites().get(0).getLogDestinations().getName());
        Assertions.assertEquals("xqv", model.getStaticSites().get(0).getIndexDocument());
        Assertions.assertEquals("vuoy", model.getStaticSites().get(0).getErrorDocument());
        Assertions.assertEquals("ccelve", model.getStaticSites().get(0).getCatchallDocument());
        Assertions.assertEquals("ypql", model.getStaticSites().get(0).getOutputDir());
        Assertions.assertEquals("qwkyhkobop", model.getStaticSites().get(0).getCors().getMaxAge());
        Assertions.assertEquals(true, model.getStaticSites().get(0).getCors().isAllowCredentials());
        Assertions.assertEquals("ffiakp", model.getJobs().get(0).getName());
        Assertions.assertEquals("qmt", model.getJobs().get(0).getGit().getBranch());
        Assertions.assertEquals("ltmm", model.getJobs().get(0).getGit().getRepoCloneUrl());
        Assertions.assertEquals("yeozphvwauyqncy", model.getJobs().get(0).getGithub().getBranch());
        Assertions.assertEquals(false, model.getJobs().get(0).getGithub().isDeployOnPush());
        Assertions.assertEquals("vipmdscwxqupevzh", model.getJobs().get(0).getGithub().getRepo());
        Assertions.assertEquals("otxhojujby", model.getJobs().get(0).getGitlab().getBranch());
        Assertions.assertEquals(true, model.getJobs().get(0).getGitlab().isDeployOnPush());
        Assertions.assertEquals("c", model.getJobs().get(0).getGitlab().getRepo());
        Assertions.assertEquals("ixbjx", model.getJobs().get(0).getImage().getRegistry());
        Assertions.assertEquals(
                AppsImageSourceSpecRegistryType.DOCKER_HUB, model.getJobs().get(0).getImage().getRegistryType());
        Assertions.assertEquals("yl", model.getJobs().get(0).getImage().getRepository());
        Assertions.assertEquals("ool", model.getJobs().get(0).getImage().getTag());
        Assertions.assertEquals("tpkiwkkbnujry", model.getJobs().get(0).getDockerfilePath());
        Assertions.assertEquals("tylbfpncurdoiw", model.getJobs().get(0).getBuildCommand());
        Assertions.assertEquals("thtywub", model.getJobs().get(0).getRunCommand());
        Assertions.assertEquals("bihwqknfdnt", model.getJobs().get(0).getSourceDir());
        Assertions.assertEquals("rdgoihxumw", model.getJobs().get(0).getEnvironmentSlug());
        Assertions.assertEquals("ond", model.getJobs().get(0).getLogDestinations().getName());
        Assertions.assertEquals(AppJobSpecKind.PREDEPLOY, model.getJobs().get(0).getKind());
        Assertions.assertEquals(2784974934686338692L, model.getJobs().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.BASICM, model.getJobs().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("wgioilqukry", model.getWorkers().get(0).getName());
        Assertions.assertEquals("qmi", model.getWorkers().get(0).getGit().getBranch());
        Assertions.assertEquals("xorgg", model.getWorkers().get(0).getGit().getRepoCloneUrl());
        Assertions.assertEquals("yaomtb", model.getWorkers().get(0).getGithub().getBranch());
        Assertions.assertEquals(false, model.getWorkers().get(0).getGithub().isDeployOnPush());
        Assertions.assertEquals("vgrvkffo", model.getWorkers().get(0).getGithub().getRepo());
        Assertions.assertEquals("hpjbib", model.getWorkers().get(0).getGitlab().getBranch());
        Assertions.assertEquals(true, model.getWorkers().get(0).getGitlab().isDeployOnPush());
        Assertions.assertEquals("xumvfcluyovw", model.getWorkers().get(0).getGitlab().getRepo());
        Assertions.assertEquals("kfezzxscyhwz", model.getWorkers().get(0).getImage().getRegistry());
        Assertions.assertEquals(
                AppsImageSourceSpecRegistryType.DOCKER_HUB, model.getWorkers().get(0).getImage().getRegistryType());
        Assertions.assertEquals("ujb", model.getWorkers().get(0).getImage().getRepository());
        Assertions.assertEquals("omvzzbtd", model.getWorkers().get(0).getImage().getTag());
        Assertions.assertEquals("vp", model.getWorkers().get(0).getDockerfilePath());
        Assertions.assertEquals("yujviylwdshfssn", model.getWorkers().get(0).getBuildCommand());
        Assertions.assertEquals("gy", model.getWorkers().get(0).getRunCommand());
        Assertions.assertEquals("rymsgaojfmw", model.getWorkers().get(0).getSourceDir());
        Assertions.assertEquals("mrfhirctymox", model.getWorkers().get(0).getEnvironmentSlug());
        Assertions.assertEquals("tpipiwyczuhx", model.getWorkers().get(0).getLogDestinations().getName());
        Assertions.assertEquals(3837774840348404858L, model.getWorkers().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL1L,
                model.getWorkers().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("pskasdvlmfwdg", model.getFunctions().get(0).getCors().getMaxAge());
        Assertions.assertEquals(false, model.getFunctions().get(0).getCors().isAllowCredentials());
        Assertions.assertEquals("cvpa", model.getFunctions().get(0).getName());
        Assertions.assertEquals("sreuzvxurisjnh", model.getFunctions().get(0).getSourceDir());
        Assertions.assertEquals("jzgxmrhublwp", model.getFunctions().get(0).getGit().getBranch());
        Assertions.assertEquals("sutrgjup", model.getFunctions().get(0).getGit().getRepoCloneUrl());
        Assertions.assertEquals("tpwoqhihejq", model.getFunctions().get(0).getGithub().getBranch());
        Assertions.assertEquals(true, model.getFunctions().get(0).getGithub().isDeployOnPush());
        Assertions.assertEquals("nfqn", model.getFunctions().get(0).getGithub().getRepo());
        Assertions.assertEquals("psxjvf", model.getFunctions().get(0).getGitlab().getBranch());
        Assertions.assertEquals(false, model.getFunctions().get(0).getGitlab().isDeployOnPush());
        Assertions.assertEquals("kslircizjxvydfc", model.getFunctions().get(0).getGitlab().getRepo());
        Assertions.assertEquals("cvlhv", model.getFunctions().get(0).getLogDestinations().getName());
        Assertions.assertEquals("sjc", model.getDatabases().get(0).getClusterName());
        Assertions.assertEquals("ernntiewdjcvbquw", model.getDatabases().get(0).getDbName());
        Assertions.assertEquals("ehwagoh", model.getDatabases().get(0).getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.UNSET, model.getDatabases().get(0).getEngine());
        Assertions.assertEquals("fkmr", model.getDatabases().get(0).getName());
        Assertions.assertEquals(true, model.getDatabases().get(0).isProduction());
        Assertions.assertEquals("vhmxtdrjfu", model.getDatabases().get(0).getVersion());
    }
}
