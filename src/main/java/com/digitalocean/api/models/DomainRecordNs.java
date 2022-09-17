package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;

/** The DomainRecordNs model. */
@Fluent
public final class DomainRecordNs extends DomainRecord {
    /** {@inheritDoc} */
    @Override
    public DomainRecordNs setType(String type) {
        super.setType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordNs setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordNs setData(String data) {
        super.setData(data);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordNs setPriority(Integer priority) {
        super.setPriority(priority);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordNs setPort(Integer port) {
        super.setPort(port);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordNs setTtl(Integer ttl) {
        super.setTtl(ttl);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordNs setWeight(Integer weight) {
        super.setWeight(weight);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordNs setFlags(Integer flags) {
        super.setFlags(flags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordNs setTag(String tag) {
        super.setTag(tag);
        return this;
    }
}
