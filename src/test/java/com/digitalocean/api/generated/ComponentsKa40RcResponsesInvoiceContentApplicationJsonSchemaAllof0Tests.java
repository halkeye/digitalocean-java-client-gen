package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ComponentsKa40RcResponsesInvoiceContentApplicationJsonSchemaAllof0;
import com.digitalocean.api.models.InvoiceItem;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentsKa40RcResponsesInvoiceContentApplicationJsonSchemaAllof0Tests {
    @Test
    public void testDeserialize() {
        ComponentsKa40RcResponsesInvoiceContentApplicationJsonSchemaAllof0 model =
                BinaryData.fromString(
                                "{\"invoice_items\":[{\"product\":\"vawu\",\"resource_uuid\":\"qjtiogqgdm\",\"resource_id\":\"i\",\"group_description\":\"teajohiyg\",\"description\":\"n\",\"amount\":\"n\",\"duration\":\"czykmktpvw\",\"duration_unit\":\"csehchkhufm\",\"start_time\":\"umqy\",\"end_time\":\"ydzulodsaeuzan\",\"project_name\":\"fnhsenwphp\"},{\"product\":\"ngqjclidf\",\"resource_uuid\":\"jwjj\",\"resource_id\":\"wbeqrkuor\",\"group_description\":\"ssruqnmdvhazcvj\",\"description\":\"iqswbqer\",\"amount\":\"xiytxtdgukvl\",\"duration\":\"ktg\",\"duration_unit\":\"tyouambewreswmow\",\"start_time\":\"mmuteyxeyguq\",\"end_time\":\"ijiitns\",\"project_name\":\"lz\"},{\"product\":\"sygrijwa\",\"resource_uuid\":\"fanraybfu\",\"resource_id\":\"frojsydgr\",\"group_description\":\"dkygywezski\",\"description\":\"afygzmxieqvds\",\"amount\":\"klixqcahyhxaly\",\"duration\":\"awoijp\",\"duration_unit\":\"tblxpkkwjdjodqhy\",\"start_time\":\"ncn\",\"end_time\":\"mehllizhceu\",\"project_name\":\"qodkadppyibngql\"},{\"product\":\"ywrxw\",\"resource_uuid\":\"dtluvvadswzsn\",\"resource_id\":\"emlowuowhl\",\"group_description\":\"nwyrmouv\",\"description\":\"gmokzkltrfowt\",\"amount\":\"rfmvlihcvjdrqcrj\",\"duration\":\"h\",\"duration_unit\":\"ukvhd\",\"start_time\":\"wyojbfqzdkfnjyi\",\"end_time\":\"afr\",\"project_name\":\"qxmbjroumzzn\"}]}")
                        .toObject(ComponentsKa40RcResponsesInvoiceContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("vawu", model.getInvoiceItems().get(0).getProduct());
        Assertions.assertEquals("qjtiogqgdm", model.getInvoiceItems().get(0).getResourceUuid());
        Assertions.assertEquals("i", model.getInvoiceItems().get(0).getResourceId());
        Assertions.assertEquals("teajohiyg", model.getInvoiceItems().get(0).getGroupDescription());
        Assertions.assertEquals("n", model.getInvoiceItems().get(0).getDescription());
        Assertions.assertEquals("n", model.getInvoiceItems().get(0).getAmount());
        Assertions.assertEquals("czykmktpvw", model.getInvoiceItems().get(0).getDuration());
        Assertions.assertEquals("csehchkhufm", model.getInvoiceItems().get(0).getDurationUnit());
        Assertions.assertEquals("umqy", model.getInvoiceItems().get(0).getStartTime());
        Assertions.assertEquals("ydzulodsaeuzan", model.getInvoiceItems().get(0).getEndTime());
        Assertions.assertEquals("fnhsenwphp", model.getInvoiceItems().get(0).getProjectName());
    }

    @Test
    public void testSerialize() {
        ComponentsKa40RcResponsesInvoiceContentApplicationJsonSchemaAllof0 model =
                new ComponentsKa40RcResponsesInvoiceContentApplicationJsonSchemaAllof0()
                        .setInvoiceItems(
                                Arrays.asList(
                                        new InvoiceItem()
                                                .setProduct("vawu")
                                                .setResourceUuid("qjtiogqgdm")
                                                .setResourceId("i")
                                                .setGroupDescription("teajohiyg")
                                                .setDescription("n")
                                                .setAmount("n")
                                                .setDuration("czykmktpvw")
                                                .setDurationUnit("csehchkhufm")
                                                .setStartTime("umqy")
                                                .setEndTime("ydzulodsaeuzan")
                                                .setProjectName("fnhsenwphp"),
                                        new InvoiceItem()
                                                .setProduct("ngqjclidf")
                                                .setResourceUuid("jwjj")
                                                .setResourceId("wbeqrkuor")
                                                .setGroupDescription("ssruqnmdvhazcvj")
                                                .setDescription("iqswbqer")
                                                .setAmount("xiytxtdgukvl")
                                                .setDuration("ktg")
                                                .setDurationUnit("tyouambewreswmow")
                                                .setStartTime("mmuteyxeyguq")
                                                .setEndTime("ijiitns")
                                                .setProjectName("lz"),
                                        new InvoiceItem()
                                                .setProduct("sygrijwa")
                                                .setResourceUuid("fanraybfu")
                                                .setResourceId("frojsydgr")
                                                .setGroupDescription("dkygywezski")
                                                .setDescription("afygzmxieqvds")
                                                .setAmount("klixqcahyhxaly")
                                                .setDuration("awoijp")
                                                .setDurationUnit("tblxpkkwjdjodqhy")
                                                .setStartTime("ncn")
                                                .setEndTime("mehllizhceu")
                                                .setProjectName("qodkadppyibngql"),
                                        new InvoiceItem()
                                                .setProduct("ywrxw")
                                                .setResourceUuid("dtluvvadswzsn")
                                                .setResourceId("emlowuowhl")
                                                .setGroupDescription("nwyrmouv")
                                                .setDescription("gmokzkltrfowt")
                                                .setAmount("rfmvlihcvjdrqcrj")
                                                .setDuration("h")
                                                .setDurationUnit("ukvhd")
                                                .setStartTime("wyojbfqzdkfnjyi")
                                                .setEndTime("afr")
                                                .setProjectName("qxmbjroumzzn")));
        model =
                BinaryData.fromObject(model)
                        .toObject(ComponentsKa40RcResponsesInvoiceContentApplicationJsonSchemaAllof0.class);
        Assertions.assertEquals("vawu", model.getInvoiceItems().get(0).getProduct());
        Assertions.assertEquals("qjtiogqgdm", model.getInvoiceItems().get(0).getResourceUuid());
        Assertions.assertEquals("i", model.getInvoiceItems().get(0).getResourceId());
        Assertions.assertEquals("teajohiyg", model.getInvoiceItems().get(0).getGroupDescription());
        Assertions.assertEquals("n", model.getInvoiceItems().get(0).getDescription());
        Assertions.assertEquals("n", model.getInvoiceItems().get(0).getAmount());
        Assertions.assertEquals("czykmktpvw", model.getInvoiceItems().get(0).getDuration());
        Assertions.assertEquals("csehchkhufm", model.getInvoiceItems().get(0).getDurationUnit());
        Assertions.assertEquals("umqy", model.getInvoiceItems().get(0).getStartTime());
        Assertions.assertEquals("ydzulodsaeuzan", model.getInvoiceItems().get(0).getEndTime());
        Assertions.assertEquals("fnhsenwphp", model.getInvoiceItems().get(0).getProjectName());
    }
}
