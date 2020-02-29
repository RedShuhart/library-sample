package com.iyushchuk.sample.configuration.database

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
@ConfigurationProperties(prefix = "postgres.r2dbc")
class PostgresR2dbcSettings {
    lateinit var host: String
    lateinit var port: String
    lateinit var database: String
    lateinit var username: String
    lateinit var password: String

    @PostConstruct
    fun postConstruct() {
        logger.info(
                """
                Postgres R2DBC properties ->
                        host:       $host,
                        port:       $port,
                        database:   $database,
                        username:   $username,
                        password:   $password
                """.trimIndent()

        )
    }

    companion object {
        protected val logger: Logger = LoggerFactory.getLogger(PostgresR2dbcSettings::class.java)
    }

    init {
        logger.info("Loading Postgres R2DBC properties")
    }
}