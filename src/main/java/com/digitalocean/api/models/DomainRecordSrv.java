package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;

/** The DomainRecordSrv model. */
@Fluent
public final class DomainRecordSrv extends DomainRecord {
    /** {@inheritDoc} */
    @Override
    public DomainRecordSrv setType(String type) {
        super.setType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordSrv setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordSrv setData(String data) {
        super.setData(data);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordSrv setPriority(Integer priority) {
        super.setPriority(priority);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordSrv setPort(Integer port) {
        super.setPort(port);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordSrv setTtl(Integer ttl) {
        super.setTtl(ttl);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordSrv setWeight(Integer weight) {
        super.setWeight(weight);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordSrv setFlags(Integer flags) {
        super.setFlags(flags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainRecordSrv setTag(String tag) {
        super.setTag(tag);
        return this;
    }
}
