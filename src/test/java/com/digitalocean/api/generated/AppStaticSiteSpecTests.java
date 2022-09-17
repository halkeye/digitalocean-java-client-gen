package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppLogDestinationDatadogSpec;
import com.digitalocean.api.models.AppLogDestinationDefinition;
import com.digitalocean.api.models.AppLogDestinationLogtailSpec;
import com.digitalocean.api.models.AppLogDestinationPapertrailSpec;
import com.digitalocean.api.models.AppRouteSpec;
import com.digitalocean.api.models.AppStaticSiteSpec;
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

public final class AppStaticSiteSpecTests {
    @Test
    public void testDeserialize() {
        AppStaticSiteSpec model =
                BinaryData.fromString(
                                "{\"index_document\":\"frbbc\",\"error_document\":\"qagt\",\"catchall_document\":\"dhlfkqojpykvgt\",\"output_dir\":\"cnifm\",\"cors\":{\"allow_origins\":[{\"exact\":\"m\",\"prefix\":\"nysuxmprafwgckh\",\"regex\":\"xvd\"},{\"exact\":\"fwafqrouda\",\"prefix\":\"avehhrvkbunzo\",\"regex\":\"dhcxgkmoy\"}],\"allow_methods\":[\"yuibhm\",\"dnbzydvfvfcjn\"],\"allow_headers\":[\"isrvhm\",\"orffukiscv\",\"mzhwplefaxvxi\",\"cbtgnhnz\"],\"expose_headers\":[\"xtjjfzqlqhycav\",\"dggxdbeesmi\",\"knlrariaawiuagy\",\"wqfbylyrfgiagt\"],\"max_age\":\"jocqwogfnzjvusf\",\"allow_credentials\":false},\"routes\":[{\"path\":\"uxylfsbtkadpy\",\"preserve_path_prefix\":false},{\"path\":\"btgkbugrjqctoj\",\"preserve_path_prefix\":true},{\"path\":\"of\",\"preserve_path_prefix\":true},{\"path\":\"efojyqdhcupl\",\"preserve_path_prefix\":true}],\"name\":\"wkhihihlhzdsqt\",\"git\":{\"branch\":\"rgnowcjhfgm\",\"repo_clone_url\":\"cact\"},\"github\":{\"branch\":\"oteyowc\",\"deploy_on_push\":true,\"repo\":\"vekqvgqo\"},\"gitlab\":{\"branch\":\"fzmpjwyivq\",\"deploy_on_push\":false,\"repo\":\"cvhrfsp\"},\"image\":{\"registry\":\"grttikteusqczk\",\"registry_type\":\"DOCKER_HUB\",\"repository\":\"xubyjaffmmfblcqc\",\"tag\":\"bgq\"},\"dockerfile_path\":\"rtalmet\",\"build_command\":\"wgdsl\",\"run_command\":\"ihhrmo\",\"source_dir\":\"z\",\"envs\":[{\"key\":\"ypxiutcxap\",\"scope\":\"UNSET\",\"type\":\"SECRET\",\"value\":\"togebjoxsl\"},{\"key\":\"vnh\",\"scope\":\"BUILD_TIME\",\"type\":\"GENERAL\",\"value\":\"kkzjcjbtrga\"},{\"key\":\"hvv\",\"scope\":\"RUN_AND_BUILD_TIME\",\"type\":\"GENERAL\",\"value\":\"s\"},{\"key\":\"oqbeitpkxzt\",\"scope\":\"UNSET\",\"type\":\"GENERAL\",\"value\":\"ft\"}],\"environment_slug\":\"gfcwqmpimaqxzhem\",\"log_destinations\":{\"name\":\"h\",\"papertrail\":{\"endpoint\":\"uj\"},\"datadog\":{\"endpoint\":\"wkozz\",\"api_key\":\"culkbawpfaj\"},\"logtail\":{\"token\":\"ltlwtjjguktalhs\"}}}")
                        .toObject(AppStaticSiteSpec.class);
        Assertions.assertEquals("wkhihihlhzdsqt", model.getName());
        Assertions.assertEquals("rgnowcjhfgm", model.getGit().getBranch());
        Assertions.assertEquals("cact", model.getGit().getRepoCloneUrl());
        Assertions.assertEquals("oteyowc", model.getGithub().getBranch());
        Assertions.assertEquals(true, model.getGithub().isDeployOnPush());
        Assertions.assertEquals("vekqvgqo", model.getGithub().getRepo());
        Assertions.assertEquals("fzmpjwyivq", model.getGitlab().getBranch());
        Assertions.assertEquals(false, model.getGitlab().isDeployOnPush());
        Assertions.assertEquals("cvhrfsp", model.getGitlab().getRepo());
        Assertions.assertEquals("grttikteusqczk", model.getImage().getRegistry());
        Assertions.assertEquals(AppsImageSourceSpecRegistryType.DOCKER_HUB, model.getImage().getRegistryType());
        Assertions.assertEquals("xubyjaffmmfblcqc", model.getImage().getRepository());
        Assertions.assertEquals("bgq", model.getImage().getTag());
        Assertions.assertEquals("rtalmet", model.getDockerfilePath());
        Assertions.assertEquals("wgdsl", model.getBuildCommand());
        Assertions.assertEquals("ihhrmo", model.getRunCommand());
        Assertions.assertEquals("z", model.getSourceDir());
        Assertions.assertEquals("ypxiutcxap", model.getEnvs().get(0).getKey());
        Assertions.assertEquals(AppVariableDefinitionScope.UNSET, model.getEnvs().get(0).getScope());
        Assertions.assertEquals(AppVariableDefinitionType.SECRET, model.getEnvs().get(0).getType());
        Assertions.assertEquals("togebjoxsl", model.getEnvs().get(0).getValue());
        Assertions.assertEquals("gfcwqmpimaqxzhem", model.getEnvironmentSlug());
        Assertions.assertEquals("h", model.getLogDestinations().getName());
        Assertions.assertEquals("uj", model.getLogDestinations().getPapertrail().getEndpoint());
        Assertions.assertEquals("wkozz", model.getLogDestinations().getDatadog().getEndpoint());
        Assertions.assertEquals("culkbawpfaj", model.getLogDestinations().getDatadog().getApiKey());
        Assertions.assertEquals("ltlwtjjguktalhs", model.getLogDestinations().getLogtail().getToken());
        Assertions.assertEquals("frbbc", model.getIndexDocument());
        Assertions.assertEquals("qagt", model.getErrorDocument());
        Assertions.assertEquals("dhlfkqojpykvgt", model.getCatchallDocument());
        Assertions.assertEquals("cnifm", model.getOutputDir());
        Assertions.assertEquals("m", model.getCors().getAllowOrigins().get(0).getExact());
        Assertions.assertEquals("nysuxmprafwgckh", model.getCors().getAllowOrigins().get(0).getPrefix());
        Assertions.assertEquals("xvd", model.getCors().getAllowOrigins().get(0).getRegex());
        Assertions.assertEquals("yuibhm", model.getCors().getAllowMethods().get(0));
        Assertions.assertEquals("isrvhm", model.getCors().getAllowHeaders().get(0));
        Assertions.assertEquals("xtjjfzqlqhycav", model.getCors().getExposeHeaders().get(0));
        Assertions.assertEquals("jocqwogfnzjvusf", model.getCors().getMaxAge());
        Assertions.assertEquals(false, model.getCors().isAllowCredentials());
        Assertions.assertEquals("uxylfsbtkadpy", model.getRoutes().get(0).getPath());
        Assertions.assertEquals(false, model.getRoutes().get(0).isPreservePathPrefix());
    }

    @Test
    public void testSerialize() {
        AppStaticSiteSpec model =
                new AppStaticSiteSpec()
                        .setName("wkhihihlhzdsqt")
                        .setGit(new AppsGitSourceSpec().setBranch("rgnowcjhfgm").setRepoCloneUrl("cact"))
                        .setGithub(
                                new AppsGithubSourceSpec()
                                        .setBranch("oteyowc")
                                        .setDeployOnPush(true)
                                        .setRepo("vekqvgqo"))
                        .setGitlab(
                                new AppsGitlabSourceSpec()
                                        .setBranch("fzmpjwyivq")
                                        .setDeployOnPush(false)
                                        .setRepo("cvhrfsp"))
                        .setImage(
                                new AppsImageSourceSpec()
                                        .setRegistry("grttikteusqczk")
                                        .setRegistryType(AppsImageSourceSpecRegistryType.DOCKER_HUB)
                                        .setRepository("xubyjaffmmfblcqc")
                                        .setTag("bgq"))
                        .setDockerfilePath("rtalmet")
                        .setBuildCommand("wgdsl")
                        .setRunCommand("ihhrmo")
                        .setSourceDir("z")
                        .setEnvs(
                                Arrays.asList(
                                        new AppVariableDefinition()
                                                .setKey("ypxiutcxap")
                                                .setScope(AppVariableDefinitionScope.UNSET)
                                                .setType(AppVariableDefinitionType.SECRET)
                                                .setValue("togebjoxsl"),
                                        new AppVariableDefinition()
                                                .setKey("vnh")
                                                .setScope(AppVariableDefinitionScope.BUILD_TIME)
                                                .setType(AppVariableDefinitionType.GENERAL)
                                                .setValue("kkzjcjbtrga"),
                                        new AppVariableDefinition()
                                                .setKey("hvv")
                                                .setScope(AppVariableDefinitionScope.RUNANDBUILD_TIME)
                                                .setType(AppVariableDefinitionType.GENERAL)
                                                .setValue("s"),
                                        new AppVariableDefinition()
                                                .setKey("oqbeitpkxzt")
                                                .setScope(AppVariableDefinitionScope.UNSET)
                                                .setType(AppVariableDefinitionType.GENERAL)
                                                .setValue("ft")))
                        .setEnvironmentSlug("gfcwqmpimaqxzhem")
                        .setLogDestinations(
                                new AppLogDestinationDefinition()
                                        .setName("h")
                                        .setPapertrail(new AppLogDestinationPapertrailSpec().setEndpoint("uj"))
                                        .setDatadog(
                                                new AppLogDestinationDatadogSpec()
                                                        .setEndpoint("wkozz")
                                                        .setApiKey("culkbawpfaj"))
                                        .setLogtail(new AppLogDestinationLogtailSpec().setToken("ltlwtjjguktalhs")))
                        .setIndexDocument("frbbc")
                        .setErrorDocument("qagt")
                        .setCatchallDocument("dhlfkqojpykvgt")
                        .setOutputDir("cnifm")
                        .setCors(
                                new AppsCorsPolicy()
                                        .setAllowOrigins(
                                                Arrays.asList(
                                                        new AppsStringMatch()
                                                                .setExact("m")
                                                                .setPrefix("nysuxmprafwgckh")
                                                                .setRegex("xvd"),
                                                        new AppsStringMatch()
                                                                .setExact("fwafqrouda")
                                                                .setPrefix("avehhrvkbunzo")
                                                                .setRegex("dhcxgkmoy")))
                                        .setAllowMethods(Arrays.asList("yuibhm", "dnbzydvfvfcjn"))
                                        .setAllowHeaders(
                                                Arrays.asList("isrvhm", "orffukiscv", "mzhwplefaxvxi", "cbtgnhnz"))
                                        .setExposeHeaders(
                                                Arrays.asList(
                                                        "xtjjfzqlqhycav",
                                                        "dggxdbeesmi",
                                                        "knlrariaawiuagy",
                                                        "wqfbylyrfgiagt"))
                                        .setMaxAge("jocqwogfnzjvusf")
                                        .setAllowCredentials(false))
                        .setRoutes(
                                Arrays.asList(
                                        new AppRouteSpec().setPath("uxylfsbtkadpy").setPreservePathPrefix(false),
                                        new AppRouteSpec().setPath("btgkbugrjqctoj").setPreservePathPrefix(true),
                                        new AppRouteSpec().setPath("of").setPreservePathPrefix(true),
                                        new AppRouteSpec().setPath("efojyqdhcupl").setPreservePathPrefix(true)));
        model = BinaryData.fromObject(model).toObject(AppStaticSiteSpec.class);
        Assertions.assertEquals("wkhihihlhzdsqt", model.getName());
        Assertions.assertEquals("rgnowcjhfgm", model.getGit().getBranch());
        Assertions.assertEquals("cact", model.getGit().getRepoCloneUrl());
        Assertions.assertEquals("oteyowc", model.getGithub().getBranch());
        Assertions.assertEquals(true, model.getGithub().isDeployOnPush());
        Assertions.assertEquals("vekqvgqo", model.getGithub().getRepo());
        Assertions.assertEquals("fzmpjwyivq", model.getGitlab().getBranch());
        Assertions.assertEquals(false, model.getGitlab().isDeployOnPush());
        Assertions.assertEquals("cvhrfsp", model.getGitlab().getRepo());
        Assertions.assertEquals("grttikteusqczk", model.getImage().getRegistry());
        Assertions.assertEquals(AppsImageSourceSpecRegistryType.DOCKER_HUB, model.getImage().getRegistryType());
        Assertions.assertEquals("xubyjaffmmfblcqc", model.getImage().getRepository());
        Assertions.assertEquals("bgq", model.getImage().getTag());
        Assertions.assertEquals("rtalmet", model.getDockerfilePath());
        Assertions.assertEquals("wgdsl", model.getBuildCommand());
        Assertions.assertEquals("ihhrmo", model.getRunCommand());
        Assertions.assertEquals("z", model.getSourceDir());
        Assertions.assertEquals("ypxiutcxap", model.getEnvs().get(0).getKey());
        Assertions.assertEquals(AppVariableDefinitionScope.UNSET, model.getEnvs().get(0).getScope());
        Assertions.assertEquals(AppVariableDefinitionType.SECRET, model.getEnvs().get(0).getType());
        Assertions.assertEquals("togebjoxsl", model.getEnvs().get(0).getValue());
        Assertions.assertEquals("gfcwqmpimaqxzhem", model.getEnvironmentSlug());
        Assertions.assertEquals("h", model.getLogDestinations().getName());
        Assertions.assertEquals("uj", model.getLogDestinations().getPapertrail().getEndpoint());
        Assertions.assertEquals("wkozz", model.getLogDestinations().getDatadog().getEndpoint());
        Assertions.assertEquals("culkbawpfaj", model.getLogDestinations().getDatadog().getApiKey());
        Assertions.assertEquals("ltlwtjjguktalhs", model.getLogDestinations().getLogtail().getToken());
        Assertions.assertEquals("frbbc", model.getIndexDocument());
        Assertions.assertEquals("qagt", model.getErrorDocument());
        Assertions.assertEquals("dhlfkqojpykvgt", model.getCatchallDocument());
        Assertions.assertEquals("cnifm", model.getOutputDir());
        Assertions.assertEquals("m", model.getCors().getAllowOrigins().get(0).getExact());
        Assertions.assertEquals("nysuxmprafwgckh", model.getCors().getAllowOrigins().get(0).getPrefix());
        Assertions.assertEquals("xvd", model.getCors().getAllowOrigins().get(0).getRegex());
        Assertions.assertEquals("yuibhm", model.getCors().getAllowMethods().get(0));
        Assertions.assertEquals("isrvhm", model.getCors().getAllowHeaders().get(0));
        Assertions.assertEquals("xtjjfzqlqhycav", model.getCors().getExposeHeaders().get(0));
        Assertions.assertEquals("jocqwogfnzjvusf", model.getCors().getMaxAge());
        Assertions.assertEquals(false, model.getCors().isAllowCredentials());
        Assertions.assertEquals("uxylfsbtkadpy", model.getRoutes().get(0).getPath());
        Assertions.assertEquals(false, model.getRoutes().get(0).isPreservePathPrefix());
    }
}