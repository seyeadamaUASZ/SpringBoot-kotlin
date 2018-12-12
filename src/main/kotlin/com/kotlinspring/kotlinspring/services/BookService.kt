package com.kotlinspring.kotlinspring.services

import com.kotlinspring.kotlinspring.dto.BookDto
import com.kotlinspring.kotlinspring.dto.BookDtoConverter
import com.kotlinspring.kotlinspring.repository.IBookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import javax.ws.rs.NotFoundException
import javax.ws.rs.PathParam

@Service
class BookService {
    @Autowired
    private lateinit var bookRepository:IBookRepository
    @Transactional(readOnly = true)
    fun getBook(@PathParam("id") id:Long): BookDto {
        return bookRepository.findById(id)
                .map { BookDtoConverter.convert(it) }
                .orElse(null)
                 ?: throw NotFoundException("Id parameter not found !!!")
    }
}