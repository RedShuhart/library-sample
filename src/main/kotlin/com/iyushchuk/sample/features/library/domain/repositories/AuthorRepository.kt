package com.iyushchuk.sample.features.library.domain.repositories

import com.iyushchuk.sample.features.library.domain.entities.Author
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository: R2dbcRepository<Author, Long> {

}