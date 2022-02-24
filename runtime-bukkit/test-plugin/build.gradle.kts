plugins {
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

dependencies {
    implementation(project(":runtime-bukkit:api"))
    implementation(project(":runtime-bukkit:adapt-v1_18_R1", "reobf"))
    implementation(project(":hephaestus-reader-blockbench")) {
        exclude(group = "com.google.code.gson", module = "gson")
    }

    compileOnly("io.papermc.paper:paper-api:1.18.1-R0.1-SNAPSHOT")
}