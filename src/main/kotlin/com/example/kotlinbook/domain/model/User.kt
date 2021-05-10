package com.example.kotlinbook.domain.model

import com.example.kotlinbook.domain.enum.RoleType

data class User(
    val id: Long,
    val email: String,
    val password: String,
    val name: String,
    val roleType: RoleType
)