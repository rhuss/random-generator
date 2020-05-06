package io.k8spatterns.demo.random;

import java.util.Random;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RandomGeneratorService {

    private static UUID id;
    private static Random random = new Random();

    public int getRandom() {
        return random.nextInt();
    }

    public UUID getUUID() {
        if (id == null) {
            id = UUID.randomUUID();
        }
        return id;
    }
}
