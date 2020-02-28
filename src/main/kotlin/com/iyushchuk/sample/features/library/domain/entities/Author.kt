package com.iyushchuk.sample.features.library.domain.entities

import javax.persistence.*

@Entity
@Table(name = "authors")
data class Author(

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
        @SequenceGenerator(name = "author_generator", sequenceName = "author_seq")
        @Column(name = "id", updatable = false, nullable = false)
        val id: Long,

        @Column(name = "title")
        val name: String? = "",

        @Column(name = "description")
        val email: String? = "",

        @ManyToMany(fetch = FetchType.LAZY, cascade = [CascadeType.PERSIST, CascadeType.MERGE])
        @JoinTable(
                name = "books_authors",
                joinColumns = [JoinColumn(name = "author")],
                inverseJoinColumns = [JoinColumn(name = "book")]
        )
        val authors: List<Book>? = mutableListOf()


)