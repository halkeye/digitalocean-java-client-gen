package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The DomainRecordCname model.
 */
@Fluent
public final class DomainRecordCname extends DomainRecord {
    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordCname setType(String type) {
        super.setType(type);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordCname setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordCname setData(String data) {
        super.setData(data);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordCname setPriority(Integer priority) {
        super.setPriority(priority);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordCname setPort(Integer port) {
        super.setPort(port);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordCname setTtl(Integer ttl) {
        super.setTtl(ttl);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordCname setWeight(Integer weight) {
        super.setWeight(weight);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordCname setFlags(Integer flags) {
        super.setFlags(flags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainRecordCname setTag(String tag) {
        super.setTag(tag);
        return this;
    }
}
