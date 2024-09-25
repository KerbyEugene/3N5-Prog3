plugins {
    kotlin("jvm") version "2.0.0"
}

group = "org.Eugene"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}