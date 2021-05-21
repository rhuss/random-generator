package io.k8spatterns.demo.random;

import java.util.UUID;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class RandomResponse {

    private UUID id;
    private int random;
    private String version;

    RandomResponse(UUID id, int random) {
        this.id = id;
        this.random = random;

        this.version = System.getenv("VERSION");
        if (this.version == null) {
            this.version = "1.0";
        }
    }

    public String getId() {
        return id.toString();
    }

    public int getRandom() {
        return random;
    }

    public String getVersion() {
        return version;
    }
}
