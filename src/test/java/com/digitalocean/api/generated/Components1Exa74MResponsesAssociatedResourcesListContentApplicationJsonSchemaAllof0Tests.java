package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AssociatedResource;
import com.digitalocean.api.models.Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"reserved_ips\":[{\"id\":\"ikwepwogggicw\",\"name\":\"htfmcqbsudzpgc\",\"cost\":\"pgfqum\"},{\"id\":\"jxhzghgo\",\"name\":\"ynrceqavfdbdf\",\"cost\":\"xjdnajuo\"},{\"id\":\"y\",\"name\":\"mk\",\"cost\":\"hvcw\"},{\"id\":\"q\",\"name\":\"jk\",\"cost\":\"xxr\"}],\"floating_ips\":[{\"id\":\"uzmsxgam\",\"name\":\"tkwppthuzd\",\"cost\":\"mimrljdpoqfxyemh\"},{\"id\":\"tbaewhte\",\"name\":\"oamfmxtllfltymqc\",\"cost\":\"rfijhggabq\"},{\"id\":\"amklilirwdv\",\"name\":\"hsdp\",\"cost\":\"uhktq\"}],\"snapshots\":[{\"id\":\"qnjxrdfddtul\",\"name\":\"gtavczcxdfwea\",\"cost\":\"fmlxrljphr\"},{\"id\":\"pifleimixl\",\"name\":\"bg\",\"cost\":\"ehfgsm\"},{\"id\":\"juqbpx\",\"name\":\"kljmtznpaxwfq\",\"cost\":\"yqiprclt\"}],\"volumes\":[{\"id\":\"s\",\"name\":\"jck\",\"cost\":\"i\"},{\"id\":\"b\",\"name\":\"ckgk\",\"cost\":\"ksw\"},{\"id\":\"iqqcq\",\"name\":\"clsmal\",\"cost\":\"swoykdn\"},{\"id\":\"aaxwmgzr\",\"name\":\"lqcwnynll\",\"cost\":\"q\"}],\"volume_snapshots\":[{\"id\":\"vs\",\"name\":\"sertoxadhxuvjh\",\"cost\":\"nrqstjcmetwmlg\"},{\"id\":\"vnpvvd\",\"name\":\"jnaqyq\",\"cost\":\"slz\"},{\"id\":\"cdsvmwbitek\",\"name\":\"fobvfiybxqich\",\"cost\":\"bfzdqekiv\"},{\"id\":\"p\",\"name\":\"vdizulrqtbh\",\"cost\":\"ezp\"}]}")
                        .toObject(
                                Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0
                                        .class);
        Assertions.assertEquals("ikwepwogggicw", model.getReservedIps().get(0).getId());
        Assertions.assertEquals("htfmcqbsudzpgc", model.getReservedIps().get(0).getName());
        Assertions.assertEquals("pgfqum", model.getReservedIps().get(0).getCost());
        Assertions.assertEquals("uzmsxgam", model.getFloatingIps().get(0).getId());
        Assertions.assertEquals("tkwppthuzd", model.getFloatingIps().get(0).getName());
        Assertions.assertEquals("mimrljdpoqfxyemh", model.getFloatingIps().get(0).getCost());
        Assertions.assertEquals("qnjxrdfddtul", model.getSnapshots().get(0).getId());
        Assertions.assertEquals("gtavczcxdfwea", model.getSnapshots().get(0).getName());
        Assertions.assertEquals("fmlxrljphr", model.getSnapshots().get(0).getCost());
        Assertions.assertEquals("s", model.getVolumes().get(0).getId());
        Assertions.assertEquals("jck", model.getVolumes().get(0).getName());
        Assertions.assertEquals("i", model.getVolumes().get(0).getCost());
        Assertions.assertEquals("vs", model.getVolumeSnapshots().get(0).getId());
        Assertions.assertEquals("sertoxadhxuvjh", model.getVolumeSnapshots().get(0).getName());
        Assertions.assertEquals("nrqstjcmetwmlg", model.getVolumeSnapshots().get(0).getCost());
    }

    @Test
    public void testSerialize() {
        Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0 model =
                new Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0()
                        .setReservedIps(
                                Arrays.asList(
                                        new AssociatedResource()
                                                .setId("ikwepwogggicw")
                                                .setName("htfmcqbsudzpgc")
                                                .setCost("pgfqum"),
                                        new AssociatedResource()
                                                .setId("jxhzghgo")
                                                .setName("ynrceqavfdbdf")
                                                .setCost("xjdnajuo"),
                                        new AssociatedResource().setId("y").setName("mk").setCost("hvcw"),
                                        new AssociatedResource().setId("q").setName("jk").setCost("xxr")))
                        .setFloatingIps(
                                Arrays.asList(
                                        new AssociatedResource()
                                                .setId("uzmsxgam")
                                                .setName("tkwppthuzd")
                                                .setCost("mimrljdpoqfxyemh"),
                                        new AssociatedResource()
                                                .setId("tbaewhte")
                                                .setName("oamfmxtllfltymqc")
                                                .setCost("rfijhggabq"),
                                        new AssociatedResource().setId("amklilirwdv").setName("hsdp").setCost("uhktq")))
                        .setSnapshots(
                                Arrays.asList(
                                        new AssociatedResource()
                                                .setId("qnjxrdfddtul")
                                                .setName("gtavczcxdfwea")
                                                .setCost("fmlxrljphr"),
                                        new AssociatedResource().setId("pifleimixl").setName("bg").setCost("ehfgsm"),
                                        new AssociatedResource()
                                                .setId("juqbpx")
                                                .setName("kljmtznpaxwfq")
                                                .setCost("yqiprclt")))
                        .setVolumes(
                                Arrays.asList(
                                        new AssociatedResource().setId("s").setName("jck").setCost("i"),
                                        new AssociatedResource().setId("b").setName("ckgk").setCost("ksw"),
                                        new AssociatedResource().setId("iqqcq").setName("clsmal").setCost("swoykdn"),
                                        new AssociatedResource().setId("aaxwmgzr").setName("lqcwnynll").setCost("q")))
                        .setVolumeSnapshots(
                                Arrays.asList(
                                        new AssociatedResource()
                                                .setId("vs")
                                                .setName("sertoxadhxuvjh")
                                                .setCost("nrqstjcmetwmlg"),
                                        new AssociatedResource().setId("vnpvvd").setName("jnaqyq").setCost("slz"),
                                        new AssociatedResource()
                                                .setId("cdsvmwbitek")
                                                .setName("fobvfiybxqich")
                                                .setCost("bfzdqekiv"),
                                        new AssociatedResource().setId("p").setName("vdizulrqtbh").setCost("ezp")));
        model =
                BinaryData.fromObject(model)
                        .toObject(
                                Components1Exa74MResponsesAssociatedResourcesListContentApplicationJsonSchemaAllof0
                                        .class);
        Assertions.assertEquals("ikwepwogggicw", model.getReservedIps().get(0).getId());
        Assertions.assertEquals("htfmcqbsudzpgc", model.getReservedIps().get(0).getName());
        Assertions.assertEquals("pgfqum", model.getReservedIps().get(0).getCost());
        Assertions.assertEquals("uzmsxgam", model.getFloatingIps().get(0).getId());
        Assertions.assertEquals("tkwppthuzd", model.getFloatingIps().get(0).getName());
        Assertions.assertEquals("mimrljdpoqfxyemh", model.getFloatingIps().get(0).getCost());
        Assertions.assertEquals("qnjxrdfddtul", model.getSnapshots().get(0).getId());
        Assertions.assertEquals("gtavczcxdfwea", model.getSnapshots().get(0).getName());
        Assertions.assertEquals("fmlxrljphr", model.getSnapshots().get(0).getCost());
        Assertions.assertEquals("s", model.getVolumes().get(0).getId());
        Assertions.assertEquals("jck", model.getVolumes().get(0).getName());
        Assertions.assertEquals("i", model.getVolumes().get(0).getCost());
        Assertions.assertEquals("vs", model.getVolumeSnapshots().get(0).getId());
        Assertions.assertEquals("sertoxadhxuvjh", model.getVolumeSnapshots().get(0).getName());
        Assertions.assertEquals("nrqstjcmetwmlg", model.getVolumeSnapshots().get(0).getCost());
    }
}
