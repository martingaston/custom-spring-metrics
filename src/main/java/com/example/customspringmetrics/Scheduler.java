package com.example.customspringmetrics;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
    private final MeterRegistry registry;

    public Scheduler(MeterRegistry registry) {
        this.registry = registry;
    }

    @Scheduled(fixedRate = 1000)
    public void scheduleMeATask() throws InterruptedException {
        registry.counter("my.cool.metric").increment();
    }
}
