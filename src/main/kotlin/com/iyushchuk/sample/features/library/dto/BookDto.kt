package com.iyushchuk.sample.features.library.dto

import com.iyushchuk.sample.features.library.domain.entities.Genre

data class BookDto(
        val id: Long,
        val title: String,
        val description: String? = "",
        val genre: CompactGenreDto? = null,
        val authors: List<CompactAuthorDto> = mutableListOf()
        )

data class CompactBookDto(
        val id: Long,
        val title: String
)