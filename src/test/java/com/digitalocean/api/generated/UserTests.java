package com.digitalocean.api.generated;

import com.azure.core.util.BinaryData;
import com.digitalocean.api.models.User;
import com.digitalocean.api.models.UserKubernetesClusterUser;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UserTests {
    @Test
    public void testDeserialize() {
        User model =
                BinaryData.fromString(
                                "{\"kubernetes_cluster_user\":{\"username\":\"ytdxmlynz\",\"groups\":[\"apbkrbuoggtdl\",\"lcuhaizi\",\"vaylz\",\"ohlpsftqkr\"]}}")
                        .toObject(User.class);
        Assertions.assertEquals("ytdxmlynz", model.getKubernetesClusterUser().getUsername());
        Assertions.assertEquals("apbkrbuoggtdl", model.getKubernetesClusterUser().getGroups().get(0));
    }

    @Test
    public void testSerialize() {
        User model =
                new User()
                        .setKubernetesClusterUser(
                                new UserKubernetesClusterUser()
                                        .setUsername("ytdxmlynz")
                                        .setGroups(Arrays.asList("apbkrbuoggtdl", "lcuhaizi", "vaylz", "ohlpsftqkr")));
        model = BinaryData.fromObject(model).toObject(User.class);
        Assertions.assertEquals("ytdxmlynz", model.getKubernetesClusterUser().getUsername());
        Assertions.assertEquals("apbkrbuoggtdl", model.getKubernetesClusterUser().getGroups().get(0));
    }
}
