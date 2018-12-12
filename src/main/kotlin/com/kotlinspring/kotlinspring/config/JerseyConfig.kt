package com.kotlinspring.kotlinspring.config

import com.kotlinspring.kotlinspring.ControllerRest.BookResource
import org.glassfish.jersey.server.ResourceConfig
import org.springframework.stereotype.Component

@Component
class JerseyConfig() : ResourceConfig() {
    init {
        register(BookResource())
    }
}