package com.daugherty.springkotlinmongosecuritygraphqlstarter.graphql

import com.coxautodev.graphql.tools.GraphQLResolver
import com.daugherty.springkotlinmongosecuritygraphqlstarter.models.User
import com.daugherty.springkotlinmongosecuritygraphqlstarter.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/*

@Component
internal class UserResolver (
        @Autowired
        private val userService: UserService
) : GraphQLResolver<User> {

    fun getEmailAddresses(): List<String?> {
        return userService.getUsers().map { it.email }
    }

}
        */