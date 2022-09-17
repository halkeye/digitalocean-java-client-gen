package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;

/** The DomainRecordCaa model. */
@Fluent
public final class DomainRecordCaa extends DomainRecord {
    /** {@inheritDoc} */
    @Override
    public DomainRecordCaa setType(String type) {
        super.setType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordCaa setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordCaa setData(String data) {
        super.setData(data);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordCaa setPriority(Integer priority) {
        super.setPriority(priority);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordCaa setPort(Integer port) {
        super.setPort(port);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordCaa setTtl(Integer ttl) {
        super.setTtl(ttl);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordCaa setWeight(Integer weight) {
        super.setWeight(weight);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordCaa setFlags(Integer flags) {
        super.setFlags(flags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordCaa setTag(String tag) {
        super.setTag(tag);
        return this;
    }
}
