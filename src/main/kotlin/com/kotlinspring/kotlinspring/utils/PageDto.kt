package com.kotlinspring.kotlinspring.utils

data class PageDto<D>(var result: List<D>, var totalPages: Int, var totalElements: Long)