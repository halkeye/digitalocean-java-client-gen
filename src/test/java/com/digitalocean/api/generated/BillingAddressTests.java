package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.BillingAddress;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BillingAddressTests {
    @Test
    public void testDeserialize() {
        BillingAddress model = BinaryData.fromString("{\"address_line1\":\"sqdtiwlwxlbon\",\"address_line2\":\"bazqicqchygtvxby\",\"city\":\"nepubdpkxyqvgx\",\"region\":\"od\",\"postal_code\":\"vohkxdxuws\",\"country_iso2_code\":\"fmcwnosb\",\"created_at\":\"ehgcvkbcknjo\",\"updated_at\":\"jy\"}").toObject(BillingAddress.class);
        Assertions.assertEquals("sqdtiwlwxlbon", model.getAddressLine1());
        Assertions.assertEquals("bazqicqchygtvxby", model.getAddressLine2());
        Assertions.assertEquals("nepubdpkxyqvgx", model.getCity());
        Assertions.assertEquals("od", model.getRegion());
        Assertions.assertEquals("vohkxdxuws", model.getPostalCode());
        Assertions.assertEquals("fmcwnosb", model.getCountryIso2Code());
        Assertions.assertEquals("ehgcvkbcknjo", model.getCreatedAt());
        Assertions.assertEquals("jy", model.getUpdatedAt());
    }

    @Test
    public void testSerialize() {
        BillingAddress model = new BillingAddress().setAddressLine1("sqdtiwlwxlbon").setAddressLine2("bazqicqchygtvxby").setCity("nepubdpkxyqvgx").setRegion("od").setPostalCode("vohkxdxuws").setCountryIso2Code("fmcwnosb").setCreatedAt("ehgcvkbcknjo").setUpdatedAt("jy");
        model = BinaryData.fromObject(model).toObject(BillingAddress.class);
        Assertions.assertEquals("sqdtiwlwxlbon", model.getAddressLine1());
        Assertions.assertEquals("bazqicqchygtvxby", model.getAddressLine2());
        Assertions.assertEquals("nepubdpkxyqvgx", model.getCity());
        Assertions.assertEquals("od", model.getRegion());
        Assertions.assertEquals("vohkxdxuws", model.getPostalCode());
        Assertions.assertEquals("fmcwnosb", model.getCountryIso2Code());
        Assertions.assertEquals("ehgcvkbcknjo", model.getCreatedAt());
        Assertions.assertEquals("jy", model.getUpdatedAt());
    }
}
