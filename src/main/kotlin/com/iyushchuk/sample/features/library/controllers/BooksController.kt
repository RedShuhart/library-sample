package com.iyushchuk.sample.features.library.controllers

import com.iyushchuk.sample.features.library.dto.BookDto
import com.iyushchuk.sample.features.library.dto.CompactBookDto
import com.iyushchuk.sample.features.library.services.LibraryCrudService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/library/books")
public class BooksControllerController(private val crudService: LibraryCrudService<BookDto, CompactBookDto, Long>) :
        LibraryCrudController<BookDto, CompactBookDto, Long>(crudService)