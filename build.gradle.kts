plugins {
    kotlin("jvm") version "1.9.23"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // JUnit 5 для тестирования
    implementation("org.junit.jupiter:junit-jupiter:5.10.0")

    // Kotlin Test для запуска тестов
    implementation("org.jetbrains.kotlin:kotlin-test:1.8.22")

    // RestAssured для API тестов
    implementation("io.rest-assured:rest-assured:5.3.0")

    // Jackson для работы с JSON
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.15.2")
}

tasks.test {
    useJUnitPlatform()
}