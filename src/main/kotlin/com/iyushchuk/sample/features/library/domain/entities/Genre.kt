package com.iyushchuk.sample.features.library.domain.entities

import javax.persistence.*

@Entity
@Table(name = "genres")
data class Genre(

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genre_generator")
        @SequenceGenerator(name = "genre_generator", sequenceName = "genre_seq")
        @Column(name = "id", updatable = false, nullable = false)
        val id: Long,

        @Column(name = "name")
        val name: String = "",

        @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.PERSIST])
        @JoinColumn(name = "genre")
        val books: List<Book>? = mutableListOf()

)