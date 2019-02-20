package com.daugherty.springkotlinmongosecuritygraphqlstarter.controllers

import com.daugherty.springkotlinmongosecuritygraphqlstarter.exceptions.CustomException
import com.daugherty.springkotlinmongosecuritygraphqlstarter.exceptions.ErrorCode
import com.daugherty.springkotlinmongosecuritygraphqlstarter.models.User
import com.daugherty.springkotlinmongosecuritygraphqlstarter.services.UserService
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.lang.Exception

//@Slf4j
@RestController
class UserController (
        @Autowired
        private val userService: UserService
) {
    @GetMapping("/users")
    fun getUsers(): ResponseEntity<List<User>> {
        return ResponseEntity.ok(userService.getUsers())
    }

    @GetMapping("/users/:id")
    fun getUserById(@RequestParam id: String): ResponseEntity<Any> {
        return try {
            ResponseEntity.ok(userService.getUserById(id))
        } catch (e: CustomException) {
            when (e.errorCode) {
                ErrorCode.USER_NOT_FOUND -> ResponseEntity(ErrorCode.USER_NOT_FOUND, HttpStatus.NOT_FOUND)
            }
        }
    }

    @PostMapping("/users")
    fun addUser(@RequestBody user: User): ResponseEntity<User> {
        val savedUser = userService.addUser(user)
        return ResponseEntity(savedUser, HttpStatus.CREATED)
    }
}