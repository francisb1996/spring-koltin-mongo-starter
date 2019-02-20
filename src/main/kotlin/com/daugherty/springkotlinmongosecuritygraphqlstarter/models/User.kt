package com.daugherty.springkotlinmongosecuritygraphqlstarter.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("users")
data class User (
    @Id
    val id: String? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var email: String? = null
)