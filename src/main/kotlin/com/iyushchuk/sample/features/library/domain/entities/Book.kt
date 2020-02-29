package com.iyushchuk.sample.features.library.domain.entities

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("books")
data class Book(

        @Id
        @Column("id")
        val id: Long? = null,

        @Column("title")
        val title: String? = "",

        @Column("description")
        val description: String? = "",

        @Column("author")
        val author: Long? = null,

        @Column("genre")
        val genre: Long? = null
)