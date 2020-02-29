package com.iyushchuk.sample.features.library.services.impl

import com.iyushchuk.sample.features.library.dto.BookDto
import com.iyushchuk.sample.features.library.dto.CompactBookDto
import com.iyushchuk.sample.features.library.services.LibraryCrudService
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
public class BooksService : LibraryCrudService<BookDto, CompactBookDto, Long> {
    override fun getAll(): Flux<CompactBookDto> {
        return Flux.empty()
    }

    override fun getById(id: Long): Mono<BookDto> {
        return Mono.empty()
    }

    override fun create(dto: BookDto): Mono<BookDto> {
        return Mono.empty()
    }

    override fun update(id: Long, dto: BookDto): Mono<BookDto> {
        return Mono.empty()
    }

    override fun delete(id: Long) {
    }
}