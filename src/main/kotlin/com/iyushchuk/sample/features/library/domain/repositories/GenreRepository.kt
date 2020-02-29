package com.iyushchuk.sample.features.library.domain.repositories

import com.iyushchuk.sample.features.library.domain.entities.Genre
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository

@Repository
public interface GenreRepository : R2dbcRepository<Genre, Long> {

}