package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.ClusterlintResults;
import com.digitalocean.api.models.ClusterlintResultsDiagnosticsItem;
import com.digitalocean.api.models.ClusterlintResultsDiagnosticsItemObject;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClusterlintResultsTests {
    @Test
    public void testDeserialize() {
        ClusterlintResults model =
                BinaryData.fromString(
                                "{\"run_id\":\"cqksaaapxjh\",\"requested_at\":\"2021-08-15T21:30:36Z\",\"completed_at\":\"2020-12-24T02:07:16Z\",\"diagnostics\":[{\"check_name\":\"sdfpvdaahlf\",\"severity\":\"qklpmvzp\",\"message\":\"eszyaqgomlbmfgge\",\"object\":{\"name\":\"e\",\"kind\":\"jjl\",\"namespace\":\"yeahhhutpulnrfcq\"}},{\"check_name\":\"m\",\"severity\":\"hpi\",\"message\":\"wrerj\",\"object\":{\"name\":\"tchdw\",\"kind\":\"qid\",\"namespace\":\"mlgbbfjmdgjv\"}}]}")
                        .toObject(ClusterlintResults.class);
        Assertions.assertEquals("cqksaaapxjh", model.getRunId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-15T21:30:36Z"), model.getRequestedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-24T02:07:16Z"), model.getCompletedAt());
        Assertions.assertEquals("sdfpvdaahlf", model.getDiagnostics().get(0).getCheckName());
        Assertions.assertEquals("qklpmvzp", model.getDiagnostics().get(0).getSeverity());
        Assertions.assertEquals("eszyaqgomlbmfgge", model.getDiagnostics().get(0).getMessage());
        Assertions.assertEquals("e", model.getDiagnostics().get(0).getObject().getName());
        Assertions.assertEquals("jjl", model.getDiagnostics().get(0).getObject().getKind());
        Assertions.assertEquals("yeahhhutpulnrfcq", model.getDiagnostics().get(0).getObject().getNamespace());
    }

    @Test
    public void testSerialize() {
        ClusterlintResults model =
                new ClusterlintResults()
                        .setRunId("cqksaaapxjh")
                        .setRequestedAt(OffsetDateTime.parse("2021-08-15T21:30:36Z"))
                        .setCompletedAt(OffsetDateTime.parse("2020-12-24T02:07:16Z"))
                        .setDiagnostics(
                                Arrays.asList(
                                        new ClusterlintResultsDiagnosticsItem()
                                                .setCheckName("sdfpvdaahlf")
                                                .setSeverity("qklpmvzp")
                                                .setMessage("eszyaqgomlbmfgge")
                                                .setObject(
                                                        new ClusterlintResultsDiagnosticsItemObject()
                                                                .setName("e")
                                                                .setKind("jjl")
                                                                .setNamespace("yeahhhutpulnrfcq")),
                                        new ClusterlintResultsDiagnosticsItem()
                                                .setCheckName("m")
                                                .setSeverity("hpi")
                                                .setMessage("wrerj")
                                                .setObject(
                                                        new ClusterlintResultsDiagnosticsItemObject()
                                                                .setName("tchdw")
                                                                .setKind("qid")
                                                                .setNamespace("mlgbbfjmdgjv"))));
        model = BinaryData.fromObject(model).toObject(ClusterlintResults.class);
        Assertions.assertEquals("cqksaaapxjh", model.getRunId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-15T21:30:36Z"), model.getRequestedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-24T02:07:16Z"), model.getCompletedAt());
        Assertions.assertEquals("sdfpvdaahlf", model.getDiagnostics().get(0).getCheckName());
        Assertions.assertEquals("qklpmvzp", model.getDiagnostics().get(0).getSeverity());
        Assertions.assertEquals("eszyaqgomlbmfgge", model.getDiagnostics().get(0).getMessage());
        Assertions.assertEquals("e", model.getDiagnostics().get(0).getObject().getName());
        Assertions.assertEquals("jjl", model.getDiagnostics().get(0).getObject().getKind());
        Assertions.assertEquals("yeahhhutpulnrfcq", model.getDiagnostics().get(0).getObject().getNamespace());
    }
}
