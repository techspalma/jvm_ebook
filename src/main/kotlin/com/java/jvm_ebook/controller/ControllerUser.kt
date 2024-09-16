package com.java.jvm_ebook.controller

import com.java.jvm_ebook.entity.User
import com.java.jvm_ebook.service.UserService
import io.azam.ulidj.ULID
import org.springframework.web.bind.annotation.*
import java.util.concurrent.CopyOnWriteArrayList
import kotlin.random.Random

@RestController
@RequestMapping("/user")
class ControllerUser(
    val service: UserService
) {

    val list = CopyOnWriteArrayList<User>()

    @PostMapping
    fun  register(): User {
        return service.register(User(name = ULID.random(), age = Random.nextInt(1, 101)))
    }

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long): User? {
        return service.getUserById(id)
    }
    @GetMapping("/age/{id}")
    fun getUserByAge(@PathVariable id: Int): List<User> {
        return service.getUserByAgeId(id)
    }

    @GetMapping("/{id}/lock")
    fun getUserWithLock(@PathVariable id: Long): User? {
       return  synchronized(1) {
            service.getUserById(id)?.let {
                list.add(it)
                Thread.sleep(1)
                it
            }
        }
    }
}