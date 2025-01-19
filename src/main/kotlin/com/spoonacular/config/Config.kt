package org.example.com.spoonacular.config

import java.util.*

object Config {
    private val properties: Properties = Properties()

    init {
        val inputStream = this::class.java.classLoader.getResourceAsStream("application.properties")
            ?: throw IllegalArgumentException("application.properties file not found")
        properties.load(inputStream)
    }

    fun get(key: String): String {
        return properties.getProperty(key) ?: throw IllegalArgumentException("Property $key not found")
    }
}