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
import com.digitalocean.api.models.AppServiceSpec;
import com.digitalocean.api.models.AppSpec;
import com.digitalocean.api.models.AppSpecRegion;
import com.digitalocean.api.models.AppStaticSiteSpec;
import com.digitalocean.api.models.AppWorkerSpec;
import com.digitalocean.api.models.AppsUpdateAppRequest;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsUpdateAppRequestTests {
    @Test
    public void testDeserialize() {
        AppsUpdateAppRequest model =
                BinaryData.fromString(
                                "{\"spec\":{\"name\":\"vqylkmqpzoyhl\",\"region\":\"ams\",\"domains\":[{\"domain\":\"gcl\",\"type\":\"PRIMARY\",\"wildcard\":true,\"zone\":\"injipnwjf\",\"minimum_tls_version\":\"1.3\"},{\"domain\":\"lafcbahh\",\"type\":\"DEFAULT\",\"wildcard\":true,\"zone\":\"iyjwpfilkmkkho\",\"minimum_tls_version\":\"1.3\"},{\"domain\":\"ndviauogphuartvt\",\"type\":\"ALIAS\",\"wildcard\":false,\"zone\":\"chnmna\",\"minimum_tls_version\":\"1.2\"},{\"domain\":\"xhk\",\"type\":\"PRIMARY\",\"wildcard\":true,\"zone\":\"rweooxffifhx\",\"minimum_tls_version\":\"1.3\"}],\"services\":[{\"http_port\":9203301537126899427,\"internal_ports\":[],\"routes\":[],\"instance_count\":9076057617214150307,\"instance_size_slug\":\"professional-m\",\"name\":\"hsycxhxzgaz\",\"dockerfile_path\":\"dvmfqhppub\",\"build_command\":\"sepdfgk\",\"run_command\":\"dherngbtcj\",\"source_dir\":\"hokq\",\"envs\":[],\"environment_slug\":\"kauxof\"},{\"http_port\":6473053422093892693,\"internal_ports\":[],\"routes\":[],\"instance_count\":3760605119106572940,\"instance_size_slug\":\"basic-xxs\",\"name\":\"e\",\"dockerfile_path\":\"wkojpllndnpd\",\"build_command\":\"pqafgfugsnnfhy\",\"run_command\":\"efy\",\"source_dir\":\"coc\",\"envs\":[],\"environment_slug\":\"gt\"},{\"http_port\":3731882443821848818,\"internal_ports\":[],\"routes\":[],\"instance_count\":8653893395762749083,\"instance_size_slug\":\"basic-m\",\"name\":\"owolbaui\",\"dockerfile_path\":\"szonwpngajinn\",\"build_command\":\"jawrtmjfjmyc\",\"run_command\":\"lzhcoxovnekh\",\"source_dir\":\"lusfnrdtjxtxrdcq\",\"envs\":[],\"environment_slug\":\"idttgepus\"}],\"static_sites\":[{\"index_document\":\"cvuwkasiz\",\"error_document\":\"sfuughtuqfecjx\",\"catchall_document\":\"gtuhxuicbu\",\"output_dir\":\"mr\",\"routes\":[],\"name\":\"lx\",\"dockerfile_path\":\"usxjbaqehg\",\"build_command\":\"ohzjqatucoigeb\",\"run_command\":\"cnwfepbnwgfmxjg\",\"source_dir\":\"bjb\",\"envs\":[],\"environment_slug\":\"fgt\"},{\"index_document\":\"naquflq\",\"error_document\":\"tqhamzjrw\",\"catchall_document\":\"qzeqyjleziunjxdf\",\"output_dir\":\"ntkwcegy\",\"routes\":[],\"name\":\"nseqacjjvp\",\"dockerfile_path\":\"qjagmditgueiook\",\"build_command\":\"sahrtdtpdel\",\"run_command\":\"cslmotoebnfxo\",\"source_dir\":\"cjkgdirazftxej\",\"envs\":[],\"environment_slug\":\"mdujtmvcopexcm\"},{\"index_document\":\"buhhlkyqlt\",\"error_document\":\"rogtuwkf\",\"catchall_document\":\"jk\",\"output_dir\":\"ysidfvclgl\",\"routes\":[],\"name\":\"ijtk\",\"dockerfile_path\":\"sfikayiansharuj\",\"build_command\":\"iqxf\",\"run_command\":\"j\",\"source_dir\":\"tvwkpqhjpenu\",\"envs\":[],\"environment_slug\":\"qeqqekewvnqvcdl\"},{\"index_document\":\"ucmfdj\",\"error_document\":\"laxpunj\",\"catchall_document\":\"kczvvita\",\"output_dir\":\"xmfcsserxhtv\",\"routes\":[],\"name\":\"lwntsjgqrs\",\"dockerfile_path\":\"u\",\"build_command\":\"nchrszizoyu\",\"run_command\":\"yetnd\",\"source_dir\":\"fqyggagflnlgmtr\",\"envs\":[],\"environment_slug\":\"zjmucftbyrplroh\"}],\"jobs\":[{\"kind\":\"FAILED_DEPLOY\",\"instance_count\":6384615910850747993,\"instance_size_slug\":\"basic-xxs\",\"name\":\"mkwkl\",\"dockerfile_path\":\"mqeq\",\"build_command\":\"h\",\"run_command\":\"nhg\",\"source_dir\":\"dyynfsvkhgb\",\"envs\":[],\"environment_slug\":\"anarfdlpukhpyrne\"}],\"workers\":[{\"instance_count\":2784891934221852248,\"instance_size_slug\":\"professional-m\",\"name\":\"nmg\",\"dockerfile_path\":\"dbhfhp\",\"build_command\":\"azjzo\",\"run_command\":\"jxhpdulontacn\",\"source_dir\":\"w\",\"envs\":[],\"environment_slug\":\"tuevrh\"},{\"instance_count\":5070322859253497277,\"instance_size_slug\":\"professional-l\",\"name\":\"xh\",\"dockerfile_path\":\"wbsreur\",\"build_command\":\"kfuarenlv\",\"run_command\":\"tklnvnafvvkyfed\",\"source_dir\":\"jboslcqxypok\",\"envs\":[],\"environment_slug\":\"inqcymczngnbdxxe\"},{\"instance_count\":8375449882122380476,\"instance_size_slug\":\"professional-1l\",\"name\":\"bchaqd\",\"dockerfile_path\":\"qct\",\"build_command\":\"xdtddmflhuytxzv\",\"run_command\":\"napxbannovv\",\"source_dir\":\"czytprwn\",\"envs\":[],\"environment_slug\":\"oevytlyokr\"},{\"instance_count\":4414369503729973449,\"instance_size_slug\":\"basic-xs\",\"name\":\"sasbcrymodizrx\",\"dockerfile_path\":\"nazpmk\",\"build_command\":\"mv\",\"run_command\":\"f\",\"source_dir\":\"op\",\"envs\":[],\"environment_slug\":\"zxlioh\"}],\"functions\":[{\"routes\":[],\"name\":\"gxqbawpcb\",\"source_dir\":\"zqcyknap\",\"alerts\":[],\"envs\":[]},{\"routes\":[],\"name\":\"zb\",\"source_dir\":\"bwwg\",\"alerts\":[],\"envs\":[]},{\"routes\":[],\"name\":\"m\",\"source_dir\":\"f\",\"alerts\":[],\"envs\":[]},{\"routes\":[],\"name\":\"kccrrvwey\",\"source_dir\":\"oy\",\"alerts\":[],\"envs\":[]}],\"databases\":[{\"cluster_name\":\"iroqbosh\",\"db_name\":\"a\",\"db_user\":\"pyyrmfs\",\"engine\":\"MYSQL\",\"name\":\"avbopfp\",\"production\":true,\"version\":\"nupgahxku\"},{\"cluster_name\":\"sjcaacfdmmcpugm\",\"db_name\":\"qepvufhbzeh\",\"db_user\":\"hoqhnl\",\"engine\":\"REDIS\",\"name\":\"bldxeaclgscho\",\"production\":true,\"version\":\"rsrrmoucsofldp\"}]}}")
                        .toObject(AppsUpdateAppRequest.class);
        Assertions.assertEquals("vqylkmqpzoyhl", model.getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.AMS, model.getSpec().getRegion());
        Assertions.assertEquals("gcl", model.getSpec().getDomains().get(0).getDomain());
        Assertions.assertEquals(AppDomainSpecType.PRIMARY, model.getSpec().getDomains().get(0).getType());
        Assertions.assertEquals(true, model.getSpec().getDomains().get(0).isWildcard());
        Assertions.assertEquals("injipnwjf", model.getSpec().getDomains().get(0).getZone());
        Assertions.assertEquals(
                AppDomainSpecMinimumTlsVersion.ONE3, model.getSpec().getDomains().get(0).getMinimumTlsVersion());
        Assertions.assertEquals("hsycxhxzgaz", model.getSpec().getServices().get(0).getName());
        Assertions.assertEquals("dvmfqhppub", model.getSpec().getServices().get(0).getDockerfilePath());
        Assertions.assertEquals("sepdfgk", model.getSpec().getServices().get(0).getBuildCommand());
        Assertions.assertEquals("dherngbtcj", model.getSpec().getServices().get(0).getRunCommand());
        Assertions.assertEquals("hokq", model.getSpec().getServices().get(0).getSourceDir());
        Assertions.assertEquals("kauxof", model.getSpec().getServices().get(0).getEnvironmentSlug());
        Assertions.assertEquals(9203301537126899427L, model.getSpec().getServices().get(0).getHttpPort());
        Assertions.assertEquals(9076057617214150307L, model.getSpec().getServices().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALM,
                model.getSpec().getServices().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("lx", model.getSpec().getStaticSites().get(0).getName());
        Assertions.assertEquals("usxjbaqehg", model.getSpec().getStaticSites().get(0).getDockerfilePath());
        Assertions.assertEquals("ohzjqatucoigeb", model.getSpec().getStaticSites().get(0).getBuildCommand());
        Assertions.assertEquals("cnwfepbnwgfmxjg", model.getSpec().getStaticSites().get(0).getRunCommand());
        Assertions.assertEquals("bjb", model.getSpec().getStaticSites().get(0).getSourceDir());
        Assertions.assertEquals("fgt", model.getSpec().getStaticSites().get(0).getEnvironmentSlug());
        Assertions.assertEquals("cvuwkasiz", model.getSpec().getStaticSites().get(0).getIndexDocument());
        Assertions.assertEquals("sfuughtuqfecjx", model.getSpec().getStaticSites().get(0).getErrorDocument());
        Assertions.assertEquals("gtuhxuicbu", model.getSpec().getStaticSites().get(0).getCatchallDocument());
        Assertions.assertEquals("mr", model.getSpec().getStaticSites().get(0).getOutputDir());
        Assertions.assertEquals("mkwkl", model.getSpec().getJobs().get(0).getName());
        Assertions.assertEquals("mqeq", model.getSpec().getJobs().get(0).getDockerfilePath());
        Assertions.assertEquals("h", model.getSpec().getJobs().get(0).getBuildCommand());
        Assertions.assertEquals("nhg", model.getSpec().getJobs().get(0).getRunCommand());
        Assertions.assertEquals("dyynfsvkhgb", model.getSpec().getJobs().get(0).getSourceDir());
        Assertions.assertEquals("anarfdlpukhpyrne", model.getSpec().getJobs().get(0).getEnvironmentSlug());
        Assertions.assertEquals(AppJobSpecKind.FAILED_DEPLOY, model.getSpec().getJobs().get(0).getKind());
        Assertions.assertEquals(6384615910850747993L, model.getSpec().getJobs().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.BASIC_XXS,
                model.getSpec().getJobs().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("nmg", model.getSpec().getWorkers().get(0).getName());
        Assertions.assertEquals("dbhfhp", model.getSpec().getWorkers().get(0).getDockerfilePath());
        Assertions.assertEquals("azjzo", model.getSpec().getWorkers().get(0).getBuildCommand());
        Assertions.assertEquals("jxhpdulontacn", model.getSpec().getWorkers().get(0).getRunCommand());
        Assertions.assertEquals("w", model.getSpec().getWorkers().get(0).getSourceDir());
        Assertions.assertEquals("tuevrh", model.getSpec().getWorkers().get(0).getEnvironmentSlug());
        Assertions.assertEquals(2784891934221852248L, model.getSpec().getWorkers().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALM,
                model.getSpec().getWorkers().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("gxqbawpcb", model.getSpec().getFunctions().get(0).getName());
        Assertions.assertEquals("zqcyknap", model.getSpec().getFunctions().get(0).getSourceDir());
        Assertions.assertEquals("iroqbosh", model.getSpec().getDatabases().get(0).getClusterName());
        Assertions.assertEquals("a", model.getSpec().getDatabases().get(0).getDbName());
        Assertions.assertEquals("pyyrmfs", model.getSpec().getDatabases().get(0).getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.MYSQL, model.getSpec().getDatabases().get(0).getEngine());
        Assertions.assertEquals("avbopfp", model.getSpec().getDatabases().get(0).getName());
        Assertions.assertEquals(true, model.getSpec().getDatabases().get(0).isProduction());
        Assertions.assertEquals("nupgahxku", model.getSpec().getDatabases().get(0).getVersion());
    }

    @Test
    public void testSerialize() {
        AppsUpdateAppRequest model =
                new AppsUpdateAppRequest()
                        .setSpec(
                                new AppSpec()
                                        .setName("vqylkmqpzoyhl")
                                        .setRegion(AppSpecRegion.AMS)
                                        .setDomains(
                                                Arrays.asList(
                                                        new AppDomainSpec()
                                                                .setDomain("gcl")
                                                                .setType(AppDomainSpecType.PRIMARY)
                                                                .setWildcard(true)
                                                                .setZone("injipnwjf")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE3),
                                                        new AppDomainSpec()
                                                                .setDomain("lafcbahh")
                                                                .setType(AppDomainSpecType.DEFAULT)
                                                                .setWildcard(true)
                                                                .setZone("iyjwpfilkmkkho")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE3),
                                                        new AppDomainSpec()
                                                                .setDomain("ndviauogphuartvt")
                                                                .setType(AppDomainSpecType.ALIAS)
                                                                .setWildcard(false)
                                                                .setZone("chnmna")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE2),
                                                        new AppDomainSpec()
                                                                .setDomain("xhk")
                                                                .setType(AppDomainSpecType.PRIMARY)
                                                                .setWildcard(true)
                                                                .setZone("rweooxffifhx")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE3)))
                                        .setServices(
                                                Arrays.asList(
                                                        new AppServiceSpec()
                                                                .setName("hsycxhxzgaz")
                                                                .setDockerfilePath("dvmfqhppub")
                                                                .setBuildCommand("sepdfgk")
                                                                .setRunCommand("dherngbtcj")
                                                                .setSourceDir("hokq")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("kauxof")
                                                                .setHttpPort(9203301537126899427L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(9076057617214150307L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALM),
                                                        new AppServiceSpec()
                                                                .setName("e")
                                                                .setDockerfilePath("wkojpllndnpd")
                                                                .setBuildCommand("pqafgfugsnnfhy")
                                                                .setRunCommand("efy")
                                                                .setSourceDir("coc")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("gt")
                                                                .setHttpPort(6473053422093892693L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(3760605119106572940L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASIC_XXS),
                                                        new AppServiceSpec()
                                                                .setName("owolbaui")
                                                                .setDockerfilePath("szonwpngajinn")
                                                                .setBuildCommand("jawrtmjfjmyc")
                                                                .setRunCommand("lzhcoxovnekh")
                                                                .setSourceDir("lusfnrdtjxtxrdcq")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("idttgepus")
                                                                .setHttpPort(3731882443821848818L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(8653893395762749083L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASICM)))
                                        .setStaticSites(
                                                Arrays.asList(
                                                        new AppStaticSiteSpec()
                                                                .setName("lx")
                                                                .setDockerfilePath("usxjbaqehg")
                                                                .setBuildCommand("ohzjqatucoigeb")
                                                                .setRunCommand("cnwfepbnwgfmxjg")
                                                                .setSourceDir("bjb")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("fgt")
                                                                .setIndexDocument("cvuwkasiz")
                                                                .setErrorDocument("sfuughtuqfecjx")
                                                                .setCatchallDocument("gtuhxuicbu")
                                                                .setOutputDir("mr")
                                                                .setRoutes(Arrays.asList()),
                                                        new AppStaticSiteSpec()
                                                                .setName("nseqacjjvp")
                                                                .setDockerfilePath("qjagmditgueiook")
                                                                .setBuildCommand("sahrtdtpdel")
                                                                .setRunCommand("cslmotoebnfxo")
                                                                .setSourceDir("cjkgdirazftxej")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("mdujtmvcopexcm")
                                                                .setIndexDocument("naquflq")
                                                                .setErrorDocument("tqhamzjrw")
                                                                .setCatchallDocument("qzeqyjleziunjxdf")
                                                                .setOutputDir("ntkwcegy")
                                                                .setRoutes(Arrays.asList()),
                                                        new AppStaticSiteSpec()
                                                                .setName("ijtk")
                                                                .setDockerfilePath("sfikayiansharuj")
                                                                .setBuildCommand("iqxf")
                                                                .setRunCommand("j")
                                                                .setSourceDir("tvwkpqhjpenu")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("qeqqekewvnqvcdl")
                                                                .setIndexDocument("buhhlkyqlt")
                                                                .setErrorDocument("rogtuwkf")
                                                                .setCatchallDocument("jk")
                                                                .setOutputDir("ysidfvclgl")
                                                                .setRoutes(Arrays.asList()),
                                                        new AppStaticSiteSpec()
                                                                .setName("lwntsjgqrs")
                                                                .setDockerfilePath("u")
                                                                .setBuildCommand("nchrszizoyu")
                                                                .setRunCommand("yetnd")
                                                                .setSourceDir("fqyggagflnlgmtr")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("zjmucftbyrplroh")
                                                                .setIndexDocument("ucmfdj")
                                                                .setErrorDocument("laxpunj")
                                                                .setCatchallDocument("kczvvita")
                                                                .setOutputDir("xmfcsserxhtv")
                                                                .setRoutes(Arrays.asList())))
                                        .setJobs(
                                                Arrays.asList(
                                                        new AppJobSpec()
                                                                .setName("mkwkl")
                                                                .setDockerfilePath("mqeq")
                                                                .setBuildCommand("h")
                                                                .setRunCommand("nhg")
                                                                .setSourceDir("dyynfsvkhgb")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("anarfdlpukhpyrne")
                                                                .setKind(AppJobSpecKind.FAILED_DEPLOY)
                                                                .setInstanceCount(6384615910850747993L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASIC_XXS)))
                                        .setWorkers(
                                                Arrays.asList(
                                                        new AppWorkerSpec()
                                                                .setName("nmg")
                                                                .setDockerfilePath("dbhfhp")
                                                                .setBuildCommand("azjzo")
                                                                .setRunCommand("jxhpdulontacn")
                                                                .setSourceDir("w")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("tuevrh")
                                                                .setInstanceCount(2784891934221852248L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALM),
                                                        new AppWorkerSpec()
                                                                .setName("xh")
                                                                .setDockerfilePath("wbsreur")
                                                                .setBuildCommand("kfuarenlv")
                                                                .setRunCommand("tklnvnafvvkyfed")
                                                                .setSourceDir("jboslcqxypok")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("inqcymczngnbdxxe")
                                                                .setInstanceCount(5070322859253497277L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALL),
                                                        new AppWorkerSpec()
                                                                .setName("bchaqd")
                                                                .setDockerfilePath("qct")
                                                                .setBuildCommand("xdtddmflhuytxzv")
                                                                .setRunCommand("napxbannovv")
                                                                .setSourceDir("czytprwn")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("oevytlyokr")
                                                                .setInstanceCount(8375449882122380476L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONAL1L),
                                                        new AppWorkerSpec()
                                                                .setName("sasbcrymodizrx")
                                                                .setDockerfilePath("nazpmk")
                                                                .setBuildCommand("mv")
                                                                .setRunCommand("f")
                                                                .setSourceDir("op")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("zxlioh")
                                                                .setInstanceCount(4414369503729973449L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASIC_XS)))
                                        .setFunctions(
                                                Arrays.asList(
                                                        new AppFunctionsSpec()
                                                                .setRoutes(Arrays.asList())
                                                                .setName("gxqbawpcb")
                                                                .setSourceDir("zqcyknap")
                                                                .setAlerts(Arrays.asList())
                                                                .setEnvs(Arrays.asList()),
                                                        new AppFunctionsSpec()
                                                                .setRoutes(Arrays.asList())
                                                                .setName("zb")
                                                                .setSourceDir("bwwg")
                                                                .setAlerts(Arrays.asList())
                                                                .setEnvs(Arrays.asList()),
                                                        new AppFunctionsSpec()
                                                                .setRoutes(Arrays.asList())
                                                                .setName("m")
                                                                .setSourceDir("f")
                                                                .setAlerts(Arrays.asList())
                                                                .setEnvs(Arrays.asList()),
                                                        new AppFunctionsSpec()
                                                                .setRoutes(Arrays.asList())
                                                                .setName("kccrrvwey")
                                                                .setSourceDir("oy")
                                                                .setAlerts(Arrays.asList())
                                                                .setEnvs(Arrays.asList())))
                                        .setDatabases(
                                                Arrays.asList(
                                                        new AppDatabaseSpec()
                                                                .setClusterName("iroqbosh")
                                                                .setDbName("a")
                                                                .setDbUser("pyyrmfs")
                                                                .setEngine(AppDatabaseSpecEngine.MYSQL)
                                                                .setName("avbopfp")
                                                                .setProduction(true)
                                                                .setVersion("nupgahxku"),
                                                        new AppDatabaseSpec()
                                                                .setClusterName("sjcaacfdmmcpugm")
                                                                .setDbName("qepvufhbzeh")
                                                                .setDbUser("hoqhnl")
                                                                .setEngine(AppDatabaseSpecEngine.REDIS)
                                                                .setName("bldxeaclgscho")
                                                                .setProduction(true)
                                                                .setVersion("rsrrmoucsofldp"))));
        model = BinaryData.fromObject(model).toObject(AppsUpdateAppRequest.class);
        Assertions.assertEquals("vqylkmqpzoyhl", model.getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.AMS, model.getSpec().getRegion());
        Assertions.assertEquals("gcl", model.getSpec().getDomains().get(0).getDomain());
        Assertions.assertEquals(AppDomainSpecType.PRIMARY, model.getSpec().getDomains().get(0).getType());
        Assertions.assertEquals(true, model.getSpec().getDomains().get(0).isWildcard());
        Assertions.assertEquals("injipnwjf", model.getSpec().getDomains().get(0).getZone());
        Assertions.assertEquals(
                AppDomainSpecMinimumTlsVersion.ONE3, model.getSpec().getDomains().get(0).getMinimumTlsVersion());
        Assertions.assertEquals("hsycxhxzgaz", model.getSpec().getServices().get(0).getName());
        Assertions.assertEquals("dvmfqhppub", model.getSpec().getServices().get(0).getDockerfilePath());
        Assertions.assertEquals("sepdfgk", model.getSpec().getServices().get(0).getBuildCommand());
        Assertions.assertEquals("dherngbtcj", model.getSpec().getServices().get(0).getRunCommand());
        Assertions.assertEquals("hokq", model.getSpec().getServices().get(0).getSourceDir());
        Assertions.assertEquals("kauxof", model.getSpec().getServices().get(0).getEnvironmentSlug());
        Assertions.assertEquals(9203301537126899427L, model.getSpec().getServices().get(0).getHttpPort());
        Assertions.assertEquals(9076057617214150307L, model.getSpec().getServices().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALM,
                model.getSpec().getServices().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("lx", model.getSpec().getStaticSites().get(0).getName());
        Assertions.assertEquals("usxjbaqehg", model.getSpec().getStaticSites().get(0).getDockerfilePath());
        Assertions.assertEquals("ohzjqatucoigeb", model.getSpec().getStaticSites().get(0).getBuildCommand());
        Assertions.assertEquals("cnwfepbnwgfmxjg", model.getSpec().getStaticSites().get(0).getRunCommand());
        Assertions.assertEquals("bjb", model.getSpec().getStaticSites().get(0).getSourceDir());
        Assertions.assertEquals("fgt", model.getSpec().getStaticSites().get(0).getEnvironmentSlug());
        Assertions.assertEquals("cvuwkasiz", model.getSpec().getStaticSites().get(0).getIndexDocument());
        Assertions.assertEquals("sfuughtuqfecjx", model.getSpec().getStaticSites().get(0).getErrorDocument());
        Assertions.assertEquals("gtuhxuicbu", model.getSpec().getStaticSites().get(0).getCatchallDocument());
        Assertions.assertEquals("mr", model.getSpec().getStaticSites().get(0).getOutputDir());
        Assertions.assertEquals("mkwkl", model.getSpec().getJobs().get(0).getName());
        Assertions.assertEquals("mqeq", model.getSpec().getJobs().get(0).getDockerfilePath());
        Assertions.assertEquals("h", model.getSpec().getJobs().get(0).getBuildCommand());
        Assertions.assertEquals("nhg", model.getSpec().getJobs().get(0).getRunCommand());
        Assertions.assertEquals("dyynfsvkhgb", model.getSpec().getJobs().get(0).getSourceDir());
        Assertions.assertEquals("anarfdlpukhpyrne", model.getSpec().getJobs().get(0).getEnvironmentSlug());
        Assertions.assertEquals(AppJobSpecKind.FAILED_DEPLOY, model.getSpec().getJobs().get(0).getKind());
        Assertions.assertEquals(6384615910850747993L, model.getSpec().getJobs().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.BASIC_XXS,
                model.getSpec().getJobs().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("nmg", model.getSpec().getWorkers().get(0).getName());
        Assertions.assertEquals("dbhfhp", model.getSpec().getWorkers().get(0).getDockerfilePath());
        Assertions.assertEquals("azjzo", model.getSpec().getWorkers().get(0).getBuildCommand());
        Assertions.assertEquals("jxhpdulontacn", model.getSpec().getWorkers().get(0).getRunCommand());
        Assertions.assertEquals("w", model.getSpec().getWorkers().get(0).getSourceDir());
        Assertions.assertEquals("tuevrh", model.getSpec().getWorkers().get(0).getEnvironmentSlug());
        Assertions.assertEquals(2784891934221852248L, model.getSpec().getWorkers().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALM,
                model.getSpec().getWorkers().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("gxqbawpcb", model.getSpec().getFunctions().get(0).getName());
        Assertions.assertEquals("zqcyknap", model.getSpec().getFunctions().get(0).getSourceDir());
        Assertions.assertEquals("iroqbosh", model.getSpec().getDatabases().get(0).getClusterName());
        Assertions.assertEquals("a", model.getSpec().getDatabases().get(0).getDbName());
        Assertions.assertEquals("pyyrmfs", model.getSpec().getDatabases().get(0).getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.MYSQL, model.getSpec().getDatabases().get(0).getEngine());
        Assertions.assertEquals("avbopfp", model.getSpec().getDatabases().get(0).getName());
        Assertions.assertEquals(true, model.getSpec().getDatabases().get(0).isProduction());
        Assertions.assertEquals("nupgahxku", model.getSpec().getDatabases().get(0).getVersion());
    }
}
