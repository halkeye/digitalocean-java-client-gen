package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The Components1WdhcpfResponsesDomainRecordContentApplicationJsonSchema model.
 */
@Fluent
public final class Components1WdhcpfResponsesDomainRecordContentApplicationJsonSchema {
    /*
     * The domain_record property.
     */
    @JsonProperty(value = "domain_record")
    private DomainRecord domainRecord;

    /**
     * Get the domainRecord property: The domain_record property.
     * 
     * @return the domainRecord value.
     */
    public DomainRecord getDomainRecord() {
        return this.domainRecord;
    }

    /**
     * Set the domainRecord property: The domain_record property.
     * 
     * @param domainRecord the domainRecord value to set.
     * @return the Components1WdhcpfResponsesDomainRecordContentApplicationJsonSchema object itself.
     */
    public Components1WdhcpfResponsesDomainRecordContentApplicationJsonSchema setDomainRecord(DomainRecord domainRecord) {
        this.domainRecord = domainRecord;
        return this;
    }
}
