package com.iyushchuk.sample.configuration.database

import org.springframework.boot.context.properties.EnableConfigurationProperties

@EnableConfigurationProperties(PostgresR2dbcSettings::class)
class AppConfiguration
