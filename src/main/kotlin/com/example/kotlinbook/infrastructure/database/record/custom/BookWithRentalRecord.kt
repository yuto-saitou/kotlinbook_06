/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.example.kotlinbook.infrastructure.database.record.custom

import java.time.LocalDate
import java.time.LocalDateTime

//↓　bookテーブルとrentalテーブルをジョインした値を格納するためのクラス
data class BookWithRentalRecord(
    var id: Long? = null,
    var title: String? = null,
    var author: String? = null,
    var releaseDate: LocalDate? = null,
    var userId: Long? = null,
    var rentalDatetime: LocalDateTime? = null,
    var returnDeadline: LocalDateTime? = null
)