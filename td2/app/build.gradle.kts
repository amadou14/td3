/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("td2.java-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("td2.app.App")
}
