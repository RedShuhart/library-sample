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
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getById(id: Long?): Mono<AuthorDto> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun create(dto: AuthorDto): Mono<AuthorDto> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(id: Long, dto: AuthorDto): Mono<AuthorDto> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(id: Long?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}