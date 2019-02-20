package com.daugherty.springkotlinmongosecuritygraphqlstarter.services

import com.daugherty.springkotlinmongosecuritygraphqlstarter.exceptions.CustomException
import com.daugherty.springkotlinmongosecuritygraphqlstarter.exceptions.ErrorCode
import com.daugherty.springkotlinmongosecuritygraphqlstarter.models.User
import com.daugherty.springkotlinmongosecuritygraphqlstarter.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService(
        @Autowired
        private val userRepository: UserRepository
) {
    fun getUsers(): List<User> {
        return userRepository.findAll()
    }

    fun getUserById(id: String): User {
        val user = userRepository.findById(id)
        if (user.isPresent)
            return user.get()
        throw CustomException(ErrorCode.USER_NOT_FOUND)
    }

    fun addUser(user: User): User {
        return userRepository.insert(user)
    }
}