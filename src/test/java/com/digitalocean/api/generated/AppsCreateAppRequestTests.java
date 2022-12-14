package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
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
import com.digitalocean.api.models.AppsCreateAppRequest;
import com.digitalocean.api.models.AppServiceSpec;
import com.digitalocean.api.models.AppSpec;
import com.digitalocean.api.models.AppSpecRegion;
import com.digitalocean.api.models.AppStaticSiteSpec;
import com.digitalocean.api.models.AppWorkerSpec;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsCreateAppRequestTests {
    @Test
    public void testDeserialize() {
        AppsCreateAppRequest model = BinaryData.fromString("{\"spec\":{\"name\":\"nsup\",\"region\":\"fra\",\"domains\":[{\"domain\":\"qnhcvsqltnzoibg\",\"type\":\"UNSPECIFIED\",\"wildcard\":true,\"zone\":\"yqo\",\"minimum_tls_version\":\"1.2\"}],\"services\":[{\"http_port\":851386620504363480,\"internal_ports\":[],\"routes\":[],\"instance_count\":3953057842762018989,\"instance_size_slug\":\"basic-m\",\"name\":\"iqbi\",\"dockerfile_path\":\"inheh\",\"build_command\":\"pofvwb\",\"run_command\":\"lembnkbwvqvxkdi\",\"source_dir\":\"ihebwtsw\",\"envs\":[],\"environment_slug\":\"wfmdurage\"}],\"static_sites\":[{\"index_document\":\"jfelisdjubggbqig\",\"error_document\":\"kbsazgak\",\"catchall_document\":\"cyrcmjdmspo\",\"output_dir\":\"pv\",\"routes\":[],\"name\":\"lniofrzgbzje\",\"dockerfile_path\":\"nlvxbcuii\",\"build_command\":\"ktwfa\",\"run_command\":\"nv\",\"source_dir\":\"ibmikostbzb\",\"envs\":[],\"environment_slug\":\"buqny\"},{\"index_document\":\"zfylsg\",\"error_document\":\"pfbcunezzcez\",\"catchall_document\":\"fwyfwlwxjwet\",\"output_dir\":\"sihclafzvaylp\",\"routes\":[],\"name\":\"qwztcmwqkc\",\"dockerfile_path\":\"fewz\",\"build_command\":\"jexfdeqvhp\",\"run_command\":\"lkkshkbffmbmx\",\"source_dir\":\"rgywwp\",\"envs\":[],\"environment_slug\":\"snptfujgicgaao\"},{\"index_document\":\"taqutdewem\",\"error_document\":\"wvruunzzj\",\"catchall_document\":\"hkfkimrtixokf\",\"output_dir\":\"yinljqe\",\"routes\":[],\"name\":\"ixmonstshiyxg\",\"dockerfile_path\":\"du\",\"build_command\":\"birdsvuwcobiegs\",\"run_command\":\"ninwjizc\",\"source_dir\":\"nghgshej\",\"envs\":[],\"environment_slug\":\"xqmul\"},{\"index_document\":\"xqzv\",\"error_document\":\"rsbycucrwn\",\"catchall_document\":\"ikzebr\",\"output_dir\":\"smswziqgfuh\",\"routes\":[],\"name\":\"uswhvhczznvfbycj\",\"dockerfile_path\":\"xzv\",\"build_command\":\"wmxqhndvnoamlds\",\"run_command\":\"aohdjh\",\"source_dir\":\"lzok\",\"envs\":[],\"environment_slug\":\"xpelnjetagltsx\"}],\"jobs\":[{\"kind\":\"UNSPECIFIED\",\"instance_count\":4715826946186701515,\"instance_size_slug\":\"basic-m\",\"name\":\"wvefloccsrmoz\",\"dockerfile_path\":\"awtxxpk\",\"build_command\":\"cxcjxgry\",\"run_command\":\"mpcycilrmcaykgg\",\"source_dir\":\"xu\",\"envs\":[],\"environment_slug\":\"ksxwpnd\"}],\"workers\":[{\"instance_count\":3576803181435923295,\"instance_size_slug\":\"basic-xs\",\"name\":\"twk\",\"dockerfile_path\":\"uzvoamktcqiosm\",\"build_command\":\"zah\",\"run_command\":\"qdlyrtl\",\"source_dir\":\"ap\",\"envs\":[],\"environment_slug\":\"zkatb\"},{\"instance_count\":7131832436161976191,\"instance_size_slug\":\"professional-s\",\"name\":\"oqeq\",\"dockerfile_path\":\"agunbtgfebw\",\"build_command\":\"bmhyreeudz\",\"run_command\":\"vbpdqmjxlyyzglgo\",\"source_dir\":\"tlmj\",\"envs\":[],\"environment_slug\":\"ojqtobaxk\"}],\"functions\":[{\"routes\":[],\"name\":\"lbfjkwr\",\"source_dir\":\"nkqbhsyrq\",\"alerts\":[],\"envs\":[]}],\"databases\":[{\"cluster_name\":\"ulkpakd\",\"db_name\":\"fmjnnawtqa\",\"db_user\":\"xuckpggqoweyir\",\"engine\":\"UNSET\",\"name\":\"isngwflqqmpizru\",\"production\":false,\"version\":\"xpxiwfcngjs\"},{\"cluster_name\":\"sii\",\"db_name\":\"mkzjvkviir\",\"db_user\":\"fgrwsdpgratzvz\",\"engine\":\"REDIS\",\"name\":\"byvi\",\"production\":true,\"version\":\"brxkjzwr\"},{\"cluster_name\":\"ffm\",\"db_name\":\"kwfbkgo\",\"db_user\":\"wopdbydpiz\",\"engine\":\"REDIS\",\"name\":\"lnapxbiygn\",\"production\":false,\"version\":\"nfsm\"},{\"cluster_name\":\"ttuxuuyilflqoiqu\",\"db_name\":\"ehmrn\",\"db_user\":\"vsujztczytqjtwh\",\"engine\":\"REDIS\",\"name\":\"nfprnjletlxs\",\"production\":true,\"version\":\"do\"}]}}").toObject(AppsCreateAppRequest.class);
        Assertions.assertEquals("nsup", model.getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.FRA, model.getSpec().getRegion());
        Assertions.assertEquals("qnhcvsqltnzoibg", model.getSpec().getDomains().get(0).getDomain());
        Assertions.assertEquals(AppDomainSpecType.UNSPECIFIED, model.getSpec().getDomains().get(0).getType());
        Assertions.assertEquals(true, model.getSpec().getDomains().get(0).isWildcard());
        Assertions.assertEquals("yqo", model.getSpec().getDomains().get(0).getZone());
        Assertions.assertEquals(AppDomainSpecMinimumTlsVersion.ONE2, model.getSpec().getDomains().get(0).getMinimumTlsVersion());
        Assertions.assertEquals("iqbi", model.getSpec().getServices().get(0).getName());
        Assertions.assertEquals("inheh", model.getSpec().getServices().get(0).getDockerfilePath());
        Assertions.assertEquals("pofvwb", model.getSpec().getServices().get(0).getBuildCommand());
        Assertions.assertEquals("lembnkbwvqvxkdi", model.getSpec().getServices().get(0).getRunCommand());
        Assertions.assertEquals("ihebwtsw", model.getSpec().getServices().get(0).getSourceDir());
        Assertions.assertEquals("wfmdurage", model.getSpec().getServices().get(0).getEnvironmentSlug());
        Assertions.assertEquals(851386620504363480L, model.getSpec().getServices().get(0).getHttpPort());
        Assertions.assertEquals(3953057842762018989L, model.getSpec().getServices().get(0).getInstanceCount());
        Assertions.assertEquals(AppComponentInstanceBaseInstanceSizeSlug.BASICM, model.getSpec().getServices().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("lniofrzgbzje", model.getSpec().getStaticSites().get(0).getName());
        Assertions.assertEquals("nlvxbcuii", model.getSpec().getStaticSites().get(0).getDockerfilePath());
        Assertions.assertEquals("ktwfa", model.getSpec().getStaticSites().get(0).getBuildCommand());
        Assertions.assertEquals("nv", model.getSpec().getStaticSites().get(0).getRunCommand());
        Assertions.assertEquals("ibmikostbzb", model.getSpec().getStaticSites().get(0).getSourceDir());
        Assertions.assertEquals("buqny", model.getSpec().getStaticSites().get(0).getEnvironmentSlug());
        Assertions.assertEquals("jfelisdjubggbqig", model.getSpec().getStaticSites().get(0).getIndexDocument());
        Assertions.assertEquals("kbsazgak", model.getSpec().getStaticSites().get(0).getErrorDocument());
        Assertions.assertEquals("cyrcmjdmspo", model.getSpec().getStaticSites().get(0).getCatchallDocument());
        Assertions.assertEquals("pv", model.getSpec().getStaticSites().get(0).getOutputDir());
        Assertions.assertEquals("wvefloccsrmoz", model.getSpec().getJobs().get(0).getName());
        Assertions.assertEquals("awtxxpk", model.getSpec().getJobs().get(0).getDockerfilePath());
        Assertions.assertEquals("cxcjxgry", model.getSpec().getJobs().get(0).getBuildCommand());
        Assertions.assertEquals("mpcycilrmcaykgg", model.getSpec().getJobs().get(0).getRunCommand());
        Assertions.assertEquals("xu", model.getSpec().getJobs().get(0).getSourceDir());
        Assertions.assertEquals("ksxwpnd", model.getSpec().getJobs().get(0).getEnvironmentSlug());
        Assertions.assertEquals(AppJobSpecKind.UNSPECIFIED, model.getSpec().getJobs().get(0).getKind());
        Assertions.assertEquals(4715826946186701515L, model.getSpec().getJobs().get(0).getInstanceCount());
        Assertions.assertEquals(AppComponentInstanceBaseInstanceSizeSlug.BASICM, model.getSpec().getJobs().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("twk", model.getSpec().getWorkers().get(0).getName());
        Assertions.assertEquals("uzvoamktcqiosm", model.getSpec().getWorkers().get(0).getDockerfilePath());
        Assertions.assertEquals("zah", model.getSpec().getWorkers().get(0).getBuildCommand());
        Assertions.assertEquals("qdlyrtl", model.getSpec().getWorkers().get(0).getRunCommand());
        Assertions.assertEquals("ap", model.getSpec().getWorkers().get(0).getSourceDir());
        Assertions.assertEquals("zkatb", model.getSpec().getWorkers().get(0).getEnvironmentSlug());
        Assertions.assertEquals(3576803181435923295L, model.getSpec().getWorkers().get(0).getInstanceCount());
        Assertions.assertEquals(AppComponentInstanceBaseInstanceSizeSlug.BASIC_XS, model.getSpec().getWorkers().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("lbfjkwr", model.getSpec().getFunctions().get(0).getName());
        Assertions.assertEquals("nkqbhsyrq", model.getSpec().getFunctions().get(0).getSourceDir());
        Assertions.assertEquals("ulkpakd", model.getSpec().getDatabases().get(0).getClusterName());
        Assertions.assertEquals("fmjnnawtqa", model.getSpec().getDatabases().get(0).getDbName());
        Assertions.assertEquals("xuckpggqoweyir", model.getSpec().getDatabases().get(0).getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.UNSET, model.getSpec().getDatabases().get(0).getEngine());
        Assertions.assertEquals("isngwflqqmpizru", model.getSpec().getDatabases().get(0).getName());
        Assertions.assertEquals(false, model.getSpec().getDatabases().get(0).isProduction());
        Assertions.assertEquals("xpxiwfcngjs", model.getSpec().getDatabases().get(0).getVersion());
    }

    @Test
    public void testSerialize() {
        AppsCreateAppRequest model = new AppsCreateAppRequest().setSpec(new AppSpec().setName("nsup").setRegion(AppSpecRegion.FRA).setDomains(Arrays.asList(new AppDomainSpec().setDomain("qnhcvsqltnzoibg").setType(AppDomainSpecType.UNSPECIFIED).setWildcard(true).setZone("yqo").setMinimumTlsVersion(AppDomainSpecMinimumTlsVersion.ONE2))).setServices(Arrays.asList(new AppServiceSpec().setName("iqbi").setDockerfilePath("inheh").setBuildCommand("pofvwb").setRunCommand("lembnkbwvqvxkdi").setSourceDir("ihebwtsw").setEnvs(Arrays.asList()).setEnvironmentSlug("wfmdurage").setHttpPort(851386620504363480L).setInternalPorts(Arrays.asList()).setRoutes(Arrays.asList()).setInstanceCount(3953057842762018989L).setInstanceSizeSlug(AppComponentInstanceBaseInstanceSizeSlug.BASICM))).setStaticSites(Arrays.asList(new AppStaticSiteSpec().setName("lniofrzgbzje").setDockerfilePath("nlvxbcuii").setBuildCommand("ktwfa").setRunCommand("nv").setSourceDir("ibmikostbzb").setEnvs(Arrays.asList()).setEnvironmentSlug("buqny").setIndexDocument("jfelisdjubggbqig").setErrorDocument("kbsazgak").setCatchallDocument("cyrcmjdmspo").setOutputDir("pv").setRoutes(Arrays.asList()), new AppStaticSiteSpec().setName("qwztcmwqkc").setDockerfilePath("fewz").setBuildCommand("jexfdeqvhp").setRunCommand("lkkshkbffmbmx").setSourceDir("rgywwp").setEnvs(Arrays.asList()).setEnvironmentSlug("snptfujgicgaao").setIndexDocument("zfylsg").setErrorDocument("pfbcunezzcez").setCatchallDocument("fwyfwlwxjwet").setOutputDir("sihclafzvaylp").setRoutes(Arrays.asList()), new AppStaticSiteSpec().setName("ixmonstshiyxg").setDockerfilePath("du").setBuildCommand("birdsvuwcobiegs").setRunCommand("ninwjizc").setSourceDir("nghgshej").setEnvs(Arrays.asList()).setEnvironmentSlug("xqmul").setIndexDocument("taqutdewem").setErrorDocument("wvruunzzj").setCatchallDocument("hkfkimrtixokf").setOutputDir("yinljqe").setRoutes(Arrays.asList()), new AppStaticSiteSpec().setName("uswhvhczznvfbycj").setDockerfilePath("xzv").setBuildCommand("wmxqhndvnoamlds").setRunCommand("aohdjh").setSourceDir("lzok").setEnvs(Arrays.asList()).setEnvironmentSlug("xpelnjetagltsx").setIndexDocument("xqzv").setErrorDocument("rsbycucrwn").setCatchallDocument("ikzebr").setOutputDir("smswziqgfuh").setRoutes(Arrays.asList()))).setJobs(Arrays.asList(new AppJobSpec().setName("wvefloccsrmoz").setDockerfilePath("awtxxpk").setBuildCommand("cxcjxgry").setRunCommand("mpcycilrmcaykgg").setSourceDir("xu").setEnvs(Arrays.asList()).setEnvironmentSlug("ksxwpnd").setKind(AppJobSpecKind.UNSPECIFIED).setInstanceCount(4715826946186701515L).setInstanceSizeSlug(AppComponentInstanceBaseInstanceSizeSlug.BASICM))).setWorkers(Arrays.asList(new AppWorkerSpec().setName("twk").setDockerfilePath("uzvoamktcqiosm").setBuildCommand("zah").setRunCommand("qdlyrtl").setSourceDir("ap").setEnvs(Arrays.asList()).setEnvironmentSlug("zkatb").setInstanceCount(3576803181435923295L).setInstanceSizeSlug(AppComponentInstanceBaseInstanceSizeSlug.BASIC_XS), new AppWorkerSpec().setName("oqeq").setDockerfilePath("agunbtgfebw").setBuildCommand("bmhyreeudz").setRunCommand("vbpdqmjxlyyzglgo").setSourceDir("tlmj").setEnvs(Arrays.asList()).setEnvironmentSlug("ojqtobaxk").setInstanceCount(7131832436161976191L).setInstanceSizeSlug(AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALS))).setFunctions(Arrays.asList(new AppFunctionsSpec().setRoutes(Arrays.asList()).setName("lbfjkwr").setSourceDir("nkqbhsyrq").setAlerts(Arrays.asList()).setEnvs(Arrays.asList()))).setDatabases(Arrays.asList(new AppDatabaseSpec().setClusterName("ulkpakd").setDbName("fmjnnawtqa").setDbUser("xuckpggqoweyir").setEngine(AppDatabaseSpecEngine.UNSET).setName("isngwflqqmpizru").setProduction(false).setVersion("xpxiwfcngjs"), new AppDatabaseSpec().setClusterName("sii").setDbName("mkzjvkviir").setDbUser("fgrwsdpgratzvz").setEngine(AppDatabaseSpecEngine.REDIS).setName("byvi").setProduction(true).setVersion("brxkjzwr"), new AppDatabaseSpec().setClusterName("ffm").setDbName("kwfbkgo").setDbUser("wopdbydpiz").setEngine(AppDatabaseSpecEngine.REDIS).setName("lnapxbiygn").setProduction(false).setVersion("nfsm"), new AppDatabaseSpec().setClusterName("ttuxuuyilflqoiqu").setDbName("ehmrn").setDbUser("vsujztczytqjtwh").setEngine(AppDatabaseSpecEngine.REDIS).setName("nfprnjletlxs").setProduction(true).setVersion("do"))));
        model = BinaryData.fromObject(model).toObject(AppsCreateAppRequest.class);
        Assertions.assertEquals("nsup", model.getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.FRA, model.getSpec().getRegion());
        Assertions.assertEquals("qnhcvsqltnzoibg", model.getSpec().getDomains().get(0).getDomain());
        Assertions.assertEquals(AppDomainSpecType.UNSPECIFIED, model.getSpec().getDomains().get(0).getType());
        Assertions.assertEquals(true, model.getSpec().getDomains().get(0).isWildcard());
        Assertions.assertEquals("yqo", model.getSpec().getDomains().get(0).getZone());
        Assertions.assertEquals(AppDomainSpecMinimumTlsVersion.ONE2, model.getSpec().getDomains().get(0).getMinimumTlsVersion());
        Assertions.assertEquals("iqbi", model.getSpec().getServices().get(0).getName());
        Assertions.assertEquals("inheh", model.getSpec().getServices().get(0).getDockerfilePath());
        Assertions.assertEquals("pofvwb", model.getSpec().getServices().get(0).getBuildCommand());
        Assertions.assertEquals("lembnkbwvqvxkdi", model.getSpec().getServices().get(0).getRunCommand());
        Assertions.assertEquals("ihebwtsw", model.getSpec().getServices().get(0).getSourceDir());
        Assertions.assertEquals("wfmdurage", model.getSpec().getServices().get(0).getEnvironmentSlug());
        Assertions.assertEquals(851386620504363480L, model.getSpec().getServices().get(0).getHttpPort());
        Assertions.assertEquals(3953057842762018989L, model.getSpec().getServices().get(0).getInstanceCount());
        Assertions.assertEquals(AppComponentInstanceBaseInstanceSizeSlug.BASICM, model.getSpec().getServices().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("lniofrzgbzje", model.getSpec().getStaticSites().get(0).getName());
        Assertions.assertEquals("nlvxbcuii", model.getSpec().getStaticSites().get(0).getDockerfilePath());
        Assertions.assertEquals("ktwfa", model.getSpec().getStaticSites().get(0).getBuildCommand());
        Assertions.assertEquals("nv", model.getSpec().getStaticSites().get(0).getRunCommand());
        Assertions.assertEquals("ibmikostbzb", model.getSpec().getStaticSites().get(0).getSourceDir());
        Assertions.assertEquals("buqny", model.getSpec().getStaticSites().get(0).getEnvironmentSlug());
        Assertions.assertEquals("jfelisdjubggbqig", model.getSpec().getStaticSites().get(0).getIndexDocument());
        Assertions.assertEquals("kbsazgak", model.getSpec().getStaticSites().get(0).getErrorDocument());
        Assertions.assertEquals("cyrcmjdmspo", model.getSpec().getStaticSites().get(0).getCatchallDocument());
        Assertions.assertEquals("pv", model.getSpec().getStaticSites().get(0).getOutputDir());
        Assertions.assertEquals("wvefloccsrmoz", model.getSpec().getJobs().get(0).getName());
        Assertions.assertEquals("awtxxpk", model.getSpec().getJobs().get(0).getDockerfilePath());
        Assertions.assertEquals("cxcjxgry", model.getSpec().getJobs().get(0).getBuildCommand());
        Assertions.assertEquals("mpcycilrmcaykgg", model.getSpec().getJobs().get(0).getRunCommand());
        Assertions.assertEquals("xu", model.getSpec().getJobs().get(0).getSourceDir());
        Assertions.assertEquals("ksxwpnd", model.getSpec().getJobs().get(0).getEnvironmentSlug());
        Assertions.assertEquals(AppJobSpecKind.UNSPECIFIED, model.getSpec().getJobs().get(0).getKind());
        Assertions.assertEquals(4715826946186701515L, model.getSpec().getJobs().get(0).getInstanceCount());
        Assertions.assertEquals(AppComponentInstanceBaseInstanceSizeSlug.BASICM, model.getSpec().getJobs().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("twk", model.getSpec().getWorkers().get(0).getName());
        Assertions.assertEquals("uzvoamktcqiosm", model.getSpec().getWorkers().get(0).getDockerfilePath());
        Assertions.assertEquals("zah", model.getSpec().getWorkers().get(0).getBuildCommand());
        Assertions.assertEquals("qdlyrtl", model.getSpec().getWorkers().get(0).getRunCommand());
        Assertions.assertEquals("ap", model.getSpec().getWorkers().get(0).getSourceDir());
        Assertions.assertEquals("zkatb", model.getSpec().getWorkers().get(0).getEnvironmentSlug());
        Assertions.assertEquals(3576803181435923295L, model.getSpec().getWorkers().get(0).getInstanceCount());
        Assertions.assertEquals(AppComponentInstanceBaseInstanceSizeSlug.BASIC_XS, model.getSpec().getWorkers().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("lbfjkwr", model.getSpec().getFunctions().get(0).getName());
        Assertions.assertEquals("nkqbhsyrq", model.getSpec().getFunctions().get(0).getSourceDir());
        Assertions.assertEquals("ulkpakd", model.getSpec().getDatabases().get(0).getClusterName());
        Assertions.assertEquals("fmjnnawtqa", model.getSpec().getDatabases().get(0).getDbName());
        Assertions.assertEquals("xuckpggqoweyir", model.getSpec().getDatabases().get(0).getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.UNSET, model.getSpec().getDatabases().get(0).getEngine());
        Assertions.assertEquals("isngwflqqmpizru", model.getSpec().getDatabases().get(0).getName());
        Assertions.assertEquals(false, model.getSpec().getDatabases().get(0).isProduction());
        Assertions.assertEquals("xpxiwfcngjs", model.getSpec().getDatabases().get(0).getVersion());
    }
}
