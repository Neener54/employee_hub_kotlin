package com.nav.kotlin.employeeHub.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

/**
 * Created by marchibald on 5/19/17.
 */
@Configuration
@EnableRedisHttpSession
open class ApplicationConfiguration {
    @Bean
    @Order(value=0)

}
