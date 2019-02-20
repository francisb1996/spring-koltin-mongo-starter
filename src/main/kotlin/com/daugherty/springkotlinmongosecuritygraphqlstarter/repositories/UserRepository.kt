package com.daugherty.springkotlinmongosecuritygraphqlstarter.repositories

import com.daugherty.springkotlinmongosecuritygraphqlstarter.models.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository("test")
interface UserRepository : MongoRepository<User, String> {
    //basic functions provided by Spring
}