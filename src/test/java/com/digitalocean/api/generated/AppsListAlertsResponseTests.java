package com.digitalocean.api.generated;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppAlert;
import com.digitalocean.api.models.AppAlertPhase;
import com.digitalocean.api.models.AppAlertProgress;
import com.digitalocean.api.models.AppAlertSpec;
import com.digitalocean.api.models.AppAlertSpecOperator;
import com.digitalocean.api.models.AppAlertSpecRule;
import com.digitalocean.api.models.AppAlertSpecWindow;
import com.digitalocean.api.models.AppsListAlertsResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsListAlertsResponseTests {
    @Test
    public void testDeserialize() {
        AppsListAlertsResponse model = BinaryData.fromString("{\"alerts\":[{\"id\":\"a\",\"component_name\":\"d\",\"spec\":{\"rule\":\"MEM_UTILIZATION\",\"disabled\":true,\"operator\":\"LESS_THAN\",\"value\":32.852657,\"window\":\"ONE_HOUR\"},\"emails\":[\"sch\",\"cgqyhleseyq\",\"hvyeldotj\"],\"slack_webhooks\":[],\"phase\":\"CONFIGURING\",\"progress\":{\"steps\":[]}},{\"id\":\"kukjtasb\",\"component_name\":\"ispkxkdtx\",\"spec\":{\"rule\":\"FUNCTIONS_GB_RATE_PER_SECOND\",\"disabled\":true,\"operator\":\"GREATER_THAN\",\"value\":81.96614,\"window\":\"ONE_HOUR\"},\"emails\":[\"mb\",\"gtywatmqaqkue\",\"tgroesh\",\"ygzc\"],\"slack_webhooks\":[],\"phase\":\"ACTIVE\",\"progress\":{\"steps\":[]}}]}").toObject(AppsListAlertsResponse.class);
        Assertions.assertEquals("d", model.getAlerts().get(0).getComponentName());
        Assertions.assertEquals(AppAlertSpecRule.MEMUTILIZATION, model.getAlerts().get(0).getSpec().getRule());
        Assertions.assertEquals(true, model.getAlerts().get(0).getSpec().isDisabled());
        Assertions.assertEquals(AppAlertSpecOperator.LESS_THAN, model.getAlerts().get(0).getSpec().getOperator());
        Assertions.assertEquals(32.852657F, model.getAlerts().get(0).getSpec().getValue());
        Assertions.assertEquals(AppAlertSpecWindow.ONEHOUR, model.getAlerts().get(0).getSpec().getWindow());
        Assertions.assertEquals("sch", model.getAlerts().get(0).getEmails().get(0));
        Assertions.assertEquals(AppAlertPhase.CONFIGURING, model.getAlerts().get(0).getPhase());
    }

    @Test
    public void testSerialize() {
        AppsListAlertsResponse model = new AppsListAlertsResponse().setAlerts(Arrays.asList(new AppAlert().setComponentName("d").setSpec(new AppAlertSpec().setRule(AppAlertSpecRule.MEMUTILIZATION).setDisabled(true).setOperator(AppAlertSpecOperator.LESS_THAN).setValue(32.852657F).setWindow(AppAlertSpecWindow.ONEHOUR)).setEmails(Arrays.asList("sch", "cgqyhleseyq", "hvyeldotj")).setSlackWebhooks(Arrays.asList()).setPhase(AppAlertPhase.CONFIGURING).setProgress(new AppAlertProgress().setSteps(Arrays.asList())), new AppAlert().setComponentName("ispkxkdtx").setSpec(new AppAlertSpec().setRule(AppAlertSpecRule.FUNCTIONS_GBRATE_PERSECOND).setDisabled(true).setOperator(AppAlertSpecOperator.GREATER_THAN).setValue(81.96614F).setWindow(AppAlertSpecWindow.ONEHOUR)).setEmails(Arrays.asList("mb", "gtywatmqaqkue", "tgroesh", "ygzc")).setSlackWebhooks(Arrays.asList()).setPhase(AppAlertPhase.ACTIVE).setProgress(new AppAlertProgress().setSteps(Arrays.asList()))));
        model = BinaryData.fromObject(model).toObject(AppsListAlertsResponse.class);
        Assertions.assertEquals("d", model.getAlerts().get(0).getComponentName());
        Assertions.assertEquals(AppAlertSpecRule.MEMUTILIZATION, model.getAlerts().get(0).getSpec().getRule());
        Assertions.assertEquals(true, model.getAlerts().get(0).getSpec().isDisabled());
        Assertions.assertEquals(AppAlertSpecOperator.LESS_THAN, model.getAlerts().get(0).getSpec().getOperator());
        Assertions.assertEquals(32.852657F, model.getAlerts().get(0).getSpec().getValue());
        Assertions.assertEquals(AppAlertSpecWindow.ONEHOUR, model.getAlerts().get(0).getSpec().getWindow());
        Assertions.assertEquals("sch", model.getAlerts().get(0).getEmails().get(0));
        Assertions.assertEquals(AppAlertPhase.CONFIGURING, model.getAlerts().get(0).getPhase());
    }
}
