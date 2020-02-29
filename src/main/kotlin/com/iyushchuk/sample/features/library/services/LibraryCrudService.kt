package com.iyushchuk.sample.features.library.services

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

public interface LibraryCrudService<Full, Compact, Id> {
    fun getAll(): Flux<Compact>

    fun getById(id: Id): Mono<Full>

    fun create(dto: Full): Mono<Full>

    fun update(id: Id, dto: Full): Mono<Full>

    fun delete(id: Id)
}