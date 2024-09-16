package com.java.jvm_ebook.repository


import com.java.jvm_ebook.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Repository
interface UserRepository : CrudRepository<User, Long> {

    fun findByAge(idade: Int): List<User>
}