package com.iyushchuk.sample

import com.iyushchuk.sample.features.library.domain.entities.Author
import com.iyushchuk.sample.features.library.domain.repositories.AuthorRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


fun main(args: Array<String>) {
	runApplication<CommandLiner>(*args)
}

@SpringBootApplication
class CommandLiner (
		private val authorRepository: AuthorRepository
) : CommandLineRunner {

	override fun run(vararg args: String?) {
		authorRepository.saveAll(
				listOf(
						Author(name = "Dan Newton", email = "dan.newton@gmail.com"),
						Author(name = "Laura So", email = "laura.so@gmail.com")
				)
		).log().blockLast()
	}

	companion object {
		protected val logger: Logger = LoggerFactory.getLogger(CommandLiner::class.java)
	}
}