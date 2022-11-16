plugins {
    id("org.jetbrains.kotlin.multiplatform").version("1.8.0-Beta")
}
repositories {
    mavenCentral()
}

kotlin {
    jvm()
    macosArm64()
    iosArm64()

    sourceSets {
        val commonMain = getByName("commonMain") {
            dependencies {
                implementation("com.squareup.okio:okio:3.2.0")
            }
        }

        val appleMain = create("appleMain") {
            dependsOn(commonMain)
        }
        getByName("macosArm64Main") {
            dependsOn(appleMain)
        }
        getByName("iosArm64Main") {
            dependsOn(appleMain)
        }
    }
}