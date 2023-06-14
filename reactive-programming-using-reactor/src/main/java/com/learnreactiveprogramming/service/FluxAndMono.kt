package com.learnreactiveprogramming.service

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

fun main() {
    namesFlux().subscribe { name ->
        println(name)
    }

    nameMono().subscribe { name ->
        println(name)
    }
}

fun namesFlux(): Flux<String> {
    return Flux.fromIterable(listOf("isuru", "amantha")).log()
}

fun nameMono(): Mono<String> {
    return Mono.just("Issa")
}
