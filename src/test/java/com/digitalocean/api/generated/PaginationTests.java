package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.PageLinks;
import com.digitalocean.api.models.Pagination;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PaginationTests {
    @Test
    public void testDeserialize() {
        Pagination model = BinaryData.fromString("{\"links\":{}}").toObject(Pagination.class);
    }

    @Test
    public void testSerialize() {
        Pagination model = new Pagination().setLinks(new PageLinks());
        model = BinaryData.fromObject(model).toObject(Pagination.class);
    }
}
