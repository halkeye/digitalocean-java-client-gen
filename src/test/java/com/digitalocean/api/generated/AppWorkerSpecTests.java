package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppComponentBase;
import com.digitalocean.api.models.AppComponentInstanceBaseInstanceSizeSlug;
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
import com.digitalocean.api.models.AppWorkerSpec;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppWorkerSpecTests {
    @Test
    public void testDeserialize() {
        AppWorkerSpec model = BinaryData.fromString("{\"instance_count\":7993985710285219031,\"instance_size_slug\":\"professional-s\",\"name\":\"f\",\"git\":{\"branch\":\"vvmu\",\"repo_clone_url\":\"pmuneqsx\"},\"github\":{\"branch\":\"fbuzjyihs\",\"deploy_on_push\":false,\"repo\":\"udypohyuems\"},\"gitlab\":{\"branch\":\"sqy\",\"deploy_on_push\":true,\"repo\":\"obrltt\"},\"image\":{\"registry\":\"jnygq\",\"registry_type\":\"DOCKER_HUB\",\"repository\":\"qzdz\",\"tag\":\"ilaxhn\"},\"dockerfile_path\":\"qlyvijo\",\"build_command\":\"iv\",\"run_command\":\"oyzunbixxr\",\"source_dir\":\"kvcpwpgclr\",\"envs\":[{\"key\":\"tso\",\"scope\":\"RUN_TIME\",\"type\":\"SECRET\",\"value\":\"xpmyyefrpmpdnq\"},{\"key\":\"skawaoqvmmb\",\"scope\":\"UNSET\",\"type\":\"GENERAL\",\"value\":\"qlkzme\"}],\"environment_slug\":\"itgvkx\",\"log_destinations\":{\"name\":\"yqdrf\",\"papertrail\":{\"endpoint\":\"cealzxwh\"},\"datadog\":{\"endpoint\":\"symoyq\",\"api_key\":\"lwigdivbkbx\"},\"logtail\":{\"token\":\"fajuwas\"}}}").toObject(AppWorkerSpec.class);
        Assertions.assertEquals("f", model.getName());
        Assertions.assertEquals("vvmu", model.getGit().getBranch());
        Assertions.assertEquals("pmuneqsx", model.getGit().getRepoCloneUrl());
        Assertions.assertEquals("fbuzjyihs", model.getGithub().getBranch());
        Assertions.assertEquals(false, model.getGithub().isDeployOnPush());
        Assertions.assertEquals("udypohyuems", model.getGithub().getRepo());
        Assertions.assertEquals("sqy", model.getGitlab().getBranch());
        Assertions.assertEquals(true, model.getGitlab().isDeployOnPush());
        Assertions.assertEquals("obrltt", model.getGitlab().getRepo());
        Assertions.assertEquals("jnygq", model.getImage().getRegistry());
        Assertions.assertEquals(AppsImageSourceSpecRegistryType.DOCKER_HUB, model.getImage().getRegistryType());
        Assertions.assertEquals("qzdz", model.getImage().getRepository());
        Assertions.assertEquals("ilaxhn", model.getImage().getTag());
        Assertions.assertEquals("qlyvijo", model.getDockerfilePath());
        Assertions.assertEquals("iv", model.getBuildCommand());
        Assertions.assertEquals("oyzunbixxr", model.getRunCommand());
        Assertions.assertEquals("kvcpwpgclr", model.getSourceDir());
        Assertions.assertEquals("tso", model.getEnvs().get(0).getKey());
        Assertions.assertEquals(AppVariableDefinitionScope.RUNTIME, model.getEnvs().get(0).getScope());
        Assertions.assertEquals(AppVariableDefinitionType.SECRET, model.getEnvs().get(0).getType());
        Assertions.assertEquals("xpmyyefrpmpdnq", model.getEnvs().get(0).getValue());
        Assertions.assertEquals("itgvkx", model.getEnvironmentSlug());
        Assertions.assertEquals("yqdrf", model.getLogDestinations().getName());
        Assertions.assertEquals("cealzxwh", model.getLogDestinations().getPapertrail().getEndpoint());
        Assertions.assertEquals("symoyq", model.getLogDestinations().getDatadog().getEndpoint());
        Assertions.assertEquals("lwigdivbkbx", model.getLogDestinations().getDatadog().getApiKey());
        Assertions.assertEquals("fajuwas", model.getLogDestinations().getLogtail().getToken());
        Assertions.assertEquals(7993985710285219031L, model.getInstanceCount());
        Assertions.assertEquals(AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALS, model.getInstanceSizeSlug());
    }

    @Test
    public void testSerialize() {
        AppWorkerSpec model = new AppWorkerSpec().setName("f").setGit(new AppsGitSourceSpec().setBranch("vvmu").setRepoCloneUrl("pmuneqsx")).setGithub(new AppsGithubSourceSpec().setBranch("fbuzjyihs").setDeployOnPush(false).setRepo("udypohyuems")).setGitlab(new AppsGitlabSourceSpec().setBranch("sqy").setDeployOnPush(true).setRepo("obrltt")).setImage(new AppsImageSourceSpec().setRegistry("jnygq").setRegistryType(AppsImageSourceSpecRegistryType.DOCKER_HUB).setRepository("qzdz").setTag("ilaxhn")).setDockerfilePath("qlyvijo").setBuildCommand("iv").setRunCommand("oyzunbixxr").setSourceDir("kvcpwpgclr").setEnvs(Arrays.asList(new AppVariableDefinition().setKey("tso").setScope(AppVariableDefinitionScope.RUNTIME).setType(AppVariableDefinitionType.SECRET).setValue("xpmyyefrpmpdnq"), new AppVariableDefinition().setKey("skawaoqvmmb").setScope(AppVariableDefinitionScope.UNSET).setType(AppVariableDefinitionType.GENERAL).setValue("qlkzme"))).setEnvironmentSlug("itgvkx").setLogDestinations(new AppLogDestinationDefinition().setName("yqdrf").setPapertrail(new AppLogDestinationPapertrailSpec().setEndpoint("cealzxwh")).setDatadog(new AppLogDestinationDatadogSpec().setEndpoint("symoyq").setApiKey("lwigdivbkbx")).setLogtail(new AppLogDestinationLogtailSpec().setToken("fajuwas"))).setInstanceCount(7993985710285219031L).setInstanceSizeSlug(AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALS);
        model = BinaryData.fromObject(model).toObject(AppWorkerSpec.class);
        Assertions.assertEquals("f", model.getName());
        Assertions.assertEquals("vvmu", model.getGit().getBranch());
        Assertions.assertEquals("pmuneqsx", model.getGit().getRepoCloneUrl());
        Assertions.assertEquals("fbuzjyihs", model.getGithub().getBranch());
        Assertions.assertEquals(false, model.getGithub().isDeployOnPush());
        Assertions.assertEquals("udypohyuems", model.getGithub().getRepo());
        Assertions.assertEquals("sqy", model.getGitlab().getBranch());
        Assertions.assertEquals(true, model.getGitlab().isDeployOnPush());
        Assertions.assertEquals("obrltt", model.getGitlab().getRepo());
        Assertions.assertEquals("jnygq", model.getImage().getRegistry());
        Assertions.assertEquals(AppsImageSourceSpecRegistryType.DOCKER_HUB, model.getImage().getRegistryType());
        Assertions.assertEquals("qzdz", model.getImage().getRepository());
        Assertions.assertEquals("ilaxhn", model.getImage().getTag());
        Assertions.assertEquals("qlyvijo", model.getDockerfilePath());
        Assertions.assertEquals("iv", model.getBuildCommand());
        Assertions.assertEquals("oyzunbixxr", model.getRunCommand());
        Assertions.assertEquals("kvcpwpgclr", model.getSourceDir());
        Assertions.assertEquals("tso", model.getEnvs().get(0).getKey());
        Assertions.assertEquals(AppVariableDefinitionScope.RUNTIME, model.getEnvs().get(0).getScope());
        Assertions.assertEquals(AppVariableDefinitionType.SECRET, model.getEnvs().get(0).getType());
        Assertions.assertEquals("xpmyyefrpmpdnq", model.getEnvs().get(0).getValue());
        Assertions.assertEquals("itgvkx", model.getEnvironmentSlug());
        Assertions.assertEquals("yqdrf", model.getLogDestinations().getName());
        Assertions.assertEquals("cealzxwh", model.getLogDestinations().getPapertrail().getEndpoint());
        Assertions.assertEquals("symoyq", model.getLogDestinations().getDatadog().getEndpoint());
        Assertions.assertEquals("lwigdivbkbx", model.getLogDestinations().getDatadog().getApiKey());
        Assertions.assertEquals("fajuwas", model.getLogDestinations().getLogtail().getToken());
        Assertions.assertEquals(7993985710285219031L, model.getInstanceCount());
        Assertions.assertEquals(AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALS, model.getInstanceSizeSlug());
    }
}
