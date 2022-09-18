package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppComponentBase;
import com.digitalocean.api.models.AppLogDestinationDatadogSpec;
import com.digitalocean.api.models.AppLogDestinationDefinition;
import com.digitalocean.api.models.AppLogDestinationLogtailSpec;
import com.digitalocean.api.models.AppLogDestinationPapertrailSpec;
import com.digitalocean.api.models.AppsGithubSourceSpec;
import com.digitalocean.api.models.AppsGitlabSourceSpec;
import com.digitalocean.api.models.AppsGitSourceSpec;
import com.digitalocean.api.models.AppsImageSourceSpec;
import com.digitalocean.api.models.AppsImageSourceSpecRegistryType;
import com.digitalocean.api.models.AppVariableDefinition;
import com.digitalocean.api.models.AppVariableDefinitionScope;
import com.digitalocean.api.models.AppVariableDefinitionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppComponentBaseTests {
    @Test
    public void testDeserialize() {
        AppComponentBase model = BinaryData.fromString("{\"name\":\"kzbrmsgeivsiy\",\"git\":{\"branch\":\"dncj\",\"repo_clone_url\":\"onbzoggculapzwy\"},\"github\":{\"branch\":\"ogtqxepnylbf\",\"deploy_on_push\":true,\"repo\":\"yjt\"},\"gitlab\":{\"branch\":\"fqzhv\",\"deploy_on_push\":false,\"repo\":\"yfm\"},\"image\":{\"registry\":\"xrkjpvdw\",\"registry_type\":\"DOCR\",\"repository\":\"iivwzjbhyzsxjrka\",\"tag\":\"trnegvmnvuqeqvld\"},\"dockerfile_path\":\"astjbkkdmflvestm\",\"build_command\":\"xrrilozapee\",\"run_command\":\"hpxlktwkuziycs\",\"source_dir\":\"vu\",\"envs\":[{\"key\":\"tcktyhjtqedcgzu\",\"scope\":\"RUN_TIME\",\"type\":\"GENERAL\",\"value\":\"z\"},{\"key\":\"rr\",\"scope\":\"RUN_TIME\",\"type\":\"GENERAL\",\"value\":\"dzgkr\"}],\"environment_slug\":\"eevt\",\"log_destinations\":{\"name\":\"pryu\",\"papertrail\":{\"endpoint\":\"wytpzdmovz\"},\"datadog\":{\"endpoint\":\"aawzqadfl\",\"api_key\":\"z\"},\"logtail\":{\"token\":\"glae\"}}}").toObject(AppComponentBase.class);
        Assertions.assertEquals("kzbrmsgeivsiy", model.getName());
        Assertions.assertEquals("dncj", model.getGit().getBranch());
        Assertions.assertEquals("onbzoggculapzwy", model.getGit().getRepoCloneUrl());
        Assertions.assertEquals("ogtqxepnylbf", model.getGithub().getBranch());
        Assertions.assertEquals(true, model.getGithub().isDeployOnPush());
        Assertions.assertEquals("yjt", model.getGithub().getRepo());
        Assertions.assertEquals("fqzhv", model.getGitlab().getBranch());
        Assertions.assertEquals(false, model.getGitlab().isDeployOnPush());
        Assertions.assertEquals("yfm", model.getGitlab().getRepo());
        Assertions.assertEquals("xrkjpvdw", model.getImage().getRegistry());
        Assertions.assertEquals(AppsImageSourceSpecRegistryType.DOCR, model.getImage().getRegistryType());
        Assertions.assertEquals("iivwzjbhyzsxjrka", model.getImage().getRepository());
        Assertions.assertEquals("trnegvmnvuqeqvld", model.getImage().getTag());
        Assertions.assertEquals("astjbkkdmflvestm", model.getDockerfilePath());
        Assertions.assertEquals("xrrilozapee", model.getBuildCommand());
        Assertions.assertEquals("hpxlktwkuziycs", model.getRunCommand());
        Assertions.assertEquals("vu", model.getSourceDir());
        Assertions.assertEquals("tcktyhjtqedcgzu", model.getEnvs().get(0).getKey());
        Assertions.assertEquals(AppVariableDefinitionScope.RUNTIME, model.getEnvs().get(0).getScope());
        Assertions.assertEquals(AppVariableDefinitionType.GENERAL, model.getEnvs().get(0).getType());
        Assertions.assertEquals("z", model.getEnvs().get(0).getValue());
        Assertions.assertEquals("eevt", model.getEnvironmentSlug());
        Assertions.assertEquals("pryu", model.getLogDestinations().getName());
        Assertions.assertEquals("wytpzdmovz", model.getLogDestinations().getPapertrail().getEndpoint());
        Assertions.assertEquals("aawzqadfl", model.getLogDestinations().getDatadog().getEndpoint());
        Assertions.assertEquals("z", model.getLogDestinations().getDatadog().getApiKey());
        Assertions.assertEquals("glae", model.getLogDestinations().getLogtail().getToken());
    }

    @Test
    public void testSerialize() {
        AppComponentBase model = new AppComponentBase().setName("kzbrmsgeivsiy").setGit(new AppsGitSourceSpec().setBranch("dncj").setRepoCloneUrl("onbzoggculapzwy")).setGithub(new AppsGithubSourceSpec().setBranch("ogtqxepnylbf").setDeployOnPush(true).setRepo("yjt")).setGitlab(new AppsGitlabSourceSpec().setBranch("fqzhv").setDeployOnPush(false).setRepo("yfm")).setImage(new AppsImageSourceSpec().setRegistry("xrkjpvdw").setRegistryType(AppsImageSourceSpecRegistryType.DOCR).setRepository("iivwzjbhyzsxjrka").setTag("trnegvmnvuqeqvld")).setDockerfilePath("astjbkkdmflvestm").setBuildCommand("xrrilozapee").setRunCommand("hpxlktwkuziycs").setSourceDir("vu").setEnvs(Arrays.asList(new AppVariableDefinition().setKey("tcktyhjtqedcgzu").setScope(AppVariableDefinitionScope.RUNTIME).setType(AppVariableDefinitionType.GENERAL).setValue("z"), new AppVariableDefinition().setKey("rr").setScope(AppVariableDefinitionScope.RUNTIME).setType(AppVariableDefinitionType.GENERAL).setValue("dzgkr"))).setEnvironmentSlug("eevt").setLogDestinations(new AppLogDestinationDefinition().setName("pryu").setPapertrail(new AppLogDestinationPapertrailSpec().setEndpoint("wytpzdmovz")).setDatadog(new AppLogDestinationDatadogSpec().setEndpoint("aawzqadfl").setApiKey("z")).setLogtail(new AppLogDestinationLogtailSpec().setToken("glae")));
        model = BinaryData.fromObject(model).toObject(AppComponentBase.class);
        Assertions.assertEquals("kzbrmsgeivsiy", model.getName());
        Assertions.assertEquals("dncj", model.getGit().getBranch());
        Assertions.assertEquals("onbzoggculapzwy", model.getGit().getRepoCloneUrl());
        Assertions.assertEquals("ogtqxepnylbf", model.getGithub().getBranch());
        Assertions.assertEquals(true, model.getGithub().isDeployOnPush());
        Assertions.assertEquals("yjt", model.getGithub().getRepo());
        Assertions.assertEquals("fqzhv", model.getGitlab().getBranch());
        Assertions.assertEquals(false, model.getGitlab().isDeployOnPush());
        Assertions.assertEquals("yfm", model.getGitlab().getRepo());
        Assertions.assertEquals("xrkjpvdw", model.getImage().getRegistry());
        Assertions.assertEquals(AppsImageSourceSpecRegistryType.DOCR, model.getImage().getRegistryType());
        Assertions.assertEquals("iivwzjbhyzsxjrka", model.getImage().getRepository());
        Assertions.assertEquals("trnegvmnvuqeqvld", model.getImage().getTag());
        Assertions.assertEquals("astjbkkdmflvestm", model.getDockerfilePath());
        Assertions.assertEquals("xrrilozapee", model.getBuildCommand());
        Assertions.assertEquals("hpxlktwkuziycs", model.getRunCommand());
        Assertions.assertEquals("vu", model.getSourceDir());
        Assertions.assertEquals("tcktyhjtqedcgzu", model.getEnvs().get(0).getKey());
        Assertions.assertEquals(AppVariableDefinitionScope.RUNTIME, model.getEnvs().get(0).getScope());
        Assertions.assertEquals(AppVariableDefinitionType.GENERAL, model.getEnvs().get(0).getType());
        Assertions.assertEquals("z", model.getEnvs().get(0).getValue());
        Assertions.assertEquals("eevt", model.getEnvironmentSlug());
        Assertions.assertEquals("pryu", model.getLogDestinations().getName());
        Assertions.assertEquals("wytpzdmovz", model.getLogDestinations().getPapertrail().getEndpoint());
        Assertions.assertEquals("aawzqadfl", model.getLogDestinations().getDatadog().getEndpoint());
        Assertions.assertEquals("z", model.getLogDestinations().getDatadog().getApiKey());
        Assertions.assertEquals("glae", model.getLogDestinations().getLogtail().getToken());
    }
}
