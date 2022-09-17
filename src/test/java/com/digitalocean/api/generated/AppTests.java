package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.App;
import com.digitalocean.api.models.AppComponentInstanceBaseInstanceSizeSlug;
import com.digitalocean.api.models.AppDatabaseSpec;
import com.digitalocean.api.models.AppDatabaseSpecEngine;
import com.digitalocean.api.models.AppDomainSpec;
import com.digitalocean.api.models.AppDomainSpecMinimumTlsVersion;
import com.digitalocean.api.models.AppDomainSpecType;
import com.digitalocean.api.models.AppFunctionsSpec;
import com.digitalocean.api.models.AppJobSpec;
import com.digitalocean.api.models.AppJobSpecKind;
import com.digitalocean.api.models.AppPinnedDeployment;
import com.digitalocean.api.models.AppServiceSpec;
import com.digitalocean.api.models.AppSpec;
import com.digitalocean.api.models.AppSpecRegion;
import com.digitalocean.api.models.AppStaticSiteSpec;
import com.digitalocean.api.models.AppWorkerSpec;
import com.digitalocean.api.models.AppsDeployment;
import com.digitalocean.api.models.AppsDeploymentFunctions;
import com.digitalocean.api.models.AppsDeploymentJob;
import com.digitalocean.api.models.AppsDeploymentPhase;
import com.digitalocean.api.models.AppsDeploymentProgress;
import com.digitalocean.api.models.AppsDeploymentService;
import com.digitalocean.api.models.AppsDeploymentStaticSite;
import com.digitalocean.api.models.AppsDeploymentWorker;
import com.digitalocean.api.models.AppsRegion;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppTests {
    @Test
    public void testDeserialize() {
        App model =
                BinaryData.fromString(
                                "{\"active_deployment\":{\"cause\":\"yifqrvkdvjsllrmv\",\"cloned_from\":\"f\",\"created_at\":\"2021-12-05T03:26:34Z\",\"id\":\"pnpulexxbczwtru\",\"jobs\":[{\"name\":\"bq\",\"source_commit_hash\":\"sovmyokacspkwl\"},{\"name\":\"dobpxjmflbvvn\",\"source_commit_hash\":\"rkcciwwzjuqk\"},{\"name\":\"sa\",\"source_commit_hash\":\"wkuofoskghsauu\"}],\"functions\":[{\"name\":\"vxieduugidyj\",\"source_commit_hash\":\"f\",\"namespace\":\"aos\"},{\"name\":\"xc\",\"source_commit_hash\":\"npc\",\"namespace\":\"ocohslkevleg\"}],\"phase\":\"UNKNOWN\",\"phase_last_updated_at\":\"2021-09-05T06:09:57Z\",\"progress\":{\"error_steps\":1240175495,\"pending_steps\":53032115,\"running_steps\":183778088,\"steps\":[],\"success_steps\":441262471,\"summary_steps\":[],\"total_steps\":378191098},\"services\":[{\"name\":\"ez\",\"source_commit_hash\":\"shxmzsbbzoggigrx\"},{\"name\":\"ur\",\"source_commit_hash\":\"xxjnspydptk\"}],\"spec\":{\"name\":\"nkoukn\",\"region\":\"fra\",\"domains\":[],\"services\":[],\"static_sites\":[],\"jobs\":[],\"workers\":[],\"functions\":[],\"databases\":[]},\"static_sites\":[{\"name\":\"z\",\"source_commit_hash\":\"o\"},{\"name\":\"ukgjnpiucgygevq\",\"source_commit_hash\":\"typmrbpizcdrqjsd\"},{\"name\":\"dnfyhxdeoejzicwi\",\"source_commit_hash\":\"jttgzf\"}],\"tier_slug\":\"shcbkhajdeyeamdp\",\"updated_at\":\"2021-04-08T03:04:22Z\",\"workers\":[{\"name\":\"buxwgip\",\"source_commit_hash\":\"onowk\"},{\"name\":\"hwankixzbinjepu\",\"source_commit_hash\":\"mryw\"},{\"name\":\"zoqftiyqzrnkcqvy\",\"source_commit_hash\":\"whzlsicohoq\"},{\"name\":\"wvl\",\"source_commit_hash\":\"avwhheunm\"}]},\"created_at\":\"2020-12-26T14:51:32Z\",\"default_ingress\":\"yxzk\",\"domains\":[{\"id\":\"uko\",\"phase\":\"ERROR\",\"progress\":{\"steps\":[]},\"spec\":{\"domain\":\"conuqszfkbeype\",\"type\":\"PRIMARY\",\"wildcard\":true,\"zone\":\"vvjektcxsenhwlrs\",\"minimum_tls_version\":\"1.3\"}},{\"id\":\"pwvlqdq\",\"phase\":\"PENDING\",\"progress\":{\"steps\":[]},\"spec\":{\"domain\":\"ihkaetcktvfc\",\"type\":\"PRIMARY\",\"wildcard\":true,\"zone\":\"ymuctqhjfbebrj\",\"minimum_tls_version\":\"1.3\"}},{\"id\":\"fuwutttxf\",\"phase\":\"CONFIGURING\",\"progress\":{\"steps\":[]},\"spec\":{\"domain\":\"phxepcyvahf\",\"type\":\"UNSPECIFIED\",\"wildcard\":false,\"zone\":\"xjvuujqgidokg\",\"minimum_tls_version\":\"1.3\"}}],\"id\":\"oxgvclt\",\"in_progress_deployment\":{\"cause\":\"ncghkje\",\"cloned_from\":\"zhbijhtxfv\",\"created_at\":\"2021-10-21T07:58:39Z\",\"id\":\"smx\",\"jobs\":[{\"name\":\"pvecxgodeb\",\"source_commit_hash\":\"kk\"},{\"name\":\"mpukgriw\",\"source_commit_hash\":\"zlfbxzpuzycispnq\"}],\"functions\":[{\"name\":\"gkbrpyyd\",\"source_commit_hash\":\"bnuqqkpik\",\"namespace\":\"rgvtqag\"},{\"name\":\"uynhijg\",\"source_commit_hash\":\"ebf\",\"namespace\":\"arbu\"},{\"name\":\"cvpnazzmhjrunmpx\",\"source_commit_hash\":\"dbhrbnlankxm\",\"namespace\":\"k\"}],\"phase\":\"BUILDING\",\"phase_last_updated_at\":\"2021-05-05T04:59:18Z\",\"progress\":{\"error_steps\":2131694851,\"pending_steps\":2016648328,\"running_steps\":83692384,\"steps\":[],\"success_steps\":782555579,\"summary_steps\":[],\"total_steps\":815551540},\"services\":[{\"name\":\"dybyxczfclhaa\",\"source_commit_hash\":\"babphlwrqlfk\"},{\"name\":\"thsu\",\"source_commit_hash\":\"cmnyyazttb\"}],\"spec\":{\"name\":\"wrqpue\",\"region\":\"ams\",\"domains\":[],\"services\":[],\"static_sites\":[],\"jobs\":[],\"workers\":[],\"functions\":[],\"databases\":[]},\"static_sites\":[{\"name\":\"xujwbhqwalmuzyo\",\"source_commit_hash\":\"epdkzja\"}],\"tier_slug\":\"ux\",\"updated_at\":\"2021-05-17T00:18:41Z\",\"workers\":[{\"name\":\"v\",\"source_commit_hash\":\"niwdjsw\"},{\"name\":\"s\",\"source_commit_hash\":\"pgn\"},{\"name\":\"txhp\",\"source_commit_hash\":\"bzpfzab\"},{\"name\":\"cuh\",\"source_commit_hash\":\"tcty\"}]},\"last_deployment_created_at\":\"2021-04-24T03:57:36Z\",\"live_domain\":\"bbovplwzbhvgyugu\",\"live_url\":\"vmkfssxqu\",\"live_url_base\":\"fpl\",\"owner_uuid\":\"gsxnkjzkdeslpv\",\"region\":{\"continent\":\"wiyighxpkdw\",\"data_centers\":[\"iuebbaumny\",\"upedeojnabckhs\",\"txp\",\"ie\"],\"default\":true,\"disabled\":true,\"flag\":\"esap\",\"label\":\"rdqmhjjdhtldwkyz\",\"reason\":\"utknc\",\"slug\":\"cwsvlxotog\"},\"spec\":{\"name\":\"wrupqsxvnmicykvc\",\"region\":\"fra\",\"domains\":[{\"domain\":\"lo\",\"type\":\"UNSPECIFIED\",\"wildcard\":true,\"zone\":\"jfcn\",\"minimum_tls_version\":\"1.2\"},{\"domain\":\"cn\",\"type\":\"PRIMARY\",\"wildcard\":true,\"zone\":\"kphywpnvjto\",\"minimum_tls_version\":\"1.3\"}],\"services\":[{\"http_port\":4658346071912083190,\"internal_ports\":[],\"routes\":[],\"instance_count\":3221959502351885450,\"instance_size_slug\":\"basic-xxs\",\"name\":\"pabgyeps\",\"dockerfile_path\":\"ugxywpmueef\",\"build_command\":\"wfqkquj\",\"run_command\":\"suyonobglaocq\",\"source_dir\":\"ccm\",\"envs\":[],\"environment_slug\":\"dxyt\"},{\"http_port\":1401162324207886414,\"internal_ports\":[],\"routes\":[],\"instance_count\":1731749490804613022,\"instance_size_slug\":\"professional-1l\",\"name\":\"txhdzh\",\"dockerfile_path\":\"ck\",\"build_command\":\"lhrxsbkyvpyc\",\"run_command\":\"uzbpzkafku\",\"source_dir\":\"crnwbmeh\",\"envs\":[],\"environment_slug\":\"yvjusrtslhsp\"},{\"http_port\":3488305487791082872,\"internal_ports\":[],\"routes\":[],\"instance_count\":1461011233299690621,\"instance_size_slug\":\"professional-xs\",\"name\":\"melmqkrha\",\"dockerfile_path\":\"haquhcdh\",\"build_command\":\"ualaexqpvfadmw\",\"run_command\":\"crgvxpvgom\",\"source_dir\":\"fmisg\",\"envs\":[],\"environment_slug\":\"b\"},{\"http_port\":2980894048729421181,\"internal_ports\":[],\"routes\":[],\"instance_count\":301155517903615814,\"instance_size_slug\":\"professional-l\",\"name\":\"qhakauhashsf\",\"dockerfile_path\":\"z\",\"build_command\":\"ugicjooxdjebw\",\"run_command\":\"cwwfvovbvme\",\"source_dir\":\"civyhzceuo\",\"envs\":[],\"environment_slug\":\"rw\"}],\"static_sites\":[{\"index_document\":\"twm\",\"error_document\":\"ytdxwit\",\"catchall_document\":\"rjaw\",\"output_dir\":\"wgxhn\",\"routes\":[],\"name\":\"fbkp\",\"dockerfile_path\":\"ndnhj\",\"build_command\":\"uwhvylwzbtdhxujz\",\"run_command\":\"mpowuwpr\",\"source_dir\":\"lve\",\"envs\":[],\"environment_slug\":\"upjm\"},{\"index_document\":\"xobbcswsrt\",\"error_document\":\"iplrbpbewtghfgb\",\"catchall_document\":\"gw\",\"output_dir\":\"vlvqhjkbegi\",\"routes\":[],\"name\":\"xiebwwaloayqcg\",\"dockerfile_path\":\"zg\",\"build_command\":\"zmh\",\"run_command\":\"ongmtsa\",\"source_dir\":\"cbpwxqpsrknft\",\"envs\":[],\"environment_slug\":\"riuhprwm\"},{\"index_document\":\"xqtayriwwro\",\"error_document\":\"bexrmcq\",\"catchall_document\":\"ycnojvknmefqsg\",\"output_dir\":\"ah\",\"routes\":[],\"name\":\"zhpvgqzcjrvxd\",\"dockerfile_path\":\"xkvugfhzov\",\"build_command\":\"jvzunluthnnp\",\"run_command\":\"xipeilpjzuaejx\",\"source_dir\":\"ltskzbbtd\",\"envs\":[],\"environment_slug\":\"veekgpwozuhkfp\"},{\"index_document\":\"yofd\",\"error_document\":\"uusdttouwa\",\"catchall_document\":\"ekqvkeln\",\"output_dir\":\"vbxwyjsflhh\",\"routes\":[],\"name\":\"n\",\"dockerfile_path\":\"yaw\",\"build_command\":\"yaqcslyjpkiidz\",\"run_command\":\"xznelixhnrztf\",\"source_dir\":\"hb\",\"envs\":[],\"environment_slug\":\"nalaulppg\"}],\"jobs\":[{\"kind\":\"FAILED_DEPLOY\",\"instance_count\":2295956833517690823,\"instance_size_slug\":\"professional-l\",\"name\":\"pu\",\"dockerfile_path\":\"gylgqgitxmedjvcs\",\"build_command\":\"n\",\"run_command\":\"wncwzzhxgktrmg\",\"source_dir\":\"napkteoellw\",\"envs\":[],\"environment_slug\":\"d\"},{\"kind\":\"POST_DEPLOY\",\"instance_count\":816546176101077379,\"instance_size_slug\":\"professional-l\",\"name\":\"op\",\"dockerfile_path\":\"uaopppcqeq\",\"build_command\":\"lzdahzxctobgbkdm\",\"run_command\":\"zpostmgrcfbu\",\"source_dir\":\"mfqjhhkxbp\",\"envs\":[],\"environment_slug\":\"mjh\"},{\"kind\":\"PRE_DEPLOY\",\"instance_count\":6882060719567811961,\"instance_size_slug\":\"basic-m\",\"name\":\"krtswbxqz\",\"dockerfile_path\":\"uvjfdxxive\",\"build_command\":\"t\",\"run_command\":\"aqtdoqmcbx\",\"source_dir\":\"vxysl\",\"envs\":[],\"environment_slug\":\"sfxobl\"}],\"workers\":[{\"instance_count\":3681757867502856948,\"instance_size_slug\":\"professional-m\",\"name\":\"wfbkrvrns\",\"dockerfile_path\":\"hxcr\",\"build_command\":\"fovasr\",\"run_command\":\"v\",\"source_dir\":\"hsqfsubcgjbirxbp\",\"envs\":[],\"environment_slug\":\"rfbjf\"},{\"instance_count\":8471863314658985713,\"instance_size_slug\":\"professional-m\",\"name\":\"tpvjzbexilzznfqq\",\"dockerfile_path\":\"taruoujmkcj\",\"build_command\":\"qytjrybnwjewgd\",\"run_command\":\"ervnaenqpehi\",\"source_dir\":\"oygmift\",\"envs\":[],\"environment_slug\":\"d\"}],\"functions\":[{\"routes\":[],\"name\":\"ayqigynduhav\",\"source_dir\":\"lkthu\",\"alerts\":[],\"envs\":[]}],\"databases\":[{\"cluster_name\":\"uie\",\"db_name\":\"gccymvaolpssl\",\"db_user\":\"fmmdnbbg\",\"engine\":\"PG\",\"name\":\"swiydmcwyhzdx\",\"production\":true,\"version\":\"bzmnvdfznud\"}]},\"tier_slug\":\"dvxzbncblylpst\",\"updated_at\":\"2021-11-13T03:54:29Z\",\"pinned_deployment\":{\"cause\":\"srzdzucerscdn\",\"cloned_from\":\"evfiwjmygt\",\"created_at\":\"2021-07-01T16:24:58Z\",\"id\":\"s\",\"jobs\":[{\"name\":\"eriofzpyqs\",\"source_commit_hash\":\"wab\"},{\"name\":\"tshhszhedp\",\"source_commit_hash\":\"wiwubm\"},{\"name\":\"besldnkwwtppjflc\",\"source_commit_hash\":\"gaokonzmnsikv\"}],\"functions\":[{\"name\":\"eqqkdltfzxm\",\"source_commit_hash\":\"v\",\"namespace\":\"ur\"},{\"name\":\"dkwobdagx\",\"source_commit_hash\":\"bqdxbx\",\"namespace\":\"kbogqxndlkzgx\"},{\"name\":\"ripl\",\"source_commit_hash\":\"odxun\",\"namespace\":\"ebxmubyynt\"},{\"name\":\"rbqtkoie\",\"source_commit_hash\":\"eotg\",\"namespace\":\"l\"}],\"phase\":\"PENDING_DEPLOY\",\"phase_last_updated_at\":\"2021-05-04T05:57:56Z\",\"progress\":{\"error_steps\":738915892,\"pending_steps\":284153241,\"running_steps\":566352608,\"steps\":[],\"success_steps\":1065910925,\"summary_steps\":[],\"total_steps\":904231635},\"services\":[{\"name\":\"muvp\",\"source_commit_hash\":\"tdum\"}],\"spec\":{\"name\":\"p\",\"region\":\"fra\",\"domains\":[],\"services\":[],\"static_sites\":[],\"jobs\":[],\"workers\":[],\"functions\":[],\"databases\":[]},\"static_sites\":[{\"name\":\"dneu\",\"source_commit_hash\":\"fphsdyhtozfikdow\"},{\"name\":\"uuvxz\",\"source_commit_hash\":\"lvithhqzonosgg\"}],\"tier_slug\":\"c\",\"updated_at\":\"2021-08-29T01:48:19Z\",\"workers\":[{\"name\":\"jnkaljutiiswacff\",\"source_commit_hash\":\"k\"},{\"name\":\"ewkfvhqcrai\",\"source_commit_hash\":\"pnppfuf\"}]}}")
                        .toObject(App.class);
        Assertions.assertEquals("yifqrvkdvjsllrmv", model.getActiveDeployment().getCause());
        Assertions.assertEquals("f", model.getActiveDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-12-05T03:26:34Z"), model.getActiveDeployment().getCreatedAt());
        Assertions.assertEquals("pnpulexxbczwtru", model.getActiveDeployment().getId());
        Assertions.assertEquals("bq", model.getActiveDeployment().getJobs().get(0).getName());
        Assertions.assertEquals("sovmyokacspkwl", model.getActiveDeployment().getJobs().get(0).getSourceCommitHash());
        Assertions.assertEquals("vxieduugidyj", model.getActiveDeployment().getFunctions().get(0).getName());
        Assertions.assertEquals("f", model.getActiveDeployment().getFunctions().get(0).getSourceCommitHash());
        Assertions.assertEquals("aos", model.getActiveDeployment().getFunctions().get(0).getNamespace());
        Assertions.assertEquals(AppsDeploymentPhase.UNKNOWN, model.getActiveDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-05T06:09:57Z"), model.getActiveDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(1240175495, model.getActiveDeployment().getProgress().getErrorSteps());
        Assertions.assertEquals(53032115, model.getActiveDeployment().getProgress().getPendingSteps());
        Assertions.assertEquals(183778088, model.getActiveDeployment().getProgress().getRunningSteps());
        Assertions.assertEquals(441262471, model.getActiveDeployment().getProgress().getSuccessSteps());
        Assertions.assertEquals(378191098, model.getActiveDeployment().getProgress().getTotalSteps());
        Assertions.assertEquals("ez", model.getActiveDeployment().getServices().get(0).getName());
        Assertions.assertEquals(
                "shxmzsbbzoggigrx", model.getActiveDeployment().getServices().get(0).getSourceCommitHash());
        Assertions.assertEquals("nkoukn", model.getActiveDeployment().getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.FRA, model.getActiveDeployment().getSpec().getRegion());
        Assertions.assertEquals("z", model.getActiveDeployment().getStaticSites().get(0).getName());
        Assertions.assertEquals("o", model.getActiveDeployment().getStaticSites().get(0).getSourceCommitHash());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-08T03:04:22Z"), model.getActiveDeployment().getUpdatedAt());
        Assertions.assertEquals("buxwgip", model.getActiveDeployment().getWorkers().get(0).getName());
        Assertions.assertEquals("onowk", model.getActiveDeployment().getWorkers().get(0).getSourceCommitHash());
        Assertions.assertEquals("ncghkje", model.getInProgressDeployment().getCause());
        Assertions.assertEquals("zhbijhtxfv", model.getInProgressDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-21T07:58:39Z"), model.getInProgressDeployment().getCreatedAt());
        Assertions.assertEquals("smx", model.getInProgressDeployment().getId());
        Assertions.assertEquals("pvecxgodeb", model.getInProgressDeployment().getJobs().get(0).getName());
        Assertions.assertEquals("kk", model.getInProgressDeployment().getJobs().get(0).getSourceCommitHash());
        Assertions.assertEquals("gkbrpyyd", model.getInProgressDeployment().getFunctions().get(0).getName());
        Assertions.assertEquals(
                "bnuqqkpik", model.getInProgressDeployment().getFunctions().get(0).getSourceCommitHash());
        Assertions.assertEquals("rgvtqag", model.getInProgressDeployment().getFunctions().get(0).getNamespace());
        Assertions.assertEquals(AppsDeploymentPhase.BUILDING, model.getInProgressDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-05T04:59:18Z"), model.getInProgressDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(2131694851, model.getInProgressDeployment().getProgress().getErrorSteps());
        Assertions.assertEquals(2016648328, model.getInProgressDeployment().getProgress().getPendingSteps());
        Assertions.assertEquals(83692384, model.getInProgressDeployment().getProgress().getRunningSteps());
        Assertions.assertEquals(782555579, model.getInProgressDeployment().getProgress().getSuccessSteps());
        Assertions.assertEquals(815551540, model.getInProgressDeployment().getProgress().getTotalSteps());
        Assertions.assertEquals("dybyxczfclhaa", model.getInProgressDeployment().getServices().get(0).getName());
        Assertions.assertEquals(
                "babphlwrqlfk", model.getInProgressDeployment().getServices().get(0).getSourceCommitHash());
        Assertions.assertEquals("wrqpue", model.getInProgressDeployment().getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.AMS, model.getInProgressDeployment().getSpec().getRegion());
        Assertions.assertEquals("xujwbhqwalmuzyo", model.getInProgressDeployment().getStaticSites().get(0).getName());
        Assertions.assertEquals(
                "epdkzja", model.getInProgressDeployment().getStaticSites().get(0).getSourceCommitHash());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-17T00:18:41Z"), model.getInProgressDeployment().getUpdatedAt());
        Assertions.assertEquals("v", model.getInProgressDeployment().getWorkers().get(0).getName());
        Assertions.assertEquals("niwdjsw", model.getInProgressDeployment().getWorkers().get(0).getSourceCommitHash());
        Assertions.assertEquals("wrupqsxvnmicykvc", model.getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.FRA, model.getSpec().getRegion());
        Assertions.assertEquals("lo", model.getSpec().getDomains().get(0).getDomain());
        Assertions.assertEquals(AppDomainSpecType.UNSPECIFIED, model.getSpec().getDomains().get(0).getType());
        Assertions.assertEquals(true, model.getSpec().getDomains().get(0).isWildcard());
        Assertions.assertEquals("jfcn", model.getSpec().getDomains().get(0).getZone());
        Assertions.assertEquals(
                AppDomainSpecMinimumTlsVersion.ONE2, model.getSpec().getDomains().get(0).getMinimumTlsVersion());
        Assertions.assertEquals("pabgyeps", model.getSpec().getServices().get(0).getName());
        Assertions.assertEquals("ugxywpmueef", model.getSpec().getServices().get(0).getDockerfilePath());
        Assertions.assertEquals("wfqkquj", model.getSpec().getServices().get(0).getBuildCommand());
        Assertions.assertEquals("suyonobglaocq", model.getSpec().getServices().get(0).getRunCommand());
        Assertions.assertEquals("ccm", model.getSpec().getServices().get(0).getSourceDir());
        Assertions.assertEquals("dxyt", model.getSpec().getServices().get(0).getEnvironmentSlug());
        Assertions.assertEquals(4658346071912083190L, model.getSpec().getServices().get(0).getHttpPort());
        Assertions.assertEquals(3221959502351885450L, model.getSpec().getServices().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.BASIC_XXS,
                model.getSpec().getServices().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("fbkp", model.getSpec().getStaticSites().get(0).getName());
        Assertions.assertEquals("ndnhj", model.getSpec().getStaticSites().get(0).getDockerfilePath());
        Assertions.assertEquals("uwhvylwzbtdhxujz", model.getSpec().getStaticSites().get(0).getBuildCommand());
        Assertions.assertEquals("mpowuwpr", model.getSpec().getStaticSites().get(0).getRunCommand());
        Assertions.assertEquals("lve", model.getSpec().getStaticSites().get(0).getSourceDir());
        Assertions.assertEquals("upjm", model.getSpec().getStaticSites().get(0).getEnvironmentSlug());
        Assertions.assertEquals("twm", model.getSpec().getStaticSites().get(0).getIndexDocument());
        Assertions.assertEquals("ytdxwit", model.getSpec().getStaticSites().get(0).getErrorDocument());
        Assertions.assertEquals("rjaw", model.getSpec().getStaticSites().get(0).getCatchallDocument());
        Assertions.assertEquals("wgxhn", model.getSpec().getStaticSites().get(0).getOutputDir());
        Assertions.assertEquals("pu", model.getSpec().getJobs().get(0).getName());
        Assertions.assertEquals("gylgqgitxmedjvcs", model.getSpec().getJobs().get(0).getDockerfilePath());
        Assertions.assertEquals("n", model.getSpec().getJobs().get(0).getBuildCommand());
        Assertions.assertEquals("wncwzzhxgktrmg", model.getSpec().getJobs().get(0).getRunCommand());
        Assertions.assertEquals("napkteoellw", model.getSpec().getJobs().get(0).getSourceDir());
        Assertions.assertEquals("d", model.getSpec().getJobs().get(0).getEnvironmentSlug());
        Assertions.assertEquals(AppJobSpecKind.FAILED_DEPLOY, model.getSpec().getJobs().get(0).getKind());
        Assertions.assertEquals(2295956833517690823L, model.getSpec().getJobs().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALL,
                model.getSpec().getJobs().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("wfbkrvrns", model.getSpec().getWorkers().get(0).getName());
        Assertions.assertEquals("hxcr", model.getSpec().getWorkers().get(0).getDockerfilePath());
        Assertions.assertEquals("fovasr", model.getSpec().getWorkers().get(0).getBuildCommand());
        Assertions.assertEquals("v", model.getSpec().getWorkers().get(0).getRunCommand());
        Assertions.assertEquals("hsqfsubcgjbirxbp", model.getSpec().getWorkers().get(0).getSourceDir());
        Assertions.assertEquals("rfbjf", model.getSpec().getWorkers().get(0).getEnvironmentSlug());
        Assertions.assertEquals(3681757867502856948L, model.getSpec().getWorkers().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALM,
                model.getSpec().getWorkers().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("ayqigynduhav", model.getSpec().getFunctions().get(0).getName());
        Assertions.assertEquals("lkthu", model.getSpec().getFunctions().get(0).getSourceDir());
        Assertions.assertEquals("uie", model.getSpec().getDatabases().get(0).getClusterName());
        Assertions.assertEquals("gccymvaolpssl", model.getSpec().getDatabases().get(0).getDbName());
        Assertions.assertEquals("fmmdnbbg", model.getSpec().getDatabases().get(0).getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.PG, model.getSpec().getDatabases().get(0).getEngine());
        Assertions.assertEquals("swiydmcwyhzdx", model.getSpec().getDatabases().get(0).getName());
        Assertions.assertEquals(true, model.getSpec().getDatabases().get(0).isProduction());
        Assertions.assertEquals("bzmnvdfznud", model.getSpec().getDatabases().get(0).getVersion());
        Assertions.assertEquals("srzdzucerscdn", model.getPinnedDeployment().getCause());
        Assertions.assertEquals("evfiwjmygt", model.getPinnedDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-01T16:24:58Z"), model.getPinnedDeployment().getCreatedAt());
        Assertions.assertEquals("s", model.getPinnedDeployment().getId());
        Assertions.assertEquals("eriofzpyqs", model.getPinnedDeployment().getJobs().get(0).getName());
        Assertions.assertEquals("wab", model.getPinnedDeployment().getJobs().get(0).getSourceCommitHash());
        Assertions.assertEquals("eqqkdltfzxm", model.getPinnedDeployment().getFunctions().get(0).getName());
        Assertions.assertEquals("v", model.getPinnedDeployment().getFunctions().get(0).getSourceCommitHash());
        Assertions.assertEquals("ur", model.getPinnedDeployment().getFunctions().get(0).getNamespace());
        Assertions.assertEquals(AppsDeploymentPhase.PENDING_DEPLOY, model.getPinnedDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-04T05:57:56Z"), model.getPinnedDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(738915892, model.getPinnedDeployment().getProgress().getErrorSteps());
        Assertions.assertEquals(284153241, model.getPinnedDeployment().getProgress().getPendingSteps());
        Assertions.assertEquals(566352608, model.getPinnedDeployment().getProgress().getRunningSteps());
        Assertions.assertEquals(1065910925, model.getPinnedDeployment().getProgress().getSuccessSteps());
        Assertions.assertEquals(904231635, model.getPinnedDeployment().getProgress().getTotalSteps());
        Assertions.assertEquals("muvp", model.getPinnedDeployment().getServices().get(0).getName());
        Assertions.assertEquals("tdum", model.getPinnedDeployment().getServices().get(0).getSourceCommitHash());
        Assertions.assertEquals("p", model.getPinnedDeployment().getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.FRA, model.getPinnedDeployment().getSpec().getRegion());
        Assertions.assertEquals("dneu", model.getPinnedDeployment().getStaticSites().get(0).getName());
        Assertions.assertEquals(
                "fphsdyhtozfikdow", model.getPinnedDeployment().getStaticSites().get(0).getSourceCommitHash());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-08-29T01:48:19Z"), model.getPinnedDeployment().getUpdatedAt());
        Assertions.assertEquals("jnkaljutiiswacff", model.getPinnedDeployment().getWorkers().get(0).getName());
        Assertions.assertEquals("k", model.getPinnedDeployment().getWorkers().get(0).getSourceCommitHash());
    }

    @Test
    public void testSerialize() {
        App model =
                new App()
                        .setActiveDeployment(
                                new AppsDeployment()
                                        .setCause("yifqrvkdvjsllrmv")
                                        .setClonedFrom("f")
                                        .setCreatedAt(OffsetDateTime.parse("2021-12-05T03:26:34Z"))
                                        .setId("pnpulexxbczwtru")
                                        .setJobs(
                                                Arrays.asList(
                                                        new AppsDeploymentJob()
                                                                .setName("bq")
                                                                .setSourceCommitHash("sovmyokacspkwl"),
                                                        new AppsDeploymentJob()
                                                                .setName("dobpxjmflbvvn")
                                                                .setSourceCommitHash("rkcciwwzjuqk"),
                                                        new AppsDeploymentJob()
                                                                .setName("sa")
                                                                .setSourceCommitHash("wkuofoskghsauu")))
                                        .setFunctions(
                                                Arrays.asList(
                                                        new AppsDeploymentFunctions()
                                                                .setName("vxieduugidyj")
                                                                .setSourceCommitHash("f")
                                                                .setNamespace("aos"),
                                                        new AppsDeploymentFunctions()
                                                                .setName("xc")
                                                                .setSourceCommitHash("npc")
                                                                .setNamespace("ocohslkevleg")))
                                        .setPhase(AppsDeploymentPhase.UNKNOWN)
                                        .setPhaseLastUpdatedAt(OffsetDateTime.parse("2021-09-05T06:09:57Z"))
                                        .setProgress(
                                                new AppsDeploymentProgress()
                                                        .setErrorSteps(1240175495)
                                                        .setPendingSteps(53032115)
                                                        .setRunningSteps(183778088)
                                                        .setSteps(Arrays.asList())
                                                        .setSuccessSteps(441262471)
                                                        .setSummarySteps(Arrays.asList())
                                                        .setTotalSteps(378191098))
                                        .setServices(
                                                Arrays.asList(
                                                        new AppsDeploymentService()
                                                                .setName("ez")
                                                                .setSourceCommitHash("shxmzsbbzoggigrx"),
                                                        new AppsDeploymentService()
                                                                .setName("ur")
                                                                .setSourceCommitHash("xxjnspydptk")))
                                        .setSpec(
                                                new AppSpec()
                                                        .setName("nkoukn")
                                                        .setRegion(AppSpecRegion.FRA)
                                                        .setDomains(Arrays.asList())
                                                        .setServices(Arrays.asList())
                                                        .setStaticSites(Arrays.asList())
                                                        .setJobs(Arrays.asList())
                                                        .setWorkers(Arrays.asList())
                                                        .setFunctions(Arrays.asList())
                                                        .setDatabases(Arrays.asList()))
                                        .setStaticSites(
                                                Arrays.asList(
                                                        new AppsDeploymentStaticSite()
                                                                .setName("z")
                                                                .setSourceCommitHash("o"),
                                                        new AppsDeploymentStaticSite()
                                                                .setName("ukgjnpiucgygevq")
                                                                .setSourceCommitHash("typmrbpizcdrqjsd"),
                                                        new AppsDeploymentStaticSite()
                                                                .setName("dnfyhxdeoejzicwi")
                                                                .setSourceCommitHash("jttgzf")))
                                        .setUpdatedAt(OffsetDateTime.parse("2021-04-08T03:04:22Z"))
                                        .setWorkers(
                                                Arrays.asList(
                                                        new AppsDeploymentWorker()
                                                                .setName("buxwgip")
                                                                .setSourceCommitHash("onowk"),
                                                        new AppsDeploymentWorker()
                                                                .setName("hwankixzbinjepu")
                                                                .setSourceCommitHash("mryw"),
                                                        new AppsDeploymentWorker()
                                                                .setName("zoqftiyqzrnkcqvy")
                                                                .setSourceCommitHash("whzlsicohoq"),
                                                        new AppsDeploymentWorker()
                                                                .setName("wvl")
                                                                .setSourceCommitHash("avwhheunm"))))
                        .setInProgressDeployment(
                                new AppsDeployment()
                                        .setCause("ncghkje")
                                        .setClonedFrom("zhbijhtxfv")
                                        .setCreatedAt(OffsetDateTime.parse("2021-10-21T07:58:39Z"))
                                        .setId("smx")
                                        .setJobs(
                                                Arrays.asList(
                                                        new AppsDeploymentJob()
                                                                .setName("pvecxgodeb")
                                                                .setSourceCommitHash("kk"),
                                                        new AppsDeploymentJob()
                                                                .setName("mpukgriw")
                                                                .setSourceCommitHash("zlfbxzpuzycispnq")))
                                        .setFunctions(
                                                Arrays.asList(
                                                        new AppsDeploymentFunctions()
                                                                .setName("gkbrpyyd")
                                                                .setSourceCommitHash("bnuqqkpik")
                                                                .setNamespace("rgvtqag"),
                                                        new AppsDeploymentFunctions()
                                                                .setName("uynhijg")
                                                                .setSourceCommitHash("ebf")
                                                                .setNamespace("arbu"),
                                                        new AppsDeploymentFunctions()
                                                                .setName("cvpnazzmhjrunmpx")
                                                                .setSourceCommitHash("dbhrbnlankxm")
                                                                .setNamespace("k")))
                                        .setPhase(AppsDeploymentPhase.BUILDING)
                                        .setPhaseLastUpdatedAt(OffsetDateTime.parse("2021-05-05T04:59:18Z"))
                                        .setProgress(
                                                new AppsDeploymentProgress()
                                                        .setErrorSteps(2131694851)
                                                        .setPendingSteps(2016648328)
                                                        .setRunningSteps(83692384)
                                                        .setSteps(Arrays.asList())
                                                        .setSuccessSteps(782555579)
                                                        .setSummarySteps(Arrays.asList())
                                                        .setTotalSteps(815551540))
                                        .setServices(
                                                Arrays.asList(
                                                        new AppsDeploymentService()
                                                                .setName("dybyxczfclhaa")
                                                                .setSourceCommitHash("babphlwrqlfk"),
                                                        new AppsDeploymentService()
                                                                .setName("thsu")
                                                                .setSourceCommitHash("cmnyyazttb")))
                                        .setSpec(
                                                new AppSpec()
                                                        .setName("wrqpue")
                                                        .setRegion(AppSpecRegion.AMS)
                                                        .setDomains(Arrays.asList())
                                                        .setServices(Arrays.asList())
                                                        .setStaticSites(Arrays.asList())
                                                        .setJobs(Arrays.asList())
                                                        .setWorkers(Arrays.asList())
                                                        .setFunctions(Arrays.asList())
                                                        .setDatabases(Arrays.asList()))
                                        .setStaticSites(
                                                Arrays.asList(
                                                        new AppsDeploymentStaticSite()
                                                                .setName("xujwbhqwalmuzyo")
                                                                .setSourceCommitHash("epdkzja")))
                                        .setUpdatedAt(OffsetDateTime.parse("2021-05-17T00:18:41Z"))
                                        .setWorkers(
                                                Arrays.asList(
                                                        new AppsDeploymentWorker()
                                                                .setName("v")
                                                                .setSourceCommitHash("niwdjsw"),
                                                        new AppsDeploymentWorker()
                                                                .setName("s")
                                                                .setSourceCommitHash("pgn"),
                                                        new AppsDeploymentWorker()
                                                                .setName("txhp")
                                                                .setSourceCommitHash("bzpfzab"),
                                                        new AppsDeploymentWorker()
                                                                .setName("cuh")
                                                                .setSourceCommitHash("tcty"))))
                        .setRegion(new AppsRegion())
                        .setSpec(
                                new AppSpec()
                                        .setName("wrupqsxvnmicykvc")
                                        .setRegion(AppSpecRegion.FRA)
                                        .setDomains(
                                                Arrays.asList(
                                                        new AppDomainSpec()
                                                                .setDomain("lo")
                                                                .setType(AppDomainSpecType.UNSPECIFIED)
                                                                .setWildcard(true)
                                                                .setZone("jfcn")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE2),
                                                        new AppDomainSpec()
                                                                .setDomain("cn")
                                                                .setType(AppDomainSpecType.PRIMARY)
                                                                .setWildcard(true)
                                                                .setZone("kphywpnvjto")
                                                                .setMinimumTlsVersion(
                                                                        AppDomainSpecMinimumTlsVersion.ONE3)))
                                        .setServices(
                                                Arrays.asList(
                                                        new AppServiceSpec()
                                                                .setName("pabgyeps")
                                                                .setDockerfilePath("ugxywpmueef")
                                                                .setBuildCommand("wfqkquj")
                                                                .setRunCommand("suyonobglaocq")
                                                                .setSourceDir("ccm")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("dxyt")
                                                                .setHttpPort(4658346071912083190L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(3221959502351885450L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASIC_XXS),
                                                        new AppServiceSpec()
                                                                .setName("txhdzh")
                                                                .setDockerfilePath("ck")
                                                                .setBuildCommand("lhrxsbkyvpyc")
                                                                .setRunCommand("uzbpzkafku")
                                                                .setSourceDir("crnwbmeh")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("yvjusrtslhsp")
                                                                .setHttpPort(1401162324207886414L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(1731749490804613022L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONAL1L),
                                                        new AppServiceSpec()
                                                                .setName("melmqkrha")
                                                                .setDockerfilePath("haquhcdh")
                                                                .setBuildCommand("ualaexqpvfadmw")
                                                                .setRunCommand("crgvxpvgom")
                                                                .setSourceDir("fmisg")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("b")
                                                                .setHttpPort(3488305487791082872L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(1461011233299690621L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONAL_XS),
                                                        new AppServiceSpec()
                                                                .setName("qhakauhashsf")
                                                                .setDockerfilePath("z")
                                                                .setBuildCommand("ugicjooxdjebw")
                                                                .setRunCommand("cwwfvovbvme")
                                                                .setSourceDir("civyhzceuo")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("rw")
                                                                .setHttpPort(2980894048729421181L)
                                                                .setInternalPorts(Arrays.asList())
                                                                .setRoutes(Arrays.asList())
                                                                .setInstanceCount(301155517903615814L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALL)))
                                        .setStaticSites(
                                                Arrays.asList(
                                                        new AppStaticSiteSpec()
                                                                .setName("fbkp")
                                                                .setDockerfilePath("ndnhj")
                                                                .setBuildCommand("uwhvylwzbtdhxujz")
                                                                .setRunCommand("mpowuwpr")
                                                                .setSourceDir("lve")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("upjm")
                                                                .setIndexDocument("twm")
                                                                .setErrorDocument("ytdxwit")
                                                                .setCatchallDocument("rjaw")
                                                                .setOutputDir("wgxhn")
                                                                .setRoutes(Arrays.asList()),
                                                        new AppStaticSiteSpec()
                                                                .setName("xiebwwaloayqcg")
                                                                .setDockerfilePath("zg")
                                                                .setBuildCommand("zmh")
                                                                .setRunCommand("ongmtsa")
                                                                .setSourceDir("cbpwxqpsrknft")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("riuhprwm")
                                                                .setIndexDocument("xobbcswsrt")
                                                                .setErrorDocument("iplrbpbewtghfgb")
                                                                .setCatchallDocument("gw")
                                                                .setOutputDir("vlvqhjkbegi")
                                                                .setRoutes(Arrays.asList()),
                                                        new AppStaticSiteSpec()
                                                                .setName("zhpvgqzcjrvxd")
                                                                .setDockerfilePath("xkvugfhzov")
                                                                .setBuildCommand("jvzunluthnnp")
                                                                .setRunCommand("xipeilpjzuaejx")
                                                                .setSourceDir("ltskzbbtd")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("veekgpwozuhkfp")
                                                                .setIndexDocument("xqtayriwwro")
                                                                .setErrorDocument("bexrmcq")
                                                                .setCatchallDocument("ycnojvknmefqsg")
                                                                .setOutputDir("ah")
                                                                .setRoutes(Arrays.asList()),
                                                        new AppStaticSiteSpec()
                                                                .setName("n")
                                                                .setDockerfilePath("yaw")
                                                                .setBuildCommand("yaqcslyjpkiidz")
                                                                .setRunCommand("xznelixhnrztf")
                                                                .setSourceDir("hb")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("nalaulppg")
                                                                .setIndexDocument("yofd")
                                                                .setErrorDocument("uusdttouwa")
                                                                .setCatchallDocument("ekqvkeln")
                                                                .setOutputDir("vbxwyjsflhh")
                                                                .setRoutes(Arrays.asList())))
                                        .setJobs(
                                                Arrays.asList(
                                                        new AppJobSpec()
                                                                .setName("pu")
                                                                .setDockerfilePath("gylgqgitxmedjvcs")
                                                                .setBuildCommand("n")
                                                                .setRunCommand("wncwzzhxgktrmg")
                                                                .setSourceDir("napkteoellw")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("d")
                                                                .setKind(AppJobSpecKind.FAILED_DEPLOY)
                                                                .setInstanceCount(2295956833517690823L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALL),
                                                        new AppJobSpec()
                                                                .setName("op")
                                                                .setDockerfilePath("uaopppcqeq")
                                                                .setBuildCommand("lzdahzxctobgbkdm")
                                                                .setRunCommand("zpostmgrcfbu")
                                                                .setSourceDir("mfqjhhkxbp")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("mjh")
                                                                .setKind(AppJobSpecKind.POST_DEPLOY)
                                                                .setInstanceCount(816546176101077379L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALL),
                                                        new AppJobSpec()
                                                                .setName("krtswbxqz")
                                                                .setDockerfilePath("uvjfdxxive")
                                                                .setBuildCommand("t")
                                                                .setRunCommand("aqtdoqmcbx")
                                                                .setSourceDir("vxysl")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("sfxobl")
                                                                .setKind(AppJobSpecKind.PREDEPLOY)
                                                                .setInstanceCount(6882060719567811961L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .BASICM)))
                                        .setWorkers(
                                                Arrays.asList(
                                                        new AppWorkerSpec()
                                                                .setName("wfbkrvrns")
                                                                .setDockerfilePath("hxcr")
                                                                .setBuildCommand("fovasr")
                                                                .setRunCommand("v")
                                                                .setSourceDir("hsqfsubcgjbirxbp")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("rfbjf")
                                                                .setInstanceCount(3681757867502856948L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALM),
                                                        new AppWorkerSpec()
                                                                .setName("tpvjzbexilzznfqq")
                                                                .setDockerfilePath("taruoujmkcj")
                                                                .setBuildCommand("qytjrybnwjewgd")
                                                                .setRunCommand("ervnaenqpehi")
                                                                .setSourceDir("oygmift")
                                                                .setEnvs(Arrays.asList())
                                                                .setEnvironmentSlug("d")
                                                                .setInstanceCount(8471863314658985713L)
                                                                .setInstanceSizeSlug(
                                                                        AppComponentInstanceBaseInstanceSizeSlug
                                                                                .PROFESSIONALM)))
                                        .setFunctions(
                                                Arrays.asList(
                                                        new AppFunctionsSpec()
                                                                .setRoutes(Arrays.asList())
                                                                .setName("ayqigynduhav")
                                                                .setSourceDir("lkthu")
                                                                .setAlerts(Arrays.asList())
                                                                .setEnvs(Arrays.asList())))
                                        .setDatabases(
                                                Arrays.asList(
                                                        new AppDatabaseSpec()
                                                                .setClusterName("uie")
                                                                .setDbName("gccymvaolpssl")
                                                                .setDbUser("fmmdnbbg")
                                                                .setEngine(AppDatabaseSpecEngine.PG)
                                                                .setName("swiydmcwyhzdx")
                                                                .setProduction(true)
                                                                .setVersion("bzmnvdfznud"))))
                        .setPinnedDeployment(
                                new AppPinnedDeployment()
                                        .setCause("srzdzucerscdn")
                                        .setClonedFrom("evfiwjmygt")
                                        .setCreatedAt(OffsetDateTime.parse("2021-07-01T16:24:58Z"))
                                        .setId("s")
                                        .setJobs(
                                                Arrays.asList(
                                                        new AppsDeploymentJob()
                                                                .setName("eriofzpyqs")
                                                                .setSourceCommitHash("wab"),
                                                        new AppsDeploymentJob()
                                                                .setName("tshhszhedp")
                                                                .setSourceCommitHash("wiwubm"),
                                                        new AppsDeploymentJob()
                                                                .setName("besldnkwwtppjflc")
                                                                .setSourceCommitHash("gaokonzmnsikv")))
                                        .setFunctions(
                                                Arrays.asList(
                                                        new AppsDeploymentFunctions()
                                                                .setName("eqqkdltfzxm")
                                                                .setSourceCommitHash("v")
                                                                .setNamespace("ur"),
                                                        new AppsDeploymentFunctions()
                                                                .setName("dkwobdagx")
                                                                .setSourceCommitHash("bqdxbx")
                                                                .setNamespace("kbogqxndlkzgx"),
                                                        new AppsDeploymentFunctions()
                                                                .setName("ripl")
                                                                .setSourceCommitHash("odxun")
                                                                .setNamespace("ebxmubyynt"),
                                                        new AppsDeploymentFunctions()
                                                                .setName("rbqtkoie")
                                                                .setSourceCommitHash("eotg")
                                                                .setNamespace("l")))
                                        .setPhase(AppsDeploymentPhase.PENDING_DEPLOY)
                                        .setPhaseLastUpdatedAt(OffsetDateTime.parse("2021-05-04T05:57:56Z"))
                                        .setProgress(
                                                new AppsDeploymentProgress()
                                                        .setErrorSteps(738915892)
                                                        .setPendingSteps(284153241)
                                                        .setRunningSteps(566352608)
                                                        .setSteps(Arrays.asList())
                                                        .setSuccessSteps(1065910925)
                                                        .setSummarySteps(Arrays.asList())
                                                        .setTotalSteps(904231635))
                                        .setServices(
                                                Arrays.asList(
                                                        new AppsDeploymentService()
                                                                .setName("muvp")
                                                                .setSourceCommitHash("tdum")))
                                        .setSpec(
                                                new AppSpec()
                                                        .setName("p")
                                                        .setRegion(AppSpecRegion.FRA)
                                                        .setDomains(Arrays.asList())
                                                        .setServices(Arrays.asList())
                                                        .setStaticSites(Arrays.asList())
                                                        .setJobs(Arrays.asList())
                                                        .setWorkers(Arrays.asList())
                                                        .setFunctions(Arrays.asList())
                                                        .setDatabases(Arrays.asList()))
                                        .setStaticSites(
                                                Arrays.asList(
                                                        new AppsDeploymentStaticSite()
                                                                .setName("dneu")
                                                                .setSourceCommitHash("fphsdyhtozfikdow"),
                                                        new AppsDeploymentStaticSite()
                                                                .setName("uuvxz")
                                                                .setSourceCommitHash("lvithhqzonosgg")))
                                        .setUpdatedAt(OffsetDateTime.parse("2021-08-29T01:48:19Z"))
                                        .setWorkers(
                                                Arrays.asList(
                                                        new AppsDeploymentWorker()
                                                                .setName("jnkaljutiiswacff")
                                                                .setSourceCommitHash("k"),
                                                        new AppsDeploymentWorker()
                                                                .setName("ewkfvhqcrai")
                                                                .setSourceCommitHash("pnppfuf"))));
        model = BinaryData.fromObject(model).toObject(App.class);
        Assertions.assertEquals("yifqrvkdvjsllrmv", model.getActiveDeployment().getCause());
        Assertions.assertEquals("f", model.getActiveDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-12-05T03:26:34Z"), model.getActiveDeployment().getCreatedAt());
        Assertions.assertEquals("pnpulexxbczwtru", model.getActiveDeployment().getId());
        Assertions.assertEquals("bq", model.getActiveDeployment().getJobs().get(0).getName());
        Assertions.assertEquals("sovmyokacspkwl", model.getActiveDeployment().getJobs().get(0).getSourceCommitHash());
        Assertions.assertEquals("vxieduugidyj", model.getActiveDeployment().getFunctions().get(0).getName());
        Assertions.assertEquals("f", model.getActiveDeployment().getFunctions().get(0).getSourceCommitHash());
        Assertions.assertEquals("aos", model.getActiveDeployment().getFunctions().get(0).getNamespace());
        Assertions.assertEquals(AppsDeploymentPhase.UNKNOWN, model.getActiveDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-05T06:09:57Z"), model.getActiveDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(1240175495, model.getActiveDeployment().getProgress().getErrorSteps());
        Assertions.assertEquals(53032115, model.getActiveDeployment().getProgress().getPendingSteps());
        Assertions.assertEquals(183778088, model.getActiveDeployment().getProgress().getRunningSteps());
        Assertions.assertEquals(441262471, model.getActiveDeployment().getProgress().getSuccessSteps());
        Assertions.assertEquals(378191098, model.getActiveDeployment().getProgress().getTotalSteps());
        Assertions.assertEquals("ez", model.getActiveDeployment().getServices().get(0).getName());
        Assertions.assertEquals(
                "shxmzsbbzoggigrx", model.getActiveDeployment().getServices().get(0).getSourceCommitHash());
        Assertions.assertEquals("nkoukn", model.getActiveDeployment().getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.FRA, model.getActiveDeployment().getSpec().getRegion());
        Assertions.assertEquals("z", model.getActiveDeployment().getStaticSites().get(0).getName());
        Assertions.assertEquals("o", model.getActiveDeployment().getStaticSites().get(0).getSourceCommitHash());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-08T03:04:22Z"), model.getActiveDeployment().getUpdatedAt());
        Assertions.assertEquals("buxwgip", model.getActiveDeployment().getWorkers().get(0).getName());
        Assertions.assertEquals("onowk", model.getActiveDeployment().getWorkers().get(0).getSourceCommitHash());
        Assertions.assertEquals("ncghkje", model.getInProgressDeployment().getCause());
        Assertions.assertEquals("zhbijhtxfv", model.getInProgressDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-21T07:58:39Z"), model.getInProgressDeployment().getCreatedAt());
        Assertions.assertEquals("smx", model.getInProgressDeployment().getId());
        Assertions.assertEquals("pvecxgodeb", model.getInProgressDeployment().getJobs().get(0).getName());
        Assertions.assertEquals("kk", model.getInProgressDeployment().getJobs().get(0).getSourceCommitHash());
        Assertions.assertEquals("gkbrpyyd", model.getInProgressDeployment().getFunctions().get(0).getName());
        Assertions.assertEquals(
                "bnuqqkpik", model.getInProgressDeployment().getFunctions().get(0).getSourceCommitHash());
        Assertions.assertEquals("rgvtqag", model.getInProgressDeployment().getFunctions().get(0).getNamespace());
        Assertions.assertEquals(AppsDeploymentPhase.BUILDING, model.getInProgressDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-05T04:59:18Z"), model.getInProgressDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(2131694851, model.getInProgressDeployment().getProgress().getErrorSteps());
        Assertions.assertEquals(2016648328, model.getInProgressDeployment().getProgress().getPendingSteps());
        Assertions.assertEquals(83692384, model.getInProgressDeployment().getProgress().getRunningSteps());
        Assertions.assertEquals(782555579, model.getInProgressDeployment().getProgress().getSuccessSteps());
        Assertions.assertEquals(815551540, model.getInProgressDeployment().getProgress().getTotalSteps());
        Assertions.assertEquals("dybyxczfclhaa", model.getInProgressDeployment().getServices().get(0).getName());
        Assertions.assertEquals(
                "babphlwrqlfk", model.getInProgressDeployment().getServices().get(0).getSourceCommitHash());
        Assertions.assertEquals("wrqpue", model.getInProgressDeployment().getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.AMS, model.getInProgressDeployment().getSpec().getRegion());
        Assertions.assertEquals("xujwbhqwalmuzyo", model.getInProgressDeployment().getStaticSites().get(0).getName());
        Assertions.assertEquals(
                "epdkzja", model.getInProgressDeployment().getStaticSites().get(0).getSourceCommitHash());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-17T00:18:41Z"), model.getInProgressDeployment().getUpdatedAt());
        Assertions.assertEquals("v", model.getInProgressDeployment().getWorkers().get(0).getName());
        Assertions.assertEquals("niwdjsw", model.getInProgressDeployment().getWorkers().get(0).getSourceCommitHash());
        Assertions.assertEquals("wrupqsxvnmicykvc", model.getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.FRA, model.getSpec().getRegion());
        Assertions.assertEquals("lo", model.getSpec().getDomains().get(0).getDomain());
        Assertions.assertEquals(AppDomainSpecType.UNSPECIFIED, model.getSpec().getDomains().get(0).getType());
        Assertions.assertEquals(true, model.getSpec().getDomains().get(0).isWildcard());
        Assertions.assertEquals("jfcn", model.getSpec().getDomains().get(0).getZone());
        Assertions.assertEquals(
                AppDomainSpecMinimumTlsVersion.ONE2, model.getSpec().getDomains().get(0).getMinimumTlsVersion());
        Assertions.assertEquals("pabgyeps", model.getSpec().getServices().get(0).getName());
        Assertions.assertEquals("ugxywpmueef", model.getSpec().getServices().get(0).getDockerfilePath());
        Assertions.assertEquals("wfqkquj", model.getSpec().getServices().get(0).getBuildCommand());
        Assertions.assertEquals("suyonobglaocq", model.getSpec().getServices().get(0).getRunCommand());
        Assertions.assertEquals("ccm", model.getSpec().getServices().get(0).getSourceDir());
        Assertions.assertEquals("dxyt", model.getSpec().getServices().get(0).getEnvironmentSlug());
        Assertions.assertEquals(4658346071912083190L, model.getSpec().getServices().get(0).getHttpPort());
        Assertions.assertEquals(3221959502351885450L, model.getSpec().getServices().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.BASIC_XXS,
                model.getSpec().getServices().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("fbkp", model.getSpec().getStaticSites().get(0).getName());
        Assertions.assertEquals("ndnhj", model.getSpec().getStaticSites().get(0).getDockerfilePath());
        Assertions.assertEquals("uwhvylwzbtdhxujz", model.getSpec().getStaticSites().get(0).getBuildCommand());
        Assertions.assertEquals("mpowuwpr", model.getSpec().getStaticSites().get(0).getRunCommand());
        Assertions.assertEquals("lve", model.getSpec().getStaticSites().get(0).getSourceDir());
        Assertions.assertEquals("upjm", model.getSpec().getStaticSites().get(0).getEnvironmentSlug());
        Assertions.assertEquals("twm", model.getSpec().getStaticSites().get(0).getIndexDocument());
        Assertions.assertEquals("ytdxwit", model.getSpec().getStaticSites().get(0).getErrorDocument());
        Assertions.assertEquals("rjaw", model.getSpec().getStaticSites().get(0).getCatchallDocument());
        Assertions.assertEquals("wgxhn", model.getSpec().getStaticSites().get(0).getOutputDir());
        Assertions.assertEquals("pu", model.getSpec().getJobs().get(0).getName());
        Assertions.assertEquals("gylgqgitxmedjvcs", model.getSpec().getJobs().get(0).getDockerfilePath());
        Assertions.assertEquals("n", model.getSpec().getJobs().get(0).getBuildCommand());
        Assertions.assertEquals("wncwzzhxgktrmg", model.getSpec().getJobs().get(0).getRunCommand());
        Assertions.assertEquals("napkteoellw", model.getSpec().getJobs().get(0).getSourceDir());
        Assertions.assertEquals("d", model.getSpec().getJobs().get(0).getEnvironmentSlug());
        Assertions.assertEquals(AppJobSpecKind.FAILED_DEPLOY, model.getSpec().getJobs().get(0).getKind());
        Assertions.assertEquals(2295956833517690823L, model.getSpec().getJobs().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALL,
                model.getSpec().getJobs().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("wfbkrvrns", model.getSpec().getWorkers().get(0).getName());
        Assertions.assertEquals("hxcr", model.getSpec().getWorkers().get(0).getDockerfilePath());
        Assertions.assertEquals("fovasr", model.getSpec().getWorkers().get(0).getBuildCommand());
        Assertions.assertEquals("v", model.getSpec().getWorkers().get(0).getRunCommand());
        Assertions.assertEquals("hsqfsubcgjbirxbp", model.getSpec().getWorkers().get(0).getSourceDir());
        Assertions.assertEquals("rfbjf", model.getSpec().getWorkers().get(0).getEnvironmentSlug());
        Assertions.assertEquals(3681757867502856948L, model.getSpec().getWorkers().get(0).getInstanceCount());
        Assertions.assertEquals(
                AppComponentInstanceBaseInstanceSizeSlug.PROFESSIONALM,
                model.getSpec().getWorkers().get(0).getInstanceSizeSlug());
        Assertions.assertEquals("ayqigynduhav", model.getSpec().getFunctions().get(0).getName());
        Assertions.assertEquals("lkthu", model.getSpec().getFunctions().get(0).getSourceDir());
        Assertions.assertEquals("uie", model.getSpec().getDatabases().get(0).getClusterName());
        Assertions.assertEquals("gccymvaolpssl", model.getSpec().getDatabases().get(0).getDbName());
        Assertions.assertEquals("fmmdnbbg", model.getSpec().getDatabases().get(0).getDbUser());
        Assertions.assertEquals(AppDatabaseSpecEngine.PG, model.getSpec().getDatabases().get(0).getEngine());
        Assertions.assertEquals("swiydmcwyhzdx", model.getSpec().getDatabases().get(0).getName());
        Assertions.assertEquals(true, model.getSpec().getDatabases().get(0).isProduction());
        Assertions.assertEquals("bzmnvdfznud", model.getSpec().getDatabases().get(0).getVersion());
        Assertions.assertEquals("srzdzucerscdn", model.getPinnedDeployment().getCause());
        Assertions.assertEquals("evfiwjmygt", model.getPinnedDeployment().getClonedFrom());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-07-01T16:24:58Z"), model.getPinnedDeployment().getCreatedAt());
        Assertions.assertEquals("s", model.getPinnedDeployment().getId());
        Assertions.assertEquals("eriofzpyqs", model.getPinnedDeployment().getJobs().get(0).getName());
        Assertions.assertEquals("wab", model.getPinnedDeployment().getJobs().get(0).getSourceCommitHash());
        Assertions.assertEquals("eqqkdltfzxm", model.getPinnedDeployment().getFunctions().get(0).getName());
        Assertions.assertEquals("v", model.getPinnedDeployment().getFunctions().get(0).getSourceCommitHash());
        Assertions.assertEquals("ur", model.getPinnedDeployment().getFunctions().get(0).getNamespace());
        Assertions.assertEquals(AppsDeploymentPhase.PENDING_DEPLOY, model.getPinnedDeployment().getPhase());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-04T05:57:56Z"), model.getPinnedDeployment().getPhaseLastUpdatedAt());
        Assertions.assertEquals(738915892, model.getPinnedDeployment().getProgress().getErrorSteps());
        Assertions.assertEquals(284153241, model.getPinnedDeployment().getProgress().getPendingSteps());
        Assertions.assertEquals(566352608, model.getPinnedDeployment().getProgress().getRunningSteps());
        Assertions.assertEquals(1065910925, model.getPinnedDeployment().getProgress().getSuccessSteps());
        Assertions.assertEquals(904231635, model.getPinnedDeployment().getProgress().getTotalSteps());
        Assertions.assertEquals("muvp", model.getPinnedDeployment().getServices().get(0).getName());
        Assertions.assertEquals("tdum", model.getPinnedDeployment().getServices().get(0).getSourceCommitHash());
        Assertions.assertEquals("p", model.getPinnedDeployment().getSpec().getName());
        Assertions.assertEquals(AppSpecRegion.FRA, model.getPinnedDeployment().getSpec().getRegion());
        Assertions.assertEquals("dneu", model.getPinnedDeployment().getStaticSites().get(0).getName());
        Assertions.assertEquals(
                "fphsdyhtozfikdow", model.getPinnedDeployment().getStaticSites().get(0).getSourceCommitHash());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-08-29T01:48:19Z"), model.getPinnedDeployment().getUpdatedAt());
        Assertions.assertEquals("jnkaljutiiswacff", model.getPinnedDeployment().getWorkers().get(0).getName());
        Assertions.assertEquals("k", model.getPinnedDeployment().getWorkers().get(0).getSourceCommitHash());
    }
}