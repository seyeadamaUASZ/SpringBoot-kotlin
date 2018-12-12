package com.kotlinspring.kotlinspring.utils

import org.springframework.data.domain.Page

interface IDtoConverter<DATA,DTO> {
    fun convert(entity:DATA):DTO
    fun convert(entities:List<DATA>): List<DTO> = entities.map{convert(it)}
    fun convert(page: Page<DATA>): PageDto<DTO> = PageDto(convert(page.content), page.totalPages, page.totalElements)
}