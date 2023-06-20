package com.learnreactiveprogramming.service

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

// Please refer the test cases in FluxAndMonoKtTest.kt file
fun namesFlux(): Flux<String> {
    return Flux.fromIterable(listOf("isuru", "amantha")).log()
}

fun nameMono(): Mono<String> {
    return Mono.just("Issa")
}

// Using the .map function
fun namesFlux_map(): Flux<String> {
    return Flux.fromIterable(listOf("isuru", "amantha")).map { name -> name.uppercase() }.log()
}
