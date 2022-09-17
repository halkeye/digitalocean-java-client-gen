package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;

/** The DomainRecordA model. */
@Fluent
public final class DomainRecordA extends DomainRecord {
    /** {@inheritDoc} */
    @Override
    public DomainRecordA setType(String type) {
        super.setType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordA setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordA setData(String data) {
        super.setData(data);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordA setPriority(Integer priority) {
        super.setPriority(priority);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordA setPort(Integer port) {
        super.setPort(port);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordA setTtl(Integer ttl) {
        super.setTtl(ttl);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordA setWeight(Integer weight) {
        super.setWeight(weight);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordA setFlags(Integer flags) {
        super.setFlags(flags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordA setTag(String tag) {
        super.setTag(tag);
        return this;
    }
}
