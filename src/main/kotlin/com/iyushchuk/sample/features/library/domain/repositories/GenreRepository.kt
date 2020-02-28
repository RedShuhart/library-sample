package com.iyushchuk.sample.features.library.domain.repositories

import com.iyushchuk.sample.features.library.domain.entities.Genre
import org.springframework.data.repository.reactive.ReactiveCrudRepository

public interface GenreRepository : ReactiveCrudRepository<Genre, Long> {

}