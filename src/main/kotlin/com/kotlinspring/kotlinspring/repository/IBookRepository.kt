package com.kotlinspring.kotlinspring.repository

import com.kotlinspring.kotlinspring.entity.Book
import org.springframework.data.repository.PagingAndSortingRepository

interface IBookRepository: PagingAndSortingRepository<Book,Long>