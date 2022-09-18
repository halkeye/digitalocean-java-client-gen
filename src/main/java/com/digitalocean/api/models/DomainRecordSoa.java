package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The DomainRecordSoa model.
 */
@Fluent
public final class DomainRecordSoa extends DomainRecord {
    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordSoa setType(String type) {
        super.setType(type);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordSoa setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordSoa setData(String data) {
        super.setData(data);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordSoa setPriority(Integer priority) {
        super.setPriority(priority);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordSoa setPort(Integer port) {
        super.setPort(port);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordSoa setTtl(Integer ttl) {
        super.setTtl(ttl);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordSoa setWeight(Integer weight) {
        super.setWeight(weight);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordSoa setFlags(Integer flags) {
        super.setFlags(flags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordSoa setTag(String tag) {
        super.setTag(tag);
        return this;
    }
}
