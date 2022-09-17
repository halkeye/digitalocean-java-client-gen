package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;

/** The DomainRecordAaaa model. */
@Fluent
public final class DomainRecordAaaa extends DomainRecord {
    /** {@inheritDoc} */
    @Override
    public DomainRecordAaaa setType(String type) {
        super.setType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordAaaa setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordAaaa setData(String data) {
        super.setData(data);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordAaaa setPriority(Integer priority) {
        super.setPriority(priority);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordAaaa setPort(Integer port) {
        super.setPort(port);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordAaaa setTtl(Integer ttl) {
        super.setTtl(ttl);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordAaaa setWeight(Integer weight) {
        super.setWeight(weight);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordAaaa setFlags(Integer flags) {
        super.setFlags(flags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordAaaa setTag(String tag) {
        super.setTag(tag);
        return this;
    }
}
