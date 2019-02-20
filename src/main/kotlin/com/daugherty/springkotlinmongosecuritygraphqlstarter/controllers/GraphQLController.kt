package com.daugherty.springkotlinmongosecuritygraphqlstarter.controllers

import graphql.ExecutionInput
import graphql.GraphQL
import graphql.schema.StaticDataFetcher
import graphql.schema.idl.RuntimeWiring.newRuntimeWiring
import graphql.schema.idl.SchemaGenerator
import graphql.schema.idl.SchemaParser
import org.json.JSONObject
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/*
@RestController
class SimpleController {

    @RequestMapping("/graphql", method = [RequestMethod.POST])
    @Throws(Exception::class)
    fun myGraphql(@RequestBody request: String): Map<String, Any> {
        val schema = "type Query{MagicSchool: String}"
        val jsonRequest = JSONObject(request)

        val schemaParser = SchemaParser()
        val typeDefinitionRegistry = schemaParser.parse(schema)

        val runtimeWiring = newRuntimeWiring()
                .type("Query") { builder -> builder.dataFetcher("MagicSchool", StaticDataFetcher("Hogwards")) }
                .build()

        val schemaGenerator = SchemaGenerator()
        val graphQLSchema = schemaGenerator.makeExecutableSchema(typeDefinitionRegistry, runtimeWiring)
        val build = GraphQL.newGraphQL(graphQLSchema).build()

        val executionInput = ExecutionInput.newExecutionInput().query(jsonRequest.getString("query")).build()
        val executionResult = build.execute(executionInput)

        return executionResult.toSpecification()
    }
}
        */