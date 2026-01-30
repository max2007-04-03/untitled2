plugins {
    java
}

group = "ua.opnu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    implementation("com.google.code.gson:gson:2.10.1")
}


tasks.jar {

    archiveFileName.set("myname.jar")


    manifest {
        attributes["Main-Class"] = "ua.opnu.Main"
    }


    val dependencies = configurations.runtimeClasspath.get().map {
        if (it.isDirectory) it else zipTree(it)
    }
    from(dependencies)


    from(sourceSets.main.get().output)


    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}