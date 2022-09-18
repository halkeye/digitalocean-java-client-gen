package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The DomainRecordTxt model.
 */
@Fluent
public final class DomainRecordTxt extends DomainRecord {
    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordTxt setType(String type) {
        super.setType(type);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordTxt setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordTxt setData(String data) {
        super.setData(data);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordTxt setPriority(Integer priority) {
        super.setPriority(priority);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordTxt setPort(Integer port) {
        super.setPort(port);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordTxt setTtl(Integer ttl) {
        super.setTtl(ttl);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordTxt setWeight(Integer weight) {
        super.setWeight(weight);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordTxt setFlags(Integer flags) {
        super.setFlags(flags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordTxt setTag(String tag) {
        super.setTag(tag);
        return this;
    }
}
