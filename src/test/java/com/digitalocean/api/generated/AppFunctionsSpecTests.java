package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppAlertSpec;
import com.digitalocean.api.models.AppAlertSpecOperator;
import com.digitalocean.api.models.AppAlertSpecRule;
import com.digitalocean.api.models.AppAlertSpecWindow;
import com.digitalocean.api.models.AppFunctionsSpec;
import com.digitalocean.api.models.AppLogDestinationDatadogSpec;
import com.digitalocean.api.models.AppLogDestinationDefinition;
import com.digitalocean.api.models.AppLogDestinationLogtailSpec;
import com.digitalocean.api.models.AppLogDestinationPapertrailSpec;
import com.digitalocean.api.models.AppRouteSpec;
import com.digitalocean.api.models.AppVariableDefinition;
import com.digitalocean.api.models.AppVariableDefinitionScope;
import com.digitalocean.api.models.AppVariableDefinitionType;
import com.digitalocean.api.models.AppsCorsPolicy;
import com.digitalocean.api.models.AppsGitSourceSpec;
import com.digitalocean.api.models.AppsGithubSourceSpec;
import com.digitalocean.api.models.AppsGitlabSourceSpec;
import com.digitalocean.api.models.AppsStringMatch;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppFunctionsSpecTests {
    @Test
    public void testDeserialize() {
        AppFunctionsSpec model =
                BinaryData.fromString(
                                "{\"cors\":{\"allow_origins\":[{\"exact\":\"y\",\"prefix\":\"uxakjsqzhzbezk\",\"regex\":\"msidxasicddyvv\"},{\"exact\":\"kgfmocwahpq\",\"prefix\":\"tjeaahhvjhh\",\"regex\":\"kzyb\"}],\"allow_methods\":[\"idjks\"],\"allow_headers\":[\"yxvxevblbjed\",\"ljlageuaulxu\",\"smjbnkppxyn\",\"nlsvxeiz\"],\"expose_headers\":[\"klnsrmffey\",\"xcktpiymerteeamm\",\"qiekkkzddrt\"],\"max_age\":\"doj\",\"allow_credentials\":false},\"routes\":[{\"path\":\"refdee\",\"preserve_path_prefix\":true}],\"name\":\"cuijpxt\",\"source_dir\":\"uwprtujwsawd\",\"alerts\":[{\"rule\":\"DOMAIN_LIVE\",\"disabled\":true,\"operator\":\"GREATER_THAN\",\"value\":64.71156,\"window\":\"TEN_MINUTES\"},{\"rule\":\"DOMAIN_LIVE\",\"disabled\":false,\"operator\":\"LESS_THAN\",\"value\":90.4149,\"window\":\"THIRTY_MINUTES\"},{\"rule\":\"FUNCTIONS_GB_RATE_PER_SECOND\",\"disabled\":true,\"operator\":\"GREATER_THAN\",\"value\":82.394005,\"window\":\"THIRTY_MINUTES\"},{\"rule\":\"DOMAIN_FAILED\",\"disabled\":true,\"operator\":\"GREATER_THAN\",\"value\":12.662607,\"window\":\"UNSPECIFIED_WINDOW\"}],\"envs\":[{\"key\":\"b\",\"scope\":\"RUN_TIME\",\"type\":\"GENERAL\",\"value\":\"db\"},{\"key\":\"vodhtn\",\"scope\":\"RUN_AND_BUILD_TIME\",\"type\":\"SECRET\",\"value\":\"z\"}],\"git\":{\"branch\":\"sckdlp\",\"repo_clone_url\":\"zrcxfailcfxwmdbo\"},\"github\":{\"branch\":\"gsftufqobrjlnacg\",\"deploy_on_push\":true,\"repo\":\"nhxk\"},\"gitlab\":{\"branch\":\"ytnrzvuljraae\",\"deploy_on_push\":false,\"repo\":\"kqg\"},\"log_destinations\":{\"name\":\"kjq\",\"papertrail\":{\"endpoint\":\"broyla\"},\"datadog\":{\"endpoint\":\"lcdisd\",\"api_key\":\"sfjbjsvg\"},\"logtail\":{\"token\":\"hryvy\"}}}")
                        .toObject(AppFunctionsSpec.class);
        Assertions.assertEquals("y", model.getCors().getAllowOrigins().get(0).getExact());
        Assertions.assertEquals("uxakjsqzhzbezk", model.getCors().getAllowOrigins().get(0).getPrefix());
        Assertions.assertEquals("msidxasicddyvv", model.getCors().getAllowOrigins().get(0).getRegex());
        Assertions.assertEquals("idjks", model.getCors().getAllowMethods().get(0));
        Assertions.assertEquals("yxvxevblbjed", model.getCors().getAllowHeaders().get(0));
        Assertions.assertEquals("klnsrmffey", model.getCors().getExposeHeaders().get(0));
        Assertions.assertEquals("doj", model.getCors().getMaxAge());
        Assertions.assertEquals(false, model.getCors().isAllowCredentials());
        Assertions.assertEquals("refdee", model.getRoutes().get(0).getPath());
        Assertions.assertEquals(true, model.getRoutes().get(0).isPreservePathPrefix());
        Assertions.assertEquals("cuijpxt", model.getName());
        Assertions.assertEquals("uwprtujwsawd", model.getSourceDir());
        Assertions.assertEquals(AppAlertSpecRule.DOMAIN_LIVE, model.getAlerts().get(0).getRule());
        Assertions.assertEquals(true, model.getAlerts().get(0).isDisabled());
        Assertions.assertEquals(AppAlertSpecOperator.GREATER_THAN, model.getAlerts().get(0).getOperator());
        Assertions.assertEquals(64.71156F, model.getAlerts().get(0).getValue());
        Assertions.assertEquals(AppAlertSpecWindow.TENMINUTES, model.getAlerts().get(0).getWindow());
        Assertions.assertEquals("b", model.getEnvs().get(0).getKey());
        Assertions.assertEquals(AppVariableDefinitionScope.RUNTIME, model.getEnvs().get(0).getScope());
        Assertions.assertEquals(AppVariableDefinitionType.GENERAL, model.getEnvs().get(0).getType());
        Assertions.assertEquals("db", model.getEnvs().get(0).getValue());
        Assertions.assertEquals("sckdlp", model.getGit().getBranch());
        Assertions.assertEquals("zrcxfailcfxwmdbo", model.getGit().getRepoCloneUrl());
        Assertions.assertEquals("gsftufqobrjlnacg", model.getGithub().getBranch());
        Assertions.assertEquals(true, model.getGithub().isDeployOnPush());
        Assertions.assertEquals("nhxk", model.getGithub().getRepo());
        Assertions.assertEquals("ytnrzvuljraae", model.getGitlab().getBranch());
        Assertions.assertEquals(false, model.getGitlab().isDeployOnPush());
        Assertions.assertEquals("kqg", model.getGitlab().getRepo());
        Assertions.assertEquals("kjq", model.getLogDestinations().getName());
        Assertions.assertEquals("broyla", model.getLogDestinations().getPapertrail().getEndpoint());
        Assertions.assertEquals("lcdisd", model.getLogDestinations().getDatadog().getEndpoint());
        Assertions.assertEquals("sfjbjsvg", model.getLogDestinations().getDatadog().getApiKey());
        Assertions.assertEquals("hryvy", model.getLogDestinations().getLogtail().getToken());
    }

    @Test
    public void testSerialize() {
        AppFunctionsSpec model =
                new AppFunctionsSpec()
                        .setCors(
                                new AppsCorsPolicy()
                                        .setAllowOrigins(
                                                Arrays.asList(
                                                        new AppsStringMatch()
                                                                .setExact("y")
                                                                .setPrefix("uxakjsqzhzbezk")
                                                                .setRegex("msidxasicddyvv"),
                                                        new AppsStringMatch()
                                                                .setExact("kgfmocwahpq")
                                                                .setPrefix("tjeaahhvjhh")
                                                                .setRegex("kzyb")))
                                        .setAllowMethods(Arrays.asList("idjks"))
                                        .setAllowHeaders(
                                                Arrays.asList(
                                                        "yxvxevblbjed", "ljlageuaulxu", "smjbnkppxyn", "nlsvxeiz"))
                                        .setExposeHeaders(
                                                Arrays.asList("klnsrmffey", "xcktpiymerteeamm", "qiekkkzddrt"))
                                        .setMaxAge("doj")
                                        .setAllowCredentials(false))
                        .setRoutes(Arrays.asList(new AppRouteSpec().setPath("refdee").setPreservePathPrefix(true)))
                        .setName("cuijpxt")
                        .setSourceDir("uwprtujwsawd")
                        .setAlerts(
                                Arrays.asList(
                                        new AppAlertSpec()
                                                .setRule(AppAlertSpecRule.DOMAIN_LIVE)
                                                .setDisabled(true)
                                                .setOperator(AppAlertSpecOperator.GREATER_THAN)
                                                .setValue(64.71156F)
                                                .setWindow(AppAlertSpecWindow.TENMINUTES),
                                        new AppAlertSpec()
                                                .setRule(AppAlertSpecRule.DOMAIN_LIVE)
                                                .setDisabled(false)
                                                .setOperator(AppAlertSpecOperator.LESS_THAN)
                                                .setValue(90.4149F)
                                                .setWindow(AppAlertSpecWindow.THIRTY_MINUTES),
                                        new AppAlertSpec()
                                                .setRule(AppAlertSpecRule.FUNCTIONS_GBRATE_PERSECOND)
                                                .setDisabled(true)
                                                .setOperator(AppAlertSpecOperator.GREATER_THAN)
                                                .setValue(82.394005F)
                                                .setWindow(AppAlertSpecWindow.THIRTY_MINUTES),
                                        new AppAlertSpec()
                                                .setRule(AppAlertSpecRule.DOMAIN_FAILED)
                                                .setDisabled(true)
                                                .setOperator(AppAlertSpecOperator.GREATER_THAN)
                                                .setValue(12.662607F)
                                                .setWindow(AppAlertSpecWindow.UNSPECIFIED_WINDOW)))
                        .setEnvs(
                                Arrays.asList(
                                        new AppVariableDefinition()
                                                .setKey("b")
                                                .setScope(AppVariableDefinitionScope.RUNTIME)
                                                .setType(AppVariableDefinitionType.GENERAL)
                                                .setValue("db"),
                                        new AppVariableDefinition()
                                                .setKey("vodhtn")
                                                .setScope(AppVariableDefinitionScope.RUNANDBUILD_TIME)
                                                .setType(AppVariableDefinitionType.SECRET)
                                                .setValue("z")))
                        .setGit(new AppsGitSourceSpec().setBranch("sckdlp").setRepoCloneUrl("zrcxfailcfxwmdbo"))
                        .setGithub(
                                new AppsGithubSourceSpec()
                                        .setBranch("gsftufqobrjlnacg")
                                        .setDeployOnPush(true)
                                        .setRepo("nhxk"))
                        .setGitlab(
                                new AppsGitlabSourceSpec()
                                        .setBranch("ytnrzvuljraae")
                                        .setDeployOnPush(false)
                                        .setRepo("kqg"))
                        .setLogDestinations(
                                new AppLogDestinationDefinition()
                                        .setName("kjq")
                                        .setPapertrail(new AppLogDestinationPapertrailSpec().setEndpoint("broyla"))
                                        .setDatadog(
                                                new AppLogDestinationDatadogSpec()
                                                        .setEndpoint("lcdisd")
                                                        .setApiKey("sfjbjsvg"))
                                        .setLogtail(new AppLogDestinationLogtailSpec().setToken("hryvy")));
        model = BinaryData.fromObject(model).toObject(AppFunctionsSpec.class);
        Assertions.assertEquals("y", model.getCors().getAllowOrigins().get(0).getExact());
        Assertions.assertEquals("uxakjsqzhzbezk", model.getCors().getAllowOrigins().get(0).getPrefix());
        Assertions.assertEquals("msidxasicddyvv", model.getCors().getAllowOrigins().get(0).getRegex());
        Assertions.assertEquals("idjks", model.getCors().getAllowMethods().get(0));
        Assertions.assertEquals("yxvxevblbjed", model.getCors().getAllowHeaders().get(0));
        Assertions.assertEquals("klnsrmffey", model.getCors().getExposeHeaders().get(0));
        Assertions.assertEquals("doj", model.getCors().getMaxAge());
        Assertions.assertEquals(false, model.getCors().isAllowCredentials());
        Assertions.assertEquals("refdee", model.getRoutes().get(0).getPath());
        Assertions.assertEquals(true, model.getRoutes().get(0).isPreservePathPrefix());
        Assertions.assertEquals("cuijpxt", model.getName());
        Assertions.assertEquals("uwprtujwsawd", model.getSourceDir());
        Assertions.assertEquals(AppAlertSpecRule.DOMAIN_LIVE, model.getAlerts().get(0).getRule());
        Assertions.assertEquals(true, model.getAlerts().get(0).isDisabled());
        Assertions.assertEquals(AppAlertSpecOperator.GREATER_THAN, model.getAlerts().get(0).getOperator());
        Assertions.assertEquals(64.71156F, model.getAlerts().get(0).getValue());
        Assertions.assertEquals(AppAlertSpecWindow.TENMINUTES, model.getAlerts().get(0).getWindow());
        Assertions.assertEquals("b", model.getEnvs().get(0).getKey());
        Assertions.assertEquals(AppVariableDefinitionScope.RUNTIME, model.getEnvs().get(0).getScope());
        Assertions.assertEquals(AppVariableDefinitionType.GENERAL, model.getEnvs().get(0).getType());
        Assertions.assertEquals("db", model.getEnvs().get(0).getValue());
        Assertions.assertEquals("sckdlp", model.getGit().getBranch());
        Assertions.assertEquals("zrcxfailcfxwmdbo", model.getGit().getRepoCloneUrl());
        Assertions.assertEquals("gsftufqobrjlnacg", model.getGithub().getBranch());
        Assertions.assertEquals(true, model.getGithub().isDeployOnPush());
        Assertions.assertEquals("nhxk", model.getGithub().getRepo());
        Assertions.assertEquals("ytnrzvuljraae", model.getGitlab().getBranch());
        Assertions.assertEquals(false, model.getGitlab().isDeployOnPush());
        Assertions.assertEquals("kqg", model.getGitlab().getRepo());
        Assertions.assertEquals("kjq", model.getLogDestinations().getName());
        Assertions.assertEquals("broyla", model.getLogDestinations().getPapertrail().getEndpoint());
        Assertions.assertEquals("lcdisd", model.getLogDestinations().getDatadog().getEndpoint());
        Assertions.assertEquals("sfjbjsvg", model.getLogDestinations().getDatadog().getApiKey());
        Assertions.assertEquals("hryvy", model.getLogDestinations().getLogtail().getToken());
    }
}
