package com.iyushchuk.sample.features.library.domain.entities

import javax.persistence.*

@Entity
@Table(name = "books")
data class Book(

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_generator")
        @SequenceGenerator(name = "book_generator", sequenceName = "book_seq")
        @Column(name = "id", updatable = false, nullable = false)
        val id: Long,

        @Column(name = "title")
        val title: String? = "",

        @Column(name = "description")
        val description: String? = "",

        @ManyToMany(fetch = FetchType.LAZY, cascade = [CascadeType.PERSIST, CascadeType.MERGE])
        @JoinTable(
                name = "books_authors",
                joinColumns = [JoinColumn(name = "book")],
                inverseJoinColumns = [JoinColumn(name = "author")]
        )
        val authors: List<Author>? = mutableListOf(),

        @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.PERSIST])
        @JoinColumn(name = "genre")
        val genre: Genre?
)