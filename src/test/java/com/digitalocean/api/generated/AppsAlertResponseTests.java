package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.AppAlert;
import com.digitalocean.api.models.AppAlertPhase;
import com.digitalocean.api.models.AppAlertProgress;
import com.digitalocean.api.models.AppAlertSlackWebhook;
import com.digitalocean.api.models.AppAlertSpec;
import com.digitalocean.api.models.AppAlertSpecOperator;
import com.digitalocean.api.models.AppAlertSpecRule;
import com.digitalocean.api.models.AppAlertSpecWindow;
import com.digitalocean.api.models.AppsAlertResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppsAlertResponseTests {
    @Test
    public void testDeserialize() {
        AppsAlertResponse model =
                BinaryData.fromString(
                                "{\"alert\":{\"id\":\"xfwush\",\"component_name\":\"pkupnq\",\"spec\":{\"rule\":\"DEPLOYMENT_FAILED\",\"disabled\":true,\"operator\":\"UNSPECIFIED_OPERATOR\",\"value\":93.58416,\"window\":\"ONE_HOUR\"},\"emails\":[\"ojfizfav\",\"jzwfb\",\"yay\",\"mmfz\"],\"slack_webhooks\":[{\"url\":\"xrzxmdewsrsxkrp\",\"channel\":\"jazejwwviyoyp\"},{\"url\":\"hbrnnhjx\",\"channel\":\"wjh\"},{\"url\":\"biwetpo\",\"channel\":\"c\"}],\"phase\":\"ERROR\",\"progress\":{\"steps\":[]}}}")
                        .toObject(AppsAlertResponse.class);
        Assertions.assertEquals("pkupnq", model.getAlert().getComponentName());
        Assertions.assertEquals(AppAlertSpecRule.DEPLOYMENT_FAILED, model.getAlert().getSpec().getRule());
        Assertions.assertEquals(true, model.getAlert().getSpec().isDisabled());
        Assertions.assertEquals(AppAlertSpecOperator.UNSPECIFIED_OPERATOR, model.getAlert().getSpec().getOperator());
        Assertions.assertEquals(93.58416F, model.getAlert().getSpec().getValue());
        Assertions.assertEquals(AppAlertSpecWindow.ONEHOUR, model.getAlert().getSpec().getWindow());
        Assertions.assertEquals("ojfizfav", model.getAlert().getEmails().get(0));
        Assertions.assertEquals("xrzxmdewsrsxkrp", model.getAlert().getSlackWebhooks().get(0).getUrl());
        Assertions.assertEquals("jazejwwviyoyp", model.getAlert().getSlackWebhooks().get(0).getChannel());
        Assertions.assertEquals(AppAlertPhase.ERROR, model.getAlert().getPhase());
    }

    @Test
    public void testSerialize() {
        AppsAlertResponse model =
                new AppsAlertResponse()
                        .setAlert(
                                new AppAlert()
                                        .setComponentName("pkupnq")
                                        .setSpec(
                                                new AppAlertSpec()
                                                        .setRule(AppAlertSpecRule.DEPLOYMENT_FAILED)
                                                        .setDisabled(true)
                                                        .setOperator(AppAlertSpecOperator.UNSPECIFIED_OPERATOR)
                                                        .setValue(93.58416F)
                                                        .setWindow(AppAlertSpecWindow.ONEHOUR))
                                        .setEmails(Arrays.asList("ojfizfav", "jzwfb", "yay", "mmfz"))
                                        .setSlackWebhooks(
                                                Arrays.asList(
                                                        new AppAlertSlackWebhook()
                                                                .setUrl("xrzxmdewsrsxkrp")
                                                                .setChannel("jazejwwviyoyp"),
                                                        new AppAlertSlackWebhook().setUrl("hbrnnhjx").setChannel("wjh"),
                                                        new AppAlertSlackWebhook().setUrl("biwetpo").setChannel("c")))
                                        .setPhase(AppAlertPhase.ERROR)
                                        .setProgress(new AppAlertProgress().setSteps(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(AppsAlertResponse.class);
        Assertions.assertEquals("pkupnq", model.getAlert().getComponentName());
        Assertions.assertEquals(AppAlertSpecRule.DEPLOYMENT_FAILED, model.getAlert().getSpec().getRule());
        Assertions.assertEquals(true, model.getAlert().getSpec().isDisabled());
        Assertions.assertEquals(AppAlertSpecOperator.UNSPECIFIED_OPERATOR, model.getAlert().getSpec().getOperator());
        Assertions.assertEquals(93.58416F, model.getAlert().getSpec().getValue());
        Assertions.assertEquals(AppAlertSpecWindow.ONEHOUR, model.getAlert().getSpec().getWindow());
        Assertions.assertEquals("ojfizfav", model.getAlert().getEmails().get(0));
        Assertions.assertEquals("xrzxmdewsrsxkrp", model.getAlert().getSlackWebhooks().get(0).getUrl());
        Assertions.assertEquals("jazejwwviyoyp", model.getAlert().getSlackWebhooks().get(0).getChannel());
        Assertions.assertEquals(AppAlertPhase.ERROR, model.getAlert().getPhase());
    }
}
