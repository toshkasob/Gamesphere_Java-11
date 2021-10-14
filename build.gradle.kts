plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    gradlePluginPortal()
    maven {
        url = uri("https://maven.restlet.com")
    }
}

dependencies {
    implementation("com.intellij:annotations:12.0")
    implementation("org.projectlombok:lombok:1.18.22")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}