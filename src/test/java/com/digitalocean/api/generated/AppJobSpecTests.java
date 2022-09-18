package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppComponentBase;
import com.digitalocean.api.models.AppComponentInstanceBaseInstanceSizeSlug;
import com.digitalocean.api.models.AppJobSpec;
import com.digitalocean.api.models.AppJobSpecKind;
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
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppJobSpecTests {
    @Test
    public void testDeserialize() {
        AppJobSpec model = BinaryData.fromString("{\"kind\":\"FAILED_DEPLOY\",\"instance_count\":5505955768043549507,\"instance_size_slug\":\"professional-1l\",\"name\":\"poaimlnwiaaomyl\",\"git\":{\"branch\":\"z\",\"repo_clone_url\":\"cse\"},\"github\":{\"branch\":\"wnpjhlfzswpchwa\",\"deploy_on_push\":false,\"repo\":\"usnfepgfewet\"},\"gitlab\":{\"branch\":\"xgncxyk\",\"deploy_on_push\":false,\"repo\":\"h\"},\"image\":{\"registry\":\"mbcxfhbcp\",\"registry_type\":\"DOCKER_HUB\",\"repository\":\"xcjzhqizxfpxt\",\"tag\":\"scjavftju\"},\"dockerfile_path\":\"qaz\",\"build_command\":\"tgguwpijrajcivmm\",\"run_command\":\"f\",\"source_dir\":\"iwrxgkn\",\"envs\":[{\"key\":\"yinzqodfvpgs\",\"scope\":\"UNSET\",\"type\":\"SECRET\",\"value\":\"bpfgzdj\"}],\"environment_slug\":\"vzflbq\",\"log_destinations\":{\"name\":\"aqvlgafcqusr\",\"papertrail\":{\"endpoint\":\"etnwsdtutnw\"},\"datadog\":{\"endpoint\":\"ycvuzhyrmewipmv\",\"api_key\":\"k\"},\"logtail\":{\"token\":\"kuqgsjjxundxgket\"}}}").toObject(AppJobSpec.class);
        Assertions.assertEquals("poaimlnwiaaomyl", model.getName());
        Assertions.assertEquals("z", model.getGit().getBranch());
        Assertions.assertEquals("cse", model.getGit().getRepoCloneUrl());
        Assertions.assertEquals("wnpjhlfzswpchwa", model.getGithub().getBranch());
        Assertions.assertEquals(false, model.getGithub().isDeployOnPush());
        Assertions.assertEquals("usnfepgfewet", model.getGithub().getRepo());
        Assertions.assertEquals("xgncxyk", model.getGitlab().getBranch());
        Assertions.assertEquals(false, model.getGitlab().isDeployOnPush());
        Assertions.assertEquals("h", model.getGitlab().getRepo());
        Assertions.assertEquals("mbcxfhbcp", model.getImage().getRegistry());
        Assertions.assertEquals(AppsImageSourceSpecRegistryType.DOCKER_HUB, model.getImage().getRegistryType());
        Assertions.assertEquals("xcjzhqizxfpxt", model.getImage().getRepository());
        Assertions.assertEquals("scjavftju", model.getImage().getTag());
        Assertions.assertEquals("qaz", model.getDockerfilePath());
        Assertions.assertEquals("tgguwpijrajcivmm", model.getBuildCommand());
        Assertions.assertEquals("f", model.getRunCommand());
        Assertions.assertEquals("iwrxgkn", model.getSourceDir());
        Assertions.assertEquals("yinzqodfvpgs", model.getEnvs().get(0).getKey());
        Assertions.assertEquals(AppVariableDefinitionScope.UNSET, model.getEnvs().get(0).getScope());
        Assertions.assertEquals(AppVariableDefinitionType.SECRET, model.getEnvs().get(0).getType());
        Assertions.assertEquals("bpfgzdj", model.getEnvs().get(0).getValue());
        Assertions.assertEquals("vzflbq", model.getEnvironmentSlug());
        Assertions.assertEquals("aqvlgafcqusr", model.getLogDestinations().getName());
        Assertions.assertEquals("etnwsdtutnw", model.getLogDestinations().getPapertrail().getEndpoint());
        Assertions.assertEquals("ycvuzhyrmewipmv", model.getLogDestinations().getDatadog().getEndpoint());
        Assertions.assertEquals("k", model.getLogDestinations().getDatadog().getApiKey());
        Assertions.assertEquals("kuqgsjjxundxgket", model.getLogDestinations().getLogtail().getToken());
        Assertions.assertEquals(AppJobSpecKind.FAILED_DEPLOY, model.getKind());
        Assertions.assertEquals(5505955768043549507L, model.getInstanceCount());
        Assertions.assertEquals(AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL1L, model.getInstanceSizeSlug());
    }

    @Test
    public void testSerialize() {
        AppJobSpec model = new AppJobSpec().setName("poaimlnwiaaomyl").setGit(new AppsGitSourceSpec().setBranch("z").setRepoCloneUrl("cse")).setGithub(new AppsGithubSourceSpec().setBranch("wnpjhlfzswpchwa").setDeployOnPush(false).setRepo("usnfepgfewet")).setGitlab(new AppsGitlabSourceSpec().setBranch("xgncxyk").setDeployOnPush(false).setRepo("h")).setImage(new AppsImageSourceSpec().setRegistry("mbcxfhbcp").setRegistryType(AppsImageSourceSpecRegistryType.DOCKER_HUB).setRepository("xcjzhqizxfpxt").setTag("scjavftju")).setDockerfilePath("qaz").setBuildCommand("tgguwpijrajcivmm").setRunCommand("f").setSourceDir("iwrxgkn").setEnvs(Arrays.asList(new AppVariableDefinition().setKey("yinzqodfvpgs").setScope(AppVariableDefinitionScope.UNSET).setType(AppVariableDefinitionType.SECRET).setValue("bpfgzdj"))).setEnvironmentSlug("vzflbq").setLogDestinations(new AppLogDestinationDefinition().setName("aqvlgafcqusr").setPapertrail(new AppLogDestinationPapertrailSpec().setEndpoint("etnwsdtutnw")).setDatadog(new AppLogDestinationDatadogSpec().setEndpoint("ycvuzhyrmewipmv").setApiKey("k")).setLogtail(new AppLogDestinationLogtailSpec().setToken("kuqgsjjxundxgket"))).setKind(AppJobSpecKind.FAILED_DEPLOY).setInstanceCount(5505955768043549507L).setInstanceSizeSlug(AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL1L);
        model = BinaryData.fromObject(model).toObject(AppJobSpec.class);
        Assertions.assertEquals("poaimlnwiaaomyl", model.getName());
        Assertions.assertEquals("z", model.getGit().getBranch());
        Assertions.assertEquals("cse", model.getGit().getRepoCloneUrl());
        Assertions.assertEquals("wnpjhlfzswpchwa", model.getGithub().getBranch());
        Assertions.assertEquals(false, model.getGithub().isDeployOnPush());
        Assertions.assertEquals("usnfepgfewet", model.getGithub().getRepo());
        Assertions.assertEquals("xgncxyk", model.getGitlab().getBranch());
        Assertions.assertEquals(false, model.getGitlab().isDeployOnPush());
        Assertions.assertEquals("h", model.getGitlab().getRepo());
        Assertions.assertEquals("mbcxfhbcp", model.getImage().getRegistry());
        Assertions.assertEquals(AppsImageSourceSpecRegistryType.DOCKER_HUB, model.getImage().getRegistryType());
        Assertions.assertEquals("xcjzhqizxfpxt", model.getImage().getRepository());
        Assertions.assertEquals("scjavftju", model.getImage().getTag());
        Assertions.assertEquals("qaz", model.getDockerfilePath());
        Assertions.assertEquals("tgguwpijrajcivmm", model.getBuildCommand());
        Assertions.assertEquals("f", model.getRunCommand());
        Assertions.assertEquals("iwrxgkn", model.getSourceDir());
        Assertions.assertEquals("yinzqodfvpgs", model.getEnvs().get(0).getKey());
        Assertions.assertEquals(AppVariableDefinitionScope.UNSET, model.getEnvs().get(0).getScope());
        Assertions.assertEquals(AppVariableDefinitionType.SECRET, model.getEnvs().get(0).getType());
        Assertions.assertEquals("bpfgzdj", model.getEnvs().get(0).getValue());
        Assertions.assertEquals("vzflbq", model.getEnvironmentSlug());
        Assertions.assertEquals("aqvlgafcqusr", model.getLogDestinations().getName());
        Assertions.assertEquals("etnwsdtutnw", model.getLogDestinations().getPapertrail().getEndpoint());
        Assertions.assertEquals("ycvuzhyrmewipmv", model.getLogDestinations().getDatadog().getEndpoint());
        Assertions.assertEquals("k", model.getLogDestinations().getDatadog().getApiKey());
        Assertions.assertEquals("kuqgsjjxundxgket", model.getLogDestinations().getLogtail().getToken());
        Assertions.assertEquals(AppJobSpecKind.FAILED_DEPLOY, model.getKind());
        Assertions.assertEquals(5505955768043549507L, model.getInstanceCount());
        Assertions.assertEquals(AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL1L, model.getInstanceSizeSlug());
    }
}
