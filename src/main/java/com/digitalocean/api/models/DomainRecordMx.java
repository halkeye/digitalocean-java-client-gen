package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The DomainRecordMx model.
 */
@Fluent
public final class DomainRecordMx extends DomainRecord {
    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordMx setType(String type) {
        super.setType(type);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordMx setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordMx setData(String data) {
        super.setData(data);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordMx setPriority(Integer priority) {
        super.setPriority(priority);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordMx setPort(Integer port) {
        super.setPort(port);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordMx setTtl(Integer ttl) {
        super.setTtl(ttl);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordMx setWeight(Integer weight) {
        super.setWeight(weight);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordMx setFlags(Integer flags) {
        super.setFlags(flags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordMx setTag(String tag) {
        super.setTag(tag);
        return this;
    }
}
