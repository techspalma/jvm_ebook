package com.java.jvm_ebook

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
class JvmEbookApplication

fun main(args: Array<String>) {
	runApplication<JvmEbookApplication>(*args)
}
