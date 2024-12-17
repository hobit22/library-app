package com.group.libraryapp

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class JunitTest {

    companion object {
        @BeforeAll
        @JvmStatic
        fun beforeAll() {
            println("Before All")
        }

        @AfterAll
        @JvmStatic
        fun afterAll() {
            println("After All")
        }
    }

    @BeforeEach
    fun beforeEach() {
        println("before each")
    }

    @AfterEach
    fun afterEach() {
        println("after each")
    }

    @Test
    fun test1() {
        println("test1")
    }

    @Test
    fun test2() {
        println("test2")
    }
}