package com.iyushchuk.sample.configuration.database

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration
import io.r2dbc.postgresql.PostgresqlConnectionFactory
import io.r2dbc.spi.ConnectionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@Configuration
@EnableR2dbcRepositories(basePackages = ["com.iyushchuk.sample.features"])
class DatabaseConfiguration @Autowired constructor(val postgresR2dbcSettings: PostgresR2dbcSettings) :
        AbstractR2dbcConfiguration() {

    override fun connectionFactory(): ConnectionFactory {
        return PostgresqlConnectionFactory(
                PostgresqlConnectionConfiguration.builder()
                        .host(postgresR2dbcSettings.host)
                        .port(postgresR2dbcSettings.port.toInt())
                        .database(postgresR2dbcSettings.database)
                        .username(postgresR2dbcSettings.username)
                        .password(postgresR2dbcSettings.password)
                        .build()
        )
    }
}