package com.java.jvm_ebook.service

import com.java.jvm_ebook.entity.User
import com.java.jvm_ebook.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Isolation
import org.springframework.transaction.annotation.Transactional
import kotlin.jvm.optionals.getOrNull

@Service
@Transactional(readOnly = true)
class UserService(
    val repository: UserRepository
) {

    @Transactional
    fun  register(user: User): User {
        return repository.save(user)
    }

    fun getUserByAgeId(id: Int): List<User> {
        return repository.findByAge(id)
    }


    fun getUserById(id: Long): User? {
        return repository.findById(id).getOrNull()
    }
}