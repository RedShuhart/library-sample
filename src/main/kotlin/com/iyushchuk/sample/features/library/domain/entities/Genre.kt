package com.iyushchuk.sample.features.library.domain.entities

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table


@Table("genres")
data class Genre(

        @Id
        @Column("id")
        val id: Long? = null,

        @Column("name")
        val name: String = ""

)