package com.iyushchuk.sample.features.library.domain.repositories

import com.iyushchuk.sample.features.library.domain.entities.Book
import org.springframework.data.repository.reactive.ReactiveCrudRepository

public interface BookRepository : ReactiveCrudRepository<Book, Long> {

}