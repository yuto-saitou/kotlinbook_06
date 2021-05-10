package com.example.kotlinbook.application.service

import com.example.kotlinbook.domain.model.BookWithRental
import com.example.kotlinbook.domain.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(
    private val bookRepository: BookRepository
) {
    fun getList(): List<BookWithRental> {
        return bookRepository.findAllWithRental()
    }

//    fun getDetail(bookId: Long): BookWithRental {
//        return bookRepository.findWithRental(bookId) ?: throw IllegalArgumentException("存在しない書籍ID: $bookId")
//    }
}