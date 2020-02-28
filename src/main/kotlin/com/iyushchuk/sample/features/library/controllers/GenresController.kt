package com.iyushchuk.sample.features.library.controllers

import com.iyushchuk.sample.features.library.dto.CompactGenreDto
import com.iyushchuk.sample.features.library.dto.GenreDto
import com.iyushchuk.sample.features.library.services.LibraryCrudService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("library/genres")
public class GenresControllerController(private val crudService: LibraryCrudService<GenreDto, CompactGenreDto, Long>) :
        LibraryCrudController<GenreDto, CompactGenreDto, Long>(crudService)