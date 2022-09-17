package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import java.util.List;

/** The AppsValidateRollbackApplicationJsonProperties model. */
@Fluent
public final class AppsValidateRollbackApplicationJsonProperties extends AppRollbackValidationCondition {
    /** {@inheritDoc} */
    @Override
    public AppsValidateRollbackApplicationJsonProperties setCode(AppRollbackValidationConditionCode code) {
        super.setCode(code);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppsValidateRollbackApplicationJsonProperties setMessage(String message) {
        super.setMessage(message);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppsValidateRollbackApplicationJsonProperties setComponents(List<String> components) {
        super.setComponents(components);
        return this;
    }
}
