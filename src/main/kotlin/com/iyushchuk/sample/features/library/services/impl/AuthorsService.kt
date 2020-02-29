package com.iyushchuk.sample.features.library.services.impl

import com.iyushchuk.sample.features.library.dto.AuthorDto
import com.iyushchuk.sample.features.library.dto.CompactAuthorDto
import com.iyushchuk.sample.features.library.services.LibraryCrudService
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
public class AuthorsService: LibraryCrudService<AuthorDto, CompactAuthorDto, Long> {
    override fun getAll(): Flux<CompactAuthorDto> {
        return Flux.empty()
    }

    override fun getById(id: Long): Mono<AuthorDto> {
        return Mono.empty()
    }

    override fun create(dto: AuthorDto): Mono<AuthorDto> {
        return Mono.empty()
    }

    override fun update(id: Long, dto: AuthorDto): Mono<AuthorDto> {
        return Mono.empty()
    }

    override fun delete(id: Long) {
    }

}