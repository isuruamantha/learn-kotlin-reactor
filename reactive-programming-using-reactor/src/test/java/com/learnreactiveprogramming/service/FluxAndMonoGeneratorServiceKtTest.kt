package com.learnreactiveprogramming.service

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import reactor.test.StepVerifier

class FluxAndMonoGeneratorServiceKtTest {
    @Test
    fun namesFluxTest() {
        StepVerifier.create(namesFlux()) // Since we're calling create here, we don't need to call subscribe() method
            .expectNext("isuru", "amantha")
//            .expectNextCount(2) //If you want to verify the count
            .verifyComplete()
    }

    @Test
    fun namesMonoTest() {
        StepVerifier.create(nameMono())
            .expectNextCount(1)
            .verifyComplete()
    }

    @Test
    fun namesFlux_mapTest() {
        StepVerifier.create(namesFlux_map())
            .expectNext("ISURU")
            .expectNextCount(1)
            .verifyComplete()
    }
}
