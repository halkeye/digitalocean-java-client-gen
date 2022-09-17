package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppComponentInstanceBaseInstanceSizeSlug;
import com.digitalocean.api.models.AppLogDestinationDatadogSpec;
import com.digitalocean.api.models.AppLogDestinationDefinition;
import com.digitalocean.api.models.AppLogDestinationLogtailSpec;
import com.digitalocean.api.models.AppLogDestinationPapertrailSpec;
import com.digitalocean.api.models.AppRouteSpec;
import com.digitalocean.api.models.AppServiceSpec;
import com.digitalocean.api.models.AppServiceSpecHealthCheck;
import com.digitalocean.api.models.AppVariableDefinition;
import com.digitalocean.api.models.AppVariableDefinitionScope;
import com.digitalocean.api.models.AppVariableDefinitionType;
import com.digitalocean.api.models.AppsCorsPolicy;
import com.digitalocean.api.models.AppsGitSourceSpec;
import com.digitalocean.api.models.AppsGithubSourceSpec;
import com.digitalocean.api.models.AppsGitlabSourceSpec;
import com.digitalocean.api.models.AppsImageSourceSpec;
import com.digitalocean.api.models.AppsImageSourceSpecRegistryType;
import com.digitalocean.api.models.AppsStringMatch;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppServiceSpecTests {
    @Test
    public void testDeserialize() {
        AppServiceSpec model =
                BinaryData.fromString(
                                "{\"cors\":{\"allow_origins\":[{\"exact\":\"lnorwmdu\",\"prefix\":\"pklvxw\",\"regex\":\"gdxpg\"}],\"allow_methods\":[\"hiszepnnbjcrxgib\",\"daxconfozauorsuk\"],\"allow_headers\":[\"bqplh\",\"vnuuepzl\"],\"expose_headers\":[\"wzsoldweyuqdunv\"],\"max_age\":\"nrwrbiork\",\"allow_credentials\":false},\"health_check\":{\"failure_threshold\":681185824,\"port\":4458522526150344918,\"http_path\":\"nhxmsi\",\"initial_delay_seconds\":759547890,\"period_seconds\":601340793,\"success_threshold\":486711131,\"timeout_seconds\":1044112339},\"http_port\":5098855864202607843,\"internal_ports\":[322470867216638009,573812384778003954,5828391548888381928],\"routes\":[{\"path\":\"fjchvc\",\"preserve_path_prefix\":false}],\"instance_count\":3930113246959080815,\"instance_size_slug\":\"professional-xl\",\"name\":\"cubiipuipw\",\"git\":{\"branch\":\"nmacj\",\"repo_clone_url\":\"nizshqvcim\"},\"github\":{\"branch\":\"fgmblrrilbywdxsm\",\"deploy_on_push\":false,\"repo\":\"rwfscjfnynszquj\"},\"gitlab\":{\"branch\":\"voqyt\",\"deploy_on_push\":false,\"repo\":\"wb\"},\"image\":{\"registry\":\"yavutpthjoxois\",\"registry_type\":\"DOCR\",\"repository\":\"bpimlqoljxkcgxxl\",\"tag\":\"ffgcvizqz\"},\"dockerfile_path\":\"l\",\"build_command\":\"lyoupfgfbkju\",\"run_command\":\"yhgk\",\"source_dir\":\"in\",\"envs\":[{\"key\":\"wzf\",\"scope\":\"BUILD_TIME\",\"type\":\"GENERAL\",\"value\":\"tlahbq\"},{\"key\":\"ctxtgzukxi\",\"scope\":\"UNSET\",\"type\":\"GENERAL\",\"value\":\"qqqxhrnxrx\"},{\"key\":\"pjui\",\"scope\":\"RUN_TIME\",\"type\":\"GENERAL\",\"value\":\"dzf\"}],\"environment_slug\":\"zivj\",\"log_destinations\":{\"name\":\"rqttbajlkatnw\",\"papertrail\":{\"endpoint\":\"iopid\"},\"datadog\":{\"endpoint\":\"fku\",\"api_key\":\"s\"},\"logtail\":{\"token\":\"dmligovibrxk\"}}}")
                        .toObject(AppServiceSpec.class);
        Assertions.assertEquals("cubiipuipw", model.getName());
        Assertions.assertEquals("nmacj", model.getGit().getBranch());
        Assertions.assertEquals("nizshqvcim", model.getGit().getRepoCloneUrl());
        Assertions.assertEquals("fgmblrrilbywdxsm", model.getGithub().getBranch());
        Assertions.assertEquals(false, model.getGithub().isDeployOnPush());
        Assertions.assertEquals("rwfscjfnynszquj", model.getGithub().getRepo());
        Assertions.assertEquals("voqyt", model.getGitlab().getBranch());
        Assertions.assertEquals(false, model.getGitlab().isDeployOnPush());
        Assertions.assertEquals("wb", model.getGitlab().getRepo());
        Assertions.assertEquals("yavutpthjoxois", model.getImage().getRegistry());
        Assertions.assertEquals(AppsImageSourceSpecRegistryType.DOCR, model.getImage().getRegistryType());
        Assertions.assertEquals("bpimlqoljxkcgxxl", model.getImage().getRepository());
        Assertions.assertEquals("ffgcvizqz", model.getImage().getTag());
        Assertions.assertEquals("l", model.getDockerfilePath());
        Assertions.assertEquals("lyoupfgfbkju", model.getBuildCommand());
        Assertions.assertEquals("yhgk", model.getRunCommand());
        Assertions.assertEquals("in", model.getSourceDir());
        Assertions.assertEquals("wzf", model.getEnvs().get(0).getKey());
        Assertions.assertEquals(AppVariableDefinitionScope.BUILD_TIME, model.getEnvs().get(0).getScope());
        Assertions.assertEquals(AppVariableDefinitionType.GENERAL, model.getEnvs().get(0).getType());
        Assertions.assertEquals("tlahbq", model.getEnvs().get(0).getValue());
        Assertions.assertEquals("zivj", model.getEnvironmentSlug());
        Assertions.assertEquals("rqttbajlkatnw", model.getLogDestinations().getName());
        Assertions.assertEquals("iopid", model.getLogDestinations().getPapertrail().getEndpoint());
        Assertions.assertEquals("fku", model.getLogDestinations().getDatadog().getEndpoint());
        Assertions.assertEquals("s", model.getLogDestinations().getDatadog().getApiKey());
        Assertions.assertEquals("dmligovibrxk", model.getLogDestinations().getLogtail().getToken());
        Assertions.assertEquals("lnorwmdu", model.getCors().getAllowOrigins().get(0).getExact());
        Assertions.assertEquals("pklvxw", model.getCors().getAllowOrigins().get(0).getPrefix());
        Assertions.assertEquals("gdxpg", model.getCors().getAllowOrigins().get(0).getRegex());
        Assertions.assertEquals("hiszepnnbjcrxgib", model.getCors().getAllowMethods().get(0));
        Assertions.assertEquals("bqplh", model.getCors().getAllowHeaders().get(0));
        Assertions.assertEquals("wzsoldweyuqdunv", model.getCors().getExposeHeaders().get(0));
        Assertions.assertEquals("nrwrbiork", model.getCors().getMaxAge());
        Assertions.assertEquals(false, model.getCors().isAllowCredentials());
        Assertions.assertEquals(681185824, model.getHealthCheck().getFailureThreshold());
        Assertions.assertEquals(4458522526150344918L, model.getHealthCheck().getPort());
        Assertions.assertEquals("nhxmsi", model.getHealthCheck().getHttpPath());
        Assertions.assertEquals(759547890, model.getHealthCheck().getInitialDelaySeconds());
        Assertions.assertEquals(601340793, model.getHealthCheck().getPeriodSeconds());
        Assertions.assertEquals(486711131, model.getHealthCheck().getSuccessThreshold());
        Assertions.assertEquals(1044112339, model.getHealthCheck().getTimeoutSeconds());
        Assertions.assertEquals(5098855864202607843L, model.getHttpPort());
        Assertions.assertEquals(322470867216638009L, model.getInternalPorts().get(0));
        Assertions.assertEquals("fjchvc", model.getRoutes().get(0).getPath());
        Assertions.assertEquals(false, model.getRoutes().get(0).isPreservePathPrefix());
        Assertions.assertEquals(3930113246959080815L, model.getInstanceCount());
        Assertions.assertEquals(AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL_XL, model.getInstanceSizeSlug());
    }

    @Test
    public void testSerialize() {
        AppServiceSpec model =
                new AppServiceSpec()
                        .setName("cubiipuipw")
                        .setGit(new AppsGitSourceSpec().setBranch("nmacj").setRepoCloneUrl("nizshqvcim"))
                        .setGithub(
                                new AppsGithubSourceSpec()
                                        .setBranch("fgmblrrilbywdxsm")
                                        .setDeployOnPush(false)
                                        .setRepo("rwfscjfnynszquj"))
                        .setGitlab(new AppsGitlabSourceSpec().setBranch("voqyt").setDeployOnPush(false).setRepo("wb"))
                        .setImage(
                                new AppsImageSourceSpec()
                                        .setRegistry("yavutpthjoxois")
                                        .setRegistryType(AppsImageSourceSpecRegistryType.DOCR)
                                        .setRepository("bpimlqoljxkcgxxl")
                                        .setTag("ffgcvizqz"))
                        .setDockerfilePath("l")
                        .setBuildCommand("lyoupfgfbkju")
                        .setRunCommand("yhgk")
                        .setSourceDir("in")
                        .setEnvs(
                                Arrays.asList(
                                        new AppVariableDefinition()
                                                .setKey("wzf")
                                                .setScope(AppVariableDefinitionScope.BUILD_TIME)
                                                .setType(AppVariableDefinitionType.GENERAL)
                                                .setValue("tlahbq"),
                                        new AppVariableDefinition()
                                                .setKey("ctxtgzukxi")
                                                .setScope(AppVariableDefinitionScope.UNSET)
                                                .setType(AppVariableDefinitionType.GENERAL)
                                                .setValue("qqqxhrnxrx"),
                                        new AppVariableDefinition()
                                                .setKey("pjui")
                                                .setScope(AppVariableDefinitionScope.RUNTIME)
                                                .setType(AppVariableDefinitionType.GENERAL)
                                                .setValue("dzf")))
                        .setEnvironmentSlug("zivj")
                        .setLogDestinations(
                                new AppLogDestinationDefinition()
                                        .setName("rqttbajlkatnw")
                                        .setPapertrail(new AppLogDestinationPapertrailSpec().setEndpoint("iopid"))
                                        .setDatadog(
                                                new AppLogDestinationDatadogSpec().setEndpoint("fku").setApiKey("s"))
                                        .setLogtail(new AppLogDestinationLogtailSpec().setToken("dmligovibrxk")))
                        .setCors(
                                new AppsCorsPolicy()
                                        .setAllowOrigins(
                                                Arrays.asList(
                                                        new AppsStringMatch()
                                                                .setExact("lnorwmdu")
                                                                .setPrefix("pklvxw")
                                                                .setRegex("gdxpg")))
                                        .setAllowMethods(Arrays.asList("hiszepnnbjcrxgib", "daxconfozauorsuk"))
                                        .setAllowHeaders(Arrays.asList("bqplh", "vnuuepzl"))
                                        .setExposeHeaders(Arrays.asList("wzsoldweyuqdunv"))
                                        .setMaxAge("nrwrbiork")
                                        .setAllowCredentials(false))
                        .setHealthCheck(
                                new AppServiceSpecHealthCheck()
                                        .setFailureThreshold(681185824)
                                        .setPort(4458522526150344918L)
                                        .setHttpPath("nhxmsi")
                                        .setInitialDelaySeconds(759547890)
                                        .setPeriodSeconds(601340793)
                                        .setSuccessThreshold(486711131)
                                        .setTimeoutSeconds(1044112339))
                        .setHttpPort(5098855864202607843L)
                        .setInternalPorts(Arrays.asList(322470867216638009L, 573812384778003954L, 5828391548888381928L))
                        .setRoutes(Arrays.asList(new AppRouteSpec().setPath("fjchvc").setPreservePathPrefix(false)))
                        .setInstanceCount(3930113246959080815L)
                        .setInstanceSizeSlug(AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL_XL);
        model = BinaryData.fromObject(model).toObject(AppServiceSpec.class);
        Assertions.assertEquals("cubiipuipw", model.getName());
        Assertions.assertEquals("nmacj", model.getGit().getBranch());
        Assertions.assertEquals("nizshqvcim", model.getGit().getRepoCloneUrl());
        Assertions.assertEquals("fgmblrrilbywdxsm", model.getGithub().getBranch());
        Assertions.assertEquals(false, model.getGithub().isDeployOnPush());
        Assertions.assertEquals("rwfscjfnynszquj", model.getGithub().getRepo());
        Assertions.assertEquals("voqyt", model.getGitlab().getBranch());
        Assertions.assertEquals(false, model.getGitlab().isDeployOnPush());
        Assertions.assertEquals("wb", model.getGitlab().getRepo());
        Assertions.assertEquals("yavutpthjoxois", model.getImage().getRegistry());
        Assertions.assertEquals(AppsImageSourceSpecRegistryType.DOCR, model.getImage().getRegistryType());
        Assertions.assertEquals("bpimlqoljxkcgxxl", model.getImage().getRepository());
        Assertions.assertEquals("ffgcvizqz", model.getImage().getTag());
        Assertions.assertEquals("l", model.getDockerfilePath());
        Assertions.assertEquals("lyoupfgfbkju", model.getBuildCommand());
        Assertions.assertEquals("yhgk", model.getRunCommand());
        Assertions.assertEquals("in", model.getSourceDir());
        Assertions.assertEquals("wzf", model.getEnvs().get(0).getKey());
        Assertions.assertEquals(AppVariableDefinitionScope.BUILD_TIME, model.getEnvs().get(0).getScope());
        Assertions.assertEquals(AppVariableDefinitionType.GENERAL, model.getEnvs().get(0).getType());
        Assertions.assertEquals("tlahbq", model.getEnvs().get(0).getValue());
        Assertions.assertEquals("zivj", model.getEnvironmentSlug());
        Assertions.assertEquals("rqttbajlkatnw", model.getLogDestinations().getName());
        Assertions.assertEquals("iopid", model.getLogDestinations().getPapertrail().getEndpoint());
        Assertions.assertEquals("fku", model.getLogDestinations().getDatadog().getEndpoint());
        Assertions.assertEquals("s", model.getLogDestinations().getDatadog().getApiKey());
        Assertions.assertEquals("dmligovibrxk", model.getLogDestinations().getLogtail().getToken());
        Assertions.assertEquals("lnorwmdu", model.getCors().getAllowOrigins().get(0).getExact());
        Assertions.assertEquals("pklvxw", model.getCors().getAllowOrigins().get(0).getPrefix());
        Assertions.assertEquals("gdxpg", model.getCors().getAllowOrigins().get(0).getRegex());
        Assertions.assertEquals("hiszepnnbjcrxgib", model.getCors().getAllowMethods().get(0));
        Assertions.assertEquals("bqplh", model.getCors().getAllowHeaders().get(0));
        Assertions.assertEquals("wzsoldweyuqdunv", model.getCors().getExposeHeaders().get(0));
        Assertions.assertEquals("nrwrbiork", model.getCors().getMaxAge());
        Assertions.assertEquals(false, model.getCors().isAllowCredentials());
        Assertions.assertEquals(681185824, model.getHealthCheck().getFailureThreshold());
        Assertions.assertEquals(4458522526150344918L, model.getHealthCheck().getPort());
        Assertions.assertEquals("nhxmsi", model.getHealthCheck().getHttpPath());
        Assertions.assertEquals(759547890, model.getHealthCheck().getInitialDelaySeconds());
        Assertions.assertEquals(601340793, model.getHealthCheck().getPeriodSeconds());
        Assertions.assertEquals(486711131, model.getHealthCheck().getSuccessThreshold());
        Assertions.assertEquals(1044112339, model.getHealthCheck().getTimeoutSeconds());
        Assertions.assertEquals(5098855864202607843L, model.getHttpPort());
        Assertions.assertEquals(322470867216638009L, model.getInternalPorts().get(0));
        Assertions.assertEquals("fjchvc", model.getRoutes().get(0).getPath());
        Assertions.assertEquals(false, model.getRoutes().get(0).isPreservePathPrefix());
        Assertions.assertEquals(3930113246959080815L, model.getInstanceCount());
        Assertions.assertEquals(AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL_XL, model.getInstanceSizeSlug());
    }
}
