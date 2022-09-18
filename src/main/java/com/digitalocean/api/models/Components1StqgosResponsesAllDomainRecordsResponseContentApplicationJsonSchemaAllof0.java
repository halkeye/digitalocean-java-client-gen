package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The Components1StqgosResponsesAllDomainRecordsResponseContentApplicationJsonSchemaAllof0 model.
 */
@Fluent
public class Components1StqgosResponsesAllDomainRecordsResponseContentApplicationJsonSchemaAllof0 {
    /*
     * The domain_records property.
     */
    @JsonProperty(value = "domain_records")
    private List<DomainRecord> domainRecords;

    /**
     * Get the domainRecords property: The domain_records property.
     * 
     * @return the domainRecords value.
     */
    public List<DomainRecord> getDomainRecords() {
        return this.domainRecords;
    }

    /**
     * Set the domainRecords property: The domain_records property.
     * 
     * @param domainRecords the domainRecords value to set.
     * @return the Components1StqgosResponsesAllDomainRecordsResponseContentApplicationJsonSchemaAllof0 object itself.
     */
    public Components1StqgosResponsesAllDomainRecordsResponseContentApplicationJsonSchemaAllof0 setDomainRecords(List<DomainRecord> domainRecords) {
        this.domainRecords = domainRecords;
        return this;
    }
}
