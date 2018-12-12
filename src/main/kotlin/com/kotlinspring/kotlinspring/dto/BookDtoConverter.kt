package com.kotlinspring.kotlinspring.dto

import com.kotlinspring.kotlinspring.entity.Book
import com.kotlinspring.kotlinspring.utils.IDtoConverter

object BookDtoConverter: IDtoConverter<Book, BookDto> {
    override fun convert(entity: Book): BookDto =
            BookDto(id=entity.id,
                    title=entity.title,
                    publication = entity.publication,
                    authorId = entity.author?.id,
                    authorName = entity.author?.name ?: "")

}