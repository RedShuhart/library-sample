package com.iyushchuk.sample.features.library.controllers

import com.iyushchuk.sample.features.library.dto.AuthorDto
import com.iyushchuk.sample.features.library.dto.CompactAuthorDto
import com.iyushchuk.sample.features.library.services.LibraryCrudService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/library/authors")
public class AuthorsController(private val crudService: LibraryCrudService<AuthorDto, CompactAuthorDto, Long>) :
        LibraryCrudController<AuthorDto, CompactAuthorDto, Long>(crudService)