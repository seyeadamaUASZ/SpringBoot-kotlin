package com.kotlinspring.kotlinspring

import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

/**
 * Initialize Spring boot servlet.
 */
class ServletInitializer : SpringBootServletInitializer() {

    override fun configure(application: SpringApplicationBuilder) : SpringApplicationBuilder {
        return application.sources(KotlinspringApplication::class.java)
    }

}