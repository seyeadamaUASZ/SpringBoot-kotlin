package com.kotlinspring.kotlinspring.ControllerRest

import com.kotlinspring.kotlinspring.services.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/book")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Component
class BookResource{
    @Autowired
    private lateinit var bookService: BookService
    @GET
    @Path("/{id}")
    fun getBook(@PathParam("id") id:Long)=bookService.getBook(id)
}