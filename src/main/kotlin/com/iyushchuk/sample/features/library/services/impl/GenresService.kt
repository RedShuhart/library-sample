package com.iyushchuk.sample.features.library.services.impl

import com.iyushchuk.sample.features.library.dto.CompactGenreDto
import com.iyushchuk.sample.features.library.dto.GenreDto
import com.iyushchuk.sample.features.library.services.LibraryCrudService
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
public class GenresService : LibraryCrudService<GenreDto, CompactGenreDto, Long> {
    override fun getAll(): Flux<CompactGenreDto> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getById(id: Long?): Mono<GenreDto> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun create(dto: GenreDto): Mono<GenreDto> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(id: Long, dto: GenreDto): Mono<GenreDto> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(id: Long?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}