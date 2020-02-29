package com.iyushchuk.sample.features.library.controllers

import com.iyushchuk.sample.features.library.services.LibraryCrudService
import org.springframework.web.bind.annotation.*

public abstract class LibraryCrudController<Full, Compact, Id>(
        private val crudService: LibraryCrudService<Full, Compact, Id>
) {

    @GetMapping
    fun getAll() = crudService.getAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable(value = "id") id: Id) = crudService.getById(id)

    @PostMapping
    fun create(@RequestBody request: Full) = crudService.create(request)

    @PatchMapping("/{id}")
    fun update(@PathVariable(value = "id") id: Id,
               @RequestBody request: Full) = crudService.update(id, request)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable(value = "id") id: Id) = crudService.delete(id)

}