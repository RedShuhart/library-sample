package com.iyushchuk.sample.features.library.dto

data class GenreDto(
        val id: Long,
        val name: String,
        val books: List<CompactBookDto> = mutableListOf()
)

data class CompactGenreDto(
        val id: Long,
        val name: String
)