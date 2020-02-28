package com.iyushchuk.sample.features.library.domain.repositories

import com.iyushchuk.sample.features.library.domain.entities.Author
import org.springframework.data.repository.reactive.ReactiveCrudRepository

public interface AuthorRepository: ReactiveCrudRepository<Author, Long> {

}