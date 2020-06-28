plugins {
    kotlin("jvm") version "1.3.71"
    java
}

group = "com.github.ryoii"
version = "V0.3.0-pre"

repositories {
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
    maven { setUrl("https://mirrors.huaweicloud.com/repository/maven") }
    jcenter()
}

dependencies {
    compileOnly(kotlin("stdlib-jdk8", "1.3.71"))
    compileOnly("net.mamoe:mirai-core-qqandroid:1.1-EA")
    compileOnly("net.mamoe:mirai-console:0.5.2")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}