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
import com.digitalocean.api.models.AppProposeResponse;
import com.digitalocean.api.models.AppServiceSpec;
import com.digitalocean.api.models.AppSpec;
import com.digitalocean.api.models.AppSpecRegion;
import com.digitalocean.api.models.AppStaticSiteSpec;
import com.digitalocean.api.models.AppWorkerSpec;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppProposeResponseTests {
    @Test
    public void testDeserialize() {
        AppProposeResponse model =
                BinaryData.fromString(
                                "{\"app_is_static\":true,\"app_name_available\":false,\"app_name_suggestion\":\"xwcdomm\",\"existing_static_apps\":\"fqawzfgbrttui\",\"spec\":{\"name\":\"lkiexhajlfnthiq\",\"region\":\"nyc\",\"domains\":[{\"domain\":\"diygbpvnwswmtxky\",\"type\":\"ALIAS\",\"wildcard\":false,\"zone\":\"wxjlmec\",\"minimum_tls_version\":\"1.2\"}],\"services\":[{\"http_port\":8562330729590351027,\"internal_ports\":[],\"routes\":[],\"instance_count\":3613374493627536729,\"instance_size_slug\":\"professional-l\",\"name\":\"moqqtlffhzbk\",\"dockerfile_path\":\"vfqnvhnqoewdo\",\"build_command\":\"yetesy\",\"run_command\":\"idbz\",\"source_dir\":\"hqtfbovn\",\"envs\":[],\"environment_slug\":\"bwetnjuhpsp\"},{\"http_port\":3829352230341191153,\"internal_ports\":[],\"routes\":[],\"instance_count\":4320431973854921473,\"instance_size_slug\":\"professional-s\",\"name\":\"bwqroohtuovm\",\"dockerfile_path\":\"tu\",\"build_command\":\"hihpvecmsl\",\"run_command\":\"bl\",\"source_dir\":\"xltbsjuscvsf\",\"envs\":[],\"environment_slug\":\"ctmgxuupbezqccy\"}],\"static_sites\":[{\"index_document\":\"ukdqkkyihztg\",\"error_document\":\"mgqzgwldoyc\",\"catchall_document\":\"llcecfehuwaoa\",\"output_dir\":\"h\",\"routes\":[],\"name\":\"lizst\",\"dockerfile_path\":\"rweft\",\"build_command\":\"qejpmvssehaepwa\",\"run_command\":\"xtczhupeuknijd\",\"source_dir\":\"yespydjfbocyv\",\"envs\":[],\"environment_slug\":\"lrtywikdmhlakuf\"},{\"index_document\":\"hgauacdixmxufrs\",\"error_document\":\"jqgdkfnozoeo\",\"catchall_document\":\"vjhvefgwbm\",\"output_dir\":\"c\",\"routes\":[],\"name\":\"sf\",\"dockerfile_path\":\"lpzealbmqkyojwyv\",\"build_command\":\"mbtsuahxsg\",\"run_command\":\"cmmzrrs\",\"source_dir\":\"biwsd\",\"envs\":[],\"environment_slug\":\"xqw\"},{\"index_document\":\"ffjxcjrmmuabwib\",\"error_document\":\"ogjo\",\"catchall_document\":\"cyefoyzbamwine\",\"output_dir\":\"vfkakpold\",\"routes\":[],\"name\":\"boclzhzjknyuxgv\",\"dockerfile_path\":\"upzaamrdixtre\",\"build_command\":\"dswys\",\"run_command\":\"ruffgllukk\",\"source_dir\":\"vlxhrpqhvmblc\",\"envs\":[],\"environment_slug\":\"ehbhb\"},{\"index_document\":\"ziryrandoy\",\"error_document\":\"blto\",\"catchall_document\":\"mkfqlwxldy\",\"output_dir\":\"lsygaol\",\"routes\":[],\"name\":\"nbmjksibjgsjjxxa\",\"dockerfile_path\":\"zyqegxyiv\",\"build_command\":\"nbm\",\"run_command\":\"bjijkgqxnh\",\"source_dir\":\"keznjaujvaa\",\"envs\":[],\"environment_slug\":\"giycwkdtaawxwfek\"}],\"jobs\":[{\"kind\":\"PRE_DEPLOY\",\"instance_count\":1737182247634742431,\"instance_size_slug\":\"professional-l\",\"name\":\"ratbnxwbjs\",\"dockerfile_path\":\"fpksok\",\"build_command\":\"ogewij\",\"run_command\":\"rhbguzozkyewnfn\",\"source_dir\":\"hhqosmffjku\",\"envs\":[],\"environment_slug\":\"yarnro\"},{\"kind\":\"POST_DEPLOY\",\"instance_count\":4075209954734263335,\"instance_size_slug\":\"basic-xxs\",\"name\":\"ktdpyczhcoe\",\"dockerfile_path\":\"rottjzcfyjzptw\",\"build_command\":\"ohapqinfsz\",\"run_command\":\"glqdhm\",\"source_dir\":\"zralcxpjbyyps\",\"envs\":[],\"environment_slug\":\"cjenkyhfqzvsqxf\"},{\"kind\":\"UNSPECIFIED\",\"instance_count\":2337136087292258932,\"instance_size_slug\":\"professional-s\",\"name\":\"jhhhqxu\",\"dockerfile_path\":\"oyvivbsiz\",\"build_command\":\"jszlb\",\"run_command\":\"mnlzijiufehgmvf\",\"source_dir\":\"wyvq\",\"envs\":[],\"environment_slug\":\"erlniylylyfw\"}],\"workers\":[{\"instance_count\":4040893848063499012,\"instance_size_slug\":\"basic-xs\",\"name\":\"gh\",\"dockerfile_path\":\"jtcdxabbujftaben\",\"build_command\":\"klqpx\",\"run_command\":\"cafeddw\",\"source_dir\":\"lzafwxu\",\"envs\":[],\"environment_slug\":\"hgookrtalvnbwgpb\"},{\"instance_count\":1755098375348312419,\"instance_size_slug\":\"basic-xxs\",\"name\":\"djj\",\"dockerfile_path\":\"qo\",\"build_command\":\"ahhxhqfaqnvzoqg\",\"run_command\":\"pem\",\"source_dir\":\"gavsczuejd\",\"envs\":[],\"environment_slug\":\"tlghwzhomew\"},{\"instance_count\":1237849779621716143,\"instance_size_slug\":\"professional-xs\",\"name\":\"qawmoaianc\",\"dockerfile_path\":\"rslbl\",\"build_command\":\"dkxrxvvbxi\",\"run_command\":\"g\",\"source_dir\":\"qljnqkhychoco\",\"envs\":[],\"environment_slug\":\"ehurqlr\"}],\"functions\":[{\"routes\":[],\"name\":\"yur\",\"source_dir\":\"hy\",\"alerts\":[],\"envs\":[]},{\"routes\":[],\"name\":\"dbrxmrgc\",\"source_dir\":\"apx\",\"alerts\":[],\"envs\":[]}],\"databases\":[{\"cluster_name\":\"buscgduus\",\"db_name\":\"ycblevpmcl\",\"db_user\":\"yxkyxlz\",\"engine\":\"UNSET\",\"name\":\"gkzz\",\"production\":false,\"version\":\"hbzffovwmbjlzqs\"}]},\"app_cost\":1007609746,\"app_tier_downgrade_cost\":1375123505}")
                        .toObject(AppProposeResponse.class);
        Assertions.assertEquals(true, model.isAppIsStatic());
        Assertions.assertEquals(false, model.isAppNameAvailable());
        Assertions.assertEquals("xwcdomm", model.getAppNameSuggestion());
        Assertions.assertEquals("fqawzfgbrttui", model.getExistingStaticApps());
        Assertions.assertEquals("lkiexhajlfnthiq", model.getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.NYC, model.getSpec().getRegion());
        Assertions.assertEquals("diygbpvnwswmtxky", model.getSpec().getDomains().get(0).getDomain());
        Assertions.assertEquals(AppDomainSpecType.ALIAS, model.getSpec().getDomains().get(0).getType());
        Assertions.assertEquals(false, model.getSpec().getDomains().get(0).isWildcard());
        Assertions.assertEquals("wxjlmec", model.getSpec().getDomains().get(0).getZone());
        Assertions.assertEquals(
                AppDomainSpecMinimumTlsVersion.ONE2, model.getSpec().getDomains().get(0).getMinimumTlsVersion());
        Assertions.assertEquals("moqqtlffhzbk", model.getSpec().getServices().get(0).getName());
        Assertions.assertEquals("vfqnvhnqoewdo", model.getSpec().getServices().get(0).getDockerfilePath());
        Assertions.assertEquals("yetesy", model.getSpec().getServices().get(0).getBuildCommand());
        Assertions.assertEquals("idbz", model.getSpec().getServices().get(0).getRunCommand());
        Assertions.assertEquals("hqtfbovn", model.getSpec().getServices().get(0).getSourceDir());
        Assertions.assertEquals("bwetnjuhpsp", model.getSpec().getServices().get(0).getEnvironmentSlug());
        Assertions.assertEquals(8562330729590351027L, model.getSpec().getServices().get(0).getHttpPort());
        Assertions.assertEquals(3613374493627536729L, model.getSpec().getServices().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALL,
                model.getSpec().getServices().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("lizst", model.getSpec().getStaticSites().get(0).getName());
        Assertions.assertEquals("rweft", model.getSpec().getStaticSites().get(0).getDockerfilePath());
        Assertions.assertEquals("qejpmvssehaepwa", model.getSpec().getStaticSites().get(0).getBuildCommand());
        Assertions.assertEquals("xtczhupeuknijd", model.getSpec().getStaticSites().get(0).getRunCommand());
        Assertions.assertEquals("yespydjfbocyv", model.getSpec().getStaticSites().get(0).getSourceDir());
        Assertions.assertEquals("lrtywikdmhlakuf", model.getSpec().getStaticSites().get(0).getEnvironmentSlug());
        Assertions.assertEquals("ukdqkkyihztg", model.getSpec().getStaticSites().get(0).getIndexDocument());
        Assertions.assertEquals("mgqzgwldoyc", model.getSpec().getStaticSites().get(0).getErrorDocument());
        Assertions.assertEquals("llcecfehuwaoa", model.getSpec().getStaticSites().get(0).getCatchallDocument());
        Assertions.assertEquals("h", model.getSpec().getStaticSites().get(0).getOutputDir());
        Assertions.assertEquals("ratbnxwbjs", model.getSpec().getJobs().get(0).getName());
        Assertions.assertEquals("fpksok", model.getSpec().getJobs().get(0).getDockerfilePath());
        Assertions.assertEquals("ogewij", model.getSpec().getJobs().get(0).getBuildCommand());
        Assertions.assertEquals("rhbguzozkyewnfn", model.getSpec().getJobs().get(0).getRunCommand());
        Assertions.assertEquals("hhqosmffjku", model.getSpec().getJobs().get(0).getSourceDir());
        Assertions.assertEquals("yarnro", model.getSpec().getJobs().get(0).getEnvironmentSlug());
        Assertions.assertEquals(AppJobSpecKind.PREDEPLOY, model.getSpec().getJobs().get(0).getKind());
        Assertions.assertEquals(1737182247634742431L, model.getSpec().getJobs().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALL,
                model.getSpec().getJobs().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("gh", model.getSpec().getWorkers().get(0).getName());
        Assertions.assertEquals("jtcdxabbujftaben", model.getSpec().getWorkers().get(0).getDockerfilePath());
        Assertions.assertEquals("klqpx", model.getSpec().getWorkers().get(0).getBuildCommand());
        Assertions.assertEquals("cafeddw", model.getSpec().getWorkers().get(0).getRunCommand());
        Assertions.assertEquals("lzafwxu", model.getSpec().getWorkers().get(0).getSourceDir());
        Assertions.assertEquals("hgookrtalvnbwgpb", model.getSpec().getWorkers().get(0).getEnvironmentSlug());
        Assertions.assertEquals(4040893848063499012L, model.getSpec().getWorkers().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.BASIC_XS,
                model.getSpec().getWorkers().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("yur", model.getSpec().getFunctions().get(0).getName());
        Assertions.assertEquals("hy", model.getSpec().getFunctions().get(0).getSourceDir());
        Assertions.assertEquals("buscgduus", model.getSpec().getDatabases().get(0).getClusterName());
        Assertions.assertEquals("ycblevpmcl", model.getSpec().getDatabases().get(0).getDbName());
        Assertions.assertEquals("yxkyxlz", model.getSpec().getDatabases().get(0).getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.UNSET, model.getSpec().getDatabases().get(0).getEngine());
        Assertions.assertEquals("gkzz", model.getSpec().getDatabases().get(0).getName());
        Assertions.assertEquals(false, model.getSpec().getDatabases().get(0).isProduction());
        Assertions.assertEquals("hbzffovwmbjlzqs", model.getSpec().getDatabases().get(0).getVersion());
        Assertions.assertEquals(1007609746, model.getAppCost());
        Assertions.assertEquals(1375123505, model.getAppTierDowngradeCost());
    }

    @Test
    public void testSerialize() {
        AppProposeResponse model =
                new AppProposeResponse()
                        .setAppIsStatic(true)
                        .setAppNameAvailable(false)
                        .setAppNameSuggestion("xwcdomm")
                        .setExistingStaticApps("fqawzfgbrttui")
                        .setSpec(
                                new AppSpec()
                                        .setName("lkiexhajlfnthiq")
                                        .setRegion(AppSpecRegion.NYC)
                                        .setDomains(
                                                Arrays.asList(
                                                        new AppDomainSpec()
                                                                .setDomain("diygbpvnwswmtxky")
                                                                .setType(AppDomainSpecType.ALIAS)
                                                                .setWildcard(false)
                                                                .setZone("wxjlmec")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE2)))
                                        .setServices(
                                                Arrays.asList(
                                                        new AppServiceSpec()
                                                                .setName("moqqtlffhzbk")
                                                                .setDockerfilePath("vfqnvhnqoewdo")
                                                                .setBuildCommand("yetesy")
                                                                .setRunCommand("idbz")
                                                                .setSourceDir("hqtfbovn")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("bwetnjuhpsp")
                                                                .setHttpPort(8562330729590351027L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(3613374493627536729L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALL),
                                                        new AppServiceSpec()
                                                                .setName("bwqroohtuovm")
                                                                .setDockerfilePath("tu")
                                                                .setBuildCommand("hihpvecmsl")
                                                                .setRunCommand("bl")
                                                                .setSourceDir("xltbsjuscvsf")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("ctmgxuupbezqccy")
                                                                .setHttpPort(3829352230341191153L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(4320431973854921473L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALS)))
                                        .setStaticSites(
                                                Arrays.asList(
                                                        new AppStaticSiteSpec()
                                                                .setName("lizst")
                                                                .setDockerfilePath("rweft")
                                                                .setBuildCommand("qejpmvssehaepwa")
                                                                .setRunCommand("xtczhupeuknijd")
                                                                .setSourceDir("yespydjfbocyv")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("lrtywikdmhlakuf")
                                                                .setIndexDocument("ukdqkkyihztg")
                                                                .setErrorDocument("mgqzgwldoyc")
                                                                .setCatchallDocument("llcecfehuwaoa")
                                                                .setOutputDir("h")
                                                                .setRoutes(Arrays.asList()),
                                                        new AppStaticSiteSpec()
                                                                .setName("sf")
                                                                .setDockerfilePath("lpzealbmqkyojwyv")
                                                                .setBuildCommand("mbtsuahxsg")
                                                                .setRunCommand("cmmzrrs")
                                                                .setSourceDir("biwsd")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("xqw")
                                                                .setIndexDocument("hgauacdixmxufrs")
                                                                .setErrorDocument("jqgdkfnozoeo")
                                                                .setCatchallDocument("vjhvefgwbm")
                                                                .setOutputDir("c")
                                                                .setRoutes(Arrays.asList()),
                                                        new AppStaticSiteSpec()
                                                                .setName("boclzhzjknyuxgv")
                                                                .setDockerfilePath("upzaamrdixtre")
                                                                .setBuildCommand("dswys")
                                                                .setRunCommand("ruffgllukk")
                                                                .setSourceDir("vlxhrpqhvmblc")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("ehbhb")
                                                                .setIndexDocument("ffjxcjrmmuabwib")
                                                                .setErrorDocument("ogjo")
                                                                .setCatchallDocument("cyefoyzbamwine")
                                                                .setOutputDir("vfkakpold")
                                                                .setRoutes(Arrays.asList()),
                                                        new AppStaticSiteSpec()
                                                                .setName("nbmjksibjgsjjxxa")
                                                                .setDockerfilePath("zyqegxyiv")
                                                                .setBuildCommand("nbm")
                                                                .setRunCommand("bjijkgqxnh")
                                                                .setSourceDir("keznjaujvaa")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("giycwkdtaawxwfek")
                                                                .setIndexDocument("ziryrandoy")
                                                                .setErrorDocument("blto")
                                                                .setCatchallDocument("mkfqlwxldy")
                                                                .setOutputDir("lsygaol")
                                                                .setRoutes(Arrays.asList())))
                                        .setJobs(
                                                Arrays.asList(
                                                        new AppJobSpec()
                                                                .setName("ratbnxwbjs")
                                                                .setDockerfilePath("fpksok")
                                                                .setBuildCommand("ogewij")
                                                                .setRunCommand("rhbguzozkyewnfn")
                                                                .setSourceDir("hhqosmffjku")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("yarnro")
                                                                .setKind(AppJobSpecKind.PREDEPLOY)
                                                                .setInstanceCount(1737182247634742431L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALL),
                                                        new AppJobSpec()
                                                                .setName("ktdpyczhcoe")
                                                                .setDockerfilePath("rottjzcfyjzptw")
                                                                .setBuildCommand("ohapqinfsz")
                                                                .setRunCommand("glqdhm")
                                                                .setSourceDir("zralcxpjbyyps")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("cjenkyhfqzvsqxf")
                                                                .setKind(AppJobSpecKind.POST_DEPLOY)
                                                                .setInstanceCount(4075209954734263335L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASIC_XXS),
                                                        new AppJobSpec()
                                                                .setName("jhhhqxu")
                                                                .setDockerfilePath("oyvivbsiz")
                                                                .setBuildCommand("jszlb")
                                                                .setRunCommand("mnlzijiufehgmvf")
                                                                .setSourceDir("wyvq")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("erlniylylyfw")
                                                                .setKind(AppJobSpecKind.UNSPECIFIED)
                                                                .setInstanceCount(2337136087292258932L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALS)))
                                        .setWorkers(
                                                Arrays.asList(
                                                        new AppWorkerSpec()
                                                                .setName("gh")
                                                                .setDockerfilePath("jtcdxabbujftaben")
                                                                .setBuildCommand("klqpx")
                                                                .setRunCommand("cafeddw")
                                                                .setSourceDir("lzafwxu")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("hgookrtalvnbwgpb")
                                                                .setInstanceCount(4040893848063499012L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASIC_XS),
                                                        new AppWorkerSpec()
                                                                .setName("djj")
                                                                .setDockerfilePath("qo")
                                                                .setBuildCommand("ahhxhqfaqnvzoqg")
                                                                .setRunCommand("pem")
                                                                .setSourceDir("gavsczuejd")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("tlghwzhomew")
                                                                .setInstanceCount(1755098375348312419L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASIC_XXS),
                                                        new AppWorkerSpec()
                                                                .setName("qawmoaianc")
                                                                .setDockerfilePath("rslbl")
                                                                .setBuildCommand("dkxrxvvbxi")
                                                                .setRunCommand("g")
                                                                .setSourceDir("qljnqkhychoco")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("ehurqlr")
                                                                .setInstanceCount(1237849779621716143L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONAL_XS)))
                                        .setFunctions(
                                                Arrays.asList(
                                                        new AppFunctionsSpec()
                                                                .setRoutes(Arrays.asList())
                                                                .setName("yur")
                                                                .setSourceDir("hy")
                                                                .setAlerts(Arrays.asList())
                                                                .setEnvs(Arrays.asList()),
                                                        new AppFunctionsSpec()
                                                                .setRoutes(Arrays.asList())
                                                                .setName("dbrxmrgc")
                                                                .setSourceDir("apx")
                                                                .setAlerts(Arrays.asList())
                                                                .setEnvs(Arrays.asList())))
                                        .setDatabases(
                                                Arrays.asList(
                                                        new AppDatabaseSpec()
                                                                .setClusterName("buscgduus")
                                                                .setDbName("ycblevpmcl")
                                                                .setDbUser("yxkyxlz")
                                                                .setEngine(AppDatabaseSpecEngine.UNSET)
                                                                .setName("gkzz")
                                                                .setProduction(false)
                                                                .setVersion("hbzffovwmbjlzqs"))))
                        .setAppCost(1007609746)
                        .setAppTierDowngradeCost(1375123505);
        model = BinaryData.fromObject(model).toObject(AppProposeResponse.class);
        Assertions.assertEquals(true, model.isAppIsStatic());
        Assertions.assertEquals(false, model.isAppNameAvailable());
        Assertions.assertEquals("xwcdomm", model.getAppNameSuggestion());
        Assertions.assertEquals("fqawzfgbrttui", model.getExistingStaticApps());
        Assertions.assertEquals("lkiexhajlfnthiq", model.getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.NYC, model.getSpec().getRegion());
        Assertions.assertEquals("diygbpvnwswmtxky", model.getSpec().getDomains().get(0).getDomain());
        Assertions.assertEquals(AppDomainSpecType.ALIAS, model.getSpec().getDomains().get(0).getType());
        Assertions.assertEquals(false, model.getSpec().getDomains().get(0).isWildcard());
        Assertions.assertEquals("wxjlmec", model.getSpec().getDomains().get(0).getZone());
        Assertions.assertEquals(
                AppDomainSpecMinimumTlsVersion.ONE2, model.getSpec().getDomains().get(0).getMinimumTlsVersion());
        Assertions.assertEquals("moqqtlffhzbk", model.getSpec().getServices().get(0).getName());
        Assertions.assertEquals("vfqnvhnqoewdo", model.getSpec().getServices().get(0).getDockerfilePath());
        Assertions.assertEquals("yetesy", model.getSpec().getServices().get(0).getBuildCommand());
        Assertions.assertEquals("idbz", model.getSpec().getServices().get(0).getRunCommand());
        Assertions.assertEquals("hqtfbovn", model.getSpec().getServices().get(0).getSourceDir());
        Assertions.assertEquals("bwetnjuhpsp", model.getSpec().getServices().get(0).getEnvironmentSlug());
        Assertions.assertEquals(8562330729590351027L, model.getSpec().getServices().get(0).getHttpPort());
        Assertions.assertEquals(3613374493627536729L, model.getSpec().getServices().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALL,
                model.getSpec().getServices().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("lizst", model.getSpec().getStaticSites().get(0).getName());
        Assertions.assertEquals("rweft", model.getSpec().getStaticSites().get(0).getDockerfilePath());
        Assertions.assertEquals("qejpmvssehaepwa", model.getSpec().getStaticSites().get(0).getBuildCommand());
        Assertions.assertEquals("xtczhupeuknijd", model.getSpec().getStaticSites().get(0).getRunCommand());
        Assertions.assertEquals("yespydjfbocyv", model.getSpec().getStaticSites().get(0).getSourceDir());
        Assertions.assertEquals("lrtywikdmhlakuf", model.getSpec().getStaticSites().get(0).getEnvironmentSlug());
        Assertions.assertEquals("ukdqkkyihztg", model.getSpec().getStaticSites().get(0).getIndexDocument());
        Assertions.assertEquals("mgqzgwldoyc", model.getSpec().getStaticSites().get(0).getErrorDocument());
        Assertions.assertEquals("llcecfehuwaoa", model.getSpec().getStaticSites().get(0).getCatchallDocument());
        Assertions.assertEquals("h", model.getSpec().getStaticSites().get(0).getOutputDir());
        Assertions.assertEquals("ratbnxwbjs", model.getSpec().getJobs().get(0).getName());
        Assertions.assertEquals("fpksok", model.getSpec().getJobs().get(0).getDockerfilePath());
        Assertions.assertEquals("ogewij", model.getSpec().getJobs().get(0).getBuildCommand());
        Assertions.assertEquals("rhbguzozkyewnfn", model.getSpec().getJobs().get(0).getRunCommand());
        Assertions.assertEquals("hhqosmffjku", model.getSpec().getJobs().get(0).getSourceDir());
        Assertions.assertEquals("yarnro", model.getSpec().getJobs().get(0).getEnvironmentSlug());
        Assertions.assertEquals(AppJobSpecKind.PREDEPLOY, model.getSpec().getJobs().get(0).getKind());
        Assertions.assertEquals(1737182247634742431L, model.getSpec().getJobs().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALL,
                model.getSpec().getJobs().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("gh", model.getSpec().getWorkers().get(0).getName());
        Assertions.assertEquals("jtcdxabbujftaben", model.getSpec().getWorkers().get(0).getDockerfilePath());
        Assertions.assertEquals("klqpx", model.getSpec().getWorkers().get(0).getBuildCommand());
        Assertions.assertEquals("cafeddw", model.getSpec().getWorkers().get(0).getRunCommand());
        Assertions.assertEquals("lzafwxu", model.getSpec().getWorkers().get(0).getSourceDir());
        Assertions.assertEquals("hgookrtalvnbwgpb", model.getSpec().getWorkers().get(0).getEnvironmentSlug());
        Assertions.assertEquals(4040893848063499012L, model.getSpec().getWorkers().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.BASIC_XS,
                model.getSpec().getWorkers().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("yur", model.getSpec().getFunctions().get(0).getName());
        Assertions.assertEquals("hy", model.getSpec().getFunctions().get(0).getSourceDir());
        Assertions.assertEquals("buscgduus", model.getSpec().getDatabases().get(0).getClusterName());
        Assertions.assertEquals("ycblevpmcl", model.getSpec().getDatabases().get(0).getDbName());
        Assertions.assertEquals("yxkyxlz", model.getSpec().getDatabases().get(0).getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.UNSET, model.getSpec().getDatabases().get(0).getEngine());
        Assertions.assertEquals("gkzz", model.getSpec().getDatabases().get(0).getName());
        Assertions.assertEquals(false, model.getSpec().getDatabases().get(0).isProduction());
        Assertions.assertEquals("hbzffovwmbjlzqs", model.getSpec().getDatabases().get(0).getVersion());
        Assertions.assertEquals(1007609746, model.getAppCost());
        Assertions.assertEquals(1375123505, model.getAppTierDowngradeCost());
    }
}
