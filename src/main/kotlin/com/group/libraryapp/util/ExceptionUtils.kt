package com.group.libraryapp.util

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.findByIdOrNull

fun fail(): Nothing {
    throw IllegalArgumentException()
}

fun <T, ID> CrudRepository<T, ID>.findByIdOrThrow(id: ID): T { // 확장함수
    return this.findByIdOrNull(id) ?: fail()
}