package com.kotlinspring.kotlinspring.repository

import com.kotlinspring.kotlinspring.entity.Author
import org.springframework.data.repository.PagingAndSortingRepository

interface IAuthorRepository: PagingAndSortingRepository<Author,Long>