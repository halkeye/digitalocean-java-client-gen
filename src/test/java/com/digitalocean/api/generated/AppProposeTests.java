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
import com.digitalocean.api.models.AppPropose;
import com.digitalocean.api.models.AppServiceSpec;
import com.digitalocean.api.models.AppSpec;
import com.digitalocean.api.models.AppSpecRegion;
import com.digitalocean.api.models.AppStaticSiteSpec;
import com.digitalocean.api.models.AppWorkerSpec;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppProposeTests {
    @Test
    public void testDeserialize() {
        AppPropose model =
                BinaryData.fromString(
                                "{\"spec\":{\"name\":\"rbqgvgov\",\"region\":\"nyc\",\"domains\":[{\"domain\":\"efjokn\",\"type\":\"ALIAS\",\"wildcard\":true,\"zone\":\"edikdfrdbiq\",\"minimum_tls_version\":\"1.3\"},{\"domain\":\"geihfql\",\"type\":\"PRIMARY\",\"wildcard\":true,\"zone\":\"zcxmjpbyep\",\"minimum_tls_version\":\"1.2\"},{\"domain\":\"t\",\"type\":\"UNSPECIFIED\",\"wildcard\":false,\"zone\":\"m\",\"minimum_tls_version\":\"1.2\"},{\"domain\":\"i\",\"type\":\"DEFAULT\",\"wildcard\":false,\"zone\":\"omyqwcabvnuileey\",\"minimum_tls_version\":\"1.3\"}],\"services\":[{\"http_port\":6044702270976415412,\"internal_ports\":[],\"routes\":[],\"instance_count\":3960460149409264910,\"instance_size_slug\":\"basic-m\",\"name\":\"oauk\",\"dockerfile_path\":\"sizmoae\",\"build_command\":\"xjw\",\"run_command\":\"vedwcgyeewx\",\"source_dir\":\"qbpsmg\",\"envs\":[],\"environment_slug\":\"u\"},{\"http_port\":769127322308420402,\"internal_ports\":[],\"routes\":[],\"instance_count\":5592106315617662810,\"instance_size_slug\":\"basic-m\",\"name\":\"ufcshhvnew\",\"dockerfile_path\":\"pqanxrjkix\",\"build_command\":\"bta\",\"run_command\":\"pnyghs\",\"source_dir\":\"cyl\",\"envs\":[],\"environment_slug\":\"mnsghpxycphdr\"},{\"http_port\":4104565600880841187,\"internal_ports\":[],\"routes\":[],\"instance_count\":1090681073720986389,\"instance_size_slug\":\"professional-xs\",\"name\":\"xnqmhrpqpdfwm\",\"dockerfile_path\":\"ssffxuifmc\",\"build_command\":\"p\",\"run_command\":\"kdqzrdzsylo\",\"source_dir\":\"gtrczzydmxzjijpv\",\"envs\":[],\"environment_slug\":\"rkihcirld\"},{\"http_port\":921467946090795096,\"internal_ports\":[],\"routes\":[],\"instance_count\":7396785488806348756,\"instance_size_slug\":\"basic-m\",\"name\":\"urnnqbnqbpiz\",\"dockerfile_path\":\"dogypxrxvbfi\",\"build_command\":\"u\",\"run_command\":\"ctafsrbxrblm\",\"source_dir\":\"owxih\",\"envs\":[],\"environment_slug\":\"xwqagnepzw\"}],\"static_sites\":[{\"index_document\":\"sbq\",\"error_document\":\"agwwrxaom\",\"catchall_document\":\"sgl\",\"output_dir\":\"czezkhhlt\",\"routes\":[],\"name\":\"hqo\",\"dockerfile_path\":\"ueayfbpcmsplb\",\"build_command\":\"rueqthwm\",\"run_command\":\"mbscbbx\",\"source_dir\":\"dhxiidlopedbwd\",\"envs\":[],\"environment_slug\":\"yybxubmdnafcbqw\"}],\"jobs\":[{\"kind\":\"POST_DEPLOY\",\"instance_count\":17608559898312941,\"instance_size_slug\":\"basic-xxs\",\"name\":\"ele\",\"dockerfile_path\":\"vwzkj\",\"build_command\":\"wbeonrlkwzdqy\",\"run_command\":\"ceakxc\",\"source_dir\":\"soqfyiaseqchkrt\",\"envs\":[],\"environment_slug\":\"azisgyk\"},{\"kind\":\"PRE_DEPLOY\",\"instance_count\":7475327936023485805,\"instance_size_slug\":\"basic-xs\",\"name\":\"ohmn\",\"dockerfile_path\":\"jklinh\",\"build_command\":\"ptysprq\",\"run_command\":\"nzxojpslsvjgpli\",\"source_dir\":\"iqwoyxqvapcoh\",\"envs\":[],\"environment_slug\":\"cqpqojxcxzrzdc\"},{\"kind\":\"FAILED_DEPLOY\",\"instance_count\":1846574721619281570,\"instance_size_slug\":\"basic-xxs\",\"name\":\"awetzq\",\"dockerfile_path\":\"ljhznamtuatmzwcj\",\"build_command\":\"cqtjzmi\",\"run_command\":\"gbgatzuuvbxn\",\"source_dir\":\"ebwgga\",\"envs\":[],\"environment_slug\":\"zlswvajqf\"}],\"workers\":[{\"instance_count\":4019217553392959801,\"instance_size_slug\":\"professional-xl\",\"name\":\"unwqr\",\"dockerfile_path\":\"haohcmbuo\",\"build_command\":\"jrohmbpyryxameb\",\"run_command\":\"dyvkfkmr\",\"source_dir\":\"xne\",\"envs\":[],\"environment_slug\":\"mtodl\"}],\"functions\":[{\"routes\":[],\"name\":\"cygvoavyunssx\",\"source_dir\":\"hi\",\"alerts\":[],\"envs\":[]},{\"routes\":[],\"name\":\"aseksgbuxantuyg\",\"source_dir\":\"gaqi\",\"alerts\":[],\"envs\":[]}],\"databases\":[{\"cluster_name\":\"ulopmjnlexwhcb\",\"db_name\":\"ibkeph\",\"db_user\":\"uerct\",\"engine\":\"UNSET\",\"name\":\"yintqpbrlcy\",\"production\":true,\"version\":\"zkgofxyf\"},{\"cluster_name\":\"uc\",\"db_name\":\"rrp\",\"db_user\":\"ttbst\",\"engine\":\"REDIS\",\"name\":\"aqnrmvvfkoxmlg\",\"production\":true,\"version\":\"idvrmaz\"},{\"cluster_name\":\"dwwexymz\",\"db_name\":\"azipbhpwvqsg\",\"db_user\":\"yuuzivens\",\"engine\":\"PG\",\"name\":\"eyyvpkpatl\",\"production\":false,\"version\":\"zgs\"}]},\"app_id\":\"rfhfvo\"}")
                        .toObject(AppPropose.class);
        Assertions.assertEquals("rbqgvgov", model.getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.NYC, model.getSpec().getRegion());
        Assertions.assertEquals("efjokn", model.getSpec().getDomains().get(0).getDomain());
        Assertions.assertEquals(AppDomainSpecType.ALIAS, model.getSpec().getDomains().get(0).getType());
        Assertions.assertEquals(true, model.getSpec().getDomains().get(0).isWildcard());
        Assertions.assertEquals("edikdfrdbiq", model.getSpec().getDomains().get(0).getZone());
        Assertions.assertEquals(
                AppDomainSpecMinimumTlsVersion.ONE3, model.getSpec().getDomains().get(0).getMinimumTlsVersion());
        Assertions.assertEquals("oauk", model.getSpec().getServices().get(0).getName());
        Assertions.assertEquals("sizmoae", model.getSpec().getServices().get(0).getDockerfilePath());
        Assertions.assertEquals("xjw", model.getSpec().getServices().get(0).getBuildCommand());
        Assertions.assertEquals("vedwcgyeewx", model.getSpec().getServices().get(0).getRunCommand());
        Assertions.assertEquals("qbpsmg", model.getSpec().getServices().get(0).getSourceDir());
        Assertions.assertEquals("u", model.getSpec().getServices().get(0).getEnvironmentSlug());
        Assertions.assertEquals(6044702270976415412L, model.getSpec().getServices().get(0).getHttpPort());
        Assertions.assertEquals(3960460149409264910L, model.getSpec().getServices().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.BASICM,
                model.getSpec().getServices().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("hqo", model.getSpec().getStaticSites().get(0).getName());
        Assertions.assertEquals("ueayfbpcmsplb", model.getSpec().getStaticSites().get(0).getDockerfilePath());
        Assertions.assertEquals("rueqthwm", model.getSpec().getStaticSites().get(0).getBuildCommand());
        Assertions.assertEquals("mbscbbx", model.getSpec().getStaticSites().get(0).getRunCommand());
        Assertions.assertEquals("dhxiidlopedbwd", model.getSpec().getStaticSites().get(0).getSourceDir());
        Assertions.assertEquals("yybxubmdnafcbqw", model.getSpec().getStaticSites().get(0).getEnvironmentSlug());
        Assertions.assertEquals("sbq", model.getSpec().getStaticSites().get(0).getIndexDocument());
        Assertions.assertEquals("agwwrxaom", model.getSpec().getStaticSites().get(0).getErrorDocument());
        Assertions.assertEquals("sgl", model.getSpec().getStaticSites().get(0).getCatchallDocument());
        Assertions.assertEquals("czezkhhlt", model.getSpec().getStaticSites().get(0).getOutputDir());
        Assertions.assertEquals("ele", model.getSpec().getJobs().get(0).getName());
        Assertions.assertEquals("vwzkj", model.getSpec().getJobs().get(0).getDockerfilePath());
        Assertions.assertEquals("wbeonrlkwzdqy", model.getSpec().getJobs().get(0).getBuildCommand());
        Assertions.assertEquals("ceakxc", model.getSpec().getJobs().get(0).getRunCommand());
        Assertions.assertEquals("soqfyiaseqchkrt", model.getSpec().getJobs().get(0).getSourceDir());
        Assertions.assertEquals("azisgyk", model.getSpec().getJobs().get(0).getEnvironmentSlug());
        Assertions.assertEquals(AppJobSpecKind.POST_DEPLOY, model.getSpec().getJobs().get(0).getKind());
        Assertions.assertEquals(17608559898312941L, model.getSpec().getJobs().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.BASIC_XXS,
                model.getSpec().getJobs().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("unwqr", model.getSpec().getWorkers().get(0).getName());
        Assertions.assertEquals("haohcmbuo", model.getSpec().getWorkers().get(0).getDockerfilePath());
        Assertions.assertEquals("jrohmbpyryxameb", model.getSpec().getWorkers().get(0).getBuildCommand());
        Assertions.assertEquals("dyvkfkmr", model.getSpec().getWorkers().get(0).getRunCommand());
        Assertions.assertEquals("xne", model.getSpec().getWorkers().get(0).getSourceDir());
        Assertions.assertEquals("mtodl", model.getSpec().getWorkers().get(0).getEnvironmentSlug());
        Assertions.assertEquals(4019217553392959801L, model.getSpec().getWorkers().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL_XL,
                model.getSpec().getWorkers().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("cygvoavyunssx", model.getSpec().getFunctions().get(0).getName());
        Assertions.assertEquals("hi", model.getSpec().getFunctions().get(0).getSourceDir());
        Assertions.assertEquals("ulopmjnlexwhcb", model.getSpec().getDatabases().get(0).getClusterName());
        Assertions.assertEquals("ibkeph", model.getSpec().getDatabases().get(0).getDbName());
        Assertions.assertEquals("uerct", model.getSpec().getDatabases().get(0).getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.UNSET, model.getSpec().getDatabases().get(0).getEngine());
        Assertions.assertEquals("yintqpbrlcy", model.getSpec().getDatabases().get(0).getName());
        Assertions.assertEquals(true, model.getSpec().getDatabases().get(0).isProduction());
        Assertions.assertEquals("zkgofxyf", model.getSpec().getDatabases().get(0).getVersion());
        Assertions.assertEquals("rfhfvo", model.getAppId());
    }

    @Test
    public void testSerialize() {
        AppPropose model =
                new AppPropose()
                        .setSpec(
                                new AppSpec()
                                        .setName("rbqgvgov")
                                        .setRegion(AppSpecRegion.NYC)
                                        .setDomains(
                                                Arrays.asList(
                                                        new AppDomainSpec()
                                                                .setDomain("efjokn")
                                                                .setType(AppDomainSpecType.ALIAS)
                                                                .setWildcard(true)
                                                                .setZone("edikdfrdbiq")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE3),
                                                        new AppDomainSpec()
                                                                .setDomain("geihfql")
                                                                .setType(AppDomainSpecType.PRIMARY)
                                                                .setWildcard(true)
                                                                .setZone("zcxmjpbyep")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE2),
                                                        new AppDomainSpec()
                                                                .setDomain("t")
                                                                .setType(AppDomainSpecType.UNSPECIFIED)
                                                                .setWildcard(false)
                                                                .setZone("m")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE2),
                                                        new AppDomainSpec()
                                                                .setDomain("i")
                                                                .setType(AppDomainSpecType.DEFAULT)
                                                                .setWildcard(false)
                                                                .setZone("omyqwcabvnuileey")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE3)))
                                        .setServices(
                                                Arrays.asList(
                                                        new AppServiceSpec()
                                                                .setName("oauk")
                                                                .setDockerfilePath("sizmoae")
                                                                .setBuildCommand("xjw")
                                                                .setRunCommand("vedwcgyeewx")
                                                                .setSourceDir("qbpsmg")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("u")
                                                                .setHttpPort(6044702270976415412L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(3960460149409264910L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASICM),
                                                        new AppServiceSpec()
                                                                .setName("ufcshhvnew")
                                                                .setDockerfilePath("pqanxrjkix")
                                                                .setBuildCommand("bta")
                                                                .setRunCommand("pnyghs")
                                                                .setSourceDir("cyl")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("mnsghpxycphdr")
                                                                .setHttpPort(769127322308420402L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(5592106315617662810L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASICM),
                                                        new AppServiceSpec()
                                                                .setName("xnqmhrpqpdfwm")
                                                                .setDockerfilePath("ssffxuifmc")
                                                                .setBuildCommand("p")
                                                                .setRunCommand("kdqzrdzsylo")
                                                                .setSourceDir("gtrczzydmxzjijpv")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("rkihcirld")
                                                                .setHttpPort(4104565600880841187L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(1090681073720986389L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONAL_XS),
                                                        new AppServiceSpec()
                                                                .setName("urnnqbnqbpiz")
                                                                .setDockerfilePath("dogypxrxvbfi")
                                                                .setBuildCommand("u")
                                                                .setRunCommand("ctafsrbxrblm")
                                                                .setSourceDir("owxih")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("xwqagnepzw")
                                                                .setHttpPort(921467946090795096L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(7396785488806348756L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASICM)))
                                        .setStaticSites(
                                                Arrays.asList(
                                                        new AppStaticSiteSpec()
                                                                .setName("hqo")
                                                                .setDockerfilePath("ueayfbpcmsplb")
                                                                .setBuildCommand("rueqthwm")
                                                                .setRunCommand("mbscbbx")
                                                                .setSourceDir("dhxiidlopedbwd")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("yybxubmdnafcbqw")
                                                                .setIndexDocument("sbq")
                                                                .setErrorDocument("agwwrxaom")
                                                                .setCatchallDocument("sgl")
                                                                .setOutputDir("czezkhhlt")
                                                                .setRoutes(Arrays.asList())))
                                        .setJobs(
                                                Arrays.asList(
                                                        new AppJobSpec()
                                                                .setName("ele")
                                                                .setDockerfilePath("vwzkj")
                                                                .setBuildCommand("wbeonrlkwzdqy")
                                                                .setRunCommand("ceakxc")
                                                                .setSourceDir("soqfyiaseqchkrt")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("azisgyk")
                                                                .setKind(AppJobSpecKind.POST_DEPLOY)
                                                                .setInstanceCount(17608559898312941L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASIC_XXS),
                                                        new AppJobSpec()
                                                                .setName("ohmn")
                                                                .setDockerfilePath("jklinh")
                                                                .setBuildCommand("ptysprq")
                                                                .setRunCommand("nzxojpslsvjgpli")
                                                                .setSourceDir("iqwoyxqvapcoh")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("cqpqojxcxzrzdc")
                                                                .setKind(AppJobSpecKind.PREDEPLOY)
                                                                .setInstanceCount(7475327936023485805L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASIC_XS),
                                                        new AppJobSpec()
                                                                .setName("awetzq")
                                                                .setDockerfilePath("ljhznamtuatmzwcj")
                                                                .setBuildCommand("cqtjzmi")
                                                                .setRunCommand("gbgatzuuvbxn")
                                                                .setSourceDir("ebwgga")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("zlswvajqf")
                                                                .setKind(AppJobSpecKind.FAILED_DEPLOY)
                                                                .setInstanceCount(1846574721619281570L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASIC_XXS)))
                                        .setWorkers(
                                                Arrays.asList(
                                                        new AppWorkerSpec()
                                                                .setName("unwqr")
                                                                .setDockerfilePath("haohcmbuo")
                                                                .setBuildCommand("jrohmbpyryxameb")
                                                                .setRunCommand("dyvkfkmr")
                                                                .setSourceDir("xne")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("mtodl")
                                                                .setInstanceCount(4019217553392959801L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONAL_XL)))
                                        .setFunctions(
                                                Arrays.asList(
                                                        new AppFunctionsSpec()
                                                                .setRoutes(Arrays.asList())
                                                                .setName("cygvoavyunssx")
                                                                .setSourceDir("hi")
                                                                .setAlerts(Arrays.asList())
                                                                .setEnvs(Arrays.asList()),
                                                        new AppFunctionsSpec()
                                                                .setRoutes(Arrays.asList())
                                                                .setName("aseksgbuxantuyg")
                                                                .setSourceDir("gaqi")
                                                                .setAlerts(Arrays.asList())
                                                                .setEnvs(Arrays.asList())))
                                        .setDatabases(
                                                Arrays.asList(
                                                        new AppDatabaseSpec()
                                                                .setClusterName("ulopmjnlexwhcb")
                                                                .setDbName("ibkeph")
                                                                .setDbUser("uerct")
                                                                .setEngine(AppDatabaseSpecEngine.UNSET)
                                                                .setName("yintqpbrlcy")
                                                                .setProduction(true)
                                                                .setVersion("zkgofxyf"),
                                                        new AppDatabaseSpec()
                                                                .setClusterName("uc")
                                                                .setDbName("rrp")
                                                                .setDbUser("ttbst")
                                                                .setEngine(AppDatabaseSpecEngine.REDIS)
                                                                .setName("aqnrmvvfkoxmlg")
                                                                .setProduction(true)
                                                                .setVersion("idvrmaz"),
                                                        new AppDatabaseSpec()
                                                                .setClusterName("dwwexymz")
                                                                .setDbName("azipbhpwvqsg")
                                                                .setDbUser("yuuzivens")
                                                                .setEngine(AppDatabaseSpecEngine.PG)
                                                                .setName("eyyvpkpatl")
                                                                .setProduction(false)
                                                                .setVersion("zgs"))))
                        .setAppId("rfhfvo");
        model = BinaryData.fromObject(model).toObject(AppPropose.class);
        Assertions.assertEquals("rbqgvgov", model.getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.NYC, model.getSpec().getRegion());
        Assertions.assertEquals("efjokn", model.getSpec().getDomains().get(0).getDomain());
        Assertions.assertEquals(AppDomainSpecType.ALIAS, model.getSpec().getDomains().get(0).getType());
        Assertions.assertEquals(true, model.getSpec().getDomains().get(0).isWildcard());
        Assertions.assertEquals("edikdfrdbiq", model.getSpec().getDomains().get(0).getZone());
        Assertions.assertEquals(
                AppDomainSpecMinimumTlsVersion.ONE3, model.getSpec().getDomains().get(0).getMinimumTlsVersion());
        Assertions.assertEquals("oauk", model.getSpec().getServices().get(0).getName());
        Assertions.assertEquals("sizmoae", model.getSpec().getServices().get(0).getDockerfilePath());
        Assertions.assertEquals("xjw", model.getSpec().getServices().get(0).getBuildCommand());
        Assertions.assertEquals("vedwcgyeewx", model.getSpec().getServices().get(0).getRunCommand());
        Assertions.assertEquals("qbpsmg", model.getSpec().getServices().get(0).getSourceDir());
        Assertions.assertEquals("u", model.getSpec().getServices().get(0).getEnvironmentSlug());
        Assertions.assertEquals(6044702270976415412L, model.getSpec().getServices().get(0).getHttpPort());
        Assertions.assertEquals(3960460149409264910L, model.getSpec().getServices().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.BASICM,
                model.getSpec().getServices().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("hqo", model.getSpec().getStaticSites().get(0).getName());
        Assertions.assertEquals("ueayfbpcmsplb", model.getSpec().getStaticSites().get(0).getDockerfilePath());
        Assertions.assertEquals("rueqthwm", model.getSpec().getStaticSites().get(0).getBuildCommand());
        Assertions.assertEquals("mbscbbx", model.getSpec().getStaticSites().get(0).getRunCommand());
        Assertions.assertEquals("dhxiidlopedbwd", model.getSpec().getStaticSites().get(0).getSourceDir());
        Assertions.assertEquals("yybxubmdnafcbqw", model.getSpec().getStaticSites().get(0).getEnvironmentSlug());
        Assertions.assertEquals("sbq", model.getSpec().getStaticSites().get(0).getIndexDocument());
        Assertions.assertEquals("agwwrxaom", model.getSpec().getStaticSites().get(0).getErrorDocument());
        Assertions.assertEquals("sgl", model.getSpec().getStaticSites().get(0).getCatchallDocument());
        Assertions.assertEquals("czezkhhlt", model.getSpec().getStaticSites().get(0).getOutputDir());
        Assertions.assertEquals("ele", model.getSpec().getJobs().get(0).getName());
        Assertions.assertEquals("vwzkj", model.getSpec().getJobs().get(0).getDockerfilePath());
        Assertions.assertEquals("wbeonrlkwzdqy", model.getSpec().getJobs().get(0).getBuildCommand());
        Assertions.assertEquals("ceakxc", model.getSpec().getJobs().get(0).getRunCommand());
        Assertions.assertEquals("soqfyiaseqchkrt", model.getSpec().getJobs().get(0).getSourceDir());
        Assertions.assertEquals("azisgyk", model.getSpec().getJobs().get(0).getEnvironmentSlug());
        Assertions.assertEquals(AppJobSpecKind.POST_DEPLOY, model.getSpec().getJobs().get(0).getKind());
        Assertions.assertEquals(17608559898312941L, model.getSpec().getJobs().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.BASIC_XXS,
                model.getSpec().getJobs().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("unwqr", model.getSpec().getWorkers().get(0).getName());
        Assertions.assertEquals("haohcmbuo", model.getSpec().getWorkers().get(0).getDockerfilePath());
        Assertions.assertEquals("jrohmbpyryxameb", model.getSpec().getWorkers().get(0).getBuildCommand());
        Assertions.assertEquals("dyvkfkmr", model.getSpec().getWorkers().get(0).getRunCommand());
        Assertions.assertEquals("xne", model.getSpec().getWorkers().get(0).getSourceDir());
        Assertions.assertEquals("mtodl", model.getSpec().getWorkers().get(0).getEnvironmentSlug());
        Assertions.assertEquals(4019217553392959801L, model.getSpec().getWorkers().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONAL_XL,
                model.getSpec().getWorkers().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("cygvoavyunssx", model.getSpec().getFunctions().get(0).getName());
        Assertions.assertEquals("hi", model.getSpec().getFunctions().get(0).getSourceDir());
        Assertions.assertEquals("ulopmjnlexwhcb", model.getSpec().getDatabases().get(0).getClusterName());
        Assertions.assertEquals("ibkeph", model.getSpec().getDatabases().get(0).getDbName());
        Assertions.assertEquals("uerct", model.getSpec().getDatabases().get(0).getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.UNSET, model.getSpec().getDatabases().get(0).getEngine());
        Assertions.assertEquals("yintqpbrlcy", model.getSpec().getDatabases().get(0).getName());
        Assertions.assertEquals(true, model.getSpec().getDatabases().get(0).isProduction());
        Assertions.assertEquals("zkgofxyf", model.getSpec().getDatabases().get(0).getVersion());
        Assertions.assertEquals("rfhfvo", model.getAppId());
    }
}
