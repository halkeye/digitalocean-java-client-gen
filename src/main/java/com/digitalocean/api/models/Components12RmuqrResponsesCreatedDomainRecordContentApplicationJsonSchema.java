package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components12RmuqrResponsesCreatedDomainRecordContentApplicationJsonSchema model. */
@Fluent
public final class Components12RmuqrResponsesCreatedDomainRecordContentApplicationJsonSchema {
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
     * @return the Components12RmuqrResponsesCreatedDomainRecordContentApplicationJsonSchema object itself.
     */
    public Components12RmuqrResponsesCreatedDomainRecordContentApplicationJsonSchema setDomainRecord(
            DomainRecord domainRecord) {
        this.domainRecord = domainRecord;
        return this;
    }
}
