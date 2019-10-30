plugins {
    // Apply the java-library plugin to add support for Java Library
    `java-library`
    id("idea")
    id("jacoco")
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // Use JUnit test framework
    testImplementation("junit:junit:4.12")
}

jacoco {
    toolVersion = "0.8.4"
}

tasks {
    "test" {
        finalizedBy(jacocoTestReport)
    }
}

tasks.jacocoTestReport {
    reports {
        xml.isEnabled = false
        csv.isEnabled = false
        html.destination = file("${buildDir}/jacocoHtml")
    }
}

