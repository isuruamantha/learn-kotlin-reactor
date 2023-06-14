package com.learnreactiveprogramming.service

import org.junit.jupiter.api.Test
import reactor.test.StepVerifier

class FluxAndMonoKtTest {
    @Test
    fun namesFluxTest() {
        //given
        //when
        val result = namesFlux()

        //then
        StepVerifier.create(result) // Since we're calling create here, we don't need to call subscribe() method
            .expectNext("isuru","amantha")
//            .expectNextCount(2) //If you want to verify the count
            .verifyComplete()
    }
}
