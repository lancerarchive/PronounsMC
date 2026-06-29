plugins {
    java
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "com.alfie51m"
version = "1.6.0"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://oss.sonatype.org/content/groups/public/")
    maven("https://repo.extendedclip.com/releases")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:[26.1.2.build,)")
    compileOnly("me.clip:placeholderapi:2.12.2")
}

tasks {
    processResources {
        filesMatching("plugin.yml") {
            expand("version" to project.version)
        }
    }

    shadowJar {
        archiveClassifier.set("")
    }

    build {
        dependsOn(shadowJar)
    }
}
