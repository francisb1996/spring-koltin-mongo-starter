package com.daugherty.springkotlinmongosecuritygraphqlstarter.exceptions

class CustomException (
        val errorCode: ErrorCode,
        params : Map<String, Any>? = null
) : Throwable()

enum class ErrorCode {
    USER_NOT_FOUND
}
