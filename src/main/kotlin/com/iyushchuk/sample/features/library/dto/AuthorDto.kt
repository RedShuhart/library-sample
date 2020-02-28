package com.iyushchuk.sample.features.library.dto

data class AuthorDto(
        val id: Long,
        val name: String,
        val email: String? = "",
        val books: List<CompactBookDto>? = mutableListOf()
)

data class CompactAuthorDto(
        val id: Long,
        val name: String
)