package com.daugherty.springkotlinmongosecuritygraphqlstarter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import graphql.Scalars
import graphql.schema.GraphQLObjectType
import graphql.schema.GraphQLSchema
import org.springframework.context.annotation.Bean


@SpringBootApplication
class SpringKotlinMongoSecurityGraphqlStarterApplication

fun main(args: Array<String>) {
	runApplication<SpringKotlinMongoSecurityGraphqlStarterApplication>(*args)
}

/*
@Bean
fun schema(): GraphQLSchema {
	return GraphQLSchema.newSchema()
		.query(GraphQLObjectType.newObject()
			.name("query")
			.field { field ->
				field
					.name("test")
					.type(Scalars.GraphQLString)
					.dataFetcher { environment -> "response" }
			}
			.build())
		.build()
}
*/

