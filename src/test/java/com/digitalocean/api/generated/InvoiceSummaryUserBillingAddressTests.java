package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.BillingAddress;
import com.digitalocean.api.models.InvoiceSummaryUserBillingAddress;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class InvoiceSummaryUserBillingAddressTests {
    @Test
    public void testDeserialize() {
        InvoiceSummaryUserBillingAddress model = BinaryData.fromString("{\"address_line1\":\"gqtagd\",\"address_line2\":\"lss\",\"city\":\"jomevtfycnlb\",\"region\":\"jcodkkgjiiytssi\",\"postal_code\":\"z\",\"country_iso2_code\":\"ufqbvntnr\",\"created_at\":\"qsorh\",\"updated_at\":\"kxgnlykmxcpwzvmd\"}").toObject(InvoiceSummaryUserBillingAddress.class);
        Assertions.assertEquals("gqtagd", model.getAddressLine1());
        Assertions.assertEquals("lss", model.getAddressLine2());
        Assertions.assertEquals("jomevtfycnlb", model.getCity());
        Assertions.assertEquals("jcodkkgjiiytssi", model.getRegion());
        Assertions.assertEquals("z", model.getPostalCode());
        Assertions.assertEquals("ufqbvntnr", model.getCountryIso2Code());
        Assertions.assertEquals("qsorh", model.getCreatedAt());
        Assertions.assertEquals("kxgnlykmxcpwzvmd", model.getUpdatedAt());
    }

    @Test
    public void testSerialize() {
        InvoiceSummaryUserBillingAddress model = new InvoiceSummaryUserBillingAddress().setAddressLine1("gqtagd").setAddressLine2("lss").setCity("jomevtfycnlb").setRegion("jcodkkgjiiytssi").setPostalCode("z").setCountryIso2Code("ufqbvntnr").setCreatedAt("qsorh").setUpdatedAt("kxgnlykmxcpwzvmd");
        model = BinaryData.fromObject(model).toObject(InvoiceSummaryUserBillingAddress.class);
        Assertions.assertEquals("gqtagd", model.getAddressLine1());
        Assertions.assertEquals("lss", model.getAddressLine2());
        Assertions.assertEquals("jomevtfycnlb", model.getCity());
        Assertions.assertEquals("jcodkkgjiiytssi", model.getRegion());
        Assertions.assertEquals("z", model.getPostalCode());
        Assertions.assertEquals("ufqbvntnr", model.getCountryIso2Code());
        Assertions.assertEquals("qsorh", model.getCreatedAt());
        Assertions.assertEquals("kxgnlykmxcpwzvmd", model.getUpdatedAt());
    }
}
