package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.InvoiceSummary;
import com.digitalocean.api.models.InvoiceSummaryCreditsAndAdjustments;
import com.digitalocean.api.models.InvoiceSummaryOverages;
import com.digitalocean.api.models.InvoiceSummaryProductCharges;
import com.digitalocean.api.models.InvoiceSummaryTaxes;
import com.digitalocean.api.models.InvoiceSummaryUserBillingAddress;
import com.digitalocean.api.models.ProductChargeItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class InvoiceSummaryTests {
    @Test
    public void testDeserialize() {
        InvoiceSummary model = BinaryData.fromString("{\"invoice_uuid\":\"iisb\",\"billing_period\":\"nppcce\",\"amount\":\"ztdsbeza\",\"user_name\":\"f\",\"user_billing_address\":{\"address_line1\":\"xuizhyhnepkpet\",\"address_line2\":\"rx\",\"city\":\"ubxdukecpxdazvdh\",\"region\":\"mmkoszudb\",\"postal_code\":\"s\",\"country_iso2_code\":\"rpcaqkiofkbtf\",\"created_at\":\"kl\",\"updated_at\":\"l\"},\"user_company\":\"vcb\",\"user_email\":\"ezyquw\",\"product_charges\":{\"name\":\"xut\",\"amount\":\"brruyuuatv\",\"items\":[{\"amount\":\"wcolbmxl\",\"name\":\"w\",\"count\":\"cpahprzrvxhm\"},{\"amount\":\"hocn\",\"name\":\"cmj\",\"count\":\"gxnoqrxtdis\"},{\"amount\":\"evhdlmydid\",\"name\":\"epfwwt\",\"count\":\"doesxxhmwcdb\"}]},\"overages\":{\"name\":\"oikxkxhnegk\",\"amount\":\"z\"},\"taxes\":{\"name\":\"t\",\"amount\":\"plvukaobrlbpg\"},\"credits_and_adjustments\":{\"name\":\"agnchjhgemuowaky\",\"amount\":\"lhjym\"}}").toObject(InvoiceSummary.class);
        Assertions.assertEquals("iisb", model.getInvoiceUuid());
        Assertions.assertEquals("nppcce", model.getBillingPeriod());
        Assertions.assertEquals("ztdsbeza", model.getAmount());
        Assertions.assertEquals("f", model.getUserName());
        Assertions.assertEquals("xuizhyhnepkpet", model.getUserBillingAddress().getAddressLine1());
        Assertions.assertEquals("rx", model.getUserBillingAddress().getAddressLine2());
        Assertions.assertEquals("ubxdukecpxdazvdh", model.getUserBillingAddress().getCity());
        Assertions.assertEquals("mmkoszudb", model.getUserBillingAddress().getRegion());
        Assertions.assertEquals("s", model.getUserBillingAddress().getPostalCode());
        Assertions.assertEquals("rpcaqkiofkbtf", model.getUserBillingAddress().getCountryIso2Code());
        Assertions.assertEquals("kl", model.getUserBillingAddress().getCreatedAt());
        Assertions.assertEquals("l", model.getUserBillingAddress().getUpdatedAt());
        Assertions.assertEquals("vcb", model.getUserCompany());
        Assertions.assertEquals("ezyquw", model.getUserEmail());
        Assertions.assertEquals("xut", model.getProductCharges().getName());
        Assertions.assertEquals("brruyuuatv", model.getProductCharges().getAmount());
        Assertions.assertEquals("wcolbmxl", model.getProductCharges().getItems().get(0).getAmount());
        Assertions.assertEquals("w", model.getProductCharges().getItems().get(0).getName());
        Assertions.assertEquals("cpahprzrvxhm", model.getProductCharges().getItems().get(0).getCount());
        Assertions.assertEquals("oikxkxhnegk", model.getOverages().getName());
        Assertions.assertEquals("z", model.getOverages().getAmount());
        Assertions.assertEquals("t", model.getTaxes().getName());
        Assertions.assertEquals("plvukaobrlbpg", model.getTaxes().getAmount());
        Assertions.assertEquals("agnchjhgemuowaky", model.getCreditsAndAdjustments().getName());
        Assertions.assertEquals("lhjym", model.getCreditsAndAdjustments().getAmount());
    }

    @Test
    public void testSerialize() {
        InvoiceSummary model = new InvoiceSummary().setInvoiceUuid("iisb").setBillingPeriod("nppcce").setAmount("ztdsbeza").setUserName("f").setUserBillingAddress(new InvoiceSummaryUserBillingAddress().setAddressLine1("xuizhyhnepkpet").setAddressLine2("rx").setCity("ubxdukecpxdazvdh").setRegion("mmkoszudb").setPostalCode("s").setCountryIso2Code("rpcaqkiofkbtf").setCreatedAt("kl").setUpdatedAt("l")).setUserCompany("vcb").setUserEmail("ezyquw").setProductCharges(new InvoiceSummaryProductCharges().setName("xut").setAmount("brruyuuatv").setItems(Arrays.asList(new ProductChargeItem().setAmount("wcolbmxl").setName("w").setCount("cpahprzrvxhm"), new ProductChargeItem().setAmount("hocn").setName("cmj").setCount("gxnoqrxtdis"), new ProductChargeItem().setAmount("evhdlmydid").setName("epfwwt").setCount("doesxxhmwcdb")))).setOverages(new InvoiceSummaryOverages().setName("oikxkxhnegk").setAmount("z")).setTaxes(new InvoiceSummaryTaxes().setName("t").setAmount("plvukaobrlbpg")).setCreditsAndAdjustments(new InvoiceSummaryCreditsAndAdjustments().setName("agnchjhgemuowaky").setAmount("lhjym"));
        model = BinaryData.fromObject(model).toObject(InvoiceSummary.class);
        Assertions.assertEquals("iisb", model.getInvoiceUuid());
        Assertions.assertEquals("nppcce", model.getBillingPeriod());
        Assertions.assertEquals("ztdsbeza", model.getAmount());
        Assertions.assertEquals("f", model.getUserName());
        Assertions.assertEquals("xuizhyhnepkpet", model.getUserBillingAddress().getAddressLine1());
        Assertions.assertEquals("rx", model.getUserBillingAddress().getAddressLine2());
        Assertions.assertEquals("ubxdukecpxdazvdh", model.getUserBillingAddress().getCity());
        Assertions.assertEquals("mmkoszudb", model.getUserBillingAddress().getRegion());
        Assertions.assertEquals("s", model.getUserBillingAddress().getPostalCode());
        Assertions.assertEquals("rpcaqkiofkbtf", model.getUserBillingAddress().getCountryIso2Code());
        Assertions.assertEquals("kl", model.getUserBillingAddress().getCreatedAt());
        Assertions.assertEquals("l", model.getUserBillingAddress().getUpdatedAt());
        Assertions.assertEquals("vcb", model.getUserCompany());
        Assertions.assertEquals("ezyquw", model.getUserEmail());
        Assertions.assertEquals("xut", model.getProductCharges().getName());
        Assertions.assertEquals("brruyuuatv", model.getProductCharges().getAmount());
        Assertions.assertEquals("wcolbmxl", model.getProductCharges().getItems().get(0).getAmount());
        Assertions.assertEquals("w", model.getProductCharges().getItems().get(0).getName());
        Assertions.assertEquals("cpahprzrvxhm", model.getProductCharges().getItems().get(0).getCount());
        Assertions.assertEquals("oikxkxhnegk", model.getOverages().getName());
        Assertions.assertEquals("z", model.getOverages().getAmount());
        Assertions.assertEquals("t", model.getTaxes().getName());
        Assertions.assertEquals("plvukaobrlbpg", model.getTaxes().getAmount());
        Assertions.assertEquals("agnchjhgemuowaky", model.getCreditsAndAdjustments().getName());
        Assertions.assertEquals("lhjym", model.getCreditsAndAdjustments().getAmount());
    }
}
