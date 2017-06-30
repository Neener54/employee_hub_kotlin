package com.nav.kotlin.employeeHub

import org.springframework.boot.SpringApplication
import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class EmployeeHubApplication

fun main(args: Array<String>) {
    SpringApplication.run(EmployeeHubApplication::class.java, *args)
}
